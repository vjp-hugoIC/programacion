/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio20;

import java.util.Scanner;

/**
 *
 * @author VSPC-210660
 */
public class Ejercicio20 {
    
    //Declaro las respuestas como constantes
    public static final String CAPITALESPANA = "Madrid";
    public static final String DESCUBRIOAMERICA = "Colón";
    
    //Metodo para recoger la respuesta del usuario
    public static String pedirRespuesta() {
        
        //Declaro la variable y el scanner
        String pregunta1;
        Scanner entrada = new Scanner(System.in);
        
        pregunta1 = entrada.nextLine();
        
        //Devuelve la variable
        return pregunta1;
    
    }
    
    //Meetodo para comprobar la primera respuesta
    public static  boolean comprobarRespuesta1 (String respuesta1) {
        
        //Declaro una variable de tipo boolean para comparar
        boolean iguales;
        
        //Igualo la respùesta del usuario con la constante
        iguales = respuesta1.equalsIgnoreCase(CAPITALESPANA);
        
        //Si coinciden estaria bien y sino no
        if (iguales==true) {
            
            System.out.println("Muy bien, respuesta correcta.");
        } else {
            System.out.println("No es correcto. La respuesta correcta sería " + CAPITALESPANA);
        }
        
        return iguales;
        
    }
    
    //Meetodo para comprobar la segunda respuesta
    public static boolean comprobarRespuesta2 (String respuesta1) {
        
        //Declaro una variable de tipo boolean para comparar
        boolean iguales;
        
        //Igualo la respùesta del usuario con la constante
        iguales = respuesta1.equalsIgnoreCase(DESCUBRIOAMERICA);
        
        //Si coinciden estaria bien y sino no
        if (iguales==true) {
            
            System.out.println("Muy bien, respuesta correcta.");
        } else {
            System.out.println("No es correcto. La respuesta correcta sería " + DESCUBRIOAMERICA);
        }
        
        return iguales;
        
    }
    
    //Metodo para sumar las notas
    public static void sumarRespuestas (boolean respuesta1, boolean respuesta2) {
    
        //Declaro las variables de las notas y el total
        int nota1=0, nota2=0, total;
        
        //Si las respuestas son correctas suma 5 puntos sino no suma
        if (respuesta1 == true) {
            
            nota1 = 5;
        
        } else {
            nota1 = 0;
        }
        
        if (respuesta2 == true) {
        
            nota2 = 5;
        } else {
        
            nota2 = 0;
        }
        
        //Calculo el total
        total = nota1 + nota2;
        
        //Imprimo la nota que ha obtenido
        System.out.println("La nota del examen es " + total);
    
    }
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Declaro las variables
        String respuesta1, respuesta2;
        
        //Le hago primera pregunta al usuario y almaceno la respuesta
        System.out.println("1ª PREGUNTA: ¿Cuál es la capital de España?: ");
        respuesta1 = pedirRespuesta();
        
        //Compruebo la respuesta 1
        boolean acierto1 = comprobarRespuesta1(respuesta1);
        
        //Le hago segunda pregunta al usuario y almaceno la respuesta
        System.out.println("2ª PREGUNTA: ¿Quién descubrió América?: ");
        respuesta2 = pedirRespuesta();
        
        //Compruebo las respuestas en los metodos
        boolean acierto2 = comprobarRespuesta2(respuesta2);
        
        //Sumo las respuestas
        sumarRespuestas(acierto1, acierto2);
        
        
    }
    
}
