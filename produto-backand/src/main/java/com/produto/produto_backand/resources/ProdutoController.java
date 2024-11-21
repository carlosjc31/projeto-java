package com.produto.produto_backand.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.produto.produto_backand.modelos.Produto;

@RestController
public class ProdutoController {
    
    @GetMapping("produtos")
    public Produto getProduto(){

        Produto p = new Produto();
        p.setId(1);
        p.setNome("Notebokk Dell");
        p.setPreco(2000.00);

        return p;
    }
}
