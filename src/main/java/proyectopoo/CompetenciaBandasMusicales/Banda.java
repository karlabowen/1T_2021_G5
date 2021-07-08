/**
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectopoo.CompetenciaBandasMusicales;
import java.util.ArrayList;
import java.util.Scanner;
import proyectopoo.Estudiante;
import proyectopoo.Proyectopoo;

public class Banda {
    private int idBanda;
    private static int idBandaSiguiente; //se obtienen ids en orden para cada banda
    private String nombre;
    private String cancion;
    private int lugar;
    private ArrayList<IntegranteBanda> integrantes;
    
    private static Scanner sc = new Scanner(System.in);

    public Banda(String nombre, String cancion) {
        ++idBandaSiguiente;
        idBanda = idBandaSiguiente;
        this.nombre = nombre;
        this.cancion = cancion;
        this.integrantes = new ArrayList<>();
        
    }
    //getters
    public int getIdBanda() {
        return idBanda;
    }

    public ArrayList<IntegranteBanda> getIntegrantes() {
        return integrantes;
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setLugar(int lugar) {
        this.lugar = lugar;
    }
    
    //ingresa numerode integrates que el usuario desea
    public String ingresoIntegrantes(int num,ArrayList<Banda> bandasMusicales){
            for(int i=1; i<=num;i++){
                System.out.println(verificarIntegrante(i,bandasMusicales));
            }
        return "";
    }
      
    //valida el ingreso de integrante y que cumpla todos los requisistos y si cumple lo agrega
    private String verificarIntegrante(int i, ArrayList<Banda> bandasMusicales){
        System.out.println("ID integrante "+i+ ": ");
        String idEst = sc.nextLine();
        for(Estudiante e: Proyectopoo.estudiantes){
            if(e.getId().equals(idEst)){ //compara integrantes
                IntegranteBanda intBanda = new IntegranteBanda(e); //crea objeto integrante
                if(contieneIntegrante(intBanda,bandasMusicales)){ //verifica que no exista
                   System.out.println("Integrante ya existente");
                   return verificarIntegrante(i,bandasMusicales);
                }
                //en el caso de que no exista
                intBanda.setRol(verificaRol()); //agrega el rol
                addIntegrante(intBanda);
                return "Estudiante "+ e.getNombre()+" registrado";
   
            }
        }
        System.out.println("No existe estudiante con ese ID");
        return verificarIntegrante(i,bandasMusicales);
    }

 //verifa que el rol sea ingresado de dorma correcta y devuelve RolBanda
    private RolBanda verificaRol(){
        System.out.println("Rol(CANTANTE,GUITARRISTA,BAJISTA,BATERISTA,OTRO):");
        String rol = sc.nextLine();
        boolean op=true;
        while (op){
            if(null!=rol) 
                switch (rol) {
                case "CANTANTE":
                    return RolBanda.CANTANTE;
                case "GUITARRISTA":
                    return RolBanda.GUITARRISTA;
                case "BAJISTA":
                    return RolBanda.BAJISTA;
                case "BATERISTA":
                    return RolBanda.BATERISTA;   
                case "OTRO":
                    return RolBanda.OTRO;
                default:
                    System.out.println("!!!Rol incorrecto!!!");
                    return verificaRol();
            }
        }  
        return null;    
    }
    
    //verifia que no exisa integrante en la banda
    public boolean contieneIntegrante(IntegranteBanda i, ArrayList<Banda> bandasMusicales){
        for(Banda b:bandasMusicales){
            for(IntegranteBanda integrante: b.getIntegrantes()){
                if(integrante.getId().equals(i.getId())){
                    System.out.println("Integrante ya existente en banda "+ b.getNombre());
                }
                    return true;
                }
            }
        return false;
    }
    //agrega integrante
    public void addIntegrante(IntegranteBanda i){
        integrantes.add(i);
    }

    @Override
    public String toString() {
        return "Id: "+idBanda+"  Nombre:"+nombre;
    }

    
    
    
    
    
    
}
