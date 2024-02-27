package com.boutiqueProject.Repository;

import com.boutiqueProject.Entity.UsuarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepositorory extends JpaRepository<UsuarioEntity, Long>
{

}
