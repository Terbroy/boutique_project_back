package com.PruebaTecnica.PruebaTecnica.Controller;

import com.PruebaTecnica.PruebaTecnica.Entity.UsuarioEntity;
import com.PruebaTecnica.PruebaTecnica.Repository.UsuarioRepositorory;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/usuarios")

public class UsuarioController
{
    private final UsuarioRepositorory usuarioRepositorory;

    public UsuarioController(UsuarioRepositorory usuarioRepositorory)
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
