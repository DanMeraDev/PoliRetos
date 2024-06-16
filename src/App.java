import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        try (Scanner msScam = new Scanner(System.in)) {
            MaldonadoShirley msSeries= new MaldonadoShirley();
            int msTam;
            while (true) {
                System.out.print("Por favor ingrese un número entero positivo mayor o igual a 1: ");
                try {
                    msTam= Integer.parseInt(msScam.nextLine());
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
                String msCar= msScam.nextLine();
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
            String msfrase = msScam.nextLine();
            char msvocal;
            while (true) {
                System.out.print("Ingrese una vocal a eliminar: ");
                String msvol = msScam.nextLine().trim().toLowerCase();
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
            String msFrase = msScam.nextLine();
            char msLetra;
            while (true) {
                System.out.print("Ingrese una letra a eliminar: ");
                String msletras = msScam.nextLine().trim();
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
                    msnumeroNombres = Integer.parseInt(msScam.nextLine());
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
                nombres[i] = msScam.nextLine();
                System.out.printf("Ingrese el porcentaje :");
                String[] porcentajesStr = msScam.nextLine().split(" ");
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
            char character = msScam.next().charAt(0);
            msSeries.desplazarCaracter(character);
            System.out.println("Waiting...................................................................................................................................................................................");
            msSeries. runAnimation();
            System.out.println(".....................................................................................RECURSIVIDAD......................................................................");
            int msnumero1, msnumero2, msnumero, msnumeros;
            System.out.println("Ingrese dos números enteros:");
            while (true) {
                if (msScam.hasNextInt()) {
                    msnumero1 = msScam.nextInt();
                    msnumero=msScam.nextInt();
                    if (msScam.hasNextInt()) {
                        msnumero2 = msScam.nextInt();
                        msnumeros=msScam.nextInt();
                        break;
                    } else {
                        System.out.println("Debe ingresar dos números enteros para la suma. Intente de nuevo.");
                        msScam.nextLine(); 
                        System.out.println("Ingrese los dos numeros a multiplicarse");
                        msScam.nextLine();
                    }
                } else {
                    System.out.println("Debe ingresar dos números enteros. Intente de nuevo.");
                    msScam.nextLine(); 
                }
            }
            int mssuma = msSeries.sumaRecursiva(msnumero1, msnumero2);
            System.out.println("La suma de " + msnumero1 + " y " + msnumero2 + " es: " + mssuma);
            System.out.println("Ingrese los dos numeros a multiplicarse");
            int msmultiplicacion = msSeries.multiplicacionRecursiva(msnumero, msnumeros);
            System.out.println("La multiplicación de " + msnumero + " y " + msnumeros + " es: " + msmultiplicacion);
        }
    }
}
