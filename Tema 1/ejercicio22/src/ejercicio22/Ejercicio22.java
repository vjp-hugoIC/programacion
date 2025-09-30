/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio22;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int lado;
        int altura;
        
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Porfavor, introduzca la medida de un lado: ");
        lado = entrada.nextInt();
        System.out.println("Porfavor, introduzca la altura: ");
        altura = entrada.nextInt();
        
        int perimetro = lado * 3;
        System.out.println("El perimetro de un triangulo de lado: " + lado + " es: " + perimetro);
        int area = lado * altura;
        System.out.println("El area de un triangulo de lado: " + lado + " es: " + area);
        
        // TODO code application logic here
    }
    
}
