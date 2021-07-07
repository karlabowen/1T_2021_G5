/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectopoo.TorneoVideoJuegos;
import java.util.ArrayList;
import java.util.Scanner;
import proyectopoo.Estudiante;
import proyectopoo.Proyectopoo;
/**
 *
 * @author Karla Bowen
 */
public class TorneosVideoJuegos {
    private ArrayList<Torneo> torneos;
    private static Scanner sc = new Scanner(System.in);

    public TorneosVideojuegos(ArrayList<Torneo> torneos) {
        this.torneos = torneos;
    }

    public void mostrarTorneos(){
        for(Torneo t:torneos){
            System.out.println(t);
        }
    }
    //método para crear torneo
    public void CrearTorneo(){
        System.out.println("** Creación de torneo de videojuego **");
        System.out.print("Fecha(dd/mm/yyyy): ");
        String fecha = sc.nextLine();
        System.out.print("Hora(hh:mm): ");
        String hora = sc.nextLine();
        System.out.print("Nombre de videojuego: ");
        String nombre = sc.nextLine();
        System.out.print("Premio primer lugar: ");
        String p1 = sc.nextLine();
        System.out.print("Premio segundo lugar: ");
        String p2 = sc.nextLine();
        System.out.print("Premio tercer lugar: ");
        String p3 = sc.nextLine();
        
        torneos.add(new Torneo(fecha,hora,nombre,p1,p2,p3)); //crea obajeto torneo y lo agrega a lista
    }
    
    //registra participantes
    public String registrarParticipantes(){
        System.out.println("Ingrese ID del torneo: ");
        int id =  sc.nextInt();
        for(Torneo t:torneos){
            if (t.getIdTorneo()== id){ //compara ids
                if(t.getGanadores().size()>0){ //verifica que no se haya terminado
                    return "Torneo ya terminado, no se pueden registrar participantes";
                }
                else{
                    System.out.println("** Registro de participantes en torneo de videojuego "+ t.getNombreVideo()+" **");
                    Scanner sc = new Scanner(System.in);
                    System.out.println("ID del estudiante: ");
                    String idEst = sc.nextLine();

                    while(!idEst.equals("0")){
                        System.out.println(t.verificarIdGamer(idEst)); //agrega estudiantes y verifica todas la condiciones para ser agregado
                        System.out.println("ID del estudiante: ");
                        idEst = sc.nextLine(); 
                    }
                    return " ";
                }
            }
            
        }
        System.out.println("No se encontró torneo ese ID");
        return registrarParticipantes();
    }
   
    //registra ganadores al torneo
    public String registrarGanadores(){
        System.out.println("Ingrese ID del torneo: ");
        int id =  sc.nextInt();
        for(Torneo t:torneos){
            if (t.getIdTorneo()== id){
                return t.registrarGanadores(); //registra ganadores
            }
        }
        System.out.println("No existe torneo con ese ID");
        return registrarGanadores();
    }
}
