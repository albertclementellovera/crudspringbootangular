package com.ac.crudspringbootangular.Controler;


import com.ac.crudspringbootangular.Model.Tarea;
import com.ac.crudspringbootangular.Service.TareaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins="*")
@RequestMapping("/api")
public class TareaControler {
    //Desde Controler llamamos a nuestro servicio
    @Autowired
    private TareaService tareaService;

    //Listar
    @GetMapping("/tareas")
    public List<Tarea> listar() {
        return tareaService.findAll();
    }

    //Guardar -@RequestBody para indicar que el parametro sera en Json
    @PostMapping("/tareas")
    public Tarea Guardar(@RequestBody Tarea tarea){
        return tareaService.save(tarea);
    }

    //Busqueda por id -@PathVariable la URL selecciona
    // del resultado la que cumple con el parametro adicional
    @GetMapping("/tareas/{id}")
    public Tarea getUnaTarea(@PathVariable Integer id) {
        return tareaService.findById(id);
    }

    //Actualizar
    @PutMapping("/tareas/{id}")
    public Tarea modificar(@RequestBody Tarea tarea, @PathVariable Integer id) {
        Tarea tareaActual= tareaService.findById(id);
        tareaActual.setTarea(tarea.getTarea());
        tareaActual.setFinalizado(tarea.getFinalizado());
        return tareaService.save(tareaActual);
    }

    //Borrar
    @DeleteMapping("/tareas/{id}")
    public void eliminar(@PathVariable Integer id){
        tareaService.delete(id);
    }
}
