package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Livro;
import com.example.demo.services.LivroService;

@RestController
@RequestMapping("livros")
public class LivroController {

    @Autowired
    private LivroService livroService;

    @GetMapping("/listar")
    public List<Livro> listar() {
        return this.livroService.listBooks();
    }
    
    @PostMapping("/salvar")
    public void save(@RequestBody Livro livro) {
        this.livroService.saveBook(livro);
    }
}