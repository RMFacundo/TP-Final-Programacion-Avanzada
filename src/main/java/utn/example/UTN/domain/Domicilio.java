package utn.example.UTN.domain;

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

public class Domicilio {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    Integer id;

    @NotNull
    String callePrincipal;
    @NotNull
    String numero;

    String calleSecundaria;

    @OneToOne
    @JoinColumn(name = "medidor_id")
    Medidor medidor;
//    @ManyToOne(fetch = FetchType.LAZY)
//    Cliente cliente;
}
