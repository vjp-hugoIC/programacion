/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio17;

/**
 *
 * @author VSPC-210660
 */
public class Enunciado {
    
    //Atributos
    private String pregunta;
    private String respuesta;
    
    //Constructores 
    //Por defecto
    public Enunciado() {
    
        pregunta = "";
        respuesta = "";
    }
    
    //Parametrizado
    public Enunciado(String pregunta, String respuesta) {
        this.pregunta = pregunta;
        this.respuesta = respuesta;
    }
    
    //Adicional
    public Enunciado(String pregunta) {
    
        this.pregunta = pregunta;
        this.respuesta = "";
    }
    
    //Getters y setters

    public String getPregunta() {
        return pregunta;
    }
    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public String getRespuesta() {
        return respuesta;
    }
    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }
    
    //Metodo mostrar
    public void mostrarPreguntas() {
    
        System.out.println(pregunta);
        System.out.println(respuesta);
    }
    
    //ToString

    @Override
    public String toString() {
        return "Enunciado{" + "pregunta=" + pregunta + ", respuesta=" + respuesta + '}';
    } 
    
}
