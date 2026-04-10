/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3;

/**
 *
 * @author VSPC-210660
 */
public class Triangulo extends FiguraGeometrica{
    
    //Atributos
    private double base;
    private double altura;
    
    //Constructores
    //Por defecto
    public Triangulo() {
    
        super();
        base = 0.0;
        altura = 0.0;
    }
    
    //Parametrizado
    public Triangulo(String color, double base, double altura) {
    
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
        return super.toString() + "Triangulo{" + "base=" + base + ", altura=" + altura + '}';
    }

    //Otros metodos
    @Override
    public void area() {
        System.out.println("El area del triangulo es: " + ((base * altura)/ 2));
    }

    
    @Override
    public void perimetro() {
        
        double hipotenusa = Math.sqrt(base * base + altura * altura);

        System.out.println("El perimetro del triangulo es: " + (base + altura + hipotenusa));
    }
    
}
