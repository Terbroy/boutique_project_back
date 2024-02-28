package com.boutiqueProject.Service;

import com.boutiqueProject.Entity.Categorias;
import com.boutiqueProject.Entity.Productos;
import com.boutiqueProject.Repository.CategoriasRepository;
import com.boutiqueProject.Repository.ProductoRepository;
import jakarta.persistence.Id;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.management.loading.PrivateClassLoader;
import java.util.List;
import java.util.Optional;

@Service
public class CategoriaService {
    @Autowired
    CategoriasRepository categoriasRepository;


    public List<Productos> getcategorias(){
        return categoriasRepository.findAll(); // get
    }
    public Optional<Categorias> getProducto(String id){
        return categoriasRepository.findById(id);
    }

    public void saveOrUpdate(Categorias categorias){
        categoriasRepository.save(categorias); // post --> crear && put||patch --> actualizar
    }

    public void delete(String id){
        categoriasRepository.deleteById(id);// delete -->eliminar
    }

}
