package com.thalisoft.productionyard.model;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.time.ZonedDateTime;
import java.util.UUID;

@Data
@Entity
@Table(name = "cobros_cosechas")
public class CobrosCosechas {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false, columnDefinition = "BINARY(16)")
    private UUID id;

    @ManyToOne
    private Clientes cliente;

    @ManyToOne
    private Cosechas cosecha;

    private ZonedDateTime fechaHoraRegistro;

    private Double cantidadPeso;

    private Integer cantidadUnidSolicitada;

    private BigDecimal precioUnitario;

    private BigDecimal totalPagoReal;

    private BigDecimal totalCobrar;

    private BigDecimal saldoActual;

    private BigDecimal totalAbono;
}
