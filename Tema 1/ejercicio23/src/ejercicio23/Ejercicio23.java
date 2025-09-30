/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio23;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int precio;
        int unidades;
        
        Scanner entrada = new Scanner (System.in);
        System.out.println("Porfavor, introduzca el precio del modelo de ordenador que desea comprar: ");
        precio = entrada.nextInt();
        System.out.println("¿Cuantas unidades quiere llevarse? ");
        unidades = entrada.nextInt();
        
        int total=precio*unidades;
        System.out.println("El precio total de su compra es de: " + total + " euros");
        
        // TODO code application logic here
    }
    
}
