import java.util.Scanner;
/**
 * Modela el interfaz para interactuar con el usuario
 * @author - Iker Iparraguirre
 */
public class IUTexto
{
    private Scanner teclado;
    private CalculadoraOctal calculadora;
    private PintorFiguras pintor;
    private Pantalla pantalla1 = new Pantalla();
    private Utilidades utilidades1 = new Utilidades();
    /**
     * Constructor  
     */
    public IUTexto(CalculadoraOctal calculadora, PintorFiguras pintor)
    {
        this.teclado = new Scanner(System.in);
        this.calculadora = calculadora;
        this.pintor = pintor;
    }

    /**
     * Controla la lógica de la aplicación
     */
    public void iniciar()
    {
        hacerSumasOctales();
        dibujarFiguras();

    }

    /**
     *  - borrar la pantalla
     *  - pedir al usuario un par de números
     *  - si los números no están en octal mostrar un mensaje
     *  - si los números no tienen el mismo número de cifras mostrar un mensaje
     *  - si son correctos calcular su suma octal y mostrar el resultado en pantalla
     *  - los pasos anteriores se repiten mientras el usuario quiera (pulsa 'S' o 's')
     *  
     */
    private void hacerSumasOctales()
    {
        pantalla1.borrarPantalla();
        System.out.println("Introduce el primer numero: ");
        int numero1 = teclado.nextInt();
        System.out.println("Introduce el segundo numero: ");
        int numero2 = teclado.nextInt();
        int sumaTotal = 0;
        String repite= "S";
        while(repite.equals("S") || repite.equals("s")){
        if(utilidades1.estaEnOctal(numero1) && utilidades1.estaEnOctal(numero2)){
            if(utilidades1.contarCifras(numero1) == utilidades1.contarCifras(numero2)){
                sumaTotal = calculadora.sumarEnOctal(numero1, numero2);
            }
            else{
                System.out.println("Los numeros no tienen las mismas cifras");
            }
        }
        else{
            System.out.println("Los numeros no estan en octal.");
        }
        System.out.println("La suma de los numeros es: " + sumaTotal);
        System.out.println("¿Quieres repetir?");
        repite= teclado.nextLine();
        Pantalla.hacerPausa();
    }
}

    /**
     *  Pide al usuario un valor de altura, 
     *  valida que sea correcto (un valor entre 1 y 10)
     *  y muestra la figura en pantalla
     */

    private void dibujarFiguras()
    {
        pantalla1.borrarPantalla();
        int altura = 0;
        boolean correcto = false;
        do{
            System.out.println("Introduce el valor de la altura: ");
            altura = teclado.nextInt();
            if(altura<10 && altura>0){
                correcto = true;
            }
            else{
                 correcto = false;
            }
        }while(!correcto);
        pintor.dibujarFigura(altura);
    
    }

}
