package com.produto.produto_backand.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    
    @GetMapping("ola")
    public String getController(){
        return "Bem-vindo ao Spring Boot";
    }
}
