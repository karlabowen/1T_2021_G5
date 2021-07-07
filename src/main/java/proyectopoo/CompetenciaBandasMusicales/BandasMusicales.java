/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectopoo.CompetenciaBandasMusicales;
import java.util.*;
import proyectopoo.Estudiante;
import proyectopoo.Proyectopoo;
/**
 *
 * @author Karla
 */
public class BandasMusicales {
    
    private ArrayList<CompetenciaBandas> compBandas;
    private static Scanner sc = new Scanner(System.in);

    public BandasMusicales(ArrayList<CompetenciaBandas> compBandas) {
        this.compBandas = compBandas;
    }

    public void mostrarCompetenciaBandas(){
        for(CompetenciaBandas cb: compBandas){
            System.out.println(cb);
        }
    }
    
    //crear competencia de bandas musicales
    public void crearCompetencia(){
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
        
        
        compBandas.add(new CompetenciaBandas(fecha,hora,p1,p2,p3,crearListaJurados()));
        
    }
    
    //pide al usuario los jurados y retorna la lista de jurados 
    public  ArrayList<Jurado> crearListaJurados(){
        ArrayList<Jurado> listaJurados =  new ArrayList<>();
        System.out.println("** Jurados **");
        int i=1;
        while(i<=3){
            System.out.println("* Informacion del Jurado "+ i+" *");
 
            System.out.println("ID: ");
            String id = sc.nextLine();
            System.out.println("Nombre: ");
            String nombre = sc.nextLine();
            System.out.println("Bio: ");
            String bio = sc.nextLine();
            listaJurados.add(new Jurado(id,nombre,bio));    //crea objeto jurado y agrega a la lista  
            i++;
            
        }
        return listaJurados;
        
    }
    
    //registrar banda musical en competencia
    public String registrarBandas(){
        System.out.println("Ingrese ID de competencia: ");
        int id = sc.nextInt();
        sc.nextLine();
        
        for(CompetenciaBandas  comp:compBandas ){
            if(comp.getIdCompBanda()==id){ //compara hasta hallar el id ingresado por el usuario
                if(comp.getBandasGanadoras().size()>0){ //verifica que no se ha terminado
                    return "Competencia de Bandas ya terminada, no puede registrar bandas";
                    
                }else{
                    comp.mostrarBandas(); //muestra las bandas para esa competencia
                    comp.registros(); //llama a metodo en clase CompetenciaBandas
                    return "";
                }
            }
        }
        System.out.println("No existe competencia de bandas con ese ID");
        return registrarBandas();
        
    }
    
 
    
   
}

