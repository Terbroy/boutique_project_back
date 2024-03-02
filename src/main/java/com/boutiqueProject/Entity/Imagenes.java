package com.boutiqueProject.Entity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.engine.jdbc.Size;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name="imagenes")
public class Imagenes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_imagenes")
    private Integer id_imagenes;

    @Column(name = "url")
    private String url;

    @ManyToOne
    @JoinColumn(name = "productos_id_productos")
    private Productos productos;
}
