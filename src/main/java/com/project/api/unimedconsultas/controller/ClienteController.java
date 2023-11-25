package com.project.api.unimedconsultas.controller;

import com.project.api.unimedconsultas.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    ClienteService clienteService;

    @GetMapping
    public ResponseEntity<List<Object[]>> findNomeClientePedidoDataPedido(){
        return ResponseEntity.status(HttpStatus.OK).body(clienteService.findNomeClientePedidoDataPedido());
    }

    @GetMapping("/quantidade-total-itens-pedido")
    public ResponseEntity<List<Object[]>> findQuantidadeTotalItensPorPedido(){
        return ResponseEntity.status(HttpStatus.OK).body(clienteService.findQuantidadeTotalItensPorPedido());
    }
}
