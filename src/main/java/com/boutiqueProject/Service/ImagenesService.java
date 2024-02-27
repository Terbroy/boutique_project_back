package com.boutiqueProject.Service;
import com.boutiqueProject.Entity.Imagenes;
import com.boutiqueProject.Repository.ImagenesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ImagenesService {
    @Autowired
    ImagenesRepository imagenesRepository;

        public List<Imagenes> getImagen(){
        return imagenesRepository.findAll(); // get
    }
    public Optional<Imagenes> getImagen(Integer id){
        return imagenesRepository.findById(id);
    }

    public void saveOrUpdate(Imagenes imagenes){
        imagenesRepository.save(imagenes);
    }

    public void delete(Integer id){
        imagenesRepository.deleteById(id);
    }

}
