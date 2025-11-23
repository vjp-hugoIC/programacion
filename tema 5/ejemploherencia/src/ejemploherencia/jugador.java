/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemploherencia;

/**
 *
 * @author alumno
 */
public class jugador extends personaje {
    
    //Atributos
    public String inventario;
    
    //Constructores
    public jugador() {
        //Llamar al constructor por defcto de Personaje
        super();
        this.inventario = "";
    }
    public jugador(int vida, String inventario) {
        super(vida);
        this.inventario = inventario;
    }
    
    //Getters y Setters
    public String getInventario() {
        return this.inventario;
    }
    public void setInventario(String inventario) {
        this.inventario = inventario;
    }
    
    //Metodos
    public void recoger(String objeto) {
        System.out.println("Recogiendo " + objeto + "...");
    }
    
    //To string
    @Override
    public String toString() {
        return super.toString() + " y es un JUGADOR con " + this.inventario;
    }
    
    
}
