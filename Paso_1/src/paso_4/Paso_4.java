package paso_4;

import java.util.Scanner;


public class Paso_4 {

public static void main(String[] args) {
    Scanner entrada=new Scanner(System.in);
    int entero;
    float decimal;
    System.out.println("Escribe un entero:");
    entero=entrada.nextInt();  
    System.out.println("tu numero es:"+entero);
    System.out.println("");
    System.out.println("Escribe un Decimal:");
    decimal=entrada.nextFloat();
    System.out.println("Este tu decimal:"+decimal);
    }    
}
