package com.ac.crudspringbootangular.Model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name="tb_tarea")
public class Tarea {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="Id")
    private Integer Id;

    @Column(name="Tarea")
    private String  Tarea;

    @Column(name="Finalizado")
    private Boolean Finalizado;
}
