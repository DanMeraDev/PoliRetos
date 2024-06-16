import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner lmretos = new Scanner(System.in);
        MoralesLeonel contador = new MoralesLeonel();

        System.out.println("\n**Cadenas de Caracteres**\n");

        System.out.println("Ejercicio C01 - Ingrese una cadena de texto:");
        String cadena = lmretos.nextLine();
        int contarVocales = contador.lmC01(cadena);
        System.out.println("El número de vocales es: " + contarVocales);

        System.out.println("Ejercicio C02 - Ingrese una cadena de texto:");
        String cadena2 = lmretos.nextLine();
        int contarLetras = contador.lmC02(cadena2);
        System.out.println("El número de letras es: " + contarLetras);

        System.out.println("\n**Arrays**");

        System.out.println("Ejercicio A04 - Matriz en X con nombre y apellido");
        MoralesLeonel.lmA04("Leonel", "Morales");

        System.out.println("\n**Login**\n");

        System.out.println("Ejercicio L01 - Indicador de carga");
        MoralesLeonel.lmL01();

        System.out.println("\nEjercicio L02 - Simulador de carga");
        System.out.println("Ingrese un caracter: ");
        char caracter = lmretos.nextLine().charAt(0);
        MoralesLeonel.lmL02(caracter);

        System.out.println("\n**Recursividad**\n");

        System.out.println("Ejercicio R01 - Ingrese un número para calcular su factorial:");
        int num = lmretos.nextInt();
        int factorial = MoralesLeonel.lmR01(num);
        System.out.println("El factorial del número es: " + factorial);

        lmretos.close();
    }
}