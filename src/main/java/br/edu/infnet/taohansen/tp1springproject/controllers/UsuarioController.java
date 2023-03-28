package br.edu.infnet.taohansen.tp1springproject.controllers;

import br.edu.infnet.taohansen.tp1springproject.entities.Usuario;
import br.edu.infnet.taohansen.tp1springproject.entities.UsuarioDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/usuario")
public class UsuarioController {
    @PostMapping(value = "/registrar")
    public String insert(UsuarioDTO usuarioDTO) {
        Usuario usuario = new Usuario(usuarioDTO);
        System.out.println(usuario);
        return "redirect:/";
    }
}
