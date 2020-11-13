
/**
 *  Representa a una calcualdora que hace sumas octales
 * 
 * @author - Iker Iparraguirre
 * 
 */
public class CalculadoraOctal
{

    /**
     * sumar dos nºs supuestos en base 8 y con el mismo
     * nº de cifras
     * Asumimos positivos
     */
    public int sumarEnOctal(int n1, int n2) {
        int numero1 = n1;
        int numero2 = n2;
        int primerDigitoN1 = 0;
        int primerDigitoN2 = 0;
        int digitoN1 = 0;
        int llevaUno = 0;
        int cantidadCifras = Utilidades.contarCifras(numero1);
        int numeroFinal = 0;
        for(int i=0; i <= cantidadCifras;i++){
            primerDigitoN1 = numero1 %10;
            primerDigitoN2 = numero2 %10;
            numero1 = numero1 / 10;
            numero2 = numero2 / 10;
            if((primerDigitoN1 + primerDigitoN2 + llevaUno) > 7){
                digitoN1 = (primerDigitoN1 + primerDigitoN2 + llevaUno) -8;
                llevaUno = 1;
            }
            
            else{
                digitoN1 = (primerDigitoN1 + primerDigitoN2 + llevaUno);
                llevaUno = 0;
            }
            numeroFinal = numeroFinal + (digitoN1 * (int)Math.pow(10, i));
        }
        
        return numeroFinal;
    }
    
}
