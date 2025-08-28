package co.vinni.entidades;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDate;

@Entity
@Table(name="productos")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Producto extends PanacheEntity {
    //https://www.youtube.com/watch?v=7-4tUPrIyqw
    @JsonProperty("elNombre")
    private String nombre;

    private String descripcion;

    private Long valor;


    @CreationTimestamp
    @JsonIgnore
    private LocalDate fechaCreacion;

    @UpdateTimestamp
    @JsonIgnore
    private LocalDate fechaActualizacion;

}
