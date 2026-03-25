
package ejemploherencia;

/**
 * Clase Vehículo
 * 
 * @author Daniel
 */
public class Vehiculo {
    
    //Atributos
    private String marca;
    private String modelo;
    private int velocidad;
    
    //Constructores
    public Vehiculo() {
        this.marca = "";
        this.modelo = "";
        this.velocidad = 0;
    }  
    
    public Vehiculo(String marca, String modelo, int velocidad) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidad = velocidad;
    }
    
    //Getters / Setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }
     
    //mostrar
    public void mostrarVehiculo(){
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Velocidad: " + velocidad);
    }
    
    //toString()
    @Override
    public String toString() {
        return "Vehiculo{" + "marca=" + marca + ", modelo=" + modelo + ", velocidad=" + velocidad + '}';
    }

    //Otros métodos
    public void acelerarVehiculo(int incremento) {
        velocidad += incremento;
    }
      
    public void frenarVehiculo(int decremento) {
        velocidad -= decremento;
    }

}
