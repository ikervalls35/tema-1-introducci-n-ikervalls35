import java.util.ArrayList;
import java.util.List;
public class Statistics {
    public static void main(String[] args) {
        List<String> numeros = new ArrayList<>();
        numeros.add("25");
        numeros.add("30");
        numeros.add("20");

        long cuantos = numeros.stream()
                .mapToInt(s -> Integer.valueOf(s))
                .filter(number -> number % 3 == 0)
                .count();

        double media = numeros.stream()
                .mapToInt(s -> Integer.valueOf(s))
                .average()
                .getAsDouble();

        System.out.printf("Hay %d números múltiplos de 3 y la media es %f%n", cuantos, media );
    }
}