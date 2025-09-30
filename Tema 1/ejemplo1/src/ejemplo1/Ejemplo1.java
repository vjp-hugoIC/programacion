/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo1;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Ejemplo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final double PI = 3.1415926536;
        
        double radio;
        double altura;
        
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Introduzca los datos del cilindro: ");
        System.out.println("Radio: ");
        radio = entrada.nextDouble();
        System.out.println("Altura: ");
        altura = entrada.nextDouble();
        System.out.println("El are  a del cilindro es: ");
        System.out.println(PI*radio*radio*altura);
        // TODO code application logic here
    }
    
}
