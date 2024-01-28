package com.thalisoft.productionyard.service;

import com.thalisoft.productionyard.model.Categorias;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface CategoriaService {

    public Categorias save(Categorias categoria);

    public List<Categorias> findAll();

    public Optional<Categorias> findById(UUID id);

    public ResponseEntity<Categorias> update(UUID id, Categorias categoria);
}
