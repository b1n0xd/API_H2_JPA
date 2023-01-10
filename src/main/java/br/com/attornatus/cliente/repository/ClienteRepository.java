package br.com.attornatus.cliente.repository;

import br.com.attornatus.cliente.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
    Optional<Cliente> findAllById(Long id);

    void deleteAllById(Long id);
}
