package com.thalisoft.productionyard.controllers;

import com.thalisoft.productionyard.model.Categorias;
import com.thalisoft.productionyard.model.TiposCosechas;
import com.thalisoft.productionyard.service.TipoCosechaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/tipo_cosecha")
public class TipoCosechaController {

    @Autowired
    private TipoCosechaService service;

    @GetMapping
    public List<TiposCosechas> getAll() {
        return service.findAll();
    }

    @PostMapping
    public TiposCosechas save(@RequestBody TiposCosechas tiposCosechas) {
        tiposCosechas.setId(UUID.randomUUID());
        tiposCosechas.setDescripcion(tiposCosechas.getDescripcion().toUpperCase());
        return service.save(tiposCosechas);
    }

    @GetMapping("/{id}")
    public ResponseEntity<TiposCosechas> getById(@PathVariable UUID id) {
        return service.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    public ResponseEntity<TiposCosechas> update(@PathVariable UUID id, @RequestBody TiposCosechas tipoCosecha) {
        return service.update(id, tipoCosecha);
    }
}
