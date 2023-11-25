package com.project.api.unimedconsultas.repositories;


import com.project.api.unimedconsultas.model.Pedido;
import com.project.api.unimedconsultas.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProdutoRepository extends JpaRepository<Produto,Long> {

    @Query("SELECT c.nome, COUNT(p) " +
            "FROM Produto p " +
            "JOIN p.categoria c " +
            "GROUP BY c.nome")
    List<Object[]> countProdutosPorCategoria();
}
