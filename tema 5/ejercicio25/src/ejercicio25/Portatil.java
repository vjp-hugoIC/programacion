/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio25;

/**
 *
 * @author VSPC-210660
 */
public class Portatil extends Ordenador {
    private String marca;
    private double tamPantalla;
    private double peso;

    public Portatil() {
        super();
    }

    public Portatil(int memoriaRam, int capacidadDisco, String procesador, String tarjetaGrafica, double precio,
                    String marca, double tamPantalla, double peso) {

        super(memoriaRam, capacidadDisco, procesador, tarjetaGrafica, precio);
        this.marca = marca;
        this.tamPantalla = tamPantalla;
        this.peso = peso;
    }

    // getters y setters
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    
    public double getTamPantalla() {
        return tamPantalla;
    }
    public void setTamPantalla(double tamPantalla) {
        this.tamPantalla = tamPantalla;
    }

    
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return super.toString() + ", Marca: " + marca +
               ", Pantalla: " + tamPantalla + ", Peso: " + peso + " kg";
    }
}
