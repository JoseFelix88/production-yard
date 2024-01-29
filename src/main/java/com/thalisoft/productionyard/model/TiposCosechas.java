package com.thalisoft.productionyard.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.UUID;

@Data
@Entity
@Table(name = "tipos_cosechas")
public class TiposCosechas {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false, columnDefinition = "BINARY(16)")
    private UUID id;

    private String descripcion;

    private ModalidadVenta modalidadVenta;
}