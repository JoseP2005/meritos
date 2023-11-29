package dominio;
import java.util.*;

public abstract class Profesor {
    protected ArrayList<Merito> meritos = new ArrayList<>();
    private String nombre;
    public Profesor(String nombre) {
        this.nombre = nombre;
        meritos = new ArrayList<>();
    }
    public abstract double calcularValoracion();

    public Profesor annadirMerito(Merito merito) {
        meritos.add(merito);
        return this;
    }

}
