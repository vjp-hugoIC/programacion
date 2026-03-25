/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio23;

/**
 *
 * @author VSPC-210660
 */
public class Vehiculo {
    
    //Atributos
    private String matricula;
    private String modelo;
    private int potenciaCV;
    
    //Constructores
    //Por defecto
    public Vehiculo() {
    
        matricula = "";
        modelo = "";
        potenciaCV = 0;
    }
    
    //Parametrizado
    public Vehiculo(String matricula, String modelo, int potenciaCV) {
    
        this.matricula = matricula;
        this.modelo = modelo;
        this.potenciaCV = potenciaCV;
    }
    
    //Getters y setters

    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getPotenciaCV() {
        return potenciaCV;
    }
    public void setPotenciaCV(int potenciaCV) {
        this.potenciaCV = potenciaCV;
    }
    
    //Metodo mostrar
    public void mostrarVehiculo() {
    
        System.out.println("Matricula: " + matricula);
        System.out.println("Modelo: " + modelo);
        System.out.println("Potencia: " + potenciaCV);
    }
    
    //ToString

    @Override
    public String toString() {
        return "Vehiculo{" + "matricula=" + matricula + ", modelo=" + modelo + ", potenciaCV=" + potenciaCV + '}';
    }
    
    
    
}
