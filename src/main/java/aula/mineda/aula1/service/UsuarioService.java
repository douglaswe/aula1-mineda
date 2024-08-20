package aula.mineda.aula1.service;

import java.util.List;

import aula.mineda.aula1.entity.Usuario;

public interface UsuarioService {
    
    public Usuario novoUsuario(Usuario usuario);

    public List<Usuario> todosUsuarios();

    public Usuario buscarPeloId(Long id);
}
