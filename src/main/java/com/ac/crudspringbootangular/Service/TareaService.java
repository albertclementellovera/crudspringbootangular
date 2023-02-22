package com.ac.crudspringbootangular.Service;


import com.ac.crudspringbootangular.Model.Tarea;

import java.util.List;

//Funciones CRUD de SpringBoot que se implementaran
public interface TareaService {

    public List<Tarea> findAll();
    public Tarea save(Tarea tarea);
    public Tarea findById(Integer id);
    public void delete(Integer id);
}
