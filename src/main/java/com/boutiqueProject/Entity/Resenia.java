package com.boutiqueProject.Entity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table (name = "resenia")
public class Resenia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_resenias;

    private Integer id_resenia;
    private boolean calificacion;
    private String comentario;
    private Integer id_usuario;
    private Integer id_producto;
}
