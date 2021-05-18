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


public class EnergyMeter {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer serialNumber;

    private String brand;
    private String model;

    private Float measure;

}