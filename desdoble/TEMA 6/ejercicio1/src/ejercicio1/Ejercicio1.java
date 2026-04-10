/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1;

/**
 *
 * @author alumno
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Creamos un objeto de cada
        Suma s = new Suma(5,5);
        Multiplicacion m = new Multiplicacion(5,5);
        Potencia p = new Potencia(5,5);
        
        //Metodo para realizar las operaciones
        s.realizarOperacion();
        m.realizarOperacion();
        p.realizarOperacion();
        
        System.out.println("");
        //Creo un objeto de cada nuevo utilizando polimorfismo
        Calculadora suma = new Suma(3,3);
        Calculadora multiplicacion = new Multiplicacion(3,3);
        Calculadora potencia = new Potencia(3,3);
        
        suma.realizarOperacion();
        multiplicacion.realizarOperacion();
        potencia.realizarOperacion();
        
        // TODO code application logic here
    }
    
}
