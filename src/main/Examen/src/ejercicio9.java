import java.util.Scanner;
public class ejercicio9 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double horas;
        double precio;
        double SalarioBruto;
        double impuestos;
        System.out.println("Ingrese el numero de horas: ");
        horas = teclado.nextDouble();
        System.out.println("Ingrese el valor de precio: ");
        precio = teclado.nextDouble();
        impuestos = teclado.nextDouble();
        SalarioBruto = teclado.nextDouble();

        if (horas<35){
            precio= horas*precio;
            System.out.println("Salario Bruto: " + precio);
        }else if (horas>35){
            SalarioBruto = horas*precio;
            SalarioBruto += (horas - 35) * (precio * horas);
            System.out.println("Salario Bruto: " + SalarioBruto);
        }
        if (precio<500){
            impuestos = 0;
            System.out.println("Impuestos: " + impuestos);
        }
        else if (precio < 900){
            SalarioBruto = (SalarioBruto-500) + 400 * 0.25;
            SalarioBruto = SalarioBruto - impuestos;
            System.out.println("Salario Bruto: " + SalarioBruto);
        }else {
            SalarioBruto = 400 * 0.25 + (SalarioBruto-900) + 400 * 0.45;
            SalarioBruto = SalarioBruto - impuestos;
            System.out.println("Salario Bruto: " + SalarioBruto);
        }

        System.out.println("Salario neto" + SalarioBruto);

    }
}