package co.vinni.servicio;

import co.vinni.entidades.Producto;
import co.vinni.repositorios.ProductoRepositorio;
import io.quarkus.panache.common.Sort;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;

import java.util.List;

@ApplicationScoped
@AllArgsConstructor
public class ProductoServicio {
    //@Inject
    private ProductoRepositorio productoRepositorio;

    public List<Producto> findAll() {
        return this.productoRepositorio.listAll();
    }
    public List<Producto> findNombre(String nombre) {
        return this.productoRepositorio.list("nombre",nombre);
    }
    public List<Producto> findNombreDescripcion(String nombre, String descripcion) {
        String filter1 = '%'+nombre+'%';
        String filter2 = '%'+descripcion+'%';
        return this.productoRepositorio.list("nombre ILIKE ?1 or descripcion ILIKE ?2",filter1, filter2);
    }
    public List<Producto> sortNombre() {
        return this.productoRepositorio.listAll(Sort.by("nombre",Sort.Direction.Ascending));
    }
    @Transactional
    public Producto addProducto(Producto producto) {
        this.productoRepositorio.persist(producto);
        return producto;
    }

}
