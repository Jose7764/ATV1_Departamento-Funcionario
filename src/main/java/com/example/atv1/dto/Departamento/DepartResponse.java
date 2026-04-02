package com.example.atv1.dto.Departamento;

import com.example.atv1.model.Funcionario;

import java.util.List;

public record DepartResponse (
        long id,
        String nome,
        List<Funcionario> funcionarios
){
}
