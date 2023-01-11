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
    @Column(name = "logradouro", nullable = false)
        private String logradouro;
    @Column(name = "endereco", nullable = false)
        private String endereco;
    @Column(name = "cep", nullable = false)
        private String cep;
    @Column(name = "numero", nullable = false)
        private String numero;
    @Column(name = "cidade", nullable = false)
        private String cidade;
}
