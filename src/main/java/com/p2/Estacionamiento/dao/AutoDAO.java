package com.p2.Estacionamiento.dao;

import com.p2.Estacionamiento.modelo.Auto;
import org.springframework.data.repository.CrudRepository;

public interface AutoDAO extends CrudRepository<Auto, Integer> {
    
}
