package com.p2.Estacionamiento.dao;

import com.p2.Estacionamiento.modelo.Persona;
import org.springframework.data.repository.CrudRepository;

public interface PersonaDAO extends CrudRepository<Persona, Integer> {
    
}
