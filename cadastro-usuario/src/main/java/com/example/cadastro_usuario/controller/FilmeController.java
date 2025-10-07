package com.example.cadastro_usuario.controller;

import com.example.cadastro_usuario.business.FilmeService;
import com.example.cadastro_usuario.infrastructure.entitys.Filme;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuario")
@RequiredArgsConstructor

public class FilmeController {
    private final FilmeService filmeService;

    @PostMapping
    public ResponseEntity<Void> salvarUsuario(@RequestBody Filme filme) {
        filmeService.salvarUsuario(filme);
        return ResponseEntity.ok().build();
    }

    @GetMapping
    public ResponseEntity<Filme> buscarUsuarioPorEmail(@RequestParam String email) {
        return ResponseEntity.ok(filmeService.buscarUsuarioPorEmail(email));
    }

    @DeleteMapping
    public ResponseEntity<Void> deletarUsuarioPorEmail(@RequestParam String email){
        filmeService.deletarUsuarioPorEmail(email);
        return ResponseEntity.ok().build();
    }

    @PutMapping
    public ResponseEntity<Void> atualizarUsuarioPorId(@RequestBody Filme filme, @RequestParam Integer id){
        filmeService.atualizarUsuarioPorId(id, filme);
        return ResponseEntity.ok().build();
    }

}
