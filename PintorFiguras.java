
/**
 *  Clase que dibuja una figura 
 * 
 * @author - Iker Iparraguirre
 *  
 */
public class PintorFiguras
{
    private static final int ANCHO_BLOQUE = 4;
    private static final char ESPACIO = ' ';
    private static final char CAR1 = 'B';
    private static final char CAR2 = '=';


    /**
     * Dibuja una figura (ver enunciado) de altura
     * indicada (se asume la altura un valor correcto)
     * 
     * (usa bucles for)
     */
    public  void dibujarFigura(int altura) {
      for(int j=(int)(altura); j>0; j--){  
          for(int i=0; i<j; i++) {  
              System.out.print( " " );  
            }  
          System.out.println("BBBB====");
      }
     
        for (int alto =1; alto <= altura; alto++){
        for(int espacio =1; espacio < altura; espacio ++){
            System.out.print("");
        }
        for(int letras = 1; letras <=(alto)-1; letras++){
            System.out.print("====BBBB");
        }
        System.out.println(" ");
      
    }
}
    /**
     * Método privado de ayuda que escribe n espacios en la misma línea
     */
    private  void escribirEspacios(char caracter, int n) {
        /*caracter = ' ';
        int altura = n;
        for(int i=altura; i>0;i++){
            System.out.println(" ");
        }*/
    }
}
