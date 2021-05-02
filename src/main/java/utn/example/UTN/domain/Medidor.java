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


public class Medidor {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    Integer numeroMedidor;

    String marca;
    String modelo;
    LocalDateTime fechaInicial;
    Float medicion;

}