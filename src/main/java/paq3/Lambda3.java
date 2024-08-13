package paq3;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda3 {
    public static void main(String[] args) {
        List<String> nombres = Arrays.asList("Juan", "Ana", "Pedro", "Alberto");

        // Filtrar nombres que empiezan con "A" usando una expresión lambda
        List<String> nombresConA = nombres.stream()
                .filter(nombre -> nombre.startsWith("A"))
                .toList();

        nombresConA.forEach(System.out::println);  // Ana, Alberto
        //nombresConA.forEach(nombre -> System.out.println(nombre));
    }
}
