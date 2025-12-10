import java.util.Scanner;
public class ejercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;
        System.out.print("Ingrese un numero: ");
        numero = teclado.nextInt();
        if (numero >= 0) {
            System.out.println("El numero es positivo");
        }else {
            System.out.println("El numero no es positivo");
        }
    }
}