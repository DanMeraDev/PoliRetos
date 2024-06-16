/**
 * Clase JarrinHelen
 * @version 1.0
 * @author: Helen_Jarrin
 */
public class JarrinHelen {
   
    public void jhPoliretos (){
        int hjTamano = 0,a,b;
        String hjFrase ;
        char hjCaracter ;
        double potencia;

        System.out.println("\n SN1");
        hjTamano=obtenerhjTamano();
        jhSN1(hjTamano);

        System.out.println("\n SN2");
        hjTamano = obtenerhjTamano();
        jhSN2(hjTamano);

        System.out.println("\n SN3");
        hjTamano = obtenerhjTamano();
        jhSN3(hjTamano);

        System.out.println("\n SC1");
        hjTamano   = obtenerhjTamano();
        hjCaracter = obtenerCaracter();
        jhSC1(hjTamano,hjCaracter);

        System.out.println("\n SC2");
        hjTamano   = obtenerhjTamano();
        hjCaracter = obtenerCaracter();
        jhSC1(hjTamano,hjCaracter);

        System.out.println("\n F1");
        hjTamano   = obtenerhjTamano();
        hjCaracter = obtenerCaracter();
        jhF1(hjTamano,hjCaracter);

        System.out.println("\n F2");
        hjTamano   = obtenerhjTamano();
        hjCaracter = obtenerCaracter();
        jhF2(hjTamano,hjCaracter);

        System.out.println("\n F3");
        hjTamano   = obtenerhjTamano();
        hjCaracter = obtenerCaracter();
        jhF3(hjTamano,hjCaracter);

        System.out.println("\n C05");
        hjFrase = obtenerFrase();
        jhC05(hjFrase);
        System.out.println("\n C06");
        hjFrase = obtenerFrase();
        jhC06(hjFrase);

        System.out.println("\n A02");
        hjTamano   = obtenerhjTamano();
        hjCaracter = obtenerCaracter();
        jhA02(hjTamano, hjCaracter);

        System.out.println("\n L05");
        jhL05();
        
        System.out.println("\n L06");
        jhL06();

        System.out.println("\n L07");
        jhL07();

        System.out.println("\n R04");
        a = obtenerValorPotencia();
        b = obtenerValorPotencia();
        potencia=jhR04(a,b);
        System.out.println("La potencia es: "+potencia);
    }
    /** 
     * construye la serie numerica 01 con jhTamano
     * @param jhTamano: tamano de la serie
    */
    public void jhSN1(int jhTamano){
        System.out.println("\nSerie Numerica 01");
        long v1=0,v2=1,sum;
    
        for(int i=0; i<jhTamano;i++){
            if(i<2){ 
                System.out.print(i + " " );
            }else{    
                sum=v1+v2;
                v1=v2;
                v2=sum;
                System.out.print(sum + " ");
            }    
        }
        System.err.println("");
    }
    /**
     * construye la serie numerica 02 con jhTamano
     * @param jhTamano: tamano de la serie
     */
    public void jhSN2(int jhTamano){
        System.out.println("\nSerie Numerica 02");
        for(int i=0; i<jhTamano;i++){
            if((i+1)%2==0)
                System.out.print(0 + " ");
            else
                System.out.print((i+1) + " ");
        }
        System.out.println("");
    }
    /**
     * construye la serie numerica 03 con jhTamano
     * @param jhTamano: tamano de la serie
     */
    public void jhSN3(int jhTamano){
        long  nume1=0, nume2=1, sum, denom=1;
        System.out.println("\nSerie Numerica 03");
        for(int i=0;i<jhTamano;i++){
            if(i<2){
                System.out.print(i+"/"+denom+" ");
            }else{
                sum=nume1+nume2;
                nume1=nume2;
                nume2=sum;
                System.out.print(sum+"/"+denom+" ");
            }
            denom=denom+2;
        }
        System.out.println("");
    }

