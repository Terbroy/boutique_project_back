package com.boutiqueProject.Controller;

import com.boutiqueProject.Entity.Categorias;
import com.boutiqueProject.Entity.Productos;
import com.boutiqueProject.Service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/v1/categorias")

public class CategoriaController {

    @Autowired
    private CategoriaService categoriaService;

    @GetMapping
    public List<Categorias> getAll(){
        return categoriaService.getCategorias();
    }

    @GetMapping("/{id}")
    public Optional<Categorias> getOne(@PathVariable("id") Integer id){
        return  categoriaService.getCategoria(id);
    }

    @PostMapping("/{id}")
    public void saveUpdate(@RequestBody Categorias categorias){
        categoriaService.saveOrUpdate(categorias);
    }


    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id){
        categoriaService.delete(id);
    }

}
