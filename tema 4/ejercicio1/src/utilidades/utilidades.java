/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utilidades;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class utilidades {
    
    public static int pedirNum() {
    int num;
    Scanner entrada = new Scanner(System.in);
    System.out.println("Introduce un numero: ");
    num = entrada.nextInt();
    return num;
    }
    
    
}
