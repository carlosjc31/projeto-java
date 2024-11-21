package com.produto.produto_backand.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.produto.produto_backand.modelos.Produto;

@RestController
public class ProdutoController {
    
    @GetMapping("produto")
    public Produto getProduto(){

        Produto p = new Produto();
        p.setId(1);
        p.setNome("Notebokk Dell");
        p.setPreco(2000.00);

        return p;
    }
    @GetMapping("produtos")
    public List<Produto> getProdutos(){
        Produto p1 = new Produto();
        p1.setId(1);
        p1.setNome("Notebokk Dell");
        p1.setPreco(2000.00);

        Produto p2 = new Produto();
        p2.setId(2);
        p2.setNome("Notebokk Asus");
        p2.setPreco(2000.00);

        Produto p3 = new Produto();
        p3.setId(3);
        p3.setNome("Notebokk Lenovo");
        p3.setPreco(2000.00);

        Produto p4 = new Produto();
        p4.setId(4);
        p4.setNome("Notebokk Apple");
        p4.setPreco(4000.00);

        List<Produto> ListaProdutos = new ArrayList<>();

        ListaProdutos.add(p1);
        ListaProdutos.add(p2);
        ListaProdutos.add(p3);
        ListaProdutos.add(p4);

        return ListaProdutos;
    }

}
