package com.p2.Estacionamiento.dao;

import com.p2.Estacionamiento.modelo.Usuario;
import org.springframework.data.repository.CrudRepository;

public interface UsuarioDAO extends CrudRepository<Usuario, Integer> {
    
}
