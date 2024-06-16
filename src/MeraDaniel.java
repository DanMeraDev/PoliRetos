import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MeraDaniel {
    Scanner scanner = new Scanner(System.in);

    private String []conjunto = {"Delira", "lidera", "Ballena", "llenaba", "Alondra", "ladrona", "España", "apañes", "Enrique", "quieren"};
    private List<String> anagramas = new ArrayList<>();
    private int size;

    public void setSize(int size) {
        this.size = size;
    }

    /**
     * construye una serie numérica
     */
    public void dmSN6() {
        if(size > 0) {
            for (int i = 1; i <= size; i++) {
                if(i == size) {
                    System.out.print((int)(Math.pow(i, 2)) + " ...");
                } else {
                    System.out.print((int) (Math.pow(i, 2)) + ", ");
                }
            }
            System.out.println();
        } else {
            System.out.println("Número inválido - Serie Númerica 6");
        }
    }

    /**
     * construye una serie numérica
     */
    public void dmSN7() {
        if(size > 0) {
            for (int i = 1; i <= size*3; i = i + 3) {
                if(i == (size+1)) {
                    System.out.print(i + " ...");
                } else {
                    System.out.print(i + ", ");
                }
            }
            System.out.println();
        } else {
            System.out.println("Número inválido - Serie Númerica 7");
        }
    }

    /**
     * construye una serie de caractéres
     */
    public void dmSC5() {
        // \ | / - | \ | / - | \ | / - | ...
        if(size > 0) {
            for (int i = 1; i < size; i++) {
                if(i == 1 || (i-1)%5==0){
                    System.out.print((char)(92) + " ");
                } else if (i == 3 || (i-3)%5==0) {
                    System.out.print("/ ");
                } else if (i == 4 || (i-4)%5==0) {
                    System.out.print("- ");
                } else if (i%5==0 || i%10==2 || i%10==7) {
                    System.out.print("| ");
                }
            }
            System.out.println();
        } else {
            System.out.println("Número inválido - Serie de Caracteres 5");
        }
    }

    /**
     * construye una serie de caractéres
     * @param upper: Determina si las letras serán mayúsculas o no
     */
    public void dmSC6(boolean upper) {
        if(size > 26 || size < 1) {
            System.out.println("Número inválido  - Serie de Caracteres 6");
        } else {
            for(int i = 0; i < size; i++) {
                if(upper) {
                    System.out.print((char)(i+65) + ", ");
                } else System.out.print((char)(i+97) + ", ");
            }
            System.out.println();
        }

    }

    /**
     * construye una figura determinada
     * @param character: determina el caracter a utilizar para la figura
     */
    public void dmF8(String character) {
        if(size > 0 && character.length()==1) {
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size - i - 1; j++) {
                    System.out.print("    ");
                }
                System.out.println(character+character+character+"|");
            }
            System.out.println();
        } else System.out.println("Número o Caracter inválido - Figura 8");
    }

    /**
     * construye una figura determinada
     * @param character: determina el caracter a utilizar para la figura
     */
    public void dmF9(String character) {
        if(size > 0 || character.length()==1) {
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size - i - 1; j++) {
                    System.out.print("    ");
                }
                if (i == 0) {
                    System.out.print(character+character+character);
                } else {
                    System.out.print(character+character+character+"|");
                    for (int j = 0; j < (2 * i - 1); j++) {
                        System.out.print("    ");
                    }
                    System.out.print("|"+character+character+character);
                }
                System.out.println();
            }
            System.out.println();
        } else System.out.println("Número inválido o Caracter - Figura 9");
    }

    /**
     * construye una figura determinada
     * @param character: determina el caracter a utilizar para la figura
     */
    public void dmF10(String character) {
        if(size > 0 || character.length()==1) {
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < i; j++) {
                    System.out.print("    ");
                }
                System.out.println("|"+character+'+'+character);
            }
            System.out.println();
        } else System.out.println("Número inválido o Caracter - Figura 10");
    }

    /**
     * construye una figura determinada
     * @param character: determina el caracter a utilizar para la figura
     */
    public void dmF11(String character) {
        if(size > 0 || character.length()==1) {
            StringBuilder line = new StringBuilder();
            StringBuilder space = new StringBuilder();
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < i; j++) {
                    space.append(" ");
                }
                System.out.print(space.toString());
                line.append(character);
                System.out.println("|" + line.toString());
            }
            System.out.println();
        } else System.out.println("Número inválido o Caracter - Figura 11");
    }

    public void dmC07(String frase, char caracter) {
        int verificateChar = frase.indexOf(caracter);

        if(verificateChar != -1) {
            System.out.println((frase.replace(caracter, '\0').replace("\0", "")).toUpperCase());
        } else {
            System.out.println("Caracter no encontrado en la frase");
        }
    }

    public void dmC08() {
        for (int i = 0; i < conjunto.length; i++) {
            if(i%2==0) {
                anagramas.add(conjunto[i]);
            }
        }
        int random = (int) (Math.random()*anagramas.size());
        String palabraRandom = anagramas.get(random);
        String palabraAnagrama = "";
        for (int i = 0; i < conjunto.length; i++) {
            if(palabraRandom.equals(conjunto[i])){
                palabraAnagrama = conjunto[i+1];
            }
        }
        String palabra = "";
        int contador = 3;
        System.out.println("Intentos: 3");
        do {
            System.out.print("Palabra: ");
            System.out.println(palabraRandom);
            System.out.println("Adivina su anagrama: ");
            palabra = scanner.next();
            contador--;
            if(contador==0 && !palabraAnagrama.equals(palabra)) {
                System.out.println("Perdiste, la respuesta era " + palabraAnagrama);
                break;
            } else if(!palabraAnagrama.equals(palabra)){
                System.out.println("Te quedan " + contador + " intentos");
            } else if (palabraAnagrama.equals(palabra)) {
                System.out.println("Adivinaste la palabra!!!");
            }

        } while (!palabraAnagrama.equals(palabra));
    }

    public void dmA03(String nombre) {
        System.out.println("Por favor, ingrese su nombre:");

        int maxX = nombre.length();
        int maxY = (nombre.length())*2;
        char[] caracteres = nombre.toCharArray();

        for (int y = maxY; y >= 0; y--) {
            if (y % 2 == 0) {
                System.out.printf("%2d |", y);
            } else {
                System.out.print("   |");
            }

            boolean printedChar = false;
            for (int x = 0; x <= maxX; x++) {
                if (2 * x == y && x < caracteres.length) {
                    System.out.print(" " + caracteres[x]);
                    printedChar = true;
                } else {
                    System.out.print("  ");
                }
            }
            if (!printedChar) {
                System.out.print(" ");
            }
            System.out.println();
        }

        System.out.print("   |");
        for (int x = 0; x <= maxX; x++) {
            System.out.print("__");
        }
        System.out.println();

        System.out.print("    ");
        for (int x = 0; x <= maxX; x++) {
            System.out.printf("%2d", x);
        }
        System.out.println();
    }

    public void dmL08(String nombre, String apellido) {
        int tamanio = nombre.length()+apellido.length()+1;
        char []nombreChar = nombre.toCharArray();
        char []apellidoChar = apellido.toCharArray();
        int porcentaje = 0;
        StringBuilder carga = new StringBuilder("[" + " ".repeat(tamanio) + "]");
        for (int i = 0; i < tamanio; i++) {
            if(i < nombre.length()) {
                carga.setCharAt(i+1, nombreChar[i]);
            } else if(i == nombre.length()) {
                carga.setCharAt(i+1, ' ');
            } else {
                carga.setCharAt(i+1, apellidoChar[i-nombre.length()-1]);
            }
            porcentaje += 100/tamanio;
            System.out.print("\r" + carga);
            System.out.print(" " + (porcentaje+1) + "%");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void dmL09(String nombre, String apellido) {
        int tamanio = nombre.length()+apellido.length()+1;
        char []nombreChar = nombre.toCharArray();
        char []apellidoChar = apellido.toCharArray();
        int porcentaje = 0;
        StringBuilder carga = new StringBuilder("[" + " ".repeat(tamanio) + "]");
        for (int i = 0; i < tamanio; i++) {
            if(i < nombre.length()) {
                carga.setCharAt(i+1, nombreChar[i]);
            } else if(i == nombre.length()) {
                carga.setCharAt(i+1, ' ');
            } else {
                carga.setCharAt(i+1, apellidoChar[i-nombre.length()-1]);
            }
            porcentaje += 100/tamanio;
            System.out.print("\r" + carga);
            System.out.print(" " + (porcentaje+1) + "%");
            carga.setCharAt(i+1, ' ');
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void dmR05(int n) {
        // Llamamos al método recursivo empezando por 1
        dmR05(n, 1);
    }

    private void dmR05(int n, int actual) {
        // Caso base: si el número actual es mayor que n, terminamos la recursión
        if (actual > n) {
            return;
        }
        // Imprimimos el número actual
        System.out.println(actual);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // Llamada recursiva incrementando el número actual
        dmR05(n, actual + 1);
    }
}
