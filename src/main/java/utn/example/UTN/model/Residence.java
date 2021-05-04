package utn.example.UTN.model;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity

public class Residence {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    Integer id;

    @NotNull
    String street;
    @NotNull
    String number;

    @OneToOne
    @JoinColumn(name = "energyMeter_serialNumber")
    EnergyMeter energyMeter;
//    @ManyToOne(fetch = FetchType.LAZY)
//    Cliente cliente;
}
