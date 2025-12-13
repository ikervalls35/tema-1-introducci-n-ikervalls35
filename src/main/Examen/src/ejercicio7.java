import java.util.Scanner;
public class ejercicio7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int dividendo;
        int divisor;
        System.out.println("Introduce el dividendo: ");
        dividendo = teclado.nextInt();
        System.out.println("Introduce el divisor: ");
        divisor = teclado.nextInt();
        do {
            dividendo-=divisor;
        }while (dividendo<divisor);
        System.out.println(dividendo);
    }
}