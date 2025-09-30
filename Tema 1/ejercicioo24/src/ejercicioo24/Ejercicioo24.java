/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicioo24;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicioo24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int nprogramacion;
        int nLM;
        int nBS;
        int nED;
        int nSI;
        int nFOL;
        
        Scanner entrada = new Scanner (System.in);
         System.out.println("Introduzca la nota de programacion: ");
         nprogramacion = entrada.nextInt();
         System.out.println("Introduzca la nota de lenguaje de marca: ");
        nLM = entrada.nextInt();
        System.out.println("Introduzca la nota de base de datos: ");
        nBS = entrada.nextInt();
        System.out.println("Introduzca la nota de entornos de desarrollo: ");
        nED = entrada.nextInt();
        System.out.println("Introduzca la nota de sistemas informaticos: ");
        nSI = entrada.nextInt();
        System.out.println("Introduzca la nota de FOL: ");
        nFOL = entrada.nextInt();
        
        int notamedia = nprogramacion + nLM + nBS + nED + nSI + nFOL;
        int media = notamedia / 6;
        System.out.println("Su nota final de curso es de: " + media);
        
        // TODO code application logic here
    }
    
}
