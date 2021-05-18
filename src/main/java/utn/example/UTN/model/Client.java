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
    private Integer id;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "residence_id")
    private ArrayList<Residence> residence;

    @OneToMany
    @JoinColumn(name = "invoice_id")
    private ArrayList<Invoice> invoice;

    @OneToOne
    @JoinColumn(name="username",foreignKey = @ForeignKey(name="FK_clients_users"))
    private User user;
}
