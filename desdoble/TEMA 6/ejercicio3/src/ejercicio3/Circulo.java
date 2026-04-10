/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3;

/**
 *
 * @author VSPC-210660
 */
public class Circulo extends FiguraGeometrica{
    
    //Atributo
    private double radio;
    
    //Constructores
    //Por defecto
    public Circulo () {
    
        super();
        radio = 0.0;
    }
    
    //Parametrizado
    public Circulo(String color, double radio) {
    
        super(color);
        this.radio = radio;
    }
    
    //Getters y setters
    public double getRadio() {
        return radio;
    }
    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    //To String
    @Override
    public String toString() {
        return super.toString() + "Circulo{" + "radio=" + radio + '}';
    }
    
    //Otros metodos

    @Override
    public void area() {
        System.out.println("El area del circulo es: " + Math.PI * (radio * radio));
    }

    @Override
    public void perimetro() {
        System.out.println("El perimetro del circulo es: " + 2 * Math.PI * radio);
    }
    
    
    
}
