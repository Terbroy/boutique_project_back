package com.boutiqueProject.Entity;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name="productos")
public class Productos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_productos")
    private Integer id_productos;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "precio")
    private Long precio;

    @Column(name = "informacion")
    private String informacion;

    @Column(name = "descripcion")
    private String descripcion;

    @ManyToOne
    @JoinColumn(name = "categorias_id_categorias")
    private Categorias categorias;

}
