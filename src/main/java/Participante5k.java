/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Karla
 */
import java.util.Date;


class Participante5k extends Estudiante {
    Date tiempo;

    public Date getTiempo() {
        return tiempo;
    }

    public void setTiempo(Date tiempo) {
        this.tiempo = tiempo;
    }

    public Participante5k(Date tiempo, int id, String nombre) {
        super(id, nombre);
        this.tiempo = tiempo;
    }
}

