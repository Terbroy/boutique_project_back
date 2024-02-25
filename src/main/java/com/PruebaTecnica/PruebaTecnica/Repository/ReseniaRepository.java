package com.PruebaTecnica.PruebaTecnica.Repository;
import com.PruebaTecnica.PruebaTecnica.Entity.Resenia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReseniaRepository extends JpaRepository<Resenia, Integer> {
}
