package Ejercicio7;
public class Main7 {
    public static void main(String[] args) {
        Tema tema1 = new Tema("T001", "Filosofía");

        Editorial editorial1 = new Editorial("E001", "Ediciones Sabiduría");

        Autor autor1 = new Autor("A001", "Platón");

        Libro libro1 = new Libro("ISBN001", "La República", tema1, editorial1);
        libro1.addAutor(autor1);

        Ejemplar ejemplar1 = new Ejemplar("REG001", libro1);

        Lector lector1 = new Lector("DNI001", "Ana");

        Prestamo prestamo1 = new Prestamo("21-01-2026", lector1, ejemplar1);

        Historico historico1 = new Historico("10-01-2025", "15-01-2025", lector1, ejemplar1);

        System.out.println(
                        "LIBRO:\n" +
                        libro1 + "\n\n" +

                        "AUTOR:\n" +
                        autor1 + "\n\n" +

                        "EDITORIAL:\n" +
                        editorial1 + "\n\n" +

                        "TEMA:\n" +
                        tema1 + "\n\n" +

                        "EJEMPLAR:\n" +
                        ejemplar1 + "\n\n" +

                        "LECTOR:\n" +
                        lector1 + "\n\n" +

                        "PRESTAMOS DEL LECTOR:\n" +
                        lector1.getPrestamoList() + "\n\n" +

                        "HISTORICO DEL LECTOR:\n" +
                        lector1.getHistoricoList() + "\n\n" +

                        "HISTORICO DEL EJEMPLAR:\n" +
                        ejemplar1.getHistoricoList() + "\n");
    }
}