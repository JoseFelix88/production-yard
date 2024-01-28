package com.thalisoft.productionyard.service.impl;

import com.thalisoft.productionyard.model.Categorias;
import com.thalisoft.productionyard.repository.CategoriaRepository;
import com.thalisoft.productionyard.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class CategoriaServiceImpl implements CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;

    @Override
    public Categorias save(Categorias categoria) {
        return categoriaRepository.save(categoria);
    }

    @Override
    public List<Categorias> findAll() {
        return categoriaRepository.findAll();
    }

    @Override
    public Optional<Categorias> findById(UUID id) {
        return categoriaRepository.findById(id);
    }

    @Override
    public ResponseEntity<Categorias> update(UUID id, Categorias categoria) {
        return findById(id)
                .map(existingCategoria -> {
                    existingCategoria.setDescripcion(categoria.getDescripcion().toUpperCase());
                    return ResponseEntity.ok(save(existingCategoria));
                })
                .orElse(ResponseEntity.notFound().build());
    }
}
