package com.project.api.unimedconsultas.repositories;


import com.project.api.unimedconsultas.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria,Long> {
}
