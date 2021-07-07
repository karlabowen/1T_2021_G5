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
        //verifica que el participante se repita un estudiante y si no es el caso, lo agrega
    private String verificarIdParticipante(String id){
        for(Estudiante e: Proyectopoo.estudiantes){
            if(e.getId().equals(id) ){ //compara para hallar id del estudiante ingresado
                Participante5k p = new Participante5k(e);
                if(contieneParticipante(p)){ //verifica que no exista el estudiante
                    return "Participante existente";
                    
                }else{
                    addParticipante(p);
                    return "Estudiante "+ e.getNombre()+ " registrado";
                }
                
            }
        }
        return "No existe Estudiante con ese id";
      
    }
   
    
    //true si el participante ya existe, falso si no existe
    private boolean contieneParticipante( Participante5k p){
        for (Participante5k part:participantes){
            if(p.getId().equals(part.getId()))
            return true;
        }
        return false;
    }
    
    public void addParticipante(Participante5k p){
        participantes.add(p);
    }
    
    //método principal para registrar ganadores
    public String registrarGanadores(){
        if(participantes.size()<3){ //si no hay al menos tres participantes entonces no se podrán registrar ganadores
            return "No existe número mínimo de participantes ";
        }
        if(ganadores.size()==0){
            System.out.println("");
            System.out.println("** Acontinuación se solicitará el ID de los 3 primeros lugares **");
            System.out.println("** Ingreso del Primer Lugar **");
            System.out.println(agregarGanador(1)); //agrega ganador
            
            System.out.println("");
            System.out.println("** Ingreso del Segundo Lugar **");
            System.out.println(agregarGanador(2)); //agrega ganador
            
            System.out.println("");
            System.out.println("** Ingreso del Tercer Lugar **");
             System.out.println(agregarGanador(3)); //agrega ganador 2
            
            return "";
        }
        return "Carrera ya terminada, no puede registrar ganadores";
        
    }
    
    
    //agrega ganador de carrera
    private String agregarGanador(int lugar){

        System.out.println("ID: ");
        String id = sc.nextLine();
        System.out.println("Tiempo: ");
        String tiempo = sc.nextLine();
        
        for(Participante5k p: participantes){
            if(p.getId().equals(id)){

                if(existeGanador(p)){ //llama al método para verificar el ganador
                    System.out.println("Ya ha sido agregado como ganador");
                    return agregarGanador(lugar);
                }else{
                    p.setLugar(lugar);
                    p.setTiempo(tiempo);
                    agregarGanador(p);
                    return "Ganador agregado con éxito";
                }
                
            }
        }
        System.out.println("No existe participante con ese ID");
        return agregarGanador(lugar);
    }
    
    //verifica que no exista ganador 
    private boolean existeGanador(Participante5k p){
        for (Participante5k part:ganadores){
            if(p.getId().equals(part.getId()))
            return true;
        }
        return false;
    }
    
    //agrega ganador a carrera
    public void agregarGanador(Participante5k p){
        ganadores.add(p);
    }
    


    @Override
    public String toString() {
        return  "ID:"+idCarrera + "  Fecha:"+fecha+ "  Hora:"+hora+"  Cantidad de Participantes: "+ participantes.size();
    }

 
    
}   

