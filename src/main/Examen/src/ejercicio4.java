import java.util.Scanner;
public class ejercicio4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float papel = 0.00001f;
        double edificio;
        System.out.println("Introduce la altura del edificio en metros: ");
        edificio = teclado.nextFloat();

        int dobleces = 0;
        do{
            papel = papel * 2;
         dobleces++;
         }while(edificio > papel);

        System.out.println(dobleces);
    }
}