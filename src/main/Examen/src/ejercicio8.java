import java.util.Scanner;
public class ejercicio8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int multiplicando;
        int multiplicador;
        int mult =0;
        System.out.println("Introduce el multiplicando: ");
        multiplicando = teclado.nextInt();
        System.out.println("Introduce el multiplicador: ");
        multiplicador = teclado.nextInt();
        for (int i = 1; i <= multiplicador; i++) {
            mult+=multiplicando;
        }
        System.out.println(mult);
    }
}