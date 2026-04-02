package com.example.atv1.dto.Funcionario;

import com.example.atv1.model.Departamento;

public record FuncionarioResponse (
        long id,
        String nome,
        int idade,
        Departamento Departamento
){
}
