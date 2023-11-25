package com.project.api.unimedconsultas.repositories;


import com.project.api.unimedconsultas.model.Funcionario;
import com.project.api.unimedconsultas.model.Nota;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotaRepository extends JpaRepository<Nota,Long> {
}
