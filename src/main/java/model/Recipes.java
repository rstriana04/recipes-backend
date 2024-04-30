package model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import org.springframework.data.annotation.Id;

@Entity
public class Recipes {
    @jakarta.persistence.Id
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nombre;
    private String descripcion;
    private Integer tiempo;
    private String dificultad;
    private Long tipoComida;


    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
