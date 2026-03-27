/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio24;

/**
 *
 * @author VSPC-210660
 */
public class ProductoFresco extends Producto{
    
    //Atributos
    private int fechaEnvasado;
    private String paisOrigen;
    
    //Constructores
    //Por defecto
    public ProductoFresco() {
    
        super();
        fechaEnvasado = 0;
        paisOrigen = "";
    }
    
    //Parametrizado
    public ProductoFresco(int fechaCaducidad, int numeroLote, int fechaEnvasado, String paisOrigen) {
    
        super(fechaCaducidad, numeroLote);
        this.fechaEnvasado = fechaEnvasado;
        this.paisOrigen = paisOrigen;
    }
    
    //Getters y setters

    public int getFechaEnvasado() {
        return fechaEnvasado;
    }
    public void setFechaEnvasado(int fechaEnvasado) {
        this.fechaEnvasado = fechaEnvasado;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }
    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }
    
    //Mostrar
    public void mostrarProductoFresco() {
    
        mostrarProducto();
        System.out.println("Fecha de envasado: " + fechaEnvasado);
        System.out.println("Pais de origen: " + paisOrigen);
    }
    
    //ToString

    @Override
    public String toString() {
        return super.toString() + "ProductoFresco{" + "fechaEnvasado=" + fechaEnvasado + ", paisOrigen=" + paisOrigen + '}';
    }
    
}
