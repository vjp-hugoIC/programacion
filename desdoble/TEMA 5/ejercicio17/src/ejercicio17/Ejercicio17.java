/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio17;

import java.util.Scanner;

/**
 *
 * @author VSPC-210660
 */
public class Ejercicio17 {

    
    //Metodo para recoger la respuesta del usuario
    public static String pedirRespuesta() {
    
        Scanner entrada = new Scanner(System.in);
        String respuesta;
        
        respuesta = entrada.nextLine();
        
        return respuesta;
    }
    
    //Metodo para comparar las respuestas
    public static boolean comprobarRespuesta(Enunciado enunciado, String respuesta) {
    
        return respuesta.equalsIgnoreCase(enunciado.getRespuesta());
    }
    
    public static double sumarRespuestas(boolean correcto) {
    
        double resultado = 0;
        
        if(correcto == true) {
        
            resultado = resultado + 2.5;
        } else {
        
            resultado = 0;
        }
        
        return resultado;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double nota = 0;
        String r1, r2, r3, r4;
        
        //Creo 4 objetos
        Enunciado enunciado1 = new Enunciado("Cual es la capital de España: ");
        Enunciado enunciado2 = new Enunciado("Cual es la capital de Italia: ");
        Enunciado enunciado3 = new Enunciado("Cual es la capital de Francia: ");
        Enunciado enunciado4 = new Enunciado("Cual es la capital de Portugal: ");
        
        //Establezco las respuestas corectas
        enunciado1.setRespuesta("Madrid");
        enunciado2.setRespuesta("Roma");
        enunciado3.setRespuesta("Paris");
        enunciado4.setRespuesta("Lisboa");
        
        //Pregunta1
        System.out.println(enunciado1.getPregunta());
        r1 = pedirRespuesta();
        if (comprobarRespuesta(enunciado1, r1)) {
            System.out.println("Correcto");
        } else {
            System.out.println("Incorrecto");
            System.out.println("Respuesta correcta: " + enunciado1.getRespuesta());
        }
        nota = nota + sumarRespuestas(comprobarRespuesta(enunciado1, r1));
        
        //Pregunta2
        System.out.println(enunciado2.getPregunta());
        r2 = pedirRespuesta();
        if (comprobarRespuesta(enunciado2, r2)) {
            System.out.println("Correcto");
        } else {
            System.out.println("Incorrecto");
            System.out.println("Respuesta correcta: " + enunciado2.getRespuesta());
        }
        nota = nota + sumarRespuestas(comprobarRespuesta(enunciado2, r2));
        
        //Pregunta3
        System.out.println(enunciado3.getPregunta());
        r3 = pedirRespuesta();
        if (comprobarRespuesta(enunciado3, r3)) {
            System.out.println("Correcto");
        } else {
            System.out.println("Incorrecto");
            System.out.println("Respuesta correcta: " + enunciado3.getRespuesta());
        }
        nota = nota + sumarRespuestas(comprobarRespuesta(enunciado3, r3));
        
        //Pregunta4
        System.out.println(enunciado4.getPregunta());
        r4 = pedirRespuesta();
        if (comprobarRespuesta(enunciado4, r4)) {
            System.out.println("Correcto");
        } else {
            System.out.println("Incorrecto");
            System.out.println("Respuesta correcta: " + enunciado4.getRespuesta());
        }
        nota = nota + sumarRespuestas(comprobarRespuesta(enunciado4, r4));
        
        //Nota final
        System.out.println("Tu nota final es: " + nota);

        
        // TODO code application logic here
    }
    
}
