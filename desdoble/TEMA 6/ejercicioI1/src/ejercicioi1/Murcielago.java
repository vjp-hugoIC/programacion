/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioi1;

/**
 *
 * @author VSPC-210660
 */
public class Murcielago extends Mamifero implements Volador{
    
    //Atributos
    private double alturaVuelo;
    
    //Constructores
    //Por defecto
    public Murcielago() {
    
        super();
        alturaVuelo = 0.0;
    }
    
    //Parametrizado
    public Murcielago(String nombre, String sexo, String color, int edad, double alturaVuelo) {
    
        super(nombre, sexo, color, edad);
        this.alturaVuelo = alturaVuelo;
    }
    
    //Getters y setters
    public double getAlturaVuelo() {
        return alturaVuelo;
    }
    public void setAlturaVuelo(double alturaVuelo) {
        this.alturaVuelo = alturaVuelo;
    }
    
    //ToStreing
    @Override
    public String toString() {
        return super.toString() + "Murcielago{" + "alturaVuelo=" + alturaVuelo + '}';
    }
    
    //Otros metodos

    @Override
    public String obtenerMensajeVolador() {
        return "El murciélago es un animal volador";
    }

    @Override
    public void aumentarAlturaVuelo() {
        System.out.println("Subiendo altura vuelo");
        alturaVuelo = alturaVuelo + 5;
    }

    @Override
    public void bajarAlturaVuelo() {
        System.out.println("Bajando altura vuelo");
        alturaVuelo = alturaVuelo - 5;
    }

    @Override
    public void mostrarAlturaVuelo() {
        System.out.println("La altura del vuelo es de: " + alturaVuelo);
    }
    
}
