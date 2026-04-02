package com.example.atv1.mapper;

import com.example.atv1.dto.Funcionario.FuncionarioRequest;
import com.example.atv1.dto.Funcionario.FuncionarioResponse;
import com.example.atv1.model.Funcionario;
import org.springframework.stereotype.Component;

@Component
public class FuncionarioMapper {

    public Funcionario toEntity(FuncionarioRequest dto){
        return new Funcionario(dto.nome(), dto.idade());
    }

    public FuncionarioResponse toResponse(Funcionario func){
        return new FuncionarioResponse(func.getId(), func.getNome(), func.getIdade(), func.getDepartamento());
    }
}
