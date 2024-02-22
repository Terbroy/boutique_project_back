package com.PruebaTecnica.PruebaTecnica.Repository;

import com.PruebaTecnica.PruebaTecnica.Entity.UsuarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepositorory extends JpaRepository<UsuarioEntity, Long>
{

}
