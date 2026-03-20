/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio16;

/**
 *
 * @author VSPC-210660
 */
public class Alumno {
    
    //Atributos
    private String nombre;
    private int nota;
    
    //Constructores
    //Por defecto
    public Alumno() {
    
        this.nombre = "";
        this.nota = 0;
    }
    
    //Parametrizado
    public Alumno(String nombre, int nota) {
    
        this.nombre = nombre;
        this.nota = nota;
    }
    
    //Getters y setters
    public String getNombre() {
    
        return nombre;
    }
    public void setNombre(String nombre) {
    
        this.nombre = nombre;
    }
    
    public int getNota() {
    
        return nota;
    }
    public void setNota(int nota) {
    
        if (nota >= 0 && nota <= 10) {
            this.nota = nota;
        } else {
            System.out.println("Error: la nota debe estar entre 0 y 10.");
            this.nota = -1;
        }
    }
    
    //Metodo mostrar
    public void mostrarAlumno() {
    
        System.out.println("El nombre del alumno es: " + nombre);
        System.out.println("La nota es: " + nota);
    }
    
    //Metodo toString
    @Override
    public String toString() {
    
        return "El alumno " + nombre + " tiene de nota: " + nota;
    }
    
    //Otros metodos
    // Método que calcula y muestra la calificación
    public void mostrarCalificaciones() {
        System.out.println("Alumno: " + nombre);
        System.out.println("Nota: " + nota);

        if (nota >= 0 && nota <= 4) {
            System.out.println("Calificación: Suspenso");
        } else if (nota <= 6) {
            System.out.println("Calificación: Bien");
        } else if (nota <= 8) {
            System.out.println("Calificación: Notable");
        } else if (nota <= 10) {
            System.out.println("Calificación: Sobresaliente");
        } else {
            System.out.println("Nota no valida");
        }

    }
    
    
}
