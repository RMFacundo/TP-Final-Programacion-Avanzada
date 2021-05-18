package utn.example.UTN.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import utn.example.UTN.model.Model;

@Repository
public interface ModelRepository extends JpaRepository<Model, Integer> {
}
