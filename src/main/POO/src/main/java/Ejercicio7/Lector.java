package Ejercicio7;
import java.util.ArrayList;
import java.util.List;
class Lector {
    private String DNI;
    private String nombre;
    private List<Prestamo> prestamoList = new ArrayList<>();
    private List<Historico> historicoList = new ArrayList<>();

    public Lector(String DNI, String nombre) {
        this.DNI = DNI;
        this.nombre = nombre;
    }public String getDNI() {
        return DNI;
    }public String getNombre() {
        return nombre;
    }public List<Prestamo> getPrestamoList() {
        return prestamoList;
    }public List<Historico> getHistoricoList() {
        return historicoList;
    }@Override
    public String toString() {
        return "Lector{" + "DNI='" + DNI + '\'' + ", nombreLector='" + nombre + '\'' + '}';
    }
}