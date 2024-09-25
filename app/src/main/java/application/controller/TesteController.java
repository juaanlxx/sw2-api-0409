package application.controller;

import java.util.Arrays;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/frutas")
public class TesteController { 
    private String[] f = {"Maçã", "Banana", "Morango"};  
    @GetMapping // usado por causa do métoto get
    public Iterable<String> get() { // convertendo o vetor em um <iterable>, e retorna um arquivo json
        return Arrays.asList(f);
    }
    @GetMapping("/{id}")
    public String get(@PathVariable int id){
        return f[id];
    }
}
