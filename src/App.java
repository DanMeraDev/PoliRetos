import java.util.Scanner;

public class App {

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
      
      // Leonel
        MoralesLeonel contador = new MoralesLeonel();

        System.out.println("\n**Cadenas de Caracteres**\n");

        System.out.println("Ejercicio C01 - Ingrese una cadena de texto:");
        String cadena = sc.nextLine();
        int contarVocales = contador.lmC01(cadena);
        System.out.println("El número de vocales es: " + contarVocales);

        System.out.println("Ejercicio C02 - Ingrese una cadena de texto:");
        String cadena2 = sc.nextLine();
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
        char caracter = sc.nextLine().charAt(0);
        MoralesLeonel.lmL02(caracter);

        System.out.println("\n**Recursividad**\n");

        System.out.println("Ejercicio R01 - Ingrese un número para calcular su factorial:");
        int num = sc.nextInt();
        int factorial = MoralesLeonel.lmR01(num);
        System.out.println("El factorial del número es: " + factorial);
      
      // Helen
        JarrinHelen jh = new JarrinHelen();
        jh.jhPoliretos();
      
      // Daniel
        MeraDaniel m= new MeraDaniel();
        System.out.print("Ingrese un tamano para las series: ");
        try {
            int size = sc.nextInt();
            sc.nextLine();
            m.setSize(size);
            System.out.println("Series numéricas");
            m.dmSN6();
            m.dmSN7();
            System.out.println("Series de caracteres");
            m.dmSC6(true);
            m.dmSC5();
            System.out.println("Figuras");
            m.dmF8("_");
            m.dmF9("_");
            m.dmF10("_");
            m.dmF11("_");
        } catch (Exception e) {
            System.out.println("Valor incorrecto");
        }
        System.out.println("Ingrese una frase: ");
        String frase = sc.nextLine();
        System.out.println("Ingrese el caracter a eliminar de su frase");
        char caracter = (sc.nextLine()).charAt(0);
        m.dmC07(frase, caracter);
        m.dmC08();
        System.out.println("Ingrese su nombre: ");
        String nombre = sc.nextLine();
        System.out.println("Ingrese su apellido: ");
        String apellido = sc.nextLine();
        m.dmA03(nombre);
        m.dmL08(nombre, apellido);
        System.out.println();
        m.dmL09(nombre, apellido);
        System.out.println();
        System.out.println("Ingrese un valor para conteo progresivo");
        int n = Integer.parseInt(sc.nextLine());
        m.dmR05(n);

    }

}

