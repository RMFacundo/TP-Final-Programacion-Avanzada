package utn.example.UTN.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import utn.example.UTN.model.EnergyMeter;

@Repository
public interface EnergyMeterRepository extends JpaRepository<EnergyMeter, Integer> {
}
