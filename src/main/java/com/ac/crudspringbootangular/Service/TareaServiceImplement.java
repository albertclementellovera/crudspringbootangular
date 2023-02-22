package com.ac.crudspringbootangular.Service;

import com.ac.crudspringbootangular.Dao.TareaDao;
import com.ac.crudspringbootangular.Model.Tarea;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class TareaServiceImplement implements TareaService {

    @Autowired
    private TareaDao tareaDao;

    @Override
    @Transactional
    public List<Tarea> findAll() {
        return (List<Tarea>) tareaDao.findAll();
    }

    @Override
    @Transactional
    public Tarea save(Tarea tarea) {
        return tareaDao.save(tarea);
    }

    @Override
    @Transactional
    public Tarea findById(Integer id) {
        return tareaDao.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public void delete(Integer id) {
        tareaDao.deleteById(id);
    }
}
