package co.vinni.servicio;

import co.vinni.entidades.Docente;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.transaction.Transactional;

import java.util.List;

@ApplicationScoped
public class DocenteServicio {
    public List<Docente> findAll() {
        return Docente.listAll();
    }
    @Transactional
    public Docente addDocente(Docente producto) {
        producto.persist();
        return producto;
    }
}
