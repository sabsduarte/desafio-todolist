package com.duarte.desafio_todolist.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "todos")
@Data
public class Todo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String descricao;
    private Boolean realizado;
    private int prioridade;
}
