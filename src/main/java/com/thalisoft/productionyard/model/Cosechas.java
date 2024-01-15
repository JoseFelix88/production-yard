package com.thalisoft.productionyard.model;


import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;
import java.util.TimeZone;
import java.util.UUID;

@Data
@Entity
@Table(name = "cosechas")
public class Cosechas {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false, columnDefinition = "BINARY(16)")
    private UUID id;

    @Column
    private Long numeroCosecha;

    @Column
    private TimeZone fechaInicio;

    @Column
    private TimeZone fechaFin;

    @ManyToOne
    @JoinColumn(name = "tipo_cosecha_id")
    private TiposCosechas tipoCosecha;

    private Integer cantidadInicio;

    private Integer cantidadFinal;
}
