/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen2;

/**
 *
 * @author alumno
 */
public class CiclistaSprinter extends Ciclistas {
    
    //Atrivutos
    private double aceleracion;
    
    //Constructor por defecto
    public CiclistaSprinter() {
        super();
        this.aceleracion = 0.0;
    }
    
    //Constructor parametrizado
    public CiclistaSprinter(double aceleracion, String nombre, int energia, boolean estaEscapado, double kmMeta, int bidones, double velocidad, int hidratacion) {
        super(nombre, energia, estaEscapado, kmMeta, bidones, velocidad, hidratacion);
        this.aceleracion = aceleracion;
    }
    
    //Getters y Setters

    public double getAceleracion() {
        return aceleracion;
    }

    public void setAceleracion(double aceleracion) {
        this.aceleracion = aceleracion;
    }
    
    
    //Metodo ToString
    @Override
        public String toString() {
        return "CiclistaSprinter " + "nombre='" + getNombre() + '\'' +", energia=" + getEnergia() +", kmMeta=" + getKmMeta() + ", bidones=" + getBidones() +", hidratacion=" + getHidratacion() +", velocidad=";
}
    
    
    //Otros Metodos
    public void comer() {
            if (getKmMeta() > 10) { // Verifica si está a más de 10 km de la meta
            setEnergia(getEnergia() + 25); // Aumenta la energía
            System.out.println("El sprinter " + getNombre() + " acaba de tomar un gel. Su energia ahora es de " + getEnergia());
        }
    }
    
    public void beber() {
        // Si no tiene bidones, los toma (2 por defecto)
        if (getBidones() <= 0) {
            setBidones(2);
        }

        // Aumenta la hidratacion
        setHidratacion(getHidratacion() + 5);

        // Tira 1 bidon
        setBidones(getBidones() - 1);

        // Mensaje
        System.out.println("El sprinter " + getNombre() + " se ha hidratado. Su nivel de hidratacion ahora es de " + getHidratacion());
    }
    
}
