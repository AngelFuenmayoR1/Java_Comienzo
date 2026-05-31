package paso_6;

import java.util.Scanner;

public class paso_6 {
    
    public static void  main(String[]args){
        //raiz 
        double numRaiz=9;
        double resultado;
        resultado=Math.sqrt(numRaiz);
        System.out.println("El resultado es: "+resultado);
        System.out.println("");
        
        //potencia esponencial
        double base=4;
        double elevado=2;
        double resultado_p;
        resultado_p=Math.pow(base, elevado);
        System.out.println("El resultado de la potencia: "+resultado_p);
        System.out.println("");
        
        //absoluto
        //nota: convierte cualquien numero en positivo en vez de negativo
        float numAbs=-5.5f;
        float resultado_Abs=Math.abs(numAbs);
        System.out.println("El resultado del valor absoluto:"+resultado_Abs);
        System.out.println("");
        
        //Redondeo
        float numRed=4.5f;
        int resRed=Math.round(numRed);
        System.out.println("El resultado del redondeo:"+resRed);    
        System.out.println("");
        
        //Ramdon
        double Ramdon=Math.random();
        System.out.println("El numero ramdon es:"+Ramdon);
        System.out.println("");
        
        //se multiplica con la idea de poder poder poner longitud maxima en este caso 
        //sera de 1 a 10 pero solo recuerda se multiplica por positivo o negativos
        
        double Ramdon_m=Math.random();
        System.out.println("El numero ramdon es:"+Math.round(Ramdon_m*10));
        System.out.println("");
        
        //Ramdon
        
    }
    
}
