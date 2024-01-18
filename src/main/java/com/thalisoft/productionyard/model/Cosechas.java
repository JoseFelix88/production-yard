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

    private Long numeroCosecha;

    private TimeZone fechaInicio;

    private TimeZone fechaFin;

    @ManyToOne
    @JoinColumn(name = "tipo_cosecha_id")
    private TiposCosechas tipoCosecha;

    private Integer cantidadInicio;

    private Integer cantidadFinal;

    @OneToMany(mappedBy = "cosecha", cascade = CascadeType.ALL)
    @OrderColumn(name = "orden_insumo")  // Aquí se especifica el nombre de la columna de orden
    private List<Insumos> insumos;
}
