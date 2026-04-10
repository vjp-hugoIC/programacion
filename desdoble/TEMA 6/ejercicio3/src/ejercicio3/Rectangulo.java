/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3;

/**
 *
 * @author VSPC-210660
 */
public class Rectangulo extends FiguraGeometrica{
    
    //Atributos
    private double base;
    private double altura;
    
    //Atributos
    //Por defecto
    public Rectangulo() {
    
        super();
        base = 0.0;
        altura = 0.0;
    }
    
    //Parametrizado
    public Rectangulo(String color, double base, double altura) {
    
        super(color);
        this.base = base;
        this.altura = altura;
    }
    
    //Getters y setters
    public double getBase() {
        return base;
    }
    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    //To String
    @Override
    public String toString() {
        return super.toString() + "Rectangulo{" + "base=" + base + ", altura=" + altura + '}';
    }
    
    //Otros metodos

    @Override
    public void area() {
        System.out.println("El area del rectangulo es: " + base * altura);
    }

    @Override
    public void perimetro() {
        System.out.println("El perimetro del rectangulo es: " + (2 * (base + altura)));
    }
    
}
