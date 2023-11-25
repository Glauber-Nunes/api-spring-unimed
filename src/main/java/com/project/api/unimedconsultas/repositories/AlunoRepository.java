package com.project.api.unimedconsultas.repositories;

import com.project.api.unimedconsultas.model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AlunoRepository extends JpaRepository<Aluno,Long> {

    @Query("SELECT a.nome, AVG(n.nota) " +
            "FROM Aluno a " +
            "LEFT JOIN Nota n ON a.id = n.aluno.id " +
            "GROUP BY a.nome")
    List<Object[]> findMediaNotasPorAluno();

}
