/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemploherencia;

/**
 *
 * @author alumno
 */
public class enemigo extends personaje{
    
    //Atributos
    private String arma;
    
    //Constructores
    public enemigo() {
        super();
        this.arma  = "";
    }
    public enemigo(int vida, String arma) {
        super(vida);
        this.arma = arma;
    }
    
    //Getters y Setters
    public String getArma() {
        return this.arma;
    }
    public void setArma(String arma) {
        this.arma = arma;
    }
    
    //Métodos
    public void crearSoldados() {
        System.out.println("Creando soldados...");
    }
    
    //To string
    @Override
    public String toString() {
        return "EL ENEMIGO tiene " + super.getVida() + "% de vida y el arma " + this.arma;
    }
    
}
