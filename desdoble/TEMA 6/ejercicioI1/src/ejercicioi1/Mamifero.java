/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioi1;

/**
 *
 * @author VSPC-210660
 */
public class Mamifero {
    
    //Atributos
    private String nombre;
    private String sexo;
    private String color;
    private int edad;
    
    //Constructores
    //Por defecto
    public Mamifero() {
    
        nombre = "";
        sexo = "";
        color = "";
        edad = 0;
    }
    
    //Parametrizado
    public Mamifero(String nombre, String sexo, String color, int edad) {
        this.nombre = nombre;
        this.sexo = sexo;
        this.color = color;
        this.edad = edad;
    }
    
    //Getters y setters
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    //To String
    @Override
    public String toString() {
        return "Mamifero{" + "nombre=" + nombre + ", sexo=" + sexo + ", color=" + color + ", edad=" + edad + '}';
    }
    
    
    
    
    
}
