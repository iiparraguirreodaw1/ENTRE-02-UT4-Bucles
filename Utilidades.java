/**
 *   Clase de utilidades
 *   Incluye métodos estáticos
 *   
 *   @author - Iker Iparraguirre 
 */
public class Utilidades
{

    /**
     * Dado un número n (asumimos positivo)
     * devueve true si está en octal false en otro caso
     * Un nº está en octal si cada una de sus cifras
     * es un valor entre 0 y 7
     * 
     * (usa bucles while)
     */
    public static boolean estaEnOctal(int n) {
        int numero = n;
        int resto = 0;
        while(numero >= 8){
            resto = numero %10;
            numero = numero / 10;
            if(resto >= 8){
                return false;
            }
        }
        return true;
    }

    /**
     * Dado un número n (asumimos positivo)
     * devuelve la cantidad de cifras que tiene
     * 
     * (usa bucles while)
     */
    public static int contarCifras(int n) {
        int numero = n;
        int cantidadDigitos = 0;
        while(numero>0){
            numero = numero / 10;
            cantidadDigitos ++;
        }
        return cantidadDigitos;
    }

}
