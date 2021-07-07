/*
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

    public String getNombre() {
        return nombre;
    }

    public void setLugar(int lugar) {
        this.lugar = lugar;
    }
    //ingresa numerode integrates que el usuario desea
    public String ingresoIntegrantes(int num){
            for(int i=1; i<=num;i++){
                System.out.println(verificarIntegrante(i));
            }
        return "";
    }
      
    //valida el ingreso de integrante y que cumpla todos los requisistos y si cumple lo agrega
    private String verificarIntegrante(int i){
        System.out.println("ID integrante "+i+ ": ");
        String idEst = sc.nextLine();
        for(Estudiante e: Proyectopoo.estudiantes){
            if(e.getId().equals(idEst)){ //compara integrantes
                IntegranteBanda intBanda = new IntegranteBanda(e); //crea objeto integrante
                if(contieneIntegrante(intBanda)){ //verifica que no exista
                   System.out.println("Integrante ya existente");
                   return verificarIntegrante(i);
                }
                //en el caso de que no exista
                intBanda.setRol(verificaRol()); //agrega el rol
                addIntegrante(intBanda);
                return "Estudiante "+ e.getNombre()+" registrado";
   
            }
        }
        System.out.println("No existe estudiante con ese ID");
        return verificarIntegrante(i);
    }