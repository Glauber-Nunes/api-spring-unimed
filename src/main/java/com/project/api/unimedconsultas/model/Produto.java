package com.project.api.unimedconsultas.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Produtos")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ProdutoID")
    private Long id;
    @Column(name = "NomeProduto")
    private String nome;

    @JoinColumn(name = "CategoriaID")
    @ManyToOne
    private Categoria categoria;

}
