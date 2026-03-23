/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3;

/**
 *
 * @author alumno
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Creo 2 objetos de rueda
        Rueda rueda1 = new Rueda();
        Rueda rueda2 = new Rueda();
        
        //Establezco el material y el tamaño, primero en el objeto rueda1 y luego en rueda2.
        rueda1.establecerMaterial("caucho");
        rueda1.establecerPulgadas(21);
        
        rueda2.establecerMaterial("goma");
        rueda2.establecerPulgadas(20);
        
        //Muestro el material y las pulgadas 
        rueda1.mostrarRueda();
        System.out.println("");
        rueda2.mostrarRueda();
        
        // TODO code application logic here
    }
    
}
