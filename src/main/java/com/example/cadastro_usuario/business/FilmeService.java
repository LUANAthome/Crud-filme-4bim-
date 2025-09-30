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

    public void salvarFilme(Filme filme){
        repository.saveAndFlush(filme);
    }

    public Filme buscarFilmePorTitulo(String titulo){
        return repository.findByTitulo(titulo).orElseThrow(
                () -> new RuntimeException("Filme não encontrado")
        );

    }

    public java.util.List<Filme> listarTodosFilmes(){
        return repository.findAll();
    }

    public void deletarFilmePorTitulo(String titulo){
        repository.deleteByTitulo(titulo);
    }

    public void atualizarFilmePorId(Integer id, Filme filme){
        Filme filmeEntity = repository.findById(id).orElseThrow(() ->
            new RuntimeException("Filme não encontrado"));
        Filme filmeAtualizado = Filme.builder()
                .titulo(filme.getTitulo() != null ? filme.getTitulo() :
                        filmeEntity.getTitulo())
                .diretor(filme.getDiretor() != null ? filme.getDiretor() :
                        filmeEntity.getDiretor())
                .ano(filme.getAno() != null ? filme.getAno() :
                        filmeEntity.getAno())
                .genero(filme.getGenero() != null ? filme.getGenero() :
                        filmeEntity.getGenero())
                .id(filmeEntity.getId())
                .build();

        repository.saveAndFlush(filmeAtualizado);

    }



}