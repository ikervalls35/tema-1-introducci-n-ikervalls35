import java.util.Scanner;
public class ejercicio5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double nota;
        int contador = 0;
        double suma = 0;
        boolean diez = false;
        System.out.println("Ingrese su nota: ");
        nota = teclado.nextDouble();

        do {
            if (nota != -1) {
                suma+= nota;
                contador++;
            }
                if (diez) {
                    diez = true;
                }
        }while(nota != -1);

        System.out.println("La nota media es igual a " + suma / contador);

        if (diez)
            System.out.println("Habia un diez en las notas");
    }
}