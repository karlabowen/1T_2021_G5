/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package proyectopoo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import proyectopoo.Carrera5k.*;
import proyectopoo.CompetenciaBandasMusicales.*;
import proyectopoo.TorneoVideojuegos.*;

/**
 *
 * @author jerry
 */
public class Proyectopoo {

    /**
     * @param args the command line arguments
     */
    private static Scanner sc = new Scanner(System.in);
    private static ArrayList<Estudiante> estudiantes = new ArrayList<>();
    public static Carreras5k competenciaCarreras ;
    public static BandasMusicales competenciaBM ;
    // crear un TorneosVideojuegos competenciaVJ ;    
    
    public static void main(String[] args) {
        // TODO code application logic here
        Proyectopoo m=new Proyectopoo();
        m.cargarEstudiantes();
        
        
        bienvenido();
        menuPrincipal();

    }

    private static void bienvenido() {
        System.out.println("\n" + "*************************");
        System.out.println("* Bienvenid@ al Sistema *");
        System.out.println("*************************");
    }
    
    
    
    private static void menuPrincipal() {
        int opcion = -1;
        while (opcion != 4) {
            System.out.println("1. Carrera 5K");
            System.out.println("2. Competencia de Bandas musicales");
            System.out.println("3. Torneo de videojuegos");
            System.out.println("4. Salir");
            System.out.println("Ingrese una opción");
            if (sc.hasNextInt()) {
                opcion = sc.nextInt();
                if (opcion == 1 || opcion == 2 || opcion == 3 || opcion == 4) {
                    sc.nextLine();
                    switch (opcion) {
                        case 1:
                            
                            carrera5k();
                            break;
                        case 2:
                            
                            competenciaBandaM();
                            break;
                        case 3:
                            
                            torneoVG();
                            break;
                        case 4:
                            System.out.println("---Bye---");
                            break;
                    }
                } else {
                    System.out.println("Opcion no Valida");
                }
            }
        }

    }

   

    

    private static void carrera5k() {
        int opcion = -1;
        while (opcion != 4) {
            System.out.println("");
            System.out.println("*** Carrera 5K ***");
            System.out.println("");
            /////
            System.out.println("");
            System.out.println("1. Crear nueva carrera");
            System.out.println("2. Registrar participantes");
            System.out.println("3. Registrar ganadores");
            System.out.println("4. Volver al menú principal");
            System.out.println("Ingrese una opción");
            if (sc.hasNextInt()) {
                opcion = sc.nextInt();
                if (opcion == 1 || opcion == 2 || opcion == 3 || opcion == 4) {
                    sc.nextLine();
                    switch (opcion) {
                        case 1:
                            System.out.println("*** Crear nueva carrera ***");
                            /////
                            
                            break;
                        case 2:
                            System.out.println("*** Registrar participantes ***");
                            registrarParticipante();
                            break;
                        case 3:
                            System.out.println("*** Registrar ganadores ***");
                            registrarGanador();
                            break;
                        case 4:
                            System.out.println("Menu Principal");
                            break;
                    }
                } else {
                    System.out.println("Opcion no Valida");
                }
            }
        }

    }
     private static void competenciaBandaM() {
// igual a carrera
    }
    
     private static void torneoVG() {
// igual a carrera
    }

     private static Carrera registrarCarrera() {
        System.out.println("Creación de carrera"); 
        System.out.println("Fecha (dd/mm/yyyy):");
        //String
        Date fecha=null;                   
        System.out.println("Hora(hh:mm):"); 
        Date hora=null;
        System.out.println("Premio primer lugar:"); 
        String premio1l=sc.nextLine();
        System.out.println("Premio segundo lugar:"); 
        String premio2l=sc.nextLine();
        System.out.println("Premio tercer lugar:");
        String premio3l=sc.nextLine();
        return new Carrera(Id(), fecha, hora, premio1l, premio2l, premio3l);
    
    }
     
     public void cargarEstudiantes() {
        //se crea inputstream con el metodo getresourceastream para que funcione con el jar
        InputStream input = getClass().getClassLoader().getResourceAsStream("archivos/ESTUDIANTES.csv");

        
        BufferedReader br = null;
        try {
            String linea = null;
            br = new BufferedReader(new InputStreamReader(input));
            linea = br.readLine();//saltar la primera linea
            while ((linea = br.readLine()) != null) //iterar mientras haya lineas
            {
                String[] info = linea.split(",");//separar los datos por coma
                //crear objeto y agregar a la lista
                estudiantes.add(new Estudiante(info[0],info[1],Character.toString(info[2].charAt(0)),info[3]));
                        
            }
        } catch (FileNotFoundException ex) {
            System.out.println("No se encuentra el archivo");
        } catch (IOException ex) {
            System.out.println("Error al leer el archivo");
        } finally {
            try {
                if (br!=null)
                br.close();
            } catch (IOException ex) {
                System.out.println("Error al cerrar el archivo");
            }
        }
   
    }
     
    private static void registrarParticipante() {
        System.out.println("Ingrese Id de la carrera: ");
        int id = sc.nextInt();
        if(buscarCarrera(id)!=null){
            System.out.println( "Registro de participantes en carrera del "+ buscarCarrera(id).getFecha());
            System.out.print("ID del estudiante:");
            int idE =sc.nextInt();
            do{
                System.out.print("ID del estudiante:");
                idE =sc.nextInt();
            }while(idE!=0);
        }
    }
        private static Carrera buscarCarrera(int Id){
        for(Carrera c: carreras){
            if (c.getId()==Id){
                return c;
            }
        }return null;
    }
    private static void registrarGanador() {
        System.out.println("Ingreso de primero lugar");
        System.out.print("Id: ");
        int id= sc.nextInt();
        obtenerParticipante(id);
        System.out.println("Tiempo: ");
       // String tiempo= sc.nextLine();
       Date tiempo=null;
        obtenerParticipante(id).setTiempo(tiempo);
        System.out.println("Ingreso de segundo lugar");
        System.out.print("Id: ");
        String id2= sc.nextLine();
        obtenerParticipante(id);
        System.out.println("Tiempo: ");
       // String tiempo= sc.nextLine();
       Date tiempo2=null;
        obtenerParticipante(id).setTiempo(tiempo2);
        System.out.println("Ingreso de tercer lugar");
        System.out.print("Id: ");
        String id3= sc.nextLine();
        obtenerParticipante(id);
        System.out.println("Tiempo: ");
       // String tiempo= sc.nextLine();
       Date tiempo3=null;
        obtenerParticipante(id).setTiempo(tiempo3);
        
        
    }

    private static Participante5k obtenerParticipante(int id) {
        System.out.println("Obtiene participante");
         
        return new Participante5k(null, 0, "Andree");//para prueba
    }

    

   

    

   
}