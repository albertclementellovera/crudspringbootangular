package com.ac.crudspringbootangular.Dao;

//Funciones CRUD de SpringBoot

import com.ac.crudspringbootangular.Model.Tarea;
import org.springframework.data.repository.CrudRepository;

public interface TareaDao extends CrudRepository<Tarea, Integer> {
}
