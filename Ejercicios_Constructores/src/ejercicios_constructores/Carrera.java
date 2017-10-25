/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_constructores;

public class Carrera {
    
    private String nombre;
    private String modalidad;
    
    public Carrera(){
        
    }
    
    public void establecer_nombre(String n){
        nombre = n;
        
    }
    
    public String obtener_nombre(){
        return nombre;
    }
    
    public void establecer_modalidad(String m){
        modalidad = m; 
    }
    
    public String obtener_modalidad(){
        return modalidad;
    }
    
    public Carrera(String mod){
        modalidad = mod;
    }
    
    public Carrera (String mod, String nom){
      modalidad = mod;
      nombre = nom;
    }
    
    @Override
        public String toString(){
            String cadena = String.format(obtener_nombre(),obtener_modalidad());
            return cadena;
        }
}
