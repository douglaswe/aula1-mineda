package aula.mineda.aula1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import aula.mineda.aula1.entity.Usuario;
import aula.mineda.aula1.service.UsuarioService;

@RestController
@RequestMapping(value = "/usuario")
@CrossOrigin
public class UsuarioController {
   
    @Autowired
    private UsuarioService service;

    @GetMapping
    public List<Usuario> todosUsuarios(){
        return service.todosUsuarios();
    }

    @PostMapping
    public Usuario novoUsuario(@RequestBody Usuario usuario){
        return service.novoUsuario(usuario);
    }

@GetMapping(value = "/{id}")
    public Usuario buscarPeloId(@PathVariable("id") Long id){
        return service.buscarPeloId(id);
    }

}
