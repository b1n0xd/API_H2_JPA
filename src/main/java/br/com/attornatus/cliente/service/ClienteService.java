package br.com.attornatus.cliente.service;

import br.com.attornatus.cliente.entity.Cliente;
import br.com.attornatus.cliente.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class ClienteService {
    @Autowired
    private ClienteRepository clienteRepository;

    public Cliente salvar(Cliente cliente){
        return clienteRepository.save(cliente);
    }
    public List<Cliente> listaCliente(){
        return clienteRepository.findAll();
    }
    public Optional<Cliente> buscarPorId(Long id){
        return clienteRepository.findAllById(id);
    }
    public void removerPorId(Long id){
        clienteRepository.deleteAllById(id);

    }

}
