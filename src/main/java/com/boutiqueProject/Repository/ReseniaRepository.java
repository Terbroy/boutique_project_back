package com.boutiqueProject.Repository;
import com.boutiqueProject.Entity.Resenia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReseniaRepository extends JpaRepository<Resenia, Integer> {
}
