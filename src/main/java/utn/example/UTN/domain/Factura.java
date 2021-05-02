package utn.example.UTN.domain;

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

public class Factura {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    Integer id;

    Float consumoTotal;
    LocalDateTime fechaEmision;

    TipoTarifa tipoTarifa;

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "domicilio_id")
    Domicilio domicilio;

    @ManyToOne
    @JoinColumn(name = "medidor_numeroMedidor")
    Medidor medidor;
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