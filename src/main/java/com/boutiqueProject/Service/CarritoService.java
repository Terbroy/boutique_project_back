package com.boutiqueProject.Service;

import com.boutiqueProject.Entity.Carrito;
import com.boutiqueProject.Entity.Usuarios;
import com.boutiqueProject.Repository.CarritoRepository;
import com.boutiqueProject.Repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CarritoService {
    @Autowired
    CarritoRepository carritoRepository;
    @Autowired
    UsuarioRepository usuariosRepository;

    public List<Carrito> getCarritos() {
        return carritoRepository.findAll();
    }

    public Optional<Carrito> getCarrito(Integer id) {
        return carritoRepository.findById(id);
    }

    public void saveOrUpdate(Carrito carrito) {
        carritoRepository.save(carrito);
    }
    public void delete(Integer id) {
        carritoRepository.deleteById(id);
    }

}
