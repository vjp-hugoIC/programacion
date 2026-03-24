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
        
        //Creo 3 objetos de coche
        Coche coche1 = new Coche();
        Coche coche2 = new Coche();
        Coche coche3 = new Coche();
        
        //Establezco la marca y el modelo de los 3 coches
        coche1.establecerMarca("Audi");
        coche1.establecerModelo("rs3");
        coche2.establecerMarca("BMW");
        coche2.establecerModelo("m5");
        coche3.establecerMarca("Mercedes");
        coche3.establecerModelo("a45");
        
        //Establezlo las ruedas para cada coche
        coche1.establecerRueda(rueda1);
        coche2.establecerRueda(rueda1);
        coche3.establecerRueda(rueda2);
        
        //Muestra los datos de todos los coches
        System.out.println("");
        coche1.mostrarCoche();
        System.out.println("");
        coche2.mostrarCoche();
        System.out.println("");
        coche3.mostrarCoche();
        
        // TODO code application logic here
    }
    
}
