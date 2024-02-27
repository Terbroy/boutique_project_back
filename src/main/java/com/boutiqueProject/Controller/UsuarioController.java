package com.boutiqueProject.Controller;

import com.boutiqueProject.Repository.UsuarioRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/usuarios")

public class UsuarioController
{
    private final UsuarioRepository usuarioRepositorory;

    public UsuarioController(UsuarioRepository usuarioRepositorory)
    {
        this.usuarioRepositorory = usuarioRepositorory;
    }

    @GetMapping
    public List<UsuarioEntity> obtenerUsuarios()
    {
        return usuarioRepositorory.findAll();
    }

    @PostMapping
    public UsuarioEntity crearUsuario(@RequestBody UsuarioEntity usuario)
    {
        return usuarioRepositorory.save(usuario);
    }

    @PutMapping("/{id}")
    public UsuarioEntity actualizarProductos(@PathVariable Long id, @RequestBody UsuarioEntity usuario)
    {
        return usuarioRepositorory.findById(id).map(usuarioMap ->
        {
            usuarioMap.setNombre(usuario.getNombre());
            usuarioMap.setApellido(usuario.getApellido());
            usuarioMap.setEmail(usuario.getEmail());
            usuarioMap.setTelefono(usuario.getTelefono());
            usuarioMap.setDepartamento(usuario.getDepartamento());
            usuarioMap.setRoles(usuario.getRoles());
            return usuarioRepositorory.save(usuarioMap);
        }).orElse(null);
    }

    @DeleteMapping("/{id}")
    public void borrarUsuario(@PathVariable Long id)
    {
        usuarioRepositorory.deleteById(id);
    }
}
