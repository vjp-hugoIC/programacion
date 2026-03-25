/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio23;

/**
 *
 * @author VSPC-210660
 */
public class Autobus extends Vehiculo{
    
    //Atributos
    private int numeroPlazas;
    
    //Constructores
    //Por defecto
    public Autobus() {
    
        super();
        numeroPlazas = 0;
    }
    
    //Parametrizado
    public Autobus(String matricula, String modelo, int potenciaCV, int numeroPlazas) {
    
        super(matricula, modelo, potenciaCV);
        this.numeroPlazas = numeroPlazas;
    }
    
    //Getters y setters

    public int getNumeroPlazas() {
        return numeroPlazas;
    }
    public void setNumeroPlazas(int numeroPlazas) {
        this.numeroPlazas = numeroPlazas;
    }
    
    //Metodo mostrar
    public void mostrarAutobus() {
    
        mostrarVehiculo();
        System.out.println("Numero de plazas: " + numeroPlazas);
    }
    
    //ToString

    @Override
    public String toString() {
        return super.toString() + ". Autobus{" + "numeroPlazas=" + numeroPlazas + '}';
    }
    
    
    
}
