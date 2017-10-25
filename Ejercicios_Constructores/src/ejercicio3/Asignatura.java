/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

public class Asignatura {
    
    private String nombre;
    private int creditos;
    private Carrera carrera;
    
    public Asignatura (Carrera c){
        carrera = c;
        nombre = "Informatica";
        creditos = 5;
    }
    
    
    public void establecer_nombre(String n){
        nombre = n;
    }
    
    public String obtener_nombre(){
        return nombre;
    }
    
    public void establecer_creditos(int c){
        creditos = c;
    }
    
    public int obtener_creditos() {
        return creditos;
    }
    
    
    public void establecer_Carrera(Carrera car){
       carrera = car;
    }
    
    public Carrera obtener_carrera() {
        return carrera;
    }
    
    
    @Override
    public String toString(){
        String cadena = String.format("Asignatura\n"
                            +"Nombres: %s\n"
                            +"Creditos: %d\n"
                            +"%s",obtener_nombre(),obtener_creditos(), obtener_carrera());
        return cadena;
    }
 
}
