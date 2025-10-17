package co.vinni.recursos;

import co.vinni.entidades.Docente;
import co.vinni.servicio.DocenteServicio;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import lombok.AllArgsConstructor;

import java.util.List;

@Path("/docentes")
@AllArgsConstructor
public class DocenteRecursos {

    private DocenteServicio docenteServicio;

    @POST
    @Path("/")
    @Produces(MediaType.APPLICATION_JSON)
    public Docente addDocente(Docente producto) {
        return docenteServicio.addDocente(producto);
    }
    @GET
    @Path("/")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Docente> getDocentes() {
        return docenteServicio.findAll();
    }

}
