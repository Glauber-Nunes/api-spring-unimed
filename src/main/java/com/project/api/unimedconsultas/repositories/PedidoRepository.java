package com.project.api.unimedconsultas.repositories;


import com.project.api.unimedconsultas.model.Nota;
import com.project.api.unimedconsultas.model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<Pedido,Long> {
}
