package br.com.adriano.springbootcommysql.controller.dto;

import br.com.adriano.springbootcommysql.model.Pessoa;

public class PessoaRq {

    private String nome;
    private String sobrenome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
}
