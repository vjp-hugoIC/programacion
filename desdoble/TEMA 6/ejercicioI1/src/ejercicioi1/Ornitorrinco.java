/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioi1;

/**
 *
 * @author VSPC-210660
 */
public class Ornitorrinco extends Mamifero implements oviparo{
    
    //Atributos
    private int nHuevos;
    
    //Constructores
    //Por defecto
    public Ornitorrinco() {
    
        super();
        nHuevos = 0;
    }
    
    //Parametrizzado
    public Ornitorrinco(String nombre, String sexo, String color, int edad, int nHuevos) {
    
        super(nombre, sexo, color, edad);
        this.nHuevos = nHuevos;
    }
    
    //Getters y setters
    public int getnHuevos() {
        return nHuevos;
    }
    public void setnHuevos(int nHuevos) {
        this.nHuevos = nHuevos;
    }
    
    //ToString

    @Override
    public String toString() {
        return super.toString() + "Ornitorrinco{" + "nHuevos=" + nHuevos + '}';
    }
    
    //Otros metodos
    @Override
    public String obtenerMensajeOviparo() {
    
        return "El ornitorrinco es un mamífero ovíparo";
    }
    
    @Override
    public void ponerHuevo() {
    
        System.out.println("Poniendo huevo");
        nHuevos ++;
    }
    
    @Override
    public void incubarHuevo() {
    
        System.out.println("Incubando huevo");
        nHuevos --;
    }
    

    @Override
    public void mostrarNumHuevos() {
        System.out.println("Numero de huevos: " + nHuevos);
    }
    
    
    
}
