package com.project.api.unimedconsultas.services;

import com.project.api.unimedconsultas.model.Funcionario;
import com.project.api.unimedconsultas.repositories.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FuncionarioService {

    @Autowired
    FuncionarioRepository funcionarioRepository;

    public List<Funcionario> findFuncionariosComSalarioSuperior() {

        return funcionarioRepository.findBySalarioGreaterThan(80000.0);
    }
}
