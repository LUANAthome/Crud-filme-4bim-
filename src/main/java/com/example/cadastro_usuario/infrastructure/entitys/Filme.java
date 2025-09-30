package com.example.cadastro_usuario.infrastructure.entitys;

import jakarta.persistence.*;
import lombok.*;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "filme")
@Entity

public class Filme {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "titulo", unique = true)
    private String titulo;

    @Column(name = "diretor")
    private String diretor;

    @Column(name = "ano")
    private Integer ano;

    @Column(name = "genero")
    private String genero;

}