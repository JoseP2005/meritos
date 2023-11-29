package dominio;

import java.util.ArrayList;

public class Catedratico extends Profesor {

    public Catedratico(String nombre) {
        super(nombre);
    }

    @Override
    public double calcularValoracion() {
        double suma = 0;
        for (Merito merito : meritos) {
            suma += Math.pow(merito.valorar(), 2);
        }
        return Math.pow(suma / 4, 0.5);
    }
}
