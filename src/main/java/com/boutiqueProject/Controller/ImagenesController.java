package com.boutiqueProject.Controller;
import com.boutiqueProject.Entity.Imagenes;
import com.boutiqueProject.Service.ImagenesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/v1/imagenes")
public class ImagenesController {
    @Autowired
    private ImagenesService imagenesService;

    @GetMapping
    public List<Imagenes> getAll(){
        return imagenesService.getImagen();
    }

    @GetMapping("/{id}")
    public Optional<Imagenes> getOne(@PathVariable("id") Integer id){
        return  imagenesService.getImagen(id);
    }

    @PostMapping
    public void saveUpdate(@RequestBody Imagenes imagenes){
        imagenesService.saveOrUpdate(imagenes);
    }


    @DeleteMapping("/{id}")
    public void deleteImagen(@PathVariable("id") Integer id){
        imagenesService.delete(id);
    }
}
