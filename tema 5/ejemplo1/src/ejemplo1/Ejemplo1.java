/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo1;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejemplo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //1 Instancio un objeto del tipo que he creado
        //1.1 Con constructor parametizado y estableciendo valores con setters
        //Scanner entrada = new Scanner(System.in);
        //Coche miCoche = new Coche();
        //System.out.println(miCoche.toString());
        
        //miCoche.setEspejos(5);
        //System.out.println(miCoche.toString());
        
        //System.out.println(miCoche.getEspejos());
        
        //miCoche.acelerar();
        
        //1.2 Con un constructor parametrizado, inicializando los atributos 
        //con los valores pasados por parametro
        Coche tuCoche = new Coche("Michelin", "Bajo", 3);
        System.out.println(tuCoche.toString());
        
        //Esto hace lo mismo que la linea anterior
        System.out.println(tuCoche);
        
        System.out.println(tuCoche.getRuedas());
        
        // TODO code application logic here
    }
    
}
