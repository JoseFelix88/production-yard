package com.thalisoft.productionyard.service.impl;

import com.thalisoft.productionyard.model.TiposCosechas;
import com.thalisoft.productionyard.repository.TipoCosechaRepository;
import com.thalisoft.productionyard.service.TipoCosechaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class TipoCosechaServiceImpl implements TipoCosechaService {

    @Autowired
    private TipoCosechaRepository repository;

    @Override
    public TiposCosechas save(TiposCosechas tipoCosecha) {
        return repository.save(tipoCosecha);
    }

    @Override
    public List<TiposCosechas> findAll() {
        return repository.findAll();
    }

    @Override
    public Optional<TiposCosechas> findById(UUID id) {
        return repository.findById(id);
    }

    @Override
    public ResponseEntity<TiposCosechas> update(UUID id, TiposCosechas tipoCosecha) {
        return findById(id)
                .map(tipoCosechaExist -> {
                    tipoCosechaExist.setDescripcion(tipoCosecha.getDescripcion().toUpperCase());
                    tipoCosechaExist.setModalidadVenta(tipoCosecha.getModalidadVenta());
                    return ResponseEntity.ok(save(tipoCosechaExist));
                })
                .orElse(ResponseEntity.notFound().build());
    }
}
