package com.boutiqueProject.Service;

import com.boutiqueProject.Entity.Usuarios;
import com.boutiqueProject.Repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {
    @Autowired
    UsuarioRepository usuarioRepository;

    public List<Usuarios> getUsuarios() { return usuarioRepository.findAll(); }

    public Optional<Usuarios> getUsuario(Integer id){
        return usuarioRepository.findById(id);
    }

    public void saveOrUpdate(Usuarios usuarios) {
        usuarioRepository.save(usuarios);
    }

    public void delete(Integer id) { usuarioRepository.deleteById(id); }
}
