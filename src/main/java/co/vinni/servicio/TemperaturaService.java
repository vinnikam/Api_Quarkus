package co.vinni.servicio;

import co.vinni.dto.Temperatura;
import jakarta.enterprise.context.ApplicationScoped;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

@ApplicationScoped
public class TemperaturaService {

    private List<Temperatura> temperaturas = new ArrayList<>();
    public Temperatura addTemperatura(Temperatura temperatura) {
        temperaturas.add(temperatura);
        return temperatura;
    }
    public List<Temperatura> getTemperaturas() {
        return temperaturas;
    }
    public Temperatura getTemperatura() {
        return Temperatura.builder()
                .ciudad("Bogota")
                .maxima(12)
                .minima(3)
                .build();
    }
    public Integer getTemperaturaMaxima() {
        return !temperaturas.isEmpty() ? temperaturas.stream().mapToInt(Temperatura::getMaxima).max().getAsInt() : null;
    }

}
