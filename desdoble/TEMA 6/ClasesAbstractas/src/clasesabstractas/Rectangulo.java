
package clasesabstractas;

/**
 * Clase Rectangulo
 * 
 * @author Daniel
 */
public class Rectangulo extends FiguraGeometrica {
    
    //Atributos
    private int lado1;
    private int lado2;
    
    //Constructores
    public Rectangulo() {
        super();
        this.lado1 = 0;
        this.lado2 = 0;
    }

    public Rectangulo(String color, int lado1, int lado2) {
        super(color);
        this.lado1 = lado1;
        this.lado2 = lado2;
    }
    
    //Getters / Setters
    public int getLado1() {
        return lado1;
    }

    public void setLado1(int lado1) {
        this.lado1 = lado1;
    }

    public int getLado2() {
        return lado2;
    }

    public void setLado2(int lado2) {
        this.lado2 = lado2;
    }
    
    //Métodos
    @Override
    public double calcularArea() {
        return lado1 * lado2;
    }
    
    //toString
    @Override
    public String toString() {
        return super.toString() + " Rectangulo{" + "lado1=" + lado1 + ", lado2=" + lado2 + '}';
    }   
    
}
