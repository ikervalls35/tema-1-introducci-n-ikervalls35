import java.util.Scanner;
public class ejercicio3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;
        int numero2;
        System.out.print("Ingrese un numero entero: ");
        numero = teclado.nextInt();
        System.out.print("Ingrese otro numero entero: ");
        numero2 = teclado.nextInt();

        if (numero == numero2) {
            System.out.println("El " + numero + " es igual al " + numero2);
        }else if (numero > numero2) {
            System.out.println("El " + numero + " es mayor que el " + numero2);
        }else  {
            System.out.println("El " + numero2 + " es mayor que el " + numero);
        }
            
        }
    }