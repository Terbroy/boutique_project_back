package com.boutiqueProject.Controller;
import com.boutiqueProject.Entity.Resenia;
import com.boutiqueProject.Service.ReseniaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/v1/resenia")
public class ReseniaController {
    @Autowired
    private ReseniaService reseniaService;

    @GetMapping
    public List<Resenia>getAll(){
        return reseniaService.getResenia();
    }

    @GetMapping(("/{reseniaId}"))
    public Optional<Resenia> getById(@PathVariable ("reseniaId") Integer reseniaId){
        return reseniaService.getResenia(reseniaId);
    }

    @PostMapping
    public void saveUpdate(@RequestBody Resenia resenia){
        reseniaService.saveOrUpdate(resenia);
    }

    @DeleteMapping("/{reseniaId}")
    public void deleteResenia (@PathVariable ("reseniaId") Integer reseniaId){
        reseniaService.delete(reseniaId);

    }
}