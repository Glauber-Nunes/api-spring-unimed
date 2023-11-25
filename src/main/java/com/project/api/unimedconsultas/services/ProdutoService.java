package com.project.api.unimedconsultas.services;

import com.project.api.unimedconsultas.repositories.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {

    @Autowired
    ProdutoRepository produtoRepository;

    public List<Object[]> countProdutosPorCategoria(){
        return produtoRepository.countProdutosPorCategoria();
    }
}
