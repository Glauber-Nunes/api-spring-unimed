package com.project.api.unimedconsultas.controller;

import com.project.api.unimedconsultas.repositories.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/alunos")
public class AlunoController {

    @Autowired
    AlunoRepository alunoRepository;

    @GetMapping
    public ResponseEntity<List<Object[]>> findMediaNotasPorAluno(){
        return ResponseEntity.status(HttpStatus.OK).body(alunoRepository.findMediaNotasPorAluno());
    }
}
