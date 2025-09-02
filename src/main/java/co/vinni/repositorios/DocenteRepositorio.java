package co.vinni.repositorios;

import co.vinni.entidades.Docente;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class DocenteRepositorio implements PanacheRepository<Docente> {
}
