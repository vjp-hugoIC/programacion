/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio25;

/**
 *
 * @author VSPC-210660
 */
public class Portatil extends Ordenador{
    
    //Atributos
    private String marca;
    private int tamañoPantalla;
    private int peso;
    
    //Constructores
    //Por defecto

    public Portatil() {
        super();
        marca = "";
        tamañoPantalla = 0;
        peso = 0;
    }

    public Portatil( int ram, int discoDuro, String modeloProcesador, String modeloTarjeta, int precio, String marca, int tamañoPantalla, int peso) {
        super(ram, discoDuro, modeloProcesador, modeloTarjeta, precio);
        this.marca = marca;
        this.tamañoPantalla = tamañoPantalla;
        this.peso = peso;
    }
    
    //Getters y setters

    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getTamañoPantalla() {
        return tamañoPantalla;
    }
    public void setTamañoPantalla(int tamañoPantalla) {
        this.tamañoPantalla = tamañoPantalla;
    }

    public int getPeso() {
        return peso;
    }
    public void setPeso(int peso) {
        this.peso = peso;
    }
    
    //Metodo mostrar
    public void mostrarPortatil() {
    
        mostrarOrdenador();
        System.out.println("Marca: " + marca);
        System.out.println("Tamaño de la pantalla: " + tamañoPantalla);
        System.out.println("Peso: " + peso);
    }
    
    //ToString

    @Override
    public String toString() {
        return super.toString() + "Portatil{" + "marca=" + marca + ", tama\u00f1oPantalla=" + tamañoPantalla + ", peso=" + peso + '}';
    }
    
    
    
}
