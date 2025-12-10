import java.util.Scanner;
public class ejercicio6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;
        System.out.println("Ingrese un numero natural:  ");
        numero = teclado.nextInt();

        for (int i = 1; i <= numero; i++) {
            if(numero % i == 0){
                System.out.println(i);
            }
        }
    }
}