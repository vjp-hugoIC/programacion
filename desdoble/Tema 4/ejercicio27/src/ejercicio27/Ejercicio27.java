/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio27;

import java.util.Scanner;

/**
 *
 * @author VSPC-210660
 */
public class Ejercicio27 {
    
    //Metodo para elegir cara o cruz aleatorio
    public static int numeroAleatorio() {
        
            int num;
            
            num = (int)(Math.random() * 2) + 1;
            
            return num;
        
        }
    
    public static String caraCruz(int num) {
    
        String cara = "cara";
        String cruz = "cruz";
        
        if(num == 1){
            
            return cara;
        } else {
            return cruz;
        }
    
    }
    
    public static String pedirRespuesta() {
        
        String respuesta;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Elige cara o cruz");
        respuesta = entrada.nextLine();
        
        return respuesta;
    }
    
    public static void respuestaFinal(String respuesta, String caraCruz) {
        
        System.out.println("Ha salido: " + caraCruz);
        
        if (respuesta.equalsIgnoreCase(caraCruz)) {
        
        System.out.println("Enhorabuena");
        } else {
            
            System.out.println("Has perdido, intentalo otra vez");
        }
        
    }
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Declaro las variables
        int num;
        String esCaraCruz, respuesta;
        
        do {
            
            //Genero con el metodo numero aleatorio 1 o 2
            num = numeroAleatorio();
        
            //Con el numero aleatorio le asigno cara o cruz
            esCaraCruz = caraCruz(num);
        
            //Le pido al usuario que elija
            respuesta = pedirRespuesta();
        
            //Comparo la respuesta del usuario y la que genero automaticamente el programa 
            respuestaFinal(respuesta, esCaraCruz);
            
            if(esCaraCruz.equalsIgnoreCase(respuesta)) {
                
                //Genero con el metodo numero aleatorio 1 o 2
                num = numeroAleatorio();
            }
            
        } while (!esCaraCruz.equalsIgnoreCase(respuesta));
        
        // TODO code application logic here
    }
    
}
