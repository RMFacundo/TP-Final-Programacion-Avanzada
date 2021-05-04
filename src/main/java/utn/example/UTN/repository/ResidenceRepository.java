package utn.example.UTN.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import utn.example.UTN.model.Residence;

@Repository
public interface ResidenceRepository extends JpaRepository<Residence, Integer> {
}
