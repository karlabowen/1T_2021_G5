/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectopoo.CompetenciaBandasMusicales;

import proyectopoo.CompetenciaBandasMusicales.*;
import java.util.ArrayList;
import java.util.Scanner;
import proyectopoo.Competencia;
/**
 *
 * @author Karla
 */
public class CompetenciaBandas extends Competencia{
    private int idCompBanda;
    private static int idCompBandaSiguiente;
    private ArrayList<Jurado> jurados;
    private ArrayList<Banda> bandasMusicales;
    private ArrayList<Banda> bandasGanadoras;
    
    private static Scanner sc = new Scanner(System.in);

    public CompetenciaBandas(String fecha, String hora, String primerPremio, String segundoPremio, String tercerPremio, ArrayList<Jurado> jurados) {
        super(fecha, hora, primerPremio, segundoPremio, tercerPremio);
        ++idCompBandaSiguiente;
        idCompBanda = idCompBandaSiguiente;
        this.jurados=jurados;
        bandasMusicales= new ArrayList<>();
        bandasGanadoras= new ArrayList<>();
    }

    public int getIdCompBanda() {
        return idCompBanda;
    }

    public ArrayList<Banda> getBandasGanadoras() {
        return bandasGanadoras;
    }
    
    //registro de bandas
    public void registros(){
        System.out.println("");
        System.out.println("Registro de bandas");
        System.out.println("");
        String op="S";
        while(!op.equals("N")){
            System.out.println("Nombre de la banda: ");
            String nombre = sc.nextLine();
            System.out.println("Cancion a interpretar: ");
            String cancion = sc.nextLine();
            System.out.println("Cuántos integrantes?: ");
            int num = sc.nextInt();
            sc.nextLine();
            
            Banda band=new Banda(nombre,cancion); //crea objeto banda
            agregarBanda(band); //agrega a la competencia
            System.out.println(band.ingresoIntegrantes(num, bandasMusicales)); //funcionamiento de ingresode integrantes en clase Banda

            System.out.println("* Desea ingresar otra banda (S/N)? *");
            op = sc.nextLine();

        }
        
    }
    
    public void agregarBanda(Banda b){
        bandasMusicales.add(b);
    }
    
    public void agregarBandasGanadoras(Banda b){
        bandasGanadoras.add(b);
    }
    
    //muestra info de las bandas de la competencia
    public void mostrarBandas(){
        if(bandasMusicales.size()>0){//verifica que existan bandas
            for(Banda b:bandasMusicales){
            System.out.println(b);
            }
        }
    }
    
    
    
    @Override
    public String toString() {
       return "ID:"+idCompBanda+ "  Fecha:"+fecha+ "  Hora:"+hora+"  Cantidad de Bandas: "+ bandasMusicales.size();
    }
    
}
