/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio7;

import java.util.Scanner;

/**
 *
 * @author VSPC-210660
 */
public class Ejercicio7 {
    
    public static void ordenarCuatroNumeros(int w, int x, int y, int z) {
    int temp;
    if (w > x) { 
        temp = w;
        w = x; 
        x = temp; 
    }
    if (w > y) {
         temp = w; 
        w = y; 
        y = temp; 
    }
    if (w > z) {
        temp = w; 
        w = z; 
        z = temp; 
    }
    
    if (x > y) {
        temp = x; 
        x = y; 
        y = temp; 
    }
    if (x > z) { 
         temp = x; 
        x = z; 
        z = temp;
    }
    
    if (y > z) { 
         temp = y;
        y = z; 
        z = temp;
    }
    
    System.out.println("Ordenados: " + w + " < " + x + " < " + y + " < " + z);
}

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int a, b, c, d;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduce 4 números enteros:");
        System.out.print("a = "); 
        a = entrada.nextInt();
        System.out.print("b = "); 
        b = entrada.nextInt();
        System.out.print("c = "); 
        c = entrada.nextInt();
        System.out.print("d = ");
        d = entrada.nextInt();
        
        ordenarCuatroNumeros(a, b, c, d);
        
        // TODO code application logic here
    }
    
}
