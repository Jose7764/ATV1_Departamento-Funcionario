package com.example.atv1.dto.Funcionario;

public record FuncionarioRequest (
        String nome,
        int idade,
        long idDepartamento
){
}
