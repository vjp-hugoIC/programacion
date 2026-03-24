/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio15;

/**
 *
 * @author VSPC-210660
 */
public class Ejercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Creo 3 direcciones
        Direccion direccion1 = new Direccion("Calle1", 1, 1, "Plasencia");
        Direccion direccion2 = new Direccion("Calle2", 2, 2, "Caceres");
        Direccion direccion3 = new Direccion("Calle3", 3, 3, "Badajoz");
        
        //Creo 3 empleados y les asigno una calle a cada uno
        Empleado empleado1 = new Empleado("empleado1", 1500, direccion1);
        Empleado empleado2 = new Empleado("empleado2", 1550, direccion2);
        Empleado empleado3 = new Empleado("empleado3", 1600, direccion3);
        
        //Muestro los datos de cada empleado
        empleado1.mostrarEmpleado();
        System.out.println("");
        empleado2.mostrarEmpleado();
        System.out.println("");
        empleado3.mostrarEmpleado();
        
        
        // TODO code application logic here
    }
    
}
