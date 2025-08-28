package co.vinni.repositorios;

import co.vinni.entidades.Producto;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ProductoRepositorio implements PanacheRepository<Producto> {
}
