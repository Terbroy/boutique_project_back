package com.boutiqueProject.Repository;

import com.boutiqueProject.Entity.Categorias;
import org.springframework.boot.autoconfigure.jackson.JacksonProperties;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface CategoriasRepository extends JpaRepository<Categorias, Integer> {
}
