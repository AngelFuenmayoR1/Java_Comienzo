package paso_5;
import java.util.Scanner;

public class paso_5 {
  
public static void main(String [] args){
   Scanner entrada = new Scanner(System.in);
   
    float Num_1,Num_2,suma,resta,multiplicacion,divicion,residuo;
    
    System.out.println("Increse dos numero:");
    Num_1=entrada.nextFloat();
    Num_2=entrada.nextFloat();
        suma=Num_1+Num_2;
        resta=Num_1-Num_2;
        multiplicacion=Num_1*Num_2;
        divicion=Num_1/Num_2;
        residuo=Num_1%Num_2;
        // es mejor en entero para los residuos aunque se pierden mucho decimales 
    System.out.println("El resultado es:"+suma);
    System.out.println("El resultado es:"+resta);
    System.out.println("El resultado es:"+multiplicacion);
    System.out.println("El resultado es:"+divicion);
    System.out.println("El resultado es:"+residuo);
    
    entrada.close(); 
}       
}
