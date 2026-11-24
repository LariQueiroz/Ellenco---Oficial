
package com.ellenco.ellenco.model;

import java.sql.Types;

import org.hibernate.annotations.JdbcTypeCode;

import jakarta.persistence.*;

@Entity
@Table(name = "foto_conteudo")
public class FotoConteudo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //Coluna para os dados no PostgreSQL --> RENDER Produção
    //@Column(nullable = false, columnDefinition = "BYTEA")
    //private byte[] dados;
    
    @JdbcTypeCode(Types.LONGVARBINARY)
    @Column(nullable = false)
    private byte[] dados;

    public FotoConteudo() {
    }

    public FotoConteudo(byte[] dados) {
        this.dados = dados;
    }

    public Long getId() {
        return id;
    }

    public byte[] getDados() {
        return dados;
    }

    public void setDados(byte[] dados) {
        this.dados = dados;
    }
}
