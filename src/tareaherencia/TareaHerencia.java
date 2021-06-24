/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareaherencia;

import ico.fes.datosalumno.Alumno;
import ico.fes.datospersona.Persona;

/**
 *
 * @author Said
 */
public class TareaHerencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Alumno a=new Alumno("318348614", "ICO", 2, "Said", 18, 1, 1.73f);
        
        System.out.println("Nombre: " +a.getNombre());
        System.out.println(a);
        
        Alumno c= new Alumno("164846739", "ICO", 2, "Pepe", 19, 1, 1.80f);
        System.out.println("Nombre: "+c.getNombre());
        System.out.println("Edad: "+c.getEdad());
        System.out.println("Altura: "+c.getAltura());
        System.out.println("Genero: "+c.getGenero());
        System.out.println(c);
        
        Persona b= new Persona("Roberto", 40, 1, 1.76f);
        System.out.println(b);
    }
    
}
