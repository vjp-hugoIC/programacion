/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio24;

/**
 *
 * @author VSPC-210660
 */
public class ProductoRefrigerado extends Producto{
    
    //Atributos
    private int codigoOrganismo;
    
    //Constructores
    //Por defecto
    public ProductoRefrigerado() {
    
        super();
        codigoOrganismo = 0;
    }
    
    //Por defecto
    public ProductoRefrigerado(int fechaCaducidad, int numeroLote, int codigoOrganismo) {
    
        super(fechaCaducidad, numeroLote);
        this.codigoOrganismo = codigoOrganismo;
    }
    
    //Getters y setters

    public int getCodigoOrganismo() {
        return codigoOrganismo;
    }
    public void setCodigoOrganismo(int codigoOrganismo) {
        this.codigoOrganismo = codigoOrganismo;
    }
    
    //Metodo mostrar
    public void mostrarProductoRefrigerado() {
    
        mostrarProducto();
        System.out.println("Codigo del organismno: " + codigoOrganismo);
    }
    
    //ToString

    @Override
    public String toString() {
        return super.toString() + "ProductoRefrigerado{" + "codigoOrganismo=" + codigoOrganismo + '}';
    }
    
}
