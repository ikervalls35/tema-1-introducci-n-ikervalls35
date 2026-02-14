package blog;
import java.util.ArrayList;
import java.util.List;
public class Autor {
    private String nombre;
    private Blog blog;
    private List<Entrada> entradaList = new ArrayList<>();

    public Autor(String nombre, Blog blog) {
        this.nombre = nombre;
        this.blog = blog;
        this.blog.getAutorList().add(this);
    }public String getNombre() {
        return nombre;
    }public List<Entrada> getEntradaList() {
        return entradaList;
    }
}