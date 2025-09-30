package com.example.cadastro_usuario.infrastructure.repository;

import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.cadastro_usuario.infrastructure.entitys.Filme;

import java.util.Optional;

public interface FilmeRepository extends JpaRepository<Filme, Integer> {
    Optional<Filme> findByTitulo(String titulo);

    @Transactional
    void deleteByTitulo(String titulo);
}