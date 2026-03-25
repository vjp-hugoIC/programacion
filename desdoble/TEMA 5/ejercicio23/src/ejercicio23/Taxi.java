/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio23;

/**
 *
 * @author VSPC-210660
 */
public class Taxi extends Vehiculo{
    
    //Atributos
    private int numeroLicencia;
    
    //Constructores
    //Por defecto
    public Taxi() {
    
        super();
        numeroLicencia = 0;
    }
    
    //Parametrizado
    public Taxi(String matricula, String modelo, int potenciaCV, int numeroLicencia) {
    
        super(matricula, modelo, potenciaCV);
        this.numeroLicencia = numeroLicencia;
    }

    //Getters y setters
    public int getNumeroLicencia() {
        return numeroLicencia;
    }
    public void setNumeroLicencia(int numeroLicencia) {
        this.numeroLicencia = numeroLicencia;
    }
    
    //Metodo mostrar
    public void mostrarTaxi() {
    
        mostrarVehiculo();
        System.out.println("Numero de licencia: " + numeroLicencia);
    }
    
    //ToString

    @Override
    public String toString() {
        return super.toString() + ". Taxi{" + "numeroLicencia=" + numeroLicencia + '}';
    }
    
    
    
    
}
