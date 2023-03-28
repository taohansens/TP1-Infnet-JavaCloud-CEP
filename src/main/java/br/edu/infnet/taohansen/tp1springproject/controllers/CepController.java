package br.edu.infnet.taohansen.tp1springproject.controllers;
import br.edu.infnet.taohansen.tp1springproject.entities.Cep;
import br.edu.infnet.taohansen.tp1springproject.entities.CepDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
public class CepController {

    @GetMapping("/{cep}")
    public ResponseEntity<Cep> getByCep(@PathVariable String cep) {
        String uri = "https://viacep.com.br/ws/" + cep + "/json";
        RestTemplate restTemplate = new RestTemplate();
        try {
            Cep foundCep = new Cep(restTemplate.getForObject(uri, CepDTO.class));
            return ResponseEntity.ok().body(foundCep);
        } catch (Exception e){
            return ResponseEntity.notFound().build();
        }
}
}
