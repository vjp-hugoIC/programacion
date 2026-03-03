/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio10;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio10 {
    
    public static int pedirNumero() {
        
        //Declaro la variable y el scanner
        int num1;
        Scanner entrada = new Scanner(System.in);
        
        //Le pido el numero al usuario
        System.out.println("Introduce el numero del que quieras la tabla de multiplicar: ");
        num1= entrada.nextInt();
        
        //Devuelvo el numero
        return num1;
        
    }
    
    public static void tablaMultiplicar(int num1) {
        
        //Declaro la variable
        int resultado;
        
        //Con un for imprimo la tabla de multiplicar
        for(int i = 0; i <= 10; i++) {
            resultado = i * num1;
            System.out.println(num1 + " x " + i + " = " + resultado);
        }
        
    }
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Declaro la variable
        int num1;
        
        //Llamo al metodo para asignarle un valor a la variable
        num1 = pedirNumero();
        
        //Llamo al metodo y le paso como parametro la variable que le hemos asignado valor antes
        tablaMultiplicar(num1);
        
    }
    
}
