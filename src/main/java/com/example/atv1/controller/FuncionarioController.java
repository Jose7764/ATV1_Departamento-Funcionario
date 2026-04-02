package com.example.atv1.controller;

import com.example.atv1.dto.Funcionario.FuncionarioRequest;
import com.example.atv1.dto.Funcionario.FuncionarioResponse;
import com.example.atv1.service.FuncionarioService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/funcionario")
@AllArgsConstructor
public class FuncionarioController {

    private final FuncionarioService service;

    @PostMapping("/criar")
    public FuncionarioResponse criar(@RequestBody FuncionarioRequest dto){
        return service.criar(dto);
    }

    @GetMapping("/listar")
    public List<FuncionarioResponse> listarTodos(){
        return service.listarTodos();
    }

    @GetMapping("/listar/{id}")
    public FuncionarioResponse listarPorId(@PathVariable long id){
        return service.listarPorId(id);
    }
}
