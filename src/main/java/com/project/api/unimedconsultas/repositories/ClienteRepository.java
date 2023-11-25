package com.project.api.unimedconsultas.repositories;


import com.project.api.unimedconsultas.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente,Long> {

    @Query("SELECT c.nome, p.id, p.dataPedido " +
            "FROM Pedido p " +
            "JOIN p.cliente c " +
            "ORDER BY p.dataPedido DESC")
    List<Object[]> findNomeClientePedidoDataPedido();

    @Query("SELECT c.nome, p.id, COUNT(pr.id) " +
            "FROM Cliente c " +
            "JOIN c.pedidos p " +
            "JOIN p.produto pr " +
            "GROUP BY c.nome, p.id")
    List<Object[]> findQuantidadeTotalItensPorPedido();
}
