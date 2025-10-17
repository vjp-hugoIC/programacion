/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio27;
import java.util.Scanner;


/**
 *
 * @author alumno
 */
public class Ejercicio27 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //declaro las variables numero 1 y numero 2 que se pediran al usuario y el resultado de las operaciones.
        int num1, num2, resultadosuma, resultadoresta, resultadomultiplicacion, resultadodivision;
        
         //declaro el scanner
        Scanner entrada =  new Scanner (System.in);
        
         
        
        //declaro la variable con la que el usuario va a elegir la opcion
        int opcion;
        
        //hago el menu
        do{
        //le pido al usuario el primer numero
        System.out.println("Introduce el primero numero: ");
        num1 = entrada.nextInt();
        
         //le pido al usuario el segunfo numero
        System.out.println("IIntroduce el segundo numero: ");
        num2 = entrada.nextInt();
        
        //inicializo las variables de operaciones
        resultadosuma = num1 + num2;
        resultadoresta = num1 - num2;
        resultadomultiplicacion = num1 * num2;
        resultadodivision = num1 / num2;
            System.out.println("Opcion 1: Suma");
            System.out.println("Opcion 2: Resta");
            System.out.println("Opcion 3: Multiplicacion");
            System.out.println("Opcion 4: Division");
            System.out.println("Opcion 5: Salir");
            System.out.println("Introduce una opcion: ");
            opcion = entrada.nextInt();
            switch (opcion){
                case 1: {
                System.out.println(resultadosuma);
                }
                case 2: {
                System.out.println(resultadoresta);
                }
                case 3: {
                System.out.println(resultadomultiplicacion);
                }
                case 4: {
                System.out.println(resultadodivision);
                }
                case 5: {
                break;
                }
                default: {
                System.out.println("Esa opcion no es valida");
                }
            
            }
        } while (opcion != 5);
        
        // TODO code application logic here
    }
    
}
