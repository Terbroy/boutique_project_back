package com.boutiqueProject.Controller;

import com.boutiqueProject.Entity.Carrito;
import com.boutiqueProject.Service.CarritoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/v1/carritos")
public class CarritoController {

    @Autowired
    private CarritoService carritoService;
    @GetMapping
    public List<Carrito> getAll(){
        return carritoService.getCarritos();
    }

    @GetMapping("/{carritoId}")
    public Optional<Carrito> getById(@PathVariable("carritoId") Integer carritoId){
        return carritoService.getCarrito(carritoId);
    }

    @PostMapping
    public void saveUpdate(@RequestBody Carrito carrito){
        carritoService.saveOrUpdate(carrito);
    }

    @DeleteMapping("/{carritoId}")
    public void delete(@PathVariable("carritoId") Integer carritoId){
        carritoService.delete(carritoId);
    }
}
