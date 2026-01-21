package Ejercicio7;
class Prestamo {
    private String fechaPrestamo;
    private Lector lector;
    private Ejemplar ejemplar;

    public Prestamo(String fechaPrestamo, Lector lector, Ejemplar ejemplar) {
        this.fechaPrestamo = fechaPrestamo;
        this.lector = lector;
        this.ejemplar = ejemplar;
        this.lector.getPrestamoList().add(this);
    }public String getFechaPrestamo() {
        return fechaPrestamo;
    }public Lector getLector() {
        return lector;
    }public Ejemplar getEjemplar() {
        return ejemplar;
    }@Override
    public String toString() {
        return "Prestec{" + "fechaPrestamo='" + fechaPrestamo + '\'' + ", lector=" + lector.getDNI() + ", exemplar=" + ejemplar.getN_reg() + '}';
    }
}