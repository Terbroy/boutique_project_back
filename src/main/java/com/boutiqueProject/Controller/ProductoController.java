package com.boutiqueProject.Controller;

import com.boutiqueProject.Entity.Productos;
import com.boutiqueProject.Service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/v1/productos")
public class ProductoController {

    @Autowired
    private ProductoService productoService;

    @GetMapping
    public List<Productos> getAll(){
        return productoService.getProductos();
    }

    @GetMapping("/{id}")
    public Optional<Productos> getOne(@PathVariable("id") Integer id){
        return  productoService.getProducto(id);
    }

    @PostMappin
    public void saveUpdate(@RequestBody Productos productos){
        productoService.saveOrUpdate(productos);
    }


    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable("id") Integer id){
        productoService.delete(id);
    }

}

