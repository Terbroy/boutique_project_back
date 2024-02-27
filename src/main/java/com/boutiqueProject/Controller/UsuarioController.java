package com.boutiqueProject.Controller;


import com.boutiqueProject.Entity.Productos;
import com.boutiqueProject.Entity.Usuarios;
import com.boutiqueProject.Service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/v1/usuarios")

public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping
    public List<Usuarios> getAll() {
        return usuarioService.getUsuarios();
    }

    @GetMapping("/{id}")
    public Optional<Usuarios> getById(@PathVariable("id") Integer id) {
        return usuarioService.getUsuario(id);
    }

    @PostMapping("/{id}")
    public void saveUpdate(@RequestBody Usuarios usuarios) {
        usuarioService.saveOrUpdate(usuarios);
    }

    @DeleteMapping("/{id}")
    public void deleteUsuario(@PathVariable("id") Integer id) {
        usuarioService.delete(id);
    }

}