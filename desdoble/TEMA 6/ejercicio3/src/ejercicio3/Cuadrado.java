/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3;

/**
 *
 * @author VSPC-210660
 */
public class Cuadrado extends FiguraGeometrica{
    
    //Atributos
    private double lado;
    
    //Constructores
    //Por defecto
    public Cuadrado() {
    
        super();
        lado = 0.0;
    }
    
    //Parametrizado
    public Cuadrado(String color, double lado) {
    
        super(color);
        this.lado = lado;
    }
    
    //Getters y setters
    public double getLado() {
        return lado;
    }
    public void setLado(double lado) {
        this.lado = lado;
    }
    
    //To String
    @Override
    public String toString() {
        return super.toString() + "Cuadrado{" + "lado=" + lado + '}';
    }

    @Override
    public void area() {
        System.out.println("El area del cuadrado es: " + (lado * lado));
    }

    @Override
    public void perimetro() {
        System.out.println("El perimetro de un cuadrado es: " + (4 * lado));
    }
    
}
