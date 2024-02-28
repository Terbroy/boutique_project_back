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

    @Column(name = "id")
    private Integer id;
    @Column(name = "calificacion")
    private boolean calificacion;
    @Column(name = "comentario")
    private String comentario;
    @ManyToOne
    @JoinColumn(name = "id_usuario")
    private Usuarios usuarios;
    @ManyToOne
    @JoinColumn(name = "id_producto")
    private Productos productos;
}
