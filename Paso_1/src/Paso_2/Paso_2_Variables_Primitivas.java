package Paso_2;

public class Paso_2_Variables_Primitivas {
  
    public static void main(String[] args) {
     
        
        
        System.out.println("Tipos de Variable");
        System.out.print("Entero (int)");
        System.out.println("");
        System.out.println("1) <byte> ");
        byte Menor_byte;
        byte Mayor_byte;
        byte Decimal_byte;
        Mayor_byte=126;
        Menor_byte=-125;
        Decimal_byte=(byte)124.99;
        System.out.println("El numero mas alto de byte es:"+Mayor_byte);
        System.out.println("Numero mas bajo de byte es :"+Menor_byte);
        System.out.println("Casting convertimos un dato decimal a un byte una variable entera:"+Decimal_byte+
                "como podemos observar inprime un numero entero pero le ingresamos este numero con decimal "
                        + "124.99");
        System.out.println("");
        
        System.out.println("2) <short>");
        short Menor_short;
        short Mayor_Short;
        Mayor_Short=32767;
        Menor_short=-32767;
        System.out.println("Este es el numero mayor de short:"+Mayor_Short);
        System.out.println("Este es el numero menor de short:"+Menor_short);
        System.out.println("");
        
        System.out.println("3) <int>");
        int A_int;
        int B_int;
        A_int=3200;
        B_int=2000;
        System.out.println("Resultado de la variable A usando int:"+A_int);
        System.out.println("Resultado de la varible "+B_int);
        System.out.println("");
        
        System.out.println("Decimales");
        System.out.println("");
        
        System.out.println("1) <floa>");
        float Num_float;
        float Num_F;
        float Num_Fo;
        Num_float=199223412;
        Num_F=(float)1.2;
        Num_Fo=1.3f;
        System.out.println("Resultado de la variable Num_float:"+Num_float);
        System.out.println("Resultado usando Num_F=(float):"+Num_F);
        System.out.println("Deciamles usando Num_Fo=1.3f:"+Num_Fo);
        System.out.println("");
        
        System.out.print("2) <double>");
        double Num_double;
        double Num_doubl;
        Num_double= 1.1;
        Num_doubl=-2.342;
        System.out.println("Resultado de la variable Num_double:"+Num_double);
        System.out.println("Resultado de double negativo :"+Num_doubl);
        System.out.println("");
        
        System.out.println("Caracteres");
        System.out.println("");
        System.out.println("1) Char");
        char Caracter;
        Caracter='$';
        System.out.println("Resultado caracter:"+Caracter);
        System.out.println("");
    
        System.out.println("TRUE OR FALSE");
        System.out.println("");
        System.out.println("1) Boolean");
        boolean Verdadero;
        boolean Falso;
        Verdadero=true;
        Falso=false;
        System.out.println("Es exitoso en la vida:"+Verdadero);
        System.out.println("Ss jugador de lol:"+Falso);
    }
}
