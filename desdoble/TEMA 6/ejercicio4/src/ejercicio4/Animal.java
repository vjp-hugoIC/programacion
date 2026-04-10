/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio4;

/**
 *
 * @author VSPC-210660
 */
public abstract class Animal {
    
    //Atributos
    private String nombre;
    private int edad;
    private int peso;
    
    //Constructores
    //Por defecto
    public Animal() {
    
        nombre = "";
        edad = 0;
        peso = 0;
    }
    
    //Parametrizado
    public Animal(String nombre, int edad, int peso) {
    
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
    }
    
    //Getters y setters

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getPeso() {
        return peso;
    }
    public void setPeso(int peso) {
        this.peso = peso;
    }
    
    //To String
    @Override
    public String toString() {
        return "Animal{" + "nombre=" + nombre + ", edad=" + edad + ", peso=" + peso + '}';
    }
    
    //Otros metodos
    public abstract void sonido();
    
    public abstract void alimentacion();
    
    public abstract void habitat();
    
    public abstract void nCientifico();
    
}
