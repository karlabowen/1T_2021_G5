
/***
 *
 * @author Karla
 */
package proyectopoo;
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
