
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
}
