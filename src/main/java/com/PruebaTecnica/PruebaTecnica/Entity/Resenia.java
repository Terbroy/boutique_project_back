package com.PruebaTecnica.PruebaTecnica.Entity;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table (name = "resenia")
public class Resenia {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO);
    private Integer id_resenia;
    private boolean calificacion;
    private String comentario;
    private Integer id_usuario;
    private Integer id_producto;
}
