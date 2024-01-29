package com.thalisoft.productionyard.service;

import com.thalisoft.productionyard.model.TiposCosechas;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface TipoCosechaService {

    public TiposCosechas save(TiposCosechas tipoCosecha);

    public List<TiposCosechas> findAll();

    public Optional<TiposCosechas> findById(UUID id);

    public ResponseEntity<TiposCosechas> update(UUID id, TiposCosechas tipoCosecha);
}
