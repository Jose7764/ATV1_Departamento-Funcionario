package com.example.atv1.service;

import com.example.atv1.dto.Funcionario.FuncionarioRequest;
import com.example.atv1.dto.Funcionario.FuncionarioResponse;
import com.example.atv1.mapper.FuncionarioMapper;
import com.example.atv1.model.Departamento;
import com.example.atv1.model.Funcionario;
import com.example.atv1.repository.DepartamentoRepository;
import com.example.atv1.repository.FuncionaroRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FuncionarioService {

    private final FuncionaroRepository repository;
    private final DepartamentoRepository depRepository;
    private final FuncionarioMapper mapper;

    public FuncionarioResponse criar(FuncionarioRequest dto){
        Departamento departamento = depRepository.findById(dto.idDepartamento()).orElseThrow(()-> new RuntimeException("Departamento Incorreto!"));

        Funcionario funcionario = mapper.toEntity(dto);
        funcionario.setDepartamento(departamento);

        return mapper.toResponse(repository.save(funcionario));
    }

    public List<FuncionarioResponse> listarTodos(){
        return repository.findAll()
                .stream()
                .map(mapper::toResponse)
                .toList();
    }

    public FuncionarioResponse listarPorId(long id){
        return mapper.toResponse(repository.findById(id).orElseThrow(()-> new RuntimeException("Funcionario não encontrado!")));
    }
}
