
package proyectopoo.Carrera5k;

import proyectopoo.Estudiante;

public class Participante5k {
    private String id;
    private String nombre;
    private int lugar;
    private String tiempo;

    public Participante5k(Estudiante e) { //ingresa estudiante y lo convierte en participante
        this.id = e.getId();
        this.nombre = e.getNombre();
    }
    //getters
    public String getId() {
        return id;
    }
    //setters
    public void setLugar(int lugar) {
        this.lugar = lugar;
    }

    public void setTiempo(String tiempo) {
        this.tiempo = tiempo;
    }
    
       
}

