package utn.example.UTN.model;

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

public class Client {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    Integer id;

    @NotNull
    String name;
    @NotNull
    String lastName;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "residence_id")
    ArrayList<Residence> residence;

    @OneToMany
    @JoinColumn(name = "invoice_id")
    ArrayList<Invoice> invoice;
}
