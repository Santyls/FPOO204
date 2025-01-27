//Importaciones
import java.util.Random;
import java.util.random.*;
import java.util.Scanner;
import javax.swing.*;
//Clase principal
public class Main {
    public static void main(String[] args) {
        /*Comentario
         * de varias lineas*/

//        System.out.println("Hola, Santiago Lugo");
//        String cadenas = "santiago" + "lugo" + "sánchez";
////        2
//        System.out.println(cadenas);
//
//        System.out.println(cadenas.length()); //nos ayuda a ver la cantidad de caracteres de una cadena
//
//        System.out.println(cadenas.substring(2,5));
//        System.out.println(cadenas.substring(2));
//        System.out.println(cadenas.substring(0,5));

//        //3. Variables
//        int x=5,x2;
//        double y=1.25;
//        String z= "Grupo S204",z1;
//        //conversion de cadena a int
////        x2= Integer.valueOf(z);
//
//        z1= String.valueOf(y);
//        //conversion de int a double
//        double asd= Double.valueOf(x);
//
//        //Conversión implicita
//        int num=12;
//        double numD= num;
//        System.out.println("Conversion implicita"+numD);
//
////        System.out.println(x2);
//        System.out.println(z1);
//        System.out.println(asd);
//
//        Random rdn = new Random();
//        int numAleatorio= rdn.nextInt();
//        double numDouble= rdn.nextDouble();
//        System.out.println("Aleatorio entero: "+numAleatorio);
//        System.out.println("Aleatorio double: "+numDouble);

//        //ingreso de datos
        Scanner scn= new Scanner(System.in);

        System.out.println("Introduce cualquier dato: ");
        String dato= scn.nextLine();

        System.out.println("Introduce un dato entero: ");
        int datoentero= scn.nextInt();

        System.out.println("Introduce un dato decimal: ");
        double datodecimal= scn.nextDouble();

        System.out.println("Cualquier dato: "+dato);

        System.out.println("Dato entero: "+datoentero);

        System.out.println("Dato decimal: "+datodecimal);

        //5. Boolean, Operadores logicps y de comprobación
//        System.out.println(10 > 9);//true
//        System.out.println(10 == 9);//false
//        System.out.println(10 < 9);//false
//        System.out.println(10 >= 9);//true
//        System.out.println(10 <= 9);//false
//        System.out.println(10 != 9);//true
//
//        System.out.println();
//        int x= 3;
//        System.out.println(x<5 && x>10);
//        System.out.println(x<5 || x>10);
//        System.out.println(!(x<5 && x>10));
        }
    }
