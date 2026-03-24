/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio15;

/**
 *
 * @author VSPC-210660
 */
public class Direccion {
    
    //Atributos
    private String calle;
    private int numero;
    private int piso;
    private String ciudad;
    
    //Constructores
    //Por defecto
    public Direccion() {
    
        calle = "";
        numero = 0;
        piso = 0;
        ciudad = "";
    }
    
    //Parametrizado
    public Direccion(String calle, int numero, int piso, String ciudad) {
    
        this.calle = calle;
        this.numero = numero;
        this.piso = piso;
        this.ciudad = ciudad;
    }
    
    //Getters y setters

    public String getCalle() {
        return calle;
    }
    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getPiso() {
        return piso;
    }
    public void setPiso(int piso) {
        this.piso = piso;
    }

    public String getCiudad() {
        return ciudad;
    }
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    
    //Metodo mostrar
    public void mostrarDireccion() {
    
        System.out.println("Calle: " + calle);
        System.out.println("Numero: " + numero);
        System.out.println("Piso: " + piso);
        System.out.println("Ciudad: " + ciudad); 
   }
    
    //ToString

    @Override
    public String toString() {
        return "Direccion{" + "calle=" + calle + ", numero=" + numero + ", piso=" + piso + ", ciudad=" + ciudad + '}';
    }
    
    
    
}
