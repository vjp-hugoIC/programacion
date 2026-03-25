
package ejemploherencia;

/**
 * Clase Moto
 * 
 * @author Daniel
 */
public class Moto extends Vehiculo {
    
    //Atributos
    private int cilindrada;
    
    //Constructores
    public Moto(){
        super();
        this.cilindrada = 0;
    }

    public Moto(String marca, String modelo, int velocidad, int cilindrada) {
        super(marca, modelo, velocidad);
        this.cilindrada = cilindrada;
    }
    
    //Getters / Setters
    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }
    
    //mostrar
    public void mostrarMoto(){
        mostrarVehiculo();
        System.out.println("Cilindrada: " + cilindrada);
    }
    
    //toString()
    @Override
    public String toString() {
        return super.toString() + ". Moto{" + "cilindrada=" + cilindrada + '}';
    }
    
}
