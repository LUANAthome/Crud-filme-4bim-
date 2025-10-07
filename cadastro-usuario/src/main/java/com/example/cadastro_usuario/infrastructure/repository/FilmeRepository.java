package com.example.cadastro_usuario.infrastructure.repository;

import com.example.cadastro_usuario.infrastructure.entitys.Filme;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface FilmeRepository extends JpaRepository<Filme, Integer> {
    Optional<Filme> findByEmail(String email);

    @Transactional
    void deleteByEmail(String email);
}
