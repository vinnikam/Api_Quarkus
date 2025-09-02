package co.vinni.entidades;


import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Table(name="docentes")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Docente  extends PanacheEntity {

    private String nombre;
    private String apellido;
}
