package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Livro;
import com.example.demo.repository.LivroRepository;

@Service
public class LivroService {

    @Autowired
    private LivroRepository livroRepository;

    // acessa a base de dados relacional usando o livroRepository 
    // save foi implementado automaticamente
    // usando as anotações descritas na interface Repository
    public void saveBook(Livro livro) {
        this.livroRepository.save(livro);
    }

    // Usando para buscar todos os livros contidos na tabela Livro
    // Equivalente ao SELECT *
    public List<Livro> listBooks() {
        return this.livroRepository.findAll();
    }
}
