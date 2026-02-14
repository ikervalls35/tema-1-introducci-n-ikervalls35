package blog;
public class Comentario {
    private Autor autor;
    private String texto;
    private Entrada entrada;

    public Comentario(Autor autor, String texto, Entrada entrada) {
        this.autor = autor;
        this.texto = texto;
        this.entrada = entrada;
        this.entrada.getComentarioList().add(this);
    }public Autor getAutor() {
        return autor;
    }public String getTexto() {
        return texto;
    }public Entrada getEntrada() {
        return entrada;
    }
}