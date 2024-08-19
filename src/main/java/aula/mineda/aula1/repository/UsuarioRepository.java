package aula.mineda.aula1.repository;

import org.springframework.data.repository.CrudRepository;

import aula.mineda.aula1.entity.Usuario;

public interface UsuarioRepository extends CrudRepository<Usuario, Long>{
    
}
