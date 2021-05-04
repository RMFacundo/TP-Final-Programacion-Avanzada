package utn.example.UTN.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import utn.example.UTN.model.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Integer> {
}
