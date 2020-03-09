package com.p2.Estacionamiento.dao;

import com.p2.Estacionamiento.modelo.Registro;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface RegistroDAO extends CrudRepository<Registro, Integer> {

    @Override
    public List<Registro> findAll();
    
}
