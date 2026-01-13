/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio8;
import java.util.Scanner;

/**
 *
 * @author VSPC-210660
 */
public class Ejercicio8 {
    
    
     

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        Numero miNumero = new Numero();
        
        System.out.println("Introduce un numero");
        int numeroPasado = scanner.nextInt();
        
        miNumero.setValor(numeroPasado);
        
        System.out.println("El numero asignado es " + miNumero.getValor());
        
        verificarParImpar(miNumero);
               
        // TODO code application logic here
    }
    public static void verificarParImpar(Numero miNumero) {
            if(miNumero.getValor() % 2 == 0) {
                System.out.println("El numero es PAR");
            } else {
                System.out.println("El numero es IMPAR");
            }
        } 
}
