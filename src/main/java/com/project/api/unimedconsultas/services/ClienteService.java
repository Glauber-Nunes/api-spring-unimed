package com.project.api.unimedconsultas.services;

import com.project.api.unimedconsultas.repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {

    @Autowired
    ClienteRepository clienteRepository;

    public List<Object[]> findNomeClientePedidoDataPedido(){

        return clienteRepository.findNomeClientePedidoDataPedido();
    }

    public List<Object[]> findQuantidadeTotalItensPorPedido(){
        return clienteRepository.findQuantidadeTotalItensPorPedido();
    }
}
