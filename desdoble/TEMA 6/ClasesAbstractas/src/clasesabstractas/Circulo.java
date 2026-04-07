
package clasesabstractas;

/**
 * Clase Circulo
 * 
 * @author Daniel
 */
public class Circulo extends FiguraGeometrica {
    
    //Atributos
    private int radio;
    
    //Constructores
    public Circulo() {
        super();
        this.radio = 0;
    }
    
    public Circulo(String color, int radio) {
        super(color);
        this.radio = radio;
    }
    
    //Getters / Setters
    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }
    
    //Métodos
    @Override
    public double calcularArea() {
       return Math.PI * radio * radio;
    }
    
    //toString
    @Override
    public String toString() {
        return super.toString() + " Circulo{" + "radio=" + radio + '}';
    }
 }
