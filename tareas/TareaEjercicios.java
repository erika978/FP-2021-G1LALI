import java.util.Scanner;

public class TareaEjercicios {
    static Scanner teclado=new Scanner(System.in);

    public static int hallarfactorial(int numero) {
        int factorialResult=1;
        if(numero>1){
            for (int i = 2; i <= numero; i++) {
                factorialResult*=i;
            }
        }
        return factorialResult;  
    }

    public static void calcularFuncionExponencial() {
        //Declarar Varaibles
        int x, lfx;
        double fx=1;
        //Datos de entrada
        System.out.println("Ingrese un numero para calcular la funcion exponencial:");
        x=teclado.nextInt();
        System.out.println("Ingrese el limite de la funcion exponencial:");
        lfx=teclado.nextInt();
        //Proceso
        if(x>0){
            for (int i = 1; i < lfx; i++) {
                System.out.println(fx);
                //fx+=((Math.pow(x, i))/hallarFactorial(i))
                fx+=((Math.pow(x, i))/hallarfactorial(i));
                
            }
        }
        //Datos de salida
        System.out.println("La funcion exponencial de e^x es:"+fx);
    }

     public static void hallarSenoX() {
        //Declarar Variables
        int senx, lfunSenx;
        //Datos de entrada
        System.out.println("Ingrese un numero X:");
        senx=teclado.nextInt();
        System.out.println("Ingrese el limite de la funcion x:");
        lfunSenx=teclado.nextInt();
        double fresulSenX=0;
        //Proceso
        int contSigno=0;
        if(senx!=0){
            for (int i = 1; i < lfunSenx; i+=2) {
                System.out.println("i="+i);
                if (contSigno%2==0) {
                    System.out.println("signo +");
                    fresulSenX=fresulSenX+((Math.pow(senx, i))/hallarfactorial(i)); 
                } else {
                    fresulSenX=fresulSenX-((Math.pow(senx, i))/hallarfactorial(i));
                    System.out.println("signo -");    
                }
                //System.out.println(fresulSenX);
                contSigno++; 
            }
        }
        //Datos de salida
        System.out.println("Sen x es:"+fresulSenX);
         
     }

    public static void main(String[] args) {
        /*System.out.println("Ingrese un numero para calcular su favtorial:");
        int numerox=teclado.nextInt();
        System.out.println("Factorial de "+numerox+" es:"+ hallarfactorial(numerox));*/
        //calcularFuncionExponencial();
        hallarSenoX();
        
    }
    
}
