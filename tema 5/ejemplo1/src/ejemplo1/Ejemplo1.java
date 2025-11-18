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
        //Coche tuCoche = new Coche("Michelin", "Bajo", 3);
        //System.out.println(tuCoche.toString());
        
        //Esto hace lo mismo que la linea anterior
        //System.out.println(tuCoche);
        
        //System.out.println(tuCoche.getRuedas());
        
        
        //MODIFICADORES DE ACCESO
        //Bicicleta bicicleta = new Bicicleta();
        //System.out.println(bicicleta.ruedas);
        //System.out.println(bicicleta.getEstaPedaleando());
        
        //System.out.println("Cuantas bicis hemos creado");
        
        
        //Bicicleta bicicleta2 = new Bicicleta();
        //System.out.println("Cuantas bicis hemos creado");
        //System.out.println(bicicleta.getNumBicicletas());
        
        //PASO DE PARAMETROS POR VALOR 0 POR PREFERENCIA
        //int num1 = 4;
        //System.out.println(suma(num1));
        
        Bicicleta bici = new Bicicleta();
        empezarAPedalear(bici);
        
    }
    
        public static int suma(int num1) {
        int num2 = 3;
        return num1 + num2;
        }
        
        public static void empezarAPedalear(Bicicleta bici) {
            bici.setEstaPedaleando(true);
        }
        
        // TODO code application logic here
        
    }
    

