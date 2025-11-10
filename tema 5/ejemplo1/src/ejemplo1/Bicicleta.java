/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo1;

/**
 *
 * @author alumno
 */
public class Bicicleta {
    
    //ATRIBUTOS
    //MODIFICADORES DE ACCESO
     int ruedas; //MAL
    protected String manillar; //MAL
    private String pedales; //BIEN
    private String frenos;
    private boolean estaPedaleando;
    
    //Atributo estatico que pertenece a la clase
    private static int numBicicletas = 0;
    
    //CONSTRUCTORES
    //Por defecto
       public Bicicleta() {
        this.ruedas = 0;
        this.manillar = "";
        this.pedales = "";
        this.frenos = "";
        this.estaPedaleando = false;
        
        //incremento el valor del atributo estatico
        incrementarNumBicicletas();
    }
       
    public Bicicleta(int ruedas, String manillar, String pedales, String frenos, boolean estaPedaleando) {
    this.ruedas = ruedas;
    this.manillar = manillar;
    this.pedales = pedales;
    this.frenos = frenos;
    this.estaPedaleando = estaPedaleando;
    
    //incremento el valor del atributo estatico
    incrementarNumBicicletas();
    }
    
    //GETTERS Y SETTERS
    public void setRuedas(int ruedas) {
        this.ruedas = ruedas;
    }
    public int getRuedas() {
        return this.ruedas;
    }
    
    
    public void setManillar(String manillar) {
        this.manillar = manillar;
    }
    public String getManillar() {
        return this.manillar;
    }
    
    
    public void setRuedas(String pedales) {
        this.pedales = pedales;
    }
    public String getPedales() {
        return this.pedales;
    }
    
    
    public void setFrenos(String frenos) {
        this.frenos = frenos;
    }
    public String getFrenos() {
        return this.frenos;
    }
    
    
    public void setEstaPedaleando(boolean estaPedaleando) {
        this.estaPedaleando = estaPedaleando;
    }
    public boolean getEstaPedaleando() {
        return this.estaPedaleando;
    }
    
    
    public int getNumBicicletas(){
        return this.numBicicletas;
    }
    //MÉTODOS
    private void acelerar() {
        System.out.println("Acelerando...");
    }
    
    private static void incrementarNumBicicletas() {
        numBicicletas++;
    }
    
    //TO STRING
    @Override
    public String toString() {
        return "Mi bicicleta tiene " + this.ruedas + " ruedas " +
                ", un manillar " + this.manillar +
                ", unos pedales " + this.pedales + 
                ", unos frenos " + this.frenos + 
                " y ahora ¿Estoy pedaleando? " + this.estaPedaleando;
    }
    
}
