package utn.example.UTN.model;

import com.sun.istack.NotNull;
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

public class Measurement {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;

    @NotNull
    private LocalDateTime date;
    @NotNull
    private Float measurementsKwH;
    private Boolean facturada;

    @ManyToOne
    @JoinColumn(name = "energyMeter_serialNumber")
    private EnergyMeter energyMeter;
}
