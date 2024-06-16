import java.util.Scanner;
import java.util.Random;

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
    
    public MontalvanAlvaro() {
        amFrase         = new StringBuilder();  
        amEsMayuscula   = true;
        amC             = ' ';
        amNumero        = new Random().nextInt(91) + 10;
        amArchivo       = "ArchivoYarl-win_amd64.whl";
        amTotal         = amNumero;
        amProgreso      = 0;
        ANSI_RESET      = "\u001B[0m";
        ANSI_GREEN      = "\u001B[32m";
        amVeces         = 40;  
        amTiempoEspera  = 100;
    }

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
    
    private void amA05(){

    }

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

    public void amL11() {
        
    }
    
    private void amL12() {
        System.out.println("  \\|||/");
        System.out.println("  ( > < )");
        System.out.println("ooO-(_)-Ooo");

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

    private void amR06(int n) {
        if (n >= 0) {
            amNumero++;
            System.out.println("Conteo regresivo: " + n);
            amR06(n - 1);
        } else {
            System.out.println("Fin del conteo regresivo");
        }
    }


    private void lecturaFrase() {
        System.out.println("Introduce una frase:");
        amFrase.append(sc.nextLine());
    }
    private void lectorNumero() {
        System.out.println("Introduce un número:");
        amNumero = sc.nextInt();
    }
}
