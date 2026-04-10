/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3;

/**
 *
 * @author VSPC-210660
 */
public class TrianguloRectangulo extends Triangulo{
    
    //Atributos
    
    //Constructores
    //Por defecto
    public TrianguloRectangulo(){
    
        super();
    }
    
    //Parametrizado
    public TrianguloRectangulo(String color, double base, double altura){
    
        super(color, base, altura);
    }
    
    //Getters y setters
    
    //To String
    @Override
    public String toString() {
        return "TrianguloRectangulo{" + '}';
    }
    
    //Otros metodos
    public double hipotenusa() {
    
        double hipotenusa = Math.sqrt(getBase() * getBase() + getAltura() * getAltura());
        System.out.println("La hipotenusa es: " + hipotenusa);
        
        return hipotenusa;
    }
    
    public void tipo() {
    
        if (Math.abs(getBase() - getAltura()) < 1e-6) {
            System.out.println("Triángulo rectángulo isósceles");
    } else {
            System.out.println("Triángulo rectángulo escaleno");
        }
    }
    
}
