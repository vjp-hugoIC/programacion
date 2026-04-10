/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3;

/**
 *
 * @author VSPC-210660
 */
public abstract class FiguraGeometrica {
    
    //Atributos
    private String color;
    
    //Constructores
    //Por defecto
    public FiguraGeometrica() {
    
        color = "";
    }
    
    //Parametrizado
    public FiguraGeometrica(String color) {
    
        this.color = color;
    }
    
    //Getters y setters
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    
    //To String
    @Override
    public String toString() {
        return "FiguraGeometrica{" + "color=" + color + '}';
    }
    
    //Otros metodos
    public abstract void area();
    
    public abstract void perimetro();
    
    
}
