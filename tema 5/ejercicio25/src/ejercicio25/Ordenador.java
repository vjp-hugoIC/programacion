/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio25;

/**
 *
 * @author VSPC-210660
 */
public class Ordenador {
    
    // Atributos
    private int memoriaRam;
    private int capacidadDisco;
    private String procesador;
    private String tarjetaGrafica;
    private double precio;

    // Constructor por defecto
    public Ordenador() {
        this.memoriaRam = 0;
        this.capacidadDisco = 0;
        this.procesador = "";
        this.tarjetaGrafica = "";
        this.precio = 0;
    }

    // Constructor con parámetros
    public Ordenador(int memoriaRam, int capacidadDisco, String procesador, String tarjetaGrafica, double precio) {
        this.memoriaRam = memoriaRam;
        this.capacidadDisco = capacidadDisco;
        this.procesador = procesador;
        this.tarjetaGrafica = tarjetaGrafica;
        this.precio = precio;
    }

    //getters y setters
    public int getMemoriaRam() {
        return memoriaRam;
    }
    public void setMemoriaRam(int memoriaRam) {
        this.memoriaRam = memoriaRam;
    }
    
    
    public int getCapacidadDisco() {
        return capacidadDisco;
    }
    public void setCapacidadDisco(int capacidadDisco) {
        this.capacidadDisco = capacidadDisco;
    }
    
    
    public String getProcesador() {
        return procesador;
    }
    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }
    
    
    public String getTarjetaGrafica() {
        return tarjetaGrafica;
    }
    public void setTarjetaGrafica(String tarjetaGrafica) {
        this.tarjetaGrafica = tarjetaGrafica;
    }
    
    
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    

    // Mostrar datos
    @Override
    public String toString() {
        return "RAM: " + memoriaRam + " GB, Disco: " + capacidadDisco + " GB, Procesador: " + procesador +
               ", Tarjeta Gráfica: " + tarjetaGrafica + ", Precio: " + precio + " €";
    }
}