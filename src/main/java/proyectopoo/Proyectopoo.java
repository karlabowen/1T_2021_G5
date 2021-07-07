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
    public static TorneosVideojuegos competenciaVJ ;    
    
    public static void main(String[] args) {
        // TODO code application logic here
        Proyectopoo m=new Proyectopoo();
        m.cargarEstudiantes();
        cargarCompetenciasBM();
        cargarTorneos();
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
            competenciaCarreras.mostrarCarreras();
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
                            competenciaCarreras.crearCarrera();
                            /////
                            
                            break;
                        case 2:
                            System.out.println("*** Registrar participantes ***");
                            System.out.println(competenciaCarreras.registrarParticipantes());
                            break;
                        case 3:
                            System.out.println("*** Registrar ganadores ***");
                            System.out.println(competenciaCarreras.registrarGanadores());
                            break;
                        case 4:
                            System.out.println("*** Menú Principal ****");
                            break;
                    }
                } else {
                    System.out.println("Opcion no Valida");
                }
            }
        }

    }
     private static void competenciaBandaM() {
          int opcion = -1;
        while (opcion != 4) {
            System.out.println("");
            System.out.println("*** Competencia de Bandas musicales ***");
            System.out.println("");
            competenciaBM.mostrarCompetenciaBandas(); //mostrar informacion de competencia de bandas
            System.out.println("");
            System.out.println("1. Crear nueva competencia");
            System.out.println("2. Registrar bandas");
            System.out.println("3. Registrar ganadores");
            System.out.println("4. Volver al menú principal");
            System.out.println("Ingrese una opción");
            if (sc.hasNextInt()) {
                opcion = sc.nextInt();
                if (opcion == 1 || opcion == 2 || opcion == 3 || opcion == 4) {
                    sc.nextLine();
                    switch (opcion) {
                        case 1:
                            System.out.println("");
                            System.out.println("** Creación de bandas musicales ** ");
                            competenciaBM.crearCompetencia();
                            break;
                        case 2:
                            System.out.println("");
                            System.out.println("*** Registrar bandas ***");
                            System.out.println(competenciaBM.registrarBandas());
                            break;
                        case 3:
                            System.out.println("");
                            System.out.println("*** Registrar ganadores ***");
                            break;
                        case 4:
                            System.out.println("");
                            System.out.println("*** Menú Principal ****");
                            break;
                    }
                } else {
                    System.out.println("Opcion no Válida");
                }
            }
        }
    }
    
     private static void torneoVG() {
        int opcion = -1;
        while (opcion != 4) {
            System.out.println("");
            System.out.println("*** Torneo de videojuegos ***");
            System.out.println("");
            competenciaVJ.mostrarTorneos();
            System.out.println("");
            System.out.println("1. Crear nuevo torneo");
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
                            System.out.println("");
                            System.out.println("*** Crear nuevo torneo***");
                            break;
                        case 2:
                            System.out.println("");
                             System.out.println("*** Registrar participantes ***");
                            System.out.println(competenciaVJ.registrarParticipantes());
                            break;
                        case 3:
                            System.out.println("");
                            System.out.println("*** Registrar ganadores ***");
                            System.out.println(competenciaVJ.registrarGanadores());
                            break;
                        case 4:
                            System.out.println("");
                            System.out.println("*** Menú Principal ****");
                            break;
                    }
                } else {
                    System.out.println("Opcion no Válida");
                }
            }
        }

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
     
     public static void cargarCarreras(){
        //carrera activa
        Carrera c1 = new Carrera("03/07/2021","10:10","$50 y medalla","$20 y medalla","$10 y medalla");
        Participante5k pc1 = new Participante5k(estudiantes.get(0));
        c1.addParticipante(pc1);
        Participante5k pc2 = new Participante5k(estudiantes.get(1));
        c1.addParticipante(pc2);
        Participante5k pc3 = new Participante5k(estudiantes.get(3));
        c1.addParticipante(pc3);
        
        //carrera inactiva
        Carrera c2 = new Carrera("10/01/2021","12:30","$700 y medalla de oro","$300 y medalla de plata ","$100 y medalla de bronce");
        Participante5k p1c2 = new Participante5k(estudiantes.get(4));
        c2.addParticipante(p1c2);
        Participante5k p2c2 = new Participante5k(estudiantes.get(5));
        c2.addParticipante(p2c2);
        Participante5k p3c2 = new Participante5k(estudiantes.get(6));
        c2.addParticipante(p3c2);
        Participante5k p4c2 = new Participante5k(estudiantes.get(7));
        c2.addParticipante(p4c2);
        Participante5k p5c2 = new Participante5k(estudiantes.get(8));
        c2.addParticipante(p5c2);
        Participante5k p6c2 = new Participante5k(estudiantes.get(9));
        c2.addParticipante(p6c2);
        
        c2.agregarGanador(p1c2);
        p1c2.setLugar(1);
        p1c2.setTiempo("2:30 h");
        
        c2.agregarGanador(p3c2);
        p3c2.setLugar(2);
        p3c2.setTiempo("2:28 h");
        
        c2.agregarGanador(p6c2);
        p3c2.setLugar(3);
        p3c2.setTiempo("2:20 h");
                
        ArrayList<Carrera> carreras = new ArrayList<>();
        carreras.add(c1);
        carreras.add(c2);
        
        //agregar las carrera en competenciaCarreras
        competenciaCarreras = new Carreras5k(carreras);
      
    }
     public static void cargarCompetenciasBM(){
        //bandas
        //banda1
        Banda b1 = new Banda("Rock Bones","heart");
        IntegranteBanda i1b1 = new IntegranteBanda(estudiantes.get(10));
        b1.addIntegrante(i1b1);
        IntegranteBanda i2b1 = new IntegranteBanda(estudiantes.get(11));
        b1.addIntegrante(i2b1);
        IntegranteBanda i3b1 = new IntegranteBanda(estudiantes.get(12));
        b1.addIntegrante(i3b1);
        
        
        //banda2
        Banda b2 = new Banda("21P","heathens");
        IntegranteBanda i1b2 = new IntegranteBanda(estudiantes.get(13));
        b2.addIntegrante(i1b2);
        IntegranteBanda i2b2 = new IntegranteBanda(estudiantes.get(14));
        b2.addIntegrante(i2b2);
        IntegranteBanda i3b2 = new IntegranteBanda(estudiantes.get(15));
        b2.addIntegrante(i3b2);
        
        
        
        //banda3
        Banda b3 = new Banda("Coldplay","yellow");
        IntegranteBanda i1b3 = new IntegranteBanda(estudiantes.get(16));
        b3.addIntegrante(i1b3);
        IntegranteBanda i2b3 = new IntegranteBanda(estudiantes.get(17));
        b3.addIntegrante(i2b3);
        IntegranteBanda i3b3 = new IntegranteBanda(estudiantes.get(18));
        b3.addIntegrante(i3b3);
        
        
        //competencia de bandas activas
       
        ArrayList<Jurado> jurados = new ArrayList<>();
        Jurado j1 = new Jurado("10203","Pablo Alcívar","Bio");
        jurados.add(j1);
        Jurado j2 = new Jurado("13123","Camila Calderón","Bio");
        jurados.add(j2);
        Jurado j3 = new Jurado("10203","Junior Mendoza","Bio");
        jurados.add(j3);
        
        CompetenciaBandas cb1 = new CompetenciaBandas("10/10/2021","13:45","$80","$70","50",jurados);
        
        cb1.agregarBanda(b1);
        cb1.agregarBanda(b2);
        cb1.agregarBanda(b3);
        
        
        //competencia de bandas inactivas
        
        CompetenciaBandas cb2 = new CompetenciaBandas("01/04/2021","10:45","$80","$70","50",jurados);
        
        cb2.agregarBanda(b1);
        cb2.agregarBanda(b2);
        cb2.agregarBanda(b3);
        
        cb2.agregarBandasGanadoras(b1);
        b1.setLugar(1);
        cb2.agregarBandasGanadoras(b2);
        b1.setLugar(2);
        cb2.agregarBandasGanadoras(b3);
        b1.setLugar(3);
        
        ArrayList<CompetenciaBandas> listaCBandas = new ArrayList<>();
        listaCBandas.add(cb1);
        listaCBandas.add(cb2);
        //agregar a CompetenciaBM
        competenciaBM = new BandasMusicales(listaCBandas);
        
    }
    
     public static void cargarTorneos(){
        //torneo activo
        Torneo t1= new Torneo("10/07/2021","14:45","Mario Bros","$100","$90","$80");
        Gamer g1 = new Gamer(estudiantes.get(19));
        t1.addGamer(g1);
        Gamer g2 = new Gamer(estudiantes.get(20));
        t1.addGamer(g2);
        Gamer g3=new Gamer(estudiantes.get(21));
        t1.addGamer(g3);

        
        //torneo inactivo

        Torneo t2= new Torneo("17/12/2020","11:30","Donkey Kong","copa","medalla","medalla");
        t2.addGamer(g1);
        t2.addGamer(g2);
        t2.addGamer(g3);
        
        t2.addGanador(g2);
        t2.addGanador(g3);
        t2.addGanador(g1);

        //agregar a competenciaVJ
        ArrayList<Torneo> listaTorneos = new ArrayList<>();
        listaTorneos.add(t1);
        listaTorneos.add(t2);
        
        
        competenciaVJ = new TorneosVideojuegos(listaTorneos);
        
    }
}