    /**
     * construye la serie de caracteres 01 con jhTamano y jhCaracter
     * @param jhTamano: tamano de la serie
     * @param jhCaracter: caracter que va en la serie
     */
    public void jhSC1(int jhTamano,char jhCaracter){
        System.out.println("\nSerie de caracteres 01");
        char caracQuemado='+';
        for(int i=0; i<jhTamano;i++){
            if(i%2==0)
                System.out.print(caracQuemado+" ");
            else
                System.out.print(jhCaracter + " ");
        }
        System.out.println("");
    }
    /**
     * construye la serie de caracteres 02 con jhTamano y jhCaracter
     * @param jhTamano: tamano de la serie
     * @param jhCaracter: caracter que va en la serie
     */
    public void jhSC2(int jhTamano, char jhCaracter){
        System.out.println("\nSerie de caracteres 02");
        long v1=1,v2=1, cant;
    
        for(int i=0; i<jhTamano;i++){
            if(i<2){ 
                cant=v1;
            }else{    
                cant=v1+v2;
                v1=v2;
                v2=cant;
            } 
            for(int j=0; j<cant;j++){
                System.out.print(jhCaracter  );
            } 
            System.out.print(" ");  
        }
        System.out.println("");
    }
    /**
     * construye la figura 01 con jhTamano y jhCaracter
     * @param jhTamano: tamano de la figura
     * @param jhCaracter: caracter de la figura
     */
    public void jhF1(int jhTamano, char jhCaracter){
        System.out.println("\nFigura 01");
        for(int i=0; i<jhTamano;i++){
            for(int j=0; j<jhTamano;j++){
                if((i==0||i==(jhTamano-1))||(j==0 || j==jhTamano-1))
                    System.out.print(jhCaracter+" ");
                else
                    System.out.print("  ");
            }
            System.out.println("");
        }
    }

    /**
     *  construye la figura 02 con jhTamano y jhCaracter
     * @param jhTamano: tamano de la figura
     * @param jhCaracter: caracter de la figura
     */
    public void jhF2(int jhTamano, char jhCaracter){
        char cQuemado='+';
        System.out.println("\nFigura 02");

        for(int i=0; i<jhTamano;i++){
            for(int j=0; j<jhTamano;j++){
                if((i==0||i==(jhTamano-1))||(j==0 || j==jhTamano-1))
                    if(((i%2==0&&j%2!=0)||(j%2==0 && i%2!=0)))
                        System.out.print(cQuemado + " ");
                    else
                        System.out.print(jhCaracter +" ");
                else
                    System.out.print("  ");
            }
            System.out.println("");
        }
    }

