/*
 * Clase MoralesLeonel
 * @autor Leonel Morales
 * @version 0.1
 */

 import java.util.HashMap;
 import java.util.Map;
 
 /**
  * Clase que contiene métodos relacionados con operaciones de cadenas,
  * matrices, indicadores de carga y recursividad.
  */
 public class MoralesLeonel {
 
     int contador = 0;
     String vocales = "aeiouAEIOU";
     private static Map<Integer, Integer> memo = new HashMap<>();
 
     /**
      * Método para contar el número de vocales en una cadena dada.
      *
      * @param cadena1 
      * @return Número de vocales .
      */
     public int lmC01(String cadena1) {
         int contadorVocal = 0;
 
         for (int i = 0; i < cadena1.length(); i++) {
             if (vocales.indexOf(cadena1.charAt(i)) != -1) {
                 contadorVocal++;
             }
         }
         return contadorVocal;
     }
 
     /**
      * Método para contar el número de letras en una cadena dada.
      *
      * @param cadena 
      * @return Número de letras .
      */
     public int lmC02(String cadena) {
         int contadorLetra = 0;
 
         for (int i = 0; i < cadena.length(); i++) {
             char caracter = cadena.charAt(i);
             if (Character.isLetter(caracter) && vocales.indexOf(caracter) == -1) {
                 contadorLetra++;
             }
         }
 
         return contadorLetra;
     }
 
     /**
      * Método estático para imprimir una matriz en forma de X 
      *
      * @param nombre   
      * @param apellido 
      */
     public static void lmA04(String nombre, String apellido) {
         int tamaño = Math.max(nombre.length(), apellido.length());
 
         char[][] matriz = new char[tamaño][tamaño];
 
         for (int i = 0; i < tamaño; i++) {
             for (int j = 0; j < tamaño; j++) {
                 matriz[i][j] = ' ';
             }
         }
 
         for (int i = 0; i < nombre.length(); i++) {
             matriz[i][i] = nombre.charAt(i);
         }
 
         for (int i = 0; i < apellido.length(); i++) {
             int row = tamaño - 1 - i;
             int col = i;
             while (col < tamaño && matriz[row][col] != ' ') {
                 col++;
             }
             if (col < tamaño) {
                 matriz[row][col] = apellido.charAt(i);
             }
         }
 
         for (int i = 0; i < tamaño; i++) {
             for (int j = 0; j < tamaño; j++) {
                 System.out.print(matriz[i][j] + " ");
             }
             System.out.println();
         }
     }
 
     /**
      * Método estático para mostrar un indicador de carga.
      */
     public static void lmL01() {
         String[] signos = {"|", "/", "-", "\\"};
         int porcentaje = 0;
         int index = 0;
 
         try {
             while (porcentaje <= 100) {
                 System.out.print("\r" + signos[index] + " " + porcentaje + "%");
                 porcentaje += 5;
                 index = (index + 1) % signos.length;
                 Thread.sleep(100);
             }
             System.out.print("\r/ 100%\n");
         } catch (InterruptedException e) {
             e.printStackTrace();
         }
     }
 
     /**
      * Método estático para simular una barra de carga.
      *
      * @param caracter
      */
     public static void lmL02(char caracter) {
         int longBarra = 20;
         int porcentaje = 0;
         try {
             while (porcentaje <= 100) {
                 int caracteresLlenos = (int) Math.ceil((porcentaje / 100.0) * longBarra);
                 int caracteresVacios = longBarra - caracteresLlenos;
 
                 System.out.print("\r[");
                 for (int i = 0; i < caracteresLlenos; i++) {
                     System.out.print(caracter);
                 }
                 for (int i = 0; i < caracteresVacios; i++) {
                     System.out.print(" ");
                 }
                 System.out.print("] " + porcentaje + "%");
 
                 porcentaje += 20;
 
                 Thread.sleep(500);
             }
             System.out.println();
         } catch (InterruptedException e) {
             e.printStackTrace();
         }
     }
 
     /**
      * Método estático para calcular el factorial de un número utilizando recursividad.
      *
      * @param n 
      * @return Factorial del número dado.
      */
     public static int lmR01(int n) {
         if (memo.containsKey(n)) {
             return memo.get(n);
         }
 
         if (n == 0) {
             memo.put(0, 1);
             return 1;
         } else {
             int result = n * lmR01(n - 1);
             memo.put(n, result);
             return result;
         }
     }
 }