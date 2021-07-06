
import proyectopoo.Persona;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Karla
 */
public class Estudiante extends Persona {
    private String genero;
    private String Carrera;

    public Estudiante(String id, String nombre, String genero, String Carrera ) {
        super(id, nombre);
        this.genero = genero;
        this.Carrera = Carrera;
    }

    @Override
    public String toString() {
        return "Estudiante{" + "genero=" + genero + ", Carrera=" + Carrera + '}';
    }
}
