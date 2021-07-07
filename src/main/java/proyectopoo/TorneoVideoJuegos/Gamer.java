/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectopoo.TorneoVideoJuegos;

import proyectopoo.Estudiante;

/**
 *
 * @author Karla
 */
public class Gamer{
    private String id;
    private String nombre;
    private int lugar;

    public Gamer(Estudiante e) { //convierte al estudiante en gamer
        this.id=e.getId();
        this.nombre=e.getNombre();
    }
    //getters
    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }
    //setters
    public void setLugar(int lugar) {
        this.lugar = lugar;
    }

    
    
}
