package utn.example.UTN.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity

public class Invoice {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;

    //CONSUMPTION
    private Integer initialConsumption;
    private Integer finalConsumption;
    private Float totalConsumption;

    //DATES
    private LocalDateTime emissionDate;
    private LocalDateTime initialReadingDate;
    private LocalDateTime finalReadingDate;


    @Column(columnDefinition = "bool default 0")
    private Boolean paid;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;

    @ManyToOne
    @JoinColumn(name = "residence_id")
    private Residence residence;

    @ManyToOne
    @JoinColumn(name = "energyMeter_serialNumber")
    private EnergyMeter energyMeter;
}

// DEBE TENER;
//        . Cliente --> traigo en relacion
//        ● Domicilio --> traigo en relacion
//        ● Numero de medidor --> traigo en relacion
//        ● Medición inicial --> la tiene el medidor
//        ● Medición final --> atributo de Factura
//        ● Fecha y hora medición inicial -->
//        ● Fecha y hora medición final --> todos los iniciales y finales hay que ver la mejor forma de traerlos.
//        ● Consumo total en Kwh --> atributo de Factura
//        ● Tipo de tarifa --> Enum
//        ● Total a pagar (Consumo * Tarifa) -->