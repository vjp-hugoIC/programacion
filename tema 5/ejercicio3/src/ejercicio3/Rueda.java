/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3;

/**
 *
 * @author VSPC-210660
 */
public class Rueda {
    
    //Atributos privados
    private String material;
    private int pulgadas;
    
    
    //Inicializamos los atributos con constructores
    //Por defecto 
    public Rueda() {
        this.material = "";
        this.pulgadas = 0;
    }
    
    //parametrizados
    public Rueda (String material, int pulgadas) {
        this.material = "material";
        this.pulgadas = pulgadas;
    }
    
    
    //Getters y setters
    public String getMaterial() {
        return this.material;
    }
    public void setMaterial(String material)  {
        this.material = material;
    }
    
    public int getPulgadas() {
        return this.pulgadas;
    }
    public void setPulgadas(int pulgadas) {
        this.pulgadas = pulgadas;
    }
    
    
    //Otros metodos
    // Método para establecer el material
    public void establecerMaterial(String material) {
        this.material = material;
    }

    // Método para establecer las pulgadas
    public void establecerPulgadas(int pulgadas) {
        this.pulgadas = pulgadas;
    }

    // Método para obtener el material
    public String obtenerMaterial() {
        return material;
    }

    // Método para obtener las pulgadas
    public int obtenerPulgadas() {
        return pulgadas;
    }
    
    
    //Metodo To String
    @Override
    public String toString() {
        return "El material es " + this.material + " y tiene " + this.pulgadas + " pulgadas";
    }
    
}
