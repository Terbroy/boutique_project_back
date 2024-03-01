package com.boutiqueProject.Service;

import com.boutiqueProject.Entity.Categorias;
import com.boutiqueProject.Repository.CategoriasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriaService {
    @Autowired
    CategoriasRepository categoriasRepository;


    public List<Categorias> getCategorias(){
        return categoriasRepository.findAll();
    }
    public Optional<Categorias> getCategoria(Integer id){
        return categoriasRepository.findById(id);
    }

    public void saveOrUpdate(Categorias categorias){
        categoriasRepository.save(categorias);
    }

    public void delete(Integer id){
        categoriasRepository.deleteById(id);
    }

}
