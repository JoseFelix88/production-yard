package com.thalisoft.productionyard.repository;

import com.thalisoft.productionyard.model.TiposCosechas;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface TipoCosechaRepository extends JpaRepository<TiposCosechas, UUID> {
}
