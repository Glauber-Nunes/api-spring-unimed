package com.project.api.unimedconsultas.controller;

import com.project.api.unimedconsultas.services.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    @Autowired
    ProdutoService produtoService;

    @GetMapping
    public ResponseEntity<List<Object[]>> countProdutosPorCategoria(){
        return ResponseEntity.status(HttpStatus.OK).body(produtoService.countProdutosPorCategoria());
    }
}
