/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio13;

/**
 *
 * @author alumno
 */
public class Becario {
    
    //Atributos
    private String nombre;
    private String apellidos;
    private String sexo;
    private int edad;
    private int suspensos;
    private boolean rFamiliar;
    private int ingresoAnual;
    
    //Constructores
    //Por defecto
    public Becario() {
    
        nombre = "";
        apellidos = "";
        sexo = "";
        edad = 0;
        suspensos = 0;
        rFamiliar = false;
        ingresoAnual = 0;
    }
    
    //Parametrizado
    public Becario(String nombre, String apellidos, String sexo, int edad, int suspensos, boolean rFamiliar, int ingresoAnual) {
    
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.sexo = sexo;
        this.edad= edad;
        this.suspensos = suspensos;
        this.rFamiliar = rFamiliar;
        this.ingresoAnual = ingresoAnual;
    }
    
    //Getters y setters
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getSuspensos() {
        return suspensos;
    }
    public void setSuspensos(int suspensos) {
        this.suspensos = suspensos;
    }

    public boolean getrFamiliar() {
        return rFamiliar;
    }
    public void setrFamiliar(boolean rFamiliar) {
        this.rFamiliar = rFamiliar;
    }

    public int getIngresoAnual() {
        return ingresoAnual;
    }
    public void setIngresoAnual(int ingresoAnual) {
        this.ingresoAnual = ingresoAnual;
    }
    
    //ToString
    @Override
    public String toString() {
        return "Becario{" + "nombre=" + nombre + ", apellidos=" + apellidos + ", sexo=" + sexo + ", edad=" + edad + ", suspensos=" + suspensos + ", rFamiliar=" + rFamiliar + ", ingresoAnual=" + ingresoAnual + '}';
    }
    
    
    
}
