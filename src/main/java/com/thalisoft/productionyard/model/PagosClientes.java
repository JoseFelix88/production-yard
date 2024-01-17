package com.thalisoft.productionyard.model;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.time.ZonedDateTime;
import java.util.UUID;
@Data
@Entity
@Table(name = "pagos_clientes")
public class PagosClientes {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false, columnDefinition = "BINARY(16)")
    private UUID id;

    private ZonedDateTime fechaHoraRegistro;

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Clientes cliente;

    @ManyToOne
    @JoinColumn(name = "cobro_cosecha_id")
    private CobrosCosechas cobroCosecha;

    private BigDecimal valorPagado;

    private BigDecimal saldoPendiente;

    private String medioPago;

    private String titularCuenta;

    private String numeroCuenta;

    private String nombreBanco;
}
