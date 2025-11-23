/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio25;

/**
 *
 * @author VSPC-210660
 */
public class Servidor extends Ordenador {
    private double tamMonitor;
    private String modeloTeclado;
    private String modeloRaton;

    // Constructor por defecto
    public Servidor() {
        super();
    }

    // Constructor con parámetros
    public Servidor(int memoriaRam, int capacidadDisco, String procesador, String tarjetaGrafica, double precio,
                    double tamMonitor, String modeloTeclado, String modeloRaton) {

        super(memoriaRam, capacidadDisco, procesador, tarjetaGrafica, precio);
        this.tamMonitor = tamMonitor;
        this.modeloTeclado = modeloTeclado;
        this.modeloRaton = modeloRaton;
    }

    // getters y setters
    public double getTamMonitor() {
        return tamMonitor;
    }
    public void setTamMonitor(double tamMonitor) {
        this.tamMonitor = tamMonitor;
    }
    
    
    public String getModeloTeclado() {
        return modeloTeclado;
    }
    public void setModeloTeclado(String modeloTeclado) {
        this.modeloTeclado = modeloTeclado;
    }
    
    
    public String getModeloRaton() {
        return modeloRaton;
    }
    public void setModeloRaton(String modeloRaton) {
        this.modeloRaton = modeloRaton;
    }

    // Mostrar datos
    @Override
    public String toString() {
        return super.toString() + ", Monitor: " + tamMonitor +
               ", Teclado: " + modeloTeclado + ", Ratón: " + modeloRaton;
    }
}