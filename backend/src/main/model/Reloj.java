package main.model;

public class Reloj {
    private static Reloj instance;
    private int hora = 0;

    private Reloj() {}

    public static Reloj getInstance() {
        throw new UnsupportedOperationException("Entrega 2");
    }

    public int horaActual() {
        throw new UnsupportedOperationException("Entrega 2");
    }

    public void avanzar() {
        throw new UnsupportedOperationException("Entrega 2");
    }

    public void reiniciar() {
        throw new UnsupportedOperationException("Entrega 2");
    }
}