package Ejercicio4;
class Autor {
    private String nombre;
    private String fechaNacimiento;

    public Autor(String nombre, String fechaNacimiento) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }public String getNombre() {
        return nombre;
    }public String getFechaNacimiento() {
        return fechaNacimiento;
    }@Override
    public String toString() {
        return nombre + " (nacido en " + fechaNacimiento + ")";
    }
}