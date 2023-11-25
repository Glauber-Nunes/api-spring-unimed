package com.project.api.unimedconsultas.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Table(name = "Notas")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Nota {


    @ManyToOne
    @JoinColumn(name = "AlunoID")
    private Aluno aluno;

    @Id
    @Column(name = "Disciplina")
    private String disciplina;

    private Double nota;
}
