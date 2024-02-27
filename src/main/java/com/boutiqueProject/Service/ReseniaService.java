package com.boutiqueProject.Service;
import com.boutiqueProject.Entity.Resenia;
import com.boutiqueProject.Repository.ReseniaRepository;
import org.hibernate.sql.Delete;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReseniaService {
    ReseniaRepository reseniaRepository;

    public List<Resenia> getResenia(){
        return reseniaRepository.findAll();
    }
    public Optional<Resenia> getResenia(Integer id){
        return reseniaRepository.findById(id);
    }
    public void saveOrUpdate(Resenia resenia){
        reseniaRepository.save(resenia);
    }

    public void delete (Integer id){
        reseniaRepository.deleteById(id);
    }
}
