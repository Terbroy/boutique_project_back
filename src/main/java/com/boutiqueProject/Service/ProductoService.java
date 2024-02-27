package com.boutiqueProject.Service;

import com.boutiqueProject.Entity.Productos;
import com.boutiqueProject.Repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductoService {
    @Autowired
    ProductoRepository productoRepository;


    public List<Productos> getProductos(){
        return productoRepository.findAll(); // get
    }
    public Optional<Productos> getProducto(Integer id){
        return productoRepository.findById(id);
    }

    public void saveOrUpdate(Productos productos){
        productoRepository.save(productos); // post --> crear && put||patch --> actualizar
    }

    public void delete(Integer id){
        productoRepository.deleteById(id);// delete -->eliminar
    }

}
