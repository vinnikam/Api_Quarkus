package co.vinni.recursos;

import co.vinni.dto.Temperatura;
import co.vinni.entidades.Producto;
import co.vinni.servicio.ProductoServicio;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import lombok.AllArgsConstructor;

import java.util.List;

@Path("/producto")
@AllArgsConstructor
public class ProductoResouce {

    private ProductoServicio productoServicio;

    @POST
    @Path("/")
    @Produces(MediaType.APPLICATION_JSON)
    public Producto addProducto(Producto producto) {
        return productoServicio.addProducto(producto);
    }
    @GET
    @Path("/")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Producto> getProductos() {
        return productoServicio.findAll();
    }

}
