/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio12;

/**
 *
 * @author VSPC-210660
 */
public class Triangulo {
    
    //Atributos
    private int cateto1;
    private int cateto2;
    
    //Constructores
    //Por defecto
    public Triangulo(){
        
        cateto1 = 0;
        cateto2 = 0;
    }
    
    //Por defecto
    public Triangulo(int cateto1, int cateto2) {
        
        this.cateto1 = cateto1;
        this.cateto2 = cateto2;
    }
    
    //Getters y Setters
    public int getCateto1() {
        
        return cateto1;
    }
    
    public void setCateto1(int cateto1) {
    
        this.cateto1 = cateto1;
    }
    
    public int getCateto2() {
        
        return cateto2;
    }
    
    public void setCateto2(int cateto2) {
    
        this.cateto2 = cateto2;
    }
    
    //Metodo mostrar
    public void mostrarTriangulo() {
    
        System.out.println("El cateto1: " + cateto1);
        System.out.println("El cateto2: " + cateto2);
    }
    
    //Metodo toString
    @Override
    public String toString() {
    
        return "El valor del cateto1 es: " + this.cateto1 + " y el valor del cateto2 es : " + this.cateto2;
    }
    
}
