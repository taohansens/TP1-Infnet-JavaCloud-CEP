package br.edu.infnet.taohansen.tp1springproject.controllers;
import br.edu.infnet.taohansen.tp1springproject.entities.Cep;
import br.edu.infnet.taohansen.tp1springproject.entities.CepDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
public class CepController {

    @GetMapping("/cep/{cep}")
    public ResponseEntity<CepDTO> getByCep(@PathVariable String cep) {
        String uri = "https://viacep.com.br/ws/" + cep + "/json";
        RestTemplate restTemplate = new RestTemplate();
        try {
            Cep foundCep = new Cep(restTemplate.getForObject(uri, CepDTO.class));
            var cepDTO = new CepDTO();
            copyEntity(foundCep, cepDTO);
            return ResponseEntity.ok().body(cepDTO);
        } catch (Exception e){
            return ResponseEntity.notFound().build();
        }
}

private void copyEntity(Cep entity, CepDTO dto){
        dto.cep = entity.getCep();
        dto.rua = entity.getRua();
        dto.cidade = entity.getCidade();
        dto.bairro = entity.getBairro();
        dto.estado = entity.getEstado();
}
}
