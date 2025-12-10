/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen2;

/**
 *
 * @author alumno
 */
public class CiclistaEscalador extends Ciclistas implements Pedaleable {
    
    //Atributos de ciclistaEscalador
    private double potencia;
    private double fuerza;
    
    //Constructores por defecto
    public CiclistaEscalador() {
        super();
        this.fuerza = 0.0;
        this.potencia = 0.0;
    }
    
    //Constructores parametrizados de ciclistaEscalador
    public CiclistaEscalador(double potencia, double fuerza, String nombre, int energia, boolean estaEscapado, double kmMeta, int bidones, double velocidad, int hidratacion) {
        super(nombre, energia, estaEscapado, kmMeta, bidones, velocidad, hidratacion);
        this.potencia = potencia;
        this.fuerza = fuerza;
    }
    
    //Getters y Setters
        public double getPotencia() {
            return potencia;
        }
        public void setPotencia(double potencia) {
            this.potencia = potencia;
        }

        public double getFuerza() {
            return fuerza;
        }
        public void setFuerza(double fuerza) {
            this.fuerza = fuerza;
        }

    //Metodo ToString
        @Override
           public String toString() {
            return "CiclistaEscalador" + "nombre=" + getNombre() + ", energia=" + getEnergia() + ", potencia=" + potencia + ", fuerza=" + fuerza;
}
        
        
    //Otros Metodos        
         public void comer() {
            if (getKmMeta() > 20) { // Verifica si está a más de 20 km de la meta
            setEnergia(getEnergia() + 30); // Aumenta la energía
            System.out.println("El escalador " + getNombre() + " acaba de tomar un gel. Su energia ahora es de " + getEnergia());
        }
    }
         public void beber() {
        // Si no tiene bidones, los toma (2 por defecto)
        if (getBidones() <= 0) {
            setBidones(2);
        }

        // Aumenta la hidratacion
        setHidratacion(getHidratacion() + 10);

        // Tira 2 bidones
        setBidones(getBidones() - 2);

        // Mensaje
        System.out.println("El escalador " + getNombre() + " se ha hidratado. Su nivel de hidratacion ahora es de " + getHidratacion());
    }
         
         
         @Override
        public void sprintar() {
            if (getKmMeta() < 0.3 && getEnergia() >= 20) {
                double velocidad = potencia / fuerza;
            setEnergia(getEnergia() - 20); // disminuye la energía
            System.out.println("El escalador " + getNombre() + " está sprintando a " + velocidad + " km/h");
            } else {
            System.out.println("Aún no puede sprintar");
        }
    }

        
        //Lo pongo para que no me de error de compilacion con la bobillita que sale aun que no sepa que hacer
    @Override
    public void atacar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public float recuperar(float kmRecuperacion) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


}

