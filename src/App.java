import java.util.Scanner;

public class App {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
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
