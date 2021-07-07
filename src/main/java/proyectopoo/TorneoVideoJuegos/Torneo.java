/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectopoo.TorneoVideoJuegos;
import java.util.ArrayList;
import java.util.Scanner;
import proyectopoo.Competencia;
import proyectopoo.Estudiante;
import proyectopoo.Proyectopoo;

public class Torneo extends Competencia{
    private int idTorneo;
    private static int idTorneoSiguiente;
    private String nombreVideo;
    private ArrayList<Gamer> jugadores;
    private ArrayList<Gamer> ganadores;
    
    private static Scanner sc = new Scanner(System.in);
    

    public Torneo(String fecha, String hora, String nombreVideo, String primerPremio, String segundoPremio, String tercerPremio) {
        super(fecha, hora, primerPremio, segundoPremio, tercerPremio);
        ++idTorneoSiguiente;
        idTorneo = idTorneoSiguiente;
        this.nombreVideo = nombreVideo;
        jugadores = new ArrayList<>();
        ganadores = new ArrayList<>();
    }

    public int getIdTorneo() {
        return idTorneo;
    }

    public ArrayList<Gamer> getGanadores() {
        return ganadores;
    }

    public String getNombreVideo() {
        return nombreVideo;
    }
    
    public void addGanador(Gamer g){
        ganadores.add(g);
    }

    public ArrayList<Gamer> getJugadores() {
        return jugadores;
    }
    
    //verifica gamer para su registro
    public String verificarIdGamer(String id){
        for(Estudiante e: Proyectopoo.estudiantes){
            if(e.getId().equals(id)){ //compara 
                Gamer g= new Gamer(e);
                if(contieneGamer(g)){ //veri
                    return "Jugador ya existente";
                }
                addGamer(g);
                return "Estudiante "+ e.getNombre()+ " registrado";
            }
        }
        return "No existe Estudiante con ese id";
    }
    
    //verifica que no exista gamer
    public boolean contieneGamer(Gamer g){
       for (Gamer jugador: jugadores){
            if(jugador.getId().equals(g.getId()))
            return true;
        }
        return false;
   }
    //agrega gamer al torneo
    public void addGamer(Gamer g){
        jugadores.add(g);
    }
 
    public String registrarGanadores(){
        if(jugadores.size()<3){ //verifica el mínimo de participantes
            return "No existe número mínimo de participantes ";
        }
        if(ganadores.size()==0){
            System.out.println(agregarGanador(1)); //agrega ganador 1

            System.out.println(agregarGanador(2)); //agrega ganador 2
            
             System.out.println(agregarGanador(3));  //agrega ganador 3
            
            return "";
        }
        return "Torneo ya terminado, no puede registrar ganadores";
        
    }
    
    public String agregarGanador(int lugar){
        System.out.println("");
        System.out.println("ID del lugar "+lugar+": ");
        String id = sc.nextLine();
        
        for(Gamer g: jugadores){
            if(g.getId().equals(id)){ //compara id del gamer
                
                if(verificaGanadorTorneo(g)){ //verifica que no exista el ganador
                    //en el casode que exista
                    System.out.println("Ya ha sido agregado como ganador");
                    return agregarGanador(lugar);
                }else{
                    //cumple todo los requerimiento y será agregado
                    g.setLugar(lugar);
                    addGanador(g);
                    return "Ganador agregado con éxito";
                }
                
            }
        }
        //vuelva a pedir id hasta que ingrese uno correcto
        System.out.println("No existe jugador con ese ID");
        return agregarGanador(lugar);
    }
    
    //verifica que no exista ganador
    public boolean verificaGanadorTorneo(Gamer gamer){
        for (Gamer g:ganadores){
            if(g.getId().equals(gamer.getId())) //compara id
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "ID:"+idTorneo + "  Fecha:"+fecha+ "  Hora:"+hora+"  Nombre Videojuego: "+ nombreVideo;
    }
    
    
}
