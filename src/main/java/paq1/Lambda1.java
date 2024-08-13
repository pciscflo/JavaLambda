package paq1;
/* Lambda
función sin nombre que se puede definir y pasar como argumento a un método
o asignar a una variable. Las expresiones lambda son útiles principalmente
en el contexto de interfaces funcionales, que son interfaces con un único
método abstracto.
 */
public class Lambda1 {
    public static void main(String[] args) {
        // Usando una lambda para implementar la interfaz paq1.Lambda1.Operacion
        Operacion suma = (a, b) -> a + b;

        // Usando la operación
        int resultado = suma.ejecutar(5, 3);
        System.out.println("Resultado: " + resultado);  // Resultado: 8
    }
}