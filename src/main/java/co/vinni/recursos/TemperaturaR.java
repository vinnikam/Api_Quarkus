package co.vinni.recursos;

import co.vinni.dto.MensajeRta;
import co.vinni.dto.Temperatura;
import co.vinni.servicio.TemperaturaService;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import lombok.AllArgsConstructor;

import java.util.List;
import java.util.Optional;

@Path("/temp")
@AllArgsConstructor
public class TemperaturaR {
    private TemperaturaService temperaturaService;
    @GET
    @Path("/")
    @Produces(MediaType.APPLICATION_JSON)
    public Temperatura getTemperatura() {
        return temperaturaService.getTemperatura();
    }
    @GET
    @Path("/all")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Temperatura> getTemperaturas() {
        return temperaturaService.getTemperaturas();
    }
    @GET
    @Path("/maxima")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getMaxima() {
        Optional<Integer> optionalValor = Optional.ofNullable(temperaturaService.getTemperaturaMaxima());
        return optionalValor.map((valor) ->
                        Response.status(Response.Status.OK)
                                .entity(new MensajeRta(valor.toString()))
                                .build())
                                .orElseGet(() ->
                        Response.status(Response.Status.NOT_FOUND)
                                .entity(new MensajeRta("no_hay_temperatura"))
                        .build());
    }
    @POST
    @Path("/")
    @Produces(MediaType.APPLICATION_JSON)
    public Temperatura postTemperatura(Temperatura temperatura) {
        return temperaturaService.addTemperatura(temperatura);
    }
}
