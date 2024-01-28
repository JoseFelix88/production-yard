package com.thalisoft.productionyard.repository;

import com.thalisoft.productionyard.model.Categorias;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CategoriaRepository extends JpaRepository<Categorias, UUID> {
}
