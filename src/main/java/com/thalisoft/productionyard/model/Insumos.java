package com.thalisoft.productionyard.model;


import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@Entity
@Table(name = "insumos")
public class Insumos {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false, columnDefinition = "BINARY(16)")
    private UUID id;

    @ManyToOne
    private Productos producto;

    private String proveedor;

    private Integer cantidadSolicitada;

    private Long precioUnidad;

    private Long totalPagado;

    private String unidadMedida;

    @ManyToOne
    @JoinColumn(name = "cosecha_id")
    private Cosechas cosecha;
}