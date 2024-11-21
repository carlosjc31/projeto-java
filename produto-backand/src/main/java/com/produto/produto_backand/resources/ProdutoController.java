package com.produto.produto_backand.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.produto.produto_backand.modelos.Produto;

import jakarta.annotation.PostConstruct;

@RestController
public class ProdutoController {
    
    List<Produto> produtos = new ArrayList<>();

    @PostConstruct
    public void init(){

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

        produtos.add(p1);
        produtos.add(p2);
        produtos.add(p3);
        produtos.add(p4);

    }

    @GetMapping("produtos/{id}") //recupera os produto pelo id
    public ResponseEntity<Produto> getProduto(@PathVariable int id){

        if(id <= produtos.size()){    
            return ResponseEntity.ok(produtos.get(id - 1));
        }
        else{
            return ResponseEntity.notFound().build();
        }

        
    }

    @GetMapping("produtos") 
    public List<Produto> getProdutos(){

        return produtos;
    }

}
