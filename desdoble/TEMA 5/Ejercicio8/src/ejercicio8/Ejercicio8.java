/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio8;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio8 {
    
    //Metodo para pedir numero
    public static int pedirNum() {
        
        int num;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduce un numero: ");
        num = entrada.nextInt();
        
        return num;
    }
    
    //Metodo para comprobar si es par o impar
    public static void parImpar(Numero a) {
        
        if ((a.getValor() % 2) == 0) {
        
            System.out.println("Es par.");
        } else {
        
        System.out.println("Es impar.");
    }
    
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Creo el objeto
        Numero numero1 = new Numero();
        
        //Le asigno el valor pidiendoselo al usuario
         numero1.setValor(pedirNum());
        
         //Llamo al metodo para comprobar si es par o impar y le paso el objeto creado
         parImpar(numero1);
        
        // TODO code application logic here
    }
    
}
