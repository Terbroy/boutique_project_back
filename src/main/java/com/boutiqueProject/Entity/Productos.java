package com.boutiqueProject.Entity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name="productos")
public class Productos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "precio")
    private Long precio;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "informacion")
    private String informacion;

    @Column(name = "stock")
    private Integer stock;

    @ManyToOne
    @JoinColumn(name = "id_categorias")
    private Categorias categorias;

    @OneToMany
    @JoinColumn(name = "id_imagenes")
    private Imagenes imagenes;
}
