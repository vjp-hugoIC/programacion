/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio24;

/**
 *
 * @author VSPC-210660
 */
public class Producto {
    
    //Atributos
    private int fechaCaducidad;
    private int numeroLote;
    
    //Constructores
    //Por defecto
    public Producto() {
    
        fechaCaducidad = 0;
        numeroLote = 0;
    }
    
    //Parametrizado

    public Producto(int fechaCaducidad, int numeroLote) {
        this.fechaCaducidad = fechaCaducidad;
        this.numeroLote = numeroLote;
    }
    
    //Getters y setters

    public int getFechaCaducidad() {
        return fechaCaducidad;
    }
    public void setFechaCaducidad(int fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    public int getNumeroLote() {
        return numeroLote;
    }
    public void setNumeroLote(int numeroLote) {
        this.numeroLote = numeroLote;
    }
    
    //Mostrar
    public void mostrarProducto() {
    
        System.out.println("Fecha de caducidad: " + fechaCaducidad);
        System.out.println("Numero de lote: " + numeroLote);
    }
    
    //ToString

    @Override
    public String toString() {
        return "Producto{" + "fechaCaducidad=" + fechaCaducidad + ", numeroLote=" + numeroLote + '}';
    }
    
    
    
}
