package pizzeria;

public class PuntosFidelizacion {
    private static PuntosFidelizacion instance;
    private int puntos;

    private PuntosFidelizacion() {
        puntos = 0;
    }

    public static PuntosFidelizacion getInstance() {
        if (instance == null) {
            synchronized (PuntosFidelizacion.class) {
                if (instance == null) {
                    instance = new PuntosFidelizacion();
                }
            }
        }
        return instance;
    }

    public void acumularPuntos(int cantidad) {
        puntos += cantidad;
    }

    public int getPuntos() {
        return puntos;
    }
}
