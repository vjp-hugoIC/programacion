/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio12;

import java.util.Scanner;

/**
 *
 * @author VSPC-210660
 */
public class Ejercicio12 {
    
    //Metodo para pedir los numeros
    public static int pedirNum() {
        
        //Declaro la variable y el scanner
        int num;
        Scanner entrada = new Scanner(System.in);
        
        //Pide el numero al usuario
        num = entrada.nextInt();
        
        //Devuelve el numero introducido por el usuario
        return num;
    }
    
    //Metodo para calcular la hipotenusa
    public static int hipotenusa(Triangulo triangulo1) {
        
        //Declaro la variable resultado
        int resultado;
        
        //Calculo la hipotenusa
        resultado = (int)Math.hypot(triangulo1.getCateto1() , triangulo1.getCateto2());
        
        //Devuelvo el resultado
        return resultado;
    }
    
    //Metodo para mostrar el resultado
    public static void mostrarResul(int resul) {
    
        //Muestro el resultado
        System.out.println("La hipotenusa es: " + resul);
    }
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Creamos el objeto
        Triangulo triangulo1 = new Triangulo();
        
        //Le damos valor a los catetos con el metodo pedirNum 
        triangulo1.setCateto1(pedirNum());
        triangulo1.setCateto2(pedirNum());
        
        //Llamo al metodo para calcular la hipotenusa y a su vez el metodo para mostrar el resultado
        mostrarResul(hipotenusa(triangulo1));
        
        // TODO code application logic here
    }
    
}
