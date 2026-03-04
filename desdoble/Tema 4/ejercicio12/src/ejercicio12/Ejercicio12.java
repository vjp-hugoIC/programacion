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
    
    public static final int contraseñaCorrecta = 12345;

    
    public static int pedirContraseña(){
    
        //Declaro la variable y el scanner
        int contra;
        Scanner entrada = new Scanner(System.in);
        
        //Le pido la contraseña
        System.out.println("Introduce la contraseña: ");
        contra = entrada.nextInt();
        
        //Devuelve la contraseña
        return contra;
}
    
    public static boolean comprobarContrasena(int contraseñaIngresada) {
        return contraseñaIngresada == contraseñaCorrecta;
    }
    
    public static void mostrarResultado(boolean esCorrecta) {
        if (esCorrecta) {
            System.out.println("Contraseña correcta.");
        } else {
            System.out.println("Contraseña incorrecta.");
        }
    }
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int intentos = 0;
        boolean accesoConcedido = false;

        while (intentos < 3 && !accesoConcedido) {

            int contraseñaIngresada = pedirContraseña();

            accesoConcedido = comprobarContrasena(contraseñaIngresada);

            mostrarResultado(accesoConcedido);

            intentos++;
        }

        if (!accesoConcedido) {
            System.out.println("Acceso bloqueado. Demasiados intentos.");
        }
    }
}
    

