/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio24;

/**
 *
 * @author VSPC-210660
 */
public class ProductoCongelado extends Producto{
    
    //Atributos
    private int temperaturaCongelacion;
    
    //Constructores
    //Por defecto
    public ProductoCongelado() {
    
        super();
        temperaturaCongelacion = 0;
    }
    
    //Parametrizado
    public ProductoCongelado(int fechaCaducidad, int numeroLote, int temperaturaCongelacion) {
    
        super(fechaCaducidad, numeroLote);
        this.temperaturaCongelacion = temperaturaCongelacion;
    }
    
    //Getters y setters

    public int getTemperaturaCongelacion() {
        return temperaturaCongelacion;
    }
    public void setTemperaturaCongelacion(int temperaturaCongelacion) {
        this.temperaturaCongelacion = temperaturaCongelacion;
    }
    
    //Metodo mostrar
    public void mostrarProductoCongelado() {
    
        mostrarProducto();
        System.out.println("Temperatura de congelacion: " + temperaturaCongelacion);
    }
    
    //ToString

    @Override
    public String toString() {
        return super.toString() + "ProductoCongelado{" + "temperaturaCongelacion=" + temperaturaCongelacion + '}';
    }
    
    
    
}
