package dominio;

import java.util.ArrayList;

public class ProfesorTitular extends Profesor {
    public ProfesorTitular() {
        super(""); // Llama al constructor de la clase base sin un nombre específico
    }

    @Override
    public double calcularValoracion() {
        double suma = 0;
        if (meritos.size() == 0) {
            return 0;
        } else {
            for (Merito merito : meritos) {
                suma += merito.valorar();
            }
            return suma / meritos.size();
        }
    }
}
