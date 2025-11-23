/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio19;

/**
 *
 * @author alumno
 */
public class Ejercicio19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Empleado 1");
        empleados emp1 = new empleados();

        System.out.println("Empleado 2");
        empleados emp2 = new empleados();

        System.out.println("Empleado 3");
        empleados emp3 = new empleados();

        mostrarSueldo(emp1);
        mostrarSueldo(emp2);
        mostrarSueldo(emp3);
    }

    public static void mostrarSueldo(empleados em) {
        double sueldo = em.calcularSueldo();

        System.out.println("\n" + em.getNombre() + " trabajó "
                + em.getHoras() + " horas, cobra "
                + em.getTarifa() + " euros la hora, por lo que le corresponde un sueldo de "
                + sueldo + " euros.");
        
        // TODO code application logic here
    }
    
}
