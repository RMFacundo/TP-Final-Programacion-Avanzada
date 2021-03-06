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
    private Integer id;

    @NotNull
    private String street;
    @NotNull
    private String number;
    @NotNull
    private Integer postalNumber;

    @NotNull
    private FeeType feeType;

    @OneToOne
    @JoinColumn(name = "energyMeter_serialNumber")
    private EnergyMeter energyMeter;
//    @ManyToOne(fetch = FetchType.LAZY)
//    Cliente cliente;
}
