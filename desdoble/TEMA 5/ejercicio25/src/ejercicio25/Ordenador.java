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
    
    //Atributos
    private int ram;
    private int discoDuro;
    private String modeloProcesador;
    private String modeloTarjeta;
    private int precio;
    
    //Constructores
    //Por defecto
    public Ordenador() {
    
        ram = 0;
        discoDuro = 0;
        modeloProcesador = "";
        modeloTarjeta = "";
        precio = 0;
    }
    
    //Parametrizados
    public Ordenador(int ram, int discoDuro, String modeloProcesador, String modeloTarjeta, int precio) {
    
        this.ram = ram;
        this.discoDuro = discoDuro;
        this.modeloProcesador = modeloProcesador;
        this.modeloTarjeta = modeloTarjeta;
        this.precio = precio;
    }
    
    //Getters y setters

    public int getRam() {
        return ram;
    }
    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getDiscoDuro() {
        return discoDuro;
    }
    public void setDiscoDuro(int discoDuro) {
        this.discoDuro = discoDuro;
    }

    public String getModeloProcesador() {
        return modeloProcesador;
    }
    public void setModeloProcesador(String modeloProcesador) {
        this.modeloProcesador = modeloProcesador;
    }

    public String getModeloTarjeta() {
        return modeloTarjeta;
    }
    public void setModeloTarjeta(String modeloTarjeta) {
        this.modeloTarjeta = modeloTarjeta;
    }

    public int getPrecio() {
        return precio;
    }
    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
    //Metodo mostrar
    public void mostrarOrdenador() {
    
        System.out.println("Memoria RAM: " + ram);
        System.out.println("Disco duro: " + discoDuro);
        System.out.println("Modelo del procesador: " + modeloProcesador);
        System.out.println("Modelo de la tarjeta grafica: " + modeloTarjeta);
        System.out.println("Precio + " + precio + "€");
    }
    
    //ToString

    @Override
    public String toString() {
        return "Ordenador{" + "ram=" + ram + ", discoDuro=" + discoDuro + ", modeloProcesador=" + modeloProcesador + ", modeloTarjeta=" + modeloTarjeta + ", precio=" + precio + '}';
    }
       
}
