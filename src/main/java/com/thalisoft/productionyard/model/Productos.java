package com.thalisoft.productionyard.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.UUID;

@Data
@Entity
@Table(name = "productos")
public class Productos {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false, columnDefinition = "BINARY(16)")
    private UUID id;

    private String descripcion;

    private Long precioUnitario;

    private Integer cantidadDisponible;

    private boolean esPerecedero;

    @ManyToOne
    private Categorias categoria;
}