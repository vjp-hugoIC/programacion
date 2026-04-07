
package clasesabstractas;

/**
 * Clase Triangulo
 * 
 * @author Daniel
 */
public class Triangulo extends FiguraGeometrica {
    
    //Atributos
    private int base;
    private int altura;
    
    //Constructores
    public Triangulo() {
        super();
        this.base = 0;
        this.altura = 0;
    }
    
    public Triangulo(String color, int base, int altura) {
        super(color);
        this.base = base;
        this.altura = altura;
    }
    
    //Getters / Setters
    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    //Métodos
    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }   
    
    //toString
    @Override
    public String toString() {
        return super.toString() + " Triangulo{" + "base=" + base + ", altura=" + altura + '}';
    }   

}
