package com.example.atv1.mapper;

import com.example.atv1.dto.Departamento.DepartRequest;
import com.example.atv1.dto.Departamento.DepartResponse;
import com.example.atv1.model.Departamento;
import org.springframework.stereotype.Component;

@Component
public class DepartamentoMapper {

    public Departamento toEntity(DepartRequest dto){
        return new Departamento(dto.nome());
    }

    public DepartResponse toResponse(Departamento depa){
        return new DepartResponse(depa.getId(),
                depa.getNome(),
                depa.getFuncionarios());
    }
}
