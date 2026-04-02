package com.example.atv1.controller;

import com.example.atv1.dto.Departamento.DepartRequest;
import com.example.atv1.dto.Departamento.DepartResponse;
import com.example.atv1.service.DepartamentoService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/departamento")
@AllArgsConstructor
public class DepartamentoController {

    private final DepartamentoService service;

    @PostMapping("/criar")
    public DepartResponse criar(@RequestBody DepartRequest dto){
        return service.criar(dto);
    }

    @GetMapping("/listar")
    public List<DepartResponse> listarTodos(){
        return service.listarTodos();
    }

    @GetMapping("/listar/{id}")
    public DepartResponse listarPorId(@PathVariable long id){
        return service.listarPorId(id);
    }


}
