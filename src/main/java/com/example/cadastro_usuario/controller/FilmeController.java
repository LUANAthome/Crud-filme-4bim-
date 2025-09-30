package com.example.cadastro_usuario.controller;

import com.example.cadastro_usuario.business.FilmeService;
import com.example.cadastro_usuario.infrastructure.entitys.Filme;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/filme")
@RequiredArgsConstructor

public class FilmeController {
    private final FilmeService filmeService;

    @PostMapping
    public ResponseEntity<Void> salvarFilme(@RequestBody Filme filme) {
        filmeService.salvarFilme(filme);
        return ResponseEntity.ok().build();
    }

    @GetMapping
    public ResponseEntity<Filme> buscarFilmePorTitulo(@RequestParam String titulo) {
        return ResponseEntity.ok(filmeService.buscarFilmePorTitulo(titulo));
    }

    @DeleteMapping
    public ResponseEntity<Void> deletarFilmePorTitulo(@RequestParam String titulo){
        filmeService.deletarFilmePorTitulo(titulo);
        return ResponseEntity.ok().build();
    }

    @PutMapping
    public ResponseEntity<Void> atualizarFilmePorId(@RequestBody Filme filme, @RequestParam Integer id){
        filmeService.atualizarFilmePorId(id, filme);
        return ResponseEntity.ok().build();
    }

}