    /**
     *  construye la figura 03 con jhTamano y jhCaracter
     * @param jhTamano: tamano de la figura
     * @param jhCaracter: caracter de la figura
     */
    public void jhF3(int jhTamano, char jhCaracter){
        System.out.println("\nFigura 03");

        for(int i=0; i<jhTamano; i++){
            for(int j=0; j<i+1; j++){
                System.out.print(jhCaracter + " ");
            }
            System.out.println("");
        }
    }
    /**
     * Obtiene los valores de potencia
     * @return
     */
    private int obtenerValorPotencia(){
        boolean bandera ;
        int hjvalor = 0 ;
        do {
            try {
                    System.out.println("Ingrese un numero ");
                    hjvalor = Integer.parseInt(App.sc.nextLine());
                bandera = true;
            } catch (NumberFormatException e) {
                bandera = false;
                System.out.println("Debe ser un numero");
            }
        } while (bandera == false);
        return hjvalor;
    }
    /**
     * Recursividad para obtener una potencia
     * @param a
     * @param b
     * @return
     */
    private double jhR04(int a, int b) {
        if(b==0)
            return 1;

        if(b<0)
            return 1/jhR04(a, -b);
        
        return a*jhR04(a, b-1);
    }
    /**
     * Barra de 20 caracteres progresiva
     */
    private void jhL07() {
        int cantCaracteres=21;
        char[] signos = {'\\', '|','/','-'};
        for(int i=0; i<=100;i++){
            if(i%5==0){
                cantCaracteres-=1;
                System.out.print("\r"
                + "["
                + "=".repeat(i/5)
                + signos[i%signos.length]
                + " ".repeat(cantCaracteres)
                + "]"
                + i + "%" );
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {}
        }
    }
    /**
     * Barra de 20 caracteres progresiva
     */
    private void jhL06() {
        
        for (int i = 0; i <= 100; i++) {
            int posicion = (int) ((i / (double) 100) * (20 - 4)); // -4 para ajustar el tamaño de <=> y mantenerlo dentro de la barra
            String barra = "[";
            for (int j = 0; j < 20; j++) {
                if (j == posicion) {
                    barra += "<=>";
                    j += 2;
                } else {
                    barra += " ";
                }
            }
            barra += "] " + i + "%";
            System.out.print("\r" + barra);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {}
        }
    }
    /**
     * Barra de 20 caracteres progresiva
     */
    private void jhL05() {
        int cantCaracteres = 21;
        for(int i=0; i<=100;i++){
            if(i%5==0){
                cantCaracteres = cantCaracteres-1;
                System.out.print("\r"
                                 + "["
                                 + "=".repeat(i/5)
                                 + ">"
                                 + " ".repeat(cantCaracteres)
                                 + "]"
                                 + i + "%" );
            }

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {}
        }
    }
    /**
     * Invierte la frase con las consonates mayusculas
     * @param hjFrase
     */
    private void jhC06(String hjFrase) {
        String fraseNew="";
        for(int i=0; i<hjFrase.length(); i++){
            if(    hjFrase.charAt(i) == 'a'
                || hjFrase.charAt(i) == 'e'
                || hjFrase.charAt(i) == 'i'
                || hjFrase.charAt(i) == 'o'
                || hjFrase.charAt(i) == 'u')
                fraseNew = hjFrase.charAt(i) + fraseNew;
            else
                fraseNew = hjFrase.toUpperCase().charAt(i) + fraseNew;
        }
        System.out.println(fraseNew);
    }
    /**
     * Obtiene el caracter
     * @return
     */
    private char obtenerCaracter(){
        String hjChar    ="";
        char hjCaracter;   
        do {
            System.out.println("Ingrese el caracter:");
            hjChar = App.sc.nextLine();
        } while (hjChar.length() != 1);
        hjCaracter = hjChar.charAt(0);
        return hjCaracter;
    }
    /**
     * Obtiene la frase
     * @return
     */
    private String obtenerFrase(){
        String hjFrase = "";
        do{
            System.out.println("Ingrese la frase:");
            hjFrase = App.sc.nextLine();
        }while(hjFrase == "");
        return hjFrase.toLowerCase();
    }
    /**
     * Obtiene el tamano
     * @return
     */
    private int obtenerhjTamano(){
        int hjTamano = 0;
        boolean bandera = true;
        do {
            try {
                do {
                    System.out.println("Ingrese el tamano: ");
                    hjTamano = Integer.parseInt(App.sc.nextLine());
                } while (hjTamano <= 0);
                bandera = true;
            } catch (NumberFormatException e) {
                bandera = false;
                System.out.println("Debe ser un numero mayor a cero(0)");
            }
        } while (bandera == false);
        return hjTamano;
    }
    /**
     * Invierte la frase con las vocales mayusculas
     * @param hjFrase
     */
    private void jhC05(String hjFrase){
        String fraseNew="";
        for(int i=0; i<hjFrase.length(); i++){
            if(    hjFrase.charAt(i) == 'a'
                || hjFrase.charAt(i) == 'e'
                || hjFrase.charAt(i) == 'i'
                || hjFrase.charAt(i) == 'o'
                || hjFrase.charAt(i) == 'a')
                fraseNew = hjFrase.toUpperCase().charAt(i) + fraseNew;
            else
                fraseNew = hjFrase.charAt(i) + fraseNew;
        }
        System.out.println(fraseNew);
    }
    /**
     * Se crea el reto A02
     * @param hjTamano
     * @param hjCaracter
     */
    private void jhA02(int hjTamano, char hjCaracter){
        char [][] matrizInicialePri = new char[hjTamano][hjTamano];
        char [][] matrizInicialeSec = new char[hjTamano][hjTamano];
        System.out.println("Mi nombre es Helen Jarrin  => HJ");
        for(int i = 0; i<hjTamano; i++){
            for(int j =0; j<hjTamano; j++){
                if ((j==0 || j==hjTamano-1 )||i==(hjTamano/2))
                    matrizInicialePri[i][j] = hjCaracter; 
                else  
                    matrizInicialePri[i][j] = ' ';   
            }
            for (int j = 0; j < hjTamano; j++) {
                if ((i==0)||(j==hjTamano/2||(i==(hjTamano-1)&&j<(hjTamano/2)+1)))
                    matrizInicialeSec [i][j] = hjCaracter;  
                else  
                    matrizInicialeSec[i][j] = ' ';                 
            }
        }
        
        for(int i=0; i<hjTamano; i++){
            for (int j = 0; j < hjTamano; j++) {
                System.out.print(matrizInicialePri[i][j]);     
            }   
            System.out.print("  ");
            for (int j = 0; j < hjTamano; j++) {
                System.out.print(matrizInicialeSec[i][j]);
            }
            System.out.println("");
        }
    }

}
