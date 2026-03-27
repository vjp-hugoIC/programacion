/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio25;

/**
 *
 * @author VSPC-210660
 */
public class Servidor extends Ordenador{
    
    //Atributos
    private int monitor;
    private int teclado;
    private String raton;
    
    //Constructores
    //Por defecto

    public Servidor() {
        super();
        monitor = 0;
        teclado = 0;
        raton = "";
    }

    //Parametrizado
    public Servidor( int ram, int discoDuro, String modeloProcesador, String modeloTarjeta, int precio, int monitor, int teclado, String raton) {
        super(ram, discoDuro, modeloProcesador, modeloTarjeta, precio);
        this.monitor = monitor;
        this.teclado = teclado;
        this.raton = raton;
    }
    
    //Getters y setters

    public int getMonitor() {
        return monitor;
    }
    public void setMonitor(int monitor) {
        this.monitor = monitor;
    }

    public int getTeclado() {
        return teclado;
    }
    public void setTeclado(int teclado) {
        this.teclado = teclado;
    }

    public String getRaton() {
        return raton;
    }
    public void setRaton(String raton) {
        this.raton = raton;
    }
    
    //Metodo mostrar
    public void mostrarServidor() {
    
        mostrarOrdenador();
        System.out.println("Tamaño monitor: " + monitor);
        System.out.println("Tamaño del teclado: " + teclado);
        System.out.println("Modelo del raton: " + raton);
    }
    
    //ToString

    @Override
    public String toString() {
        return super.toString() + "Servidor{" + "monitor=" + monitor + ", teclado=" + teclado + ", raton=" + raton + '}';
    }   
}
