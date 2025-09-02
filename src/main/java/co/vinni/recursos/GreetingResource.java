package co.vinni.recursos;


import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import lombok.AllArgsConstructor;

import java.util.Optional;

@Path("/")
@AllArgsConstructor
public class GreetingResource {


/* OPCIONAL SI NO SE USA LOMBOK
    @Inject
    public GreetingResource(TemperaturaService temperaturaService) {
        this.temperaturaService = temperaturaService;
    }
*/

    @GET
    @Path("parametros")
    @Produces(MediaType.TEXT_PLAIN)
    public String usandoParametros(@QueryParam("mensaje") String mensaje)
    {
        return Optional.ofNullable(mensaje)
                .orElse("Parametro vacio");
    }
    @GET
    @Path("/{nombre}")
    @Produces(MediaType.TEXT_PLAIN)
    public String usandoPathParam(@PathParam("nombre") String nombre)
    {
        return Optional.ofNullable(nombre)
                .orElse("Parametro vacio");
    }
    @GET
    @Path("/{nombre}/{apellido}")
    @Produces(MediaType.TEXT_PLAIN)
    public String usandoPathParam(@PathParam("nombre") String nombre,
                                  @PathParam("apellido") String apellido)
    {
        return Optional.ofNullable(nombre)
                .orElse("Parametro nombre vacio")+
               Optional.ofNullable(apellido)
                        .orElse("Parametro apellido vacio");
    }
    @GET
    @Path("/")
    @Produces(MediaType.TEXT_PLAIN)
    public String basico() {
        return "Aplicacion Quarkus";
    }

}
