/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos2;

public class Ejemplos {
    public static void main(String[] args) {
        
        Computadora c = new Computadora();
        System.out.println(c.obtener_velocidad_procesador());
        c.establecer_velocidad_procesador(10);
        System.out.println(c.obtener_velocidad_procesador());
    }
}
