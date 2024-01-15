package com.thalisoft.productionyard.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.UUID;

@Data
@Entity
@Table(name = "categorias")
public class Categorias {
    @Id
    @Column(name = "id", nullable = false)
    private UUID id;

    private String descripcion;
}