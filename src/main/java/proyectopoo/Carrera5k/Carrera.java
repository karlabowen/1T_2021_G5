package proyectopoo.Carrera5k;
import java.util.*;
import proyectopoo.Competencia;
import proyectopoo.Estudiante;
import proyectopoo.Proyectopoo;


/**
 *
 * @author Karla
 */
public class Carrera extends Competencia{
    private int idCarrera;
    private static int idCarreraSiguiente; //se obtienen ids en orden para cada carrera
    private ArrayList<Participante5k> participantes;
    private ArrayList<Participante5k> ganadores;
    
    private static Scanner sc = new Scanner(System.in);

    public Carrera(String fecha, String hora, String primerPremio, String segundoPremio, String tercerPremio) {
        super(fecha, hora, primerPremio, segundoPremio, tercerPremio);
        ++idCarreraSiguiente;
        idCarrera = idCarreraSiguiente;
        participantes = new ArrayList<Participante5k>() ;
        ganadores = new ArrayList<Participante5k>();
    }


    public int getIdCarrera() {
        return idCarrera;
    }

    public ArrayList<Participante5k> getParticipantes() {
        return participantes;
    }

    public ArrayList<Participante5k> getGanadores() {
        return ganadores;
    }
    //registrar paticipantes
    public String resgistrarParticipantes(){
        System.out.println("** Registro de participantes en carrera del "+ getFecha()+"  **");
        Scanner sc = new Scanner(System.in);
        System.out.println("ID del estudiante: ");
        String idEst = sc.nextLine();
        while(!idEst.equals("0")){

            System.out.println(verificarIdParticipante(idEst));
            System.out.println("ID del estudiante: ");
            idEst = sc.nextLine(); 
        }
        return " ";

    }

    public int getCantParticipante() {
        return cantParticipante;
    }

    public void setCantParticipante(int cantParticipante) {
        this.cantParticipante = cantParticipante;
    }
    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Date getHora() {
        return hora;
    }

    public void setHora(Date hora) {
        this.hora = hora;
    }

    public String getPremio1l() {
        return premio1l;
    }

    public void setPremio1l(String premio1l) {
        this.premio1l = premio1l;
    }

    public String getPremio2l() {
        return premio2l;
    }

    public void setPremio2l(String premio2l) {
        this.premio2l = premio2l;
    }

    public String getPremio3l() {
        return premio3l;
    }

    public void setPremio3l(String premio3l) {
        this.premio3l = premio3l;
    }

    @Override
    public String toString() {
        return  Id + "  fecha=" + fecha + "  hora=" + hora + " Cantidad de participantes="+cantParticipante;
    }

 
    
}   

