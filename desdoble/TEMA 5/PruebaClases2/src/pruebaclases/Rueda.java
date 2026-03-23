
package pruebaclases;

/**
 * Clase Rueda
 * 
 * @author Daniel
 */
public class Rueda {
    
    //Atributos
    private int diametro;

    //Constructores
    public Rueda() {
        this.diametro = 0;
    }
    
    public Rueda(int diametro) {
        this.diametro = diametro;
    }
    
    //Getters / Setters
    public int getDiametro() {
        return diametro;
    }

    public void setDiametro(int diametro) {
        this.diametro = diametro;
    }
    
    //mostrarRueda
    public void mostrarRueda(){
        System.out.println("Diametro: " + diametro);  
    }
    
    //toString
    @Override
    public String toString() {
        return "Rueda{" + "diametro=" + diametro + '}';
    }
  

}
