package com.example.atv1.service;

import com.example.atv1.dto.Departamento.DepartRequest;
import com.example.atv1.dto.Departamento.DepartResponse;
import com.example.atv1.mapper.DepartamentoMapper;
import com.example.atv1.model.Departamento;
import com.example.atv1.repository.DepartamentoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DepartamentoService {

    private final DepartamentoRepository repository;
    private final DepartamentoMapper mapper;

    public DepartResponse criar (DepartRequest dto){
        return mapper.toResponse(repository.save(mapper.toEntity(dto)));
    }

    public List<DepartResponse> listarTodos(){
        return repository.findAll()
                .stream()
                .map(mapper::toResponse)
                .toList();
    }

    public DepartResponse listarPorId(long id){
        return mapper.toResponse(repository.findById(id).orElseThrow(()-> new RuntimeException("Departamento nao encontrado;")));
    }


}
