public class Pila {
    private Nodo cima;

    public Pila() {
        this.cima = null;
    }

    public void push(String nombre, String tipo) {
        Nodo nuevo = new Nodo(nombre, tipo);
        nuevo.siguiente = cima;
        cima = nuevo;
        System.out.println("Rutina agregada a la pila exitosamente.");
    }

    public String pop() {
        if (estaVacia()) {
            return "La pila esta vacia. No hay rutinas para eliminar.";
        } else {
            cima = cima.siguiente;
            return "Rutina eliminada exitosamente.";
        }
    }

    public String peek() {
        if (estaVacia()) {
            return "La pila esta vacia.";
        } else {
            return cima.toString();
        }
    }

    public String mostrar() {
        String s = "";
        if (estaVacia()) {
            return "La pila esta vacia.";
        } else {
            s += "Contenido de la pila:\n";
            Nodo actual = cima;
            while (actual != null) {
                s += actual.toString() + "\n";
                actual = actual.siguiente;
            }
        }
        return s;
    }

    public boolean estaVacia() {
        return cima == null;
    }
}
