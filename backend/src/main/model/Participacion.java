
package dominio.modelo;

public class Participacion {

    private Secuaz secuaz;
    private Ejecucion ejecucion;

    public Participacion(Secuaz secuaz, Ejecucion ejecucion) {
        this.secuaz = secuaz;
        this.ejecucion = ejecucion;
    }

    public Secuaz getSecuaz() {
        return secuaz;
    }

    public Ejecucion getEjecucion() {
        return ejecucion;
    }

    public void setEjecucion(Ejecucion ejecucion) {
        this.ejecucion = ejecucion;
    }
}
