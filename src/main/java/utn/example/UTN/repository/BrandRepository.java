package utn.example.UTN.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import utn.example.UTN.model.Brand;

@Repository
public interface BrandRepository extends JpaRepository<Brand, Integer> {
}
