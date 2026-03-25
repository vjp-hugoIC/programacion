/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio23;

/**
 *
 * @author VSPC-210660
 */
public class Ejercicio23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Creo un objeto taxi y otro autobus que reciben los parametros los valores de los atributos
        Taxi taxi1 = new Taxi("1111AAA", "Toyota", 100, 1111);
        Autobus autobus1 = new Autobus("1111AAA", "modelo1", 150, 60);
        
        //Creo otros 2 objetos por defecto y le introduzco los valores con los metodos
        Taxi taxi2 = new Taxi();
        Autobus autobus2 = new Autobus();
        
        taxi2.setMatricula("2222AAA");
        taxi2.setModelo("modelo2");
        taxi2.setPotenciaCV(200);
        taxi2.setNumeroLicencia(2222);
        
        autobus2.setMatricula("2222AAA");
        autobus2.setModelo("modelo2");
        autobus2.setPotenciaCV(250);
        autobus2.setNumeroPlazas(75);
        
        //Muestro la informacion de cada objeto
        taxi1.mostrarTaxi();
        System.out.println("");
        taxi2.mostrarTaxi();
        System.out.println("");
        autobus1.mostrarAutobus();
        System.out.println("");
        autobus2.mostrarAutobus();
        
        // TODO code application logic here
    }
    
}
