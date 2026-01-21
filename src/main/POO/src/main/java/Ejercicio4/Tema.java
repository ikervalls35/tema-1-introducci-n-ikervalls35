package Ejercicio4;
class Tema {
    private String nombre;

    public Tema(String nombre) {
        this.nombre = nombre;
    }public String getNombre() {
        return nombre;
    }@Override
    public String toString() {
        return nombre;
    }
}