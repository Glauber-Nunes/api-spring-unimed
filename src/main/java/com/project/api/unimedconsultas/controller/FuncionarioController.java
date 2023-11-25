package com.project.api.unimedconsultas.controller;

import com.project.api.unimedconsultas.model.Funcionario;
import com.project.api.unimedconsultas.services.FuncionarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/funcionarios")
public class FuncionarioController {

    @Autowired
    FuncionarioService funcionarioService;

    @GetMapping
    public ResponseEntity<List<Funcionario>> findFuncionariosComSalarioSuperior(){
        return ResponseEntity.status(HttpStatus.OK).body(funcionarioService.findFuncionariosComSalarioSuperior());
    }
}
