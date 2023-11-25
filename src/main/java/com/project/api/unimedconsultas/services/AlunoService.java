package com.project.api.unimedconsultas.services;

import com.project.api.unimedconsultas.repositories.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlunoService {

    @Autowired
    AlunoRepository alunoRepository;

    public List<Object[]> findMediaNotasPorAluno(){
        return alunoRepository.findMediaNotasPorAluno();
    }
}
