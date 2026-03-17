/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio5;

/**
 *
 * @author alumno
 */
public class Asignatura {
    
    //Atributos
    private String nombre;
    private int nota;
    
    
    //Constructores
    //Por defecto
    public Asignatura() {
    
        this.nombre = "";
        this.nota = 0;   
    }
    
    //parametrizado
    public Asignatura(String nombre, int nota) {
        
        this.nombre = nombre;
        this.nota = nota;
    }
    
    
    //Constructor asignar directamente el nombre de la asignatura
    public Asignatura(String nombre) {
        
        this.nombre = nombre;
        this.nota = 0;
    }
    
    //Getters y Setters
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
        this.nota = nota;
    }
    
    
    //Metodo mostrar 
    public void mostrarAsignatura() {
       
        System.out.println("Asignatura: " + this.nombre);
        System.out.println("Nota: " + this.nota);
    }
    
    //Metodo toString
    @Override
    public String toString() {
        return "Asignatura{" + "Nombre: " + nombre + "Nota = " + nota + "}";
    }
    
    
    //Otros metodos
    public static void notaMedia(Asignatura a1, Asignatura a2, Asignatura a3, Asignatura a4, Asignatura a5, Asignatura a6) {

    int media = (int)((a1.getNota() + a2.getNota() + a3.getNota() + a4.getNota() + a5.getNota() + a6.getNota()) / 6.0);

    System.out.println("La nota media es: " + media);
}
    
    
}
