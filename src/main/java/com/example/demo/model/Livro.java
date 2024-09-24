package com.example.demo.model;

import lombok.Getter;
import lombok.Setter;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Livro {

    public Livro(long id, String titulo, String autor, int edicao) {

    }

    @Id @GeneratedValue private long id;
    private String titulo;
    private String autor;
    private int edicao;
}


// Neste código abaixo, está sendo gerado um erro devido a presença
// da anotação @NoArgsConstructor na classe e um construtor vazio ao mesmo tempo

// @Getter
// @Setter
// @NoArgsConstructor
// @AllArgsConstructor
// @Entity
// public class Livro {

//     public Livro() {
        
//     }

//     @Id @GeneratedValue private long id;
//     private String titulo;
//     private String autor;
//     private int edicao;
// }


// No código abaixo também está tendo um erro, visto que tem-se um construtor
// com todas as propriedades da classes em order de criação exatas
// o que acaba por conflitar com a anotação AllArgsConstructor

// @Getter
// @Setter
// @NoArgsConstructor
// @AllArgsConstructor
// @Entity
// public class Livro {

//     public Livro(long id, String titulo, String autor, int edicao) {

//     }

//     @Id @GeneratedValue private long id;
//     private String titulo;
//     private String autor;
//     private int edicao;
// }


// O código abaixo não gera erro, visto que a ordem dos atributos no construtor
// é diferente da ordem de criação das variáveis

// @Getter
// @Setter
// @NoArgsConstructor
// @AllArgsConstructor
// @Entity
// public class Livro {

//     public Livro(long id, String titulo, int edicao, String autor) {

//     }

//     @Id @GeneratedValue private long id;
//     private String titulo;
//     private String autor;
//     private int edicao;
// }

