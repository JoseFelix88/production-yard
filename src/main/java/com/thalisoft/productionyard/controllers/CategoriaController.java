package com.thalisoft.productionyard.controllers;

import com.thalisoft.productionyard.model.Categorias;
import com.thalisoft.productionyard.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/categorias")
public class CategoriaController {

    @Autowired
    private CategoriaService categoriaService;

    @GetMapping
    public List<Categorias> getAllCategorias() {
        return categoriaService.findAll();
    }

    @PostMapping
    public Categorias save(@RequestBody Categorias categoria) {
        categoria.setId(UUID.randomUUID());
        categoria.setDescripcion(categoria.getDescripcion().toUpperCase());
        return categoriaService.save(categoria);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Categorias> getCategoriaById(@PathVariable UUID id) {
        return categoriaService.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Categorias> updateCategoria(@PathVariable UUID id, @RequestBody Categorias updatedCategoria) {
        return categoriaService.update(id, updatedCategoria);
    }
}
