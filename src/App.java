import java.util.Scanner;

public class App {

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
      // Shirley
    try {
            MaldonadoShirley msSeries= new MaldonadoShirley();
            int msTam;
            while (true) {
                System.out.print("Por favor ingrese un número entero positivo mayor o igual a 1: ");
                try {
                    msTam= Integer.parseInt(sc.nextLine());
                    if (msTam >= 1) {
                        break;
                    } else {
                        System.out.println("Por favor, ingrese un número entero positivo mayor o igual a 1.");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Por favor, ingrese un número entero.");
                }
            }
            System.out.println("el tamano ingresado es: " + msTam);
            char msCaracteres;
            while (true) {
                System.out.print("Por favor ingrese un carácter: ");
                String msCar= sc.nextLine();
                if (msCar.length() != 1) {
                    System.out.println("Por favor, ingrese solo un carácter.");
                } else {
                    msCaracteres= msCar.charAt(0);
                    break;
                }
            }
            System.out.println("Carácter ingresado: " + msCaracteres);
            System.out.println("......................................................................................SERIES NUMERICAS.....................................................");
            msSeries. msSN4(msTam);
            msSeries. msSN5(msTam);
            System.out.println("................................................................................SERIES CON CARACTERES..............................................");
            msSeries. smSC3(msCaracteres, msTam);
            msSeries. smSC4(msCaracteres, msTam);
            System.out.println("..............................................................................................FIGURAS.............................................................");
            msSeries. smFig4(msCaracteres, msTam);
            msSeries. msFig5(msCaracteres, msTam);
            msSeries. msFig6(msCaracteres, msTam);
            msSeries. msFig7(msTam);
            System.out.println("....................................................................................CADENA DE CARACTERES ...........................................");
            System.out.println("CARACTER 03......................................................................................................................................................");
            System.out.print("Ingrese una frase: ");
            String msfrase = sc.nextLine();
            char msvocal;
            while (true) {
                System.out.print("Ingrese una vocal a eliminar: ");
                String msvol = sc.nextLine().trim().toLowerCase();
                if (msvol.length() == 1 && "aeiou".contains(msvol)) {
                   msvocal = msvol.charAt(0);
                    break; 
                } else {
                    System.out.println("Entrada inválida. Debes ingresar una única vocal (a, e, i, o, u).");
                }
            }
            msSeries.eliminarVocal(msfrase, msvocal);
            System.out.println("CARACTER 04..........................................................................................................................................................");
            System.out.print("Ingrese una frase: ");
            String msFrase = sc.nextLine();
            char msLetra;
            while (true) {
                System.out.print("Ingrese una letra a eliminar: ");
                String msletras = sc.nextLine().trim();
                if (msletras.length() == 1 && Character.isLetter(msletras.charAt(0))) {
                    msLetra = msletras.charAt(0);
                    break;
                } else {
                    System.out.println("Entrada inválida. Debes ingresar una única letra.");
                }
            }
            msSeries.eliminarLetra(msFrase, msLetra);
            System.out.println(".........................................................................................ARRAYS............................................................................");
            System.out.println("descarga de nombres...........................................................................................................................................");
            int msnumeroNombres= 0;
            while (true) {
                System.out.println("Ingrese el número de nombres (debe ser un número entero positivo):");
                try {
                    msnumeroNombres = Integer.parseInt(sc.nextLine());
                    if (msnumeroNombres > 0) {
                        break; 
                    } else {
                        System.out.println("Ingrese un número entero positivo mayor que cero.");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Entrada inválida. Debe ingresar un número entero.");
                }
            }
            String[] nombres = new String[msnumeroNombres];
            int[][] porcentajes = new int[msnumeroNombres][];
            for (int i = 0; i < msnumeroNombres; i++) {
                System.out.printf("Ingrese el nombre completo #%d:%n", i + 1);
                nombres[i] = sc.nextLine();
                System.out.printf("Ingrese el porcentaje :");
                String[] porcentajesStr = sc.nextLine().split(" ");
                porcentajes[i] = new int[porcentajesStr.length];
                for (int j = 0; j < porcentajesStr.length; j++) {
                    porcentajes[i][j] = Integer.parseInt(porcentajesStr[j]);
                }   
            }
            for (int i = 0; i < msnumeroNombres; i++) {
                msSeries. mostrarAnimacionNombre(nombres[i], porcentajes[i]);
                System.out.println();
                if (i < msnumeroNombres - 1) {
                    msSeries. pausa(1500);
                }
            }
            System.out.println(".........................................................................Loading, Usar el delay para animar................................................... ");
            System.out.println("Ingrese un carácter para desplazar en la barra de progreso:");
            char character = sc.next().charAt(0);
            msSeries.desplazarCaracter(character);
            System.out.println("Waiting...................................................................................................................................................................................");
            msSeries. runAnimation();
            System.out.println(".....................................................................................RECURSIVIDAD......................................................................");
            int msnumero1, msnumero2, msnumero, msnumeros;
            System.out.println("Ingrese dos números enteros:");
            while (true) {
                if (sc.hasNextInt()) {
                    msnumero1 = sc.nextInt();
                    msnumero=sc.nextInt();
                    if (sc.hasNextInt()) {
                        msnumero2 = sc.nextInt();
                        msnumeros=sc.nextInt();
                        break;
                    } else {
                        System.out.println("Debe ingresar dos números enteros para la suma. Intente de nuevo.");
                        sc.nextLine(); 
                        System.out.println("Ingrese los dos numeros a multiplicarse");
                        sc.nextLine();
                    }
                } else {
                    System.out.println("Debe ingresar dos números enteros. Intente de nuevo.");
                    sc.nextLine(); 
                }
            }
            int mssuma = msSeries.sumaRecursiva(msnumero1, msnumero2);
            System.out.println("La suma de " + msnumero1 + " y " + msnumero2 + " es: " + mssuma);
            System.out.println("Ingrese los dos numeros a multiplicarse");
            int msmultiplicacion = msSeries.multiplicacionRecursiva(msnumero, msnumeros);
            System.out.println("La multiplicación de " + msnumero + " y " + msnumeros + " es: " + msmultiplicacion);
        }
  
  
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

