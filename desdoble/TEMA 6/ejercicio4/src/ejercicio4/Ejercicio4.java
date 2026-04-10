/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio4;

/**
 *
 * @author VSPC-210660
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Creo un objeto de cada uno
        Perros perro1 = new Perros("perro1", 2, 10);
        Lobos lobo1 = new Lobos("lobo1", 5, 20);
        Leones leon1 = new Leones("leon1", 7, 35);
        Gatos gato1 = new Gatos("gato1", 1, 4);
        
        System.out.println(perro1.toString());
        perro1.sonido();
        perro1.alimentacion();
        perro1.habitat();
        perro1.nCientifico();
        System.out.println("");
        System.out.println(lobo1.toString());
        lobo1.sonido();
        lobo1.alimentacion();
        lobo1.habitat();
        lobo1.nCientifico();
        System.out.println("");
        System.out.println(leon1.toString());
        leon1.sonido();
        leon1.alimentacion();
        leon1.habitat();
        leon1.nCientifico();
        System.out.println("");
        System.out.println(gato1.toString());
        gato1.sonido();
        gato1.alimentacion();
        gato1.habitat();
        gato1.nCientifico();
        System.out.println("");
        
        //Usando polimorfismo
        Animal perro2 = new Perros("perro2", 3, 7);
        Animal lobo2 = new Lobos("lobo2", 8, 19);
        Animal leon2 = new Leones("leon2", 10, 33);
        Animal gato2 = new Gatos("gato2", 3, 8);
        
        System.out.println(perro2.toString());
        perro2.sonido();
        perro2.alimentacion();
        perro2.habitat();
        perro2.nCientifico();
        System.out.println("");
        System.out.println(lobo2.toString());
        lobo2.sonido();
        lobo2.alimentacion();
        lobo2.habitat();
        lobo2.nCientifico();
        System.out.println("");
        System.out.println(leon2.toString());
        leon2.sonido();
        leon2.alimentacion();
        leon2.habitat();
        leon2.nCientifico();
        System.out.println("");
        System.out.println(gato2.toString());
        gato2.sonido();
        gato2.alimentacion();
        gato2.habitat();
        gato2.nCientifico();
        System.out.println("");
        
        // TODO code application logic here
    }
    
}
