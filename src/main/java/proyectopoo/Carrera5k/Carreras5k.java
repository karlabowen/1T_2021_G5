
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectopoo.Carrera5k;
import java.util.*;
import proyectopoo.Estudiante;
import proyectopoo.Proyectopoo;
/**
 *
 * @author Karla
 */
public class Carreras5k {
   private ArrayList<Carrera> carreras;
   private static Scanner sc = new Scanner(System.in);
   
   public Carreras5k(ArrayList<Carrera> carreras) {
        this.carreras = carreras;
   }
   
   //mostrar info de cada carrera
    public void mostrarCarreras(){
        for(Carrera c: carreras){
            System.out.println(c);
        }
    }
    
    //metodo para crear carrera
    public void crearCarrera(){
        System.out.println("** Creacion de nueva carrera **");
        System.out.println("Fecha(dd/mm/yyyy): ");
        String fecha = sc.nextLine();
        System.out.println("Hora(hh:mm): ");
        String hora = sc.nextLine();
        System.out.println("Premio primer lugar: ");
        String p1 = sc.nextLine();
        System.out.println("Premio segundo lugar: ");
        String p2 = sc.nextLine();
        System.out.println("Premio tercer lugar: ");
        String p3 = sc.nextLine();
        
        carreras.add(new Carrera(fecha,hora,p1,p2,p3));
        
    }
    //metodo para registrar participantes
    public String registrarParticipantes(){
        System.out.println("Ingrese ID de la carrera: ");
        int idc = sc.nextInt();
        sc.nextLine();
        for(Carrera c: carreras){
            if(c.getIdCarrera()==idc){ //comparar si es la carrera indicada por el usuario
                if((c.getGanadores()).size()==0){ //comprobar que no se haya terminado
                    return c.resgistrarParticipantes();
                }else{
                    return "No se puede registrar ... Carrera ya terminada";
                }
           
            }  
        }
        //si no retorno entonces el id ingresado no existe
         System.out.println("No existe Carrera con ese id");
         return registrarParticipantes();
         
    }
    
    //método registrar ganadores que se llamará en la clase principal
    public String registrarGanadores(){
        System.out.println("Ingrese ID de la carrera: ");
        int id = sc.nextInt();
        sc.nextLine();
        for(Carrera c: carreras){
            if(c.getIdCarrera()==id){//comparar si es la carrera indicada por el usuario
                return c.registrarGanadores(); //llama al metodo reistrar ganadores de la clase Carrea
                
            }
        }
        //si no retorno entonces el id ingresado no existe
        System.out.println("No existe Carrera con ese id");
        return registrarGanadores(); //vuelva a llamar a la función hasta que el id ingresado sea el correcto
    }
}
