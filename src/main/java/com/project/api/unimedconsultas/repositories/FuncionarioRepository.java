package com.project.api.unimedconsultas.repositories;


import com.project.api.unimedconsultas.model.Cliente;
import com.project.api.unimedconsultas.model.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FuncionarioRepository extends JpaRepository<Funcionario,Long> {

    List<Funcionario> findBySalarioGreaterThan(Double salario);
}
