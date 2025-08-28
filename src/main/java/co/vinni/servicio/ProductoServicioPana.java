package co.vinni.servicio;

import co.vinni.entidades.Producto;
import jakarta.transaction.Transactional;

import java.util.List;

public class ProductoServicioPana {
    public List<Producto> findAll() {
        return Producto.listAll();
    }
    @Transactional
    public Producto addProducto(Producto producto) {
        producto.persist();
        return producto;
    }
}
