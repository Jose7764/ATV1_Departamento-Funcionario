package com.example.atv1.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Funcionario")
public class Funcionario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String nome;
    private int idade;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "id_depertamento")
    Departamento departamento;

    public Funcionario(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;

    }

    public Funcionario(String nome, int idade, Departamento departamento) {
        this.nome = nome;
        this.idade = idade;
        this.departamento = departamento;
    }
}
