/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio15;

/**
 *
 * @author alumno
 */
public class Ejercicio15 {
    final static int segundosh = 3600;
    final static int segundosm =60;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int tiempo = 10000;
        int horas = tiempo / 3600;
        int minutos = (tiempo % segundosh) / segundosm;
        int segundos = tiempo % segundosm;
        
        System.out.println(tiempo + " segundos hacen un total de " + horas + " horas " + minutos + " minutos " + segundos + " segundos");
        // TODO code application logic here
    }
    
}
