package Ejercicio4;
import java.util.ArrayList;
import java.util.List;
class Libro {
    private String titulo;
    private Autor autor;
    private int paginas;
    private List<Tema> temas;

    public Libro(String titulo, Autor autor, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
        this.temas = new ArrayList<>();
    }public String getTitulo() {
        return titulo;
    }public Autor getAutor() {
        return autor;
    }public List<Tema> getTemas() {
        return temas;
    }public int getPaginas() {
        return paginas;
    }public void addTema(Tema tema) {
        temas.add(tema);
    }@Override
    public String toString() {
        return "Título: " + titulo + "\nAutor: " + autor + "\nPáginas: " + paginas + "\nTemas: " + temas;
    }
}