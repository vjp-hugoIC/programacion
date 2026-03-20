/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio13;

/**
 *
 * @author VSPC-210660
 */
public class Ejercicio13 {
    
    public static void saludar(Saludo a) {
    
        for(int i = 0; i < 5; i++) {
            a.mostrarSaludo();
        }
    }
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Saludo saludo1 = new Saludo("Hola, que tal");
        
        saludar(saludo1);
        
        // TODO code application logic here
    }
    
}
