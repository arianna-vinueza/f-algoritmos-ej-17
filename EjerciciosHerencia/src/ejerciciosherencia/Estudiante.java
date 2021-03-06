/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosherencia;

/**
 *
 * @author Arianna Vinueza
 */
public class Estudiante extends Persona{
    private String carrera;
    private double matricula;
    
   
    public Estudiante(String n, String a, int e, double mat){
        super(n, a, e);
        setMatricula(mat);
    }
    
    public void setEdad(int e){
        if (edad < 18){ 
           edad = 18;
        }else{
            edad = e;
        }
    }
    
     public void setMatricula(double mat){
        matricula = mat;
    }
    
    public double getMatricula(){
        return matricula;
    }
    
    @Override
    public String toString(){
    
        return String.format("%s - %f", super.toString(), getMatricula());
    }
    
    
    // @Override
    // public String toString(){
    
    //    return String.format("%s - %f", getApellido(), getMatricula());
    // }
}
