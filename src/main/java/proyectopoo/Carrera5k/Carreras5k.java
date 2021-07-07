
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
    
}
