package com.project.api.unimedconsultas.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Table(name = "Pedidos")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PedidoID")
    private Long id;
    @ManyToOne
    @JoinColumn(name = "ClienteID")
    private Cliente cliente;
    @ManyToOne
    @JoinColumn(name = "ProdutoID")
    private Produto produto;
    private Date dataPedido;
}
