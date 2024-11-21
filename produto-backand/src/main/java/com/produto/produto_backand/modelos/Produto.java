package com.produto.produto_backand.modelos;

import org.springframework.web.bind.annotation.GetMapping;

public class Produto {

    private int id;
    private String nome;
    private double preco;

    @GetMapping
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }

    
    
}
