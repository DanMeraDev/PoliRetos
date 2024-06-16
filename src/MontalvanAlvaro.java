import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.Random;

/**
 * La clase MontalvanAlvaro contiene métodos para realizar diversas operaciones y efectos visuales.
 */
public class MontalvanAlvaro {
    StringBuilder amFrase;
    static Scanner sc = new Scanner(System.in);
    boolean amEsMayuscula;
    char amC;
    int amNumero;
    String amArchivo;
    double amProgreso;
    double amTotal;
    String ANSI_RESET;
    String ANSI_GREEN;
    int amVeces;
    int amTiempoEspera;
    char[][] matrix;
    String fullName;
    Random random = new Random();
    int amMaximaSeñal;
    int amRelleno;
    int amSenalTamano;
    int amNivel;
    
    /**
     * Constructor de la clase MontalvanAlvaro, inicializa variables y configuraciones.
     */
    public MontalvanAlvaro() {
        // Inicialización de variables
        amFrase = new StringBuilder();  
        amEsMayuscula = true;
        amC = ' ';
        amNumero = new Random().nextInt(91) + 10;
        amArchivo = "ArchivoYarl-win_amd64.whl";
        amTotal = amNumero;
        amProgreso = 0;
        ANSI_RESET = "\u001B[0m";
        ANSI_GREEN = "\u001B[32m";
        amVeces = 40;  
        amTiempoEspera = 100;
        fullName = "AlvaroGonzalo";
        amMaximaSeñal = 10;
        amRelleno = 0;
        amSenalTamano = 0;
        amNivel = 50;
    }

    /**
     * Método principal para ejecutar los retos del programa.
     */
    public void poliRetos() {
        lecturaFrase();
        amC09();
        amA05();
        amL10();
        amL11();
        amL12();
        lectorNumero();
        amR06(amNumero);
    }

    /**
     * Método para capitalizar alternadamente las letras de una frase.
     */
    private void amC09() {
        StringBuilder amResultado = new StringBuilder();
        for (int i = 0; i < amFrase.length(); i++) {
            amC = amFrase.charAt(i);
            if (Character.isLetter(amC)) {
                if (amEsMayuscula) {
                    amResultado.append(Character.toUpperCase(amC));
                } else {
                    amResultado.append(Character.toLowerCase(amC));
                }
                amEsMayuscula = !amEsMayuscula;
            } else {
                amResultado.append(amC);
            }
        }
        amFrase = amResultado;
        System.out.println(amFrase.toString());
    }
    
    /**
     * Método para generar una matriz con el nombre completo en posiciones aleatorias.
     */
    private void amA05(){
        int size = fullName.length();
        matrix = new char[size][size];

        // Inicialización de la matriz
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = ' ';
            }
        }

        // Colocación de caracteres en posiciones aleatorias
        for (char c : fullName.toCharArray()) {
            int x, y;
            do {
                x = random.nextInt(size);
                y = random.nextInt(size);
            } while (matrix[x][y] != ' ');

            if (matrix[x][y] == c) {
                matrix[x][y] = '*';
            } else {
                matrix[x][y] = c;
            }
            amImprimirMatriz();
            delay(500);
        }
    }

    /**
     * Método para imprimir la matriz en consola.
     */
    public void amImprimirMatriz() {
        for (char[] row : matrix) {
            for (char c : row) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    /**
     * Método para introducir un retardo en milisegundos.
     * @param amTiempo Tiempo en milisegundos para el retardo.
     */
    public void delay(int amTiempo) {
        try {
            TimeUnit.MILLISECONDS.sleep(amTiempo);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    /**
     * Método para simular la descarga de un archivo con barra de progreso.
     */
    private void amL10() {
        System.out.println("Downloading " + amArchivo + " (" + amNumero + " kB)");
        while (amProgreso < amTotal) {
            amProgreso += new Random().nextInt(5) + 1;
            int progresoPorcentaje = (int) ((amProgreso / amTotal) * 100);
            String barraProgreso = "";
            for (int i = 0; i < 50; i++) {
                if (i < progresoPorcentaje / 2) {
                    barraProgreso += "-";
                } else {
                    barraProgreso += " "; 
                }
            }
            System.out.print("\r" + ANSI_GREEN + barraProgreso + ANSI_RESET + " " + String.format("%.1f", amProgreso) + " / " + amNumero + " kB");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("\nDownload complete!");
    }

    /**
     * Método para dibujar una serie de señales aleatorias.
     */
    public void amL11() { 
        for (int i = 0; i < amNivel; i++) {
            amSenalTamano = random.nextInt(11);
            amDibujarSenal(amSenalTamano);
        }
    }

    /**
     * Método para dibujar una señal con tamaño determinado.
     * @param amTamaño Tamaño de la señal a dibujar.
     */
    public void amDibujarSenal(int amTamaño) {
        amRelleno = amMaximaSeñal - amTamaño; 

        for (int i = 0; i < amRelleno; i++) {
            System.out.print(" ");
        }

        for (int i = 0; i < amTamaño; i++) {
            System.out.print("-");
        }

        System.out.print("|"); 

        for (int i = 0; i < amTamaño; i++) {
            System.out.print("-");
        }

        System.out.println(); 
    }
    
    /**
     * Método para realizar una animación de figuras.
     */
    private void amL12() {
        System.out.println("  \\|||/");
        System.out.println("  ( > < )");
        System.out.println("ooO-(_)-Ooo");

        // Animación ascendente
        for (int i = 0; i < amVeces; i++) {
            try {
                Thread.sleep(amTiempoEspera);
                System.out.print("\033[H\033[2J");
                System.out.flush();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            for (int j = 0; j < i; j++) {
                System.out.print(" "); 
            }
            System.out.println("  \\|||/");
            for (int j = 0; j < i; j++) {
                System.out.print(" "); 
            }
            System.out.println("  ( > < )");
            for (int j = 0; j < i; j++) {
                System.out.print(" "); 
            }
            System.out.println("ooO-(_)-Ooo");
        }

        // Animación descendente
        for (int i = amVeces - 1; i >= 0; i--) {
            try {
                Thread.sleep(amTiempoEspera);
                System.out.print("\033[H\033[2J");
                System.out.flush();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            for (int j = 0; j < i; j++) {
                System.out.print(" "); 
            }
            System.out.println("  \\|||/");
            for (int j = 0; j < i; j++) {
                System.out.print(" "); 
            }
            System.out.println("  ( > < )");
            for (int j = 0; j < i; j++) {
                System.out.print(" "); 
            }
            System.out.println("ooO-(_)-Ooo");
        }
    }

    /**
     * Método recursivo para realizar un conteo regresivo.
     * @param amn Número inicial para el conteo regresivo.
     */
    private void amR06(int amn) {
        if (amn >= 0) {
            amNumero++;
            System.out.println("Conteo regresivo: " + amn);
            amR06(amn - 1);
        } else {
            System.out.println("Fin del conteo regresivo");
        }
    }

    /**
     * Método para leer una frase desde la entrada estándar.
     */
    private void lecturaFrase() {
        System.out.println("Introduce una frase:");
        amFrase.append(sc.nextLine());
    }

    /**
     * Método para leer un número desde la entrada estándar.
    */

    private void lectorNumero() {
        System.out.println("Introduce un número:");
        amNumero = sc.nextInt();
    }
}
