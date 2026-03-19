/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio9;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio9 {
    
    //Metodo para pedir los numeros
    public static int pedirNum() {
        
        //Declaro la variable y el scanner
        int num;
        Scanner entrada = new Scanner(System.in);
        
        //Pide el numero al usuario
        System.out.println("Introduce un numero: ");
        num = entrada.nextInt();
        
        //Devuelve el numero introducido por el usuario
        return num;
    
    }
    
    //Metodo para comprobar que numero es mayor
    public static void esMayor(Numero num1, Numero num2, Numero num3) {
    
        //Comprueba cual es mas grande de los 3
        if(num1.getValor() > num2.getValor() && num1.getValor() > num3.getValor()) {
            
            System.out.println("El numero mas grande es: " + num1);
        
        } else if( num2.getValor() > num1.getValor() && num2.getValor() > num3.getValor()) {
        
            System.out.println("El numero mas grande es: " + num2);
        
        } else {
        
            System.out.println("El numero mas grande es: " + num3);
        }
    
    
    }
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Declaro los 3 objetos
        Numero num1 = new Numero();
        Numero num2 = new Numero();
        Numero num3 = new Numero();
        
        //Le establezco valor a los objetos mediante el metodo pedirNum
        num1.setValor(pedirNum());
        num2.setValor(pedirNum());
        num3.setValor(pedirNum());
        
        //Le paso los objetos al metodo esMayor para que compruebe que numero es mayor
        esMayor(num1, num2, num3);
        
        
        // TODO code application logic here
    }
    
}
