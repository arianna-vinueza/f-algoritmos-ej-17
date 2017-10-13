/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos2;

public class Computadora {
      private double velocidad_procesador;
    
     public void establecer_velocidad_procesador(double velo) {
        velocidad_procesador = velo;
        if (velo >5) {
            velocidad_procesador = 5.0;
            
        }else{
            velocidad_procesador = velo;
        }

    }
    public double obtener_velocidad_procesador(){
       return velocidad_procesador;
    }
       
}
    

