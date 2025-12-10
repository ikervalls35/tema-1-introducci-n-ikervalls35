import java.util.Scanner;
public class ejercicio2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;
        System.out.print("Ingrese un numero entero: ");
        numero = teclado.nextInt();

        if (numero % 10 == 0) {
            System.out.println("El numero " + numero + " es multiplo de 10");
            System.out.println("Introduce otro numero entero: ");
            int numero2 = teclado.nextInt();
            if (numero2 % 10 == 0) {
                System.out.println("El numero " + numero2 + " es multiplo de 10");

            }
        }
    }
}