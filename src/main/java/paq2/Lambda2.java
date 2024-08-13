package paq2;
import java.util.Arrays;
import java.util.List;

public class Lambda2 {
    public static void main(String[] args) {
        List<String> nombres = Arrays.asList("Juan", "Ana", "Pedro");

        // Imprimir todos los nombres en la lista usando una expresión lambda
        nombres.forEach(nombre -> System.out.println(nombre));
        //nombres.forEach(System.out::println);

    }
}
