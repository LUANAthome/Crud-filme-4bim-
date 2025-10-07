package com.example.cadastro_usuario.business;

import com.example.cadastro_usuario.infrastructure.entitys.Filme;
import com.example.cadastro_usuario.infrastructure.repository.FilmeRepository;
import org.springframework.stereotype.Service;

@Service

public class FilmeService {

    private final FilmeRepository repository;

    public FilmeService(FilmeRepository repository) {
        this.repository = repository;
    }

    public void salvarUsuario(Filme filme){
        repository.saveAndFlush(filme);
    }

    public Filme buscarUsuarioPorEmail(String email){
        return repository.findByEmail(email).orElseThrow(
                () -> new RuntimeException("Email não encontrado")
        );

    }

    public void deletarUsuarioPorEmail(String email){
        repository.deleteByEmail(email);
    }

    public void atualizarUsuarioPorId(Integer id, Filme filme){
        Filme filmeEntity = repository.findById(id).orElseThrow(() ->
            new RuntimeException("Usuario não encontrado"));
        Filme filmeAtualizado = com.example.cadastro_usuario.infrastructure.entitys.Filme.builder()
                .email(filme.getEmail() != null ? filme.getEmail() :
                        filmeEntity.getEmail())
                .nome(filme.getNome() != null ? filme.getNome() :
                        filmeEntity.getNome())
                .id(filmeEntity.getId())
                .build();

        repository.saveAndFlush(filmeAtualizado);

    }



}
