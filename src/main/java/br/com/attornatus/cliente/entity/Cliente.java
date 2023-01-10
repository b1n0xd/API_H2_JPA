package br.com.attornatus.cliente.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Cliente implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "nome", nullable = false)
    private String nome;
    @Column(name = "dataNascimento", nullable = false)
    private  String dataNascimento;
    @Column(name = "enderecoCompleto", nullable = false)
    private String endereco;
    public class Endereco {
        private String logradouro;
        private String rua;
        private String cep;
        private String numero;
        private String cidade;
}
}
