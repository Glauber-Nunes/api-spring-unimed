package com.project.api.unimedconsultas.cargabd;

import com.project.api.unimedconsultas.model.*;
import com.project.api.unimedconsultas.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.util.Date;

@Configuration

public class CargaBD implements CommandLineRunner {

    @Autowired
    AlunoRepository alunoRepository;
    @Autowired
    CategoriaRepository categoriaRepository;
    @Autowired
    ClienteRepository clienteRepository;
    @Autowired
    FuncionarioRepository funcionarioRepository;
    @Autowired
    NotaRepository notaRepository;
    @Autowired
    PedidoRepository pedidoRepository;
    @Autowired
    ProdutoRepository produtoRepository;

    @Override
    public void run(String... args) throws Exception {

        Aluno aluno = new Aluno(null,"Gabriel");
        alunoRepository.save(aluno);

        Categoria categoria = new Categoria(null,"Material");
        categoriaRepository.save(categoria);

        Cliente cliente = new Cliente(null,"Felipe","felipe@gmail.com");
        clienteRepository.save(cliente);

        Funcionario funcionario = new Funcionario(null,"Ricardo","TI",9200D);
        funcionarioRepository.save(funcionario);

        Nota nota = new Nota(aluno,"JAVA",8D);
        notaRepository.save(nota);

        Produto produto = new Produto(null,"Lapis",categoria);
        produtoRepository.save(produto);

        Pedido pedido = new Pedido(null,cliente,produto,new Date());
        pedidoRepository.save(pedido);

    }
}
