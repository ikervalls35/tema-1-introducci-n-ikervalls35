package Ejercicio7;
import java.util.ArrayList;
import java.util.List;
class Ejemplar {
    private String n_reg;
    private Libro libro;
    private List<Historico> historicoList = new ArrayList<>();

    public Ejemplar(String n_reg, Libro libro) {
        this.n_reg = n_reg;
        this.libro = libro;
        this.libro.getEjemplarList().add(this);
    }public String getN_reg() {
        return n_reg;
    }public Libro getLibro() {
        return libro;
    }public List<Historico> getHistoricoList() {
        return historicoList;
    }@Override
    public String toString() {
        return "Ejemplar{" + "n_reg='" + n_reg + '\'' + ", libro=" + libro.getISBN() + '}';
    }
}