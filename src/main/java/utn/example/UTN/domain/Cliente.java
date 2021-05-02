package utn.example.UTN.domain;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity

public class Cliente {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    Integer Id;

    @NotNull
    String nombre;
    @NotNull
    String apellido;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "domicilio_id")
    ArrayList<Domicilio> domicilio;

    @OneToMany
    @JoinColumn(name = "factura_id")
    ArrayList<Factura> factura;
}
