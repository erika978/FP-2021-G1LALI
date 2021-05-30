import java.util.Scanner;

/**
 * EstRepetitive hace comentario un bloque de codigo
 */
//comenta una sola linea
public class EstRepetitive {
    //objTeclado es un objeto
    static Scanner objteclado=new Scanner(System.in);//Permite leer valores por teclado
    /* Inicio a, b son atribulos o variables, pero variales globales */
    static int a=10;
    double b=5;
    /* Fin a, b son atributos o variables, pero variables globales*/
    
    /* Estos son metodos */
    public static void saludo() {
        System.out.print("Ingrese su nombre:");
        String nombre=objteclado.next();//Leer nombre
        System.out.println("Hola: "+nombre+" Como estas?");
        System.out.println("Suma:"+ (a) );

    }

    public void saludo2() {
        System.out.print("Ingrese su nombre:");
        String nombre=objteclado.next();//Leer nombre
        System.out.println("Hola: "+nombre+" Como estas?");
        System.out.println("Suma:"+ (a+b) );
    }

    public static void Suma10NumerosMientras() {
        //Declarar Variables
        double numeros, sumaNumero=0;
        int contador=1;
        //Datos denetrada y proceso
        while(contador<=10){
            System.out.println("Ingrese el valor de la posicion "+contador+":");
            numeros=objteclado.nextDouble();
            sumaNumero=sumaNumero+numeros;
            contador++;
        }
        System.out.println("La suma de los 10 numeros es:"+sumaNumero);
    }

    public static void Suma10NumerosHacerMientras() {
        //Declarar Variables
        double numeros, sumaNumero=0;
        int contador=1;
        //Datos denetrada y proceso
        do{
            System.out.println("Ingrese el valor de la posicion "+contador+":");
            numeros=objteclado.nextDouble();
            sumaNumero=sumaNumero+numeros;
            contador++;

        }
        while(contador<=10);
        System.out.println("La suma de los 10 numeros es:"+sumaNumero);
    }
    public static void Suma10NumerosPara() {
        //Declarar Variables
        double numeros, sumaNumero=0;
        
        //Datos denetrada y proceso
        for(int contador=1;contador<=10;contador++){
            System.out.println("Ingrese el valor de la posicion "+contador+":");
            numeros=objteclado.nextDouble();
            sumaNumero=sumaNumero+numeros;

        }
        System.out.println("La suma de los 10 numeros es:"+sumaNumero);
    }

    public static void main(String[] args) {
        //saludo(); 
        //Suma10NumerosMientras();
        //Suma10NumerosHacerMientras();
        Suma10NumerosPara();
        /*EstRepetitive obj=new EstRepetitive();
        obj.saludo2();*/
    }
}