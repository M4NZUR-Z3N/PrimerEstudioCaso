public class Nodo {
    String nombreRutina;
    String tipoRetorno;
    Nodo siguiente;

    public Nodo(String nombreRutina, String tipoRetorno) {
        this.nombreRutina = nombreRutina;
        this.tipoRetorno = tipoRetorno;
        this.siguiente = null;
    }

    @Override
    public String toString() {
        return "Rutina: " +  nombreRutina + "\nTipo de Retorno: " + tipoRetorno;
    }
}
