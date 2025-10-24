/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utilidades;
import java.util.Scanner;
import java.util.InputMismatchException;

/**
 *
 * @author alumno
 */
public class utilidadesjava {
    
    public static int pedirNumero() {
        int num = 0;
        try {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escribe un numero:" );
         num = entrada.nextInt();
        } catch(InputMismatchException e) {
            System.out.println("Ha sucedido una excepcion aritmetica");
        }
            
        return num;
    
    }
    
}
