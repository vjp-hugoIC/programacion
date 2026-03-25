
package ejemploherencia;

/**
 * Clase Coche
 * 
 * @author Daniel
 */
public class Coche extends Vehiculo {
    
    //Atributos
    private int numPuertas;
    
    //Constructores
    public Coche(){
        super();
        this.numPuertas = 0;
    }
    
    public Coche(String marca, String modelo, int velocidad, int numPuertas) {
        super(marca, modelo, velocidad);
        this.numPuertas = numPuertas;   
    }
    
    //Getters / Setters
    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }
    
    //mostrar
    public void mostrarCoche(){
        mostrarVehiculo();
        System.out.println("NumPuertas: " + numPuertas);
    }
    
    //toString()
    @Override
    public String toString() {
        return super.toString() + ". Coche{" + "numPuertas=" + numPuertas + '}';
    }
    
}
