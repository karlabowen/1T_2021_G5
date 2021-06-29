/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author jerry
 */
public class Proyectopoo {

    /**
     * @param args the command line arguments
     */
    private static Scanner sc = new Scanner(System.in);
    private static ArrayList<Carrera> carreras = new ArrayList<>();


    public static void main(String[] args) {
        // TODO code application logic here
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
            if (sc.hasNextInt()) {
                opcion = sc.nextInt();
                if (opcion == 1 || opcion == 2 || opcion == 3 || opcion == 4) {
                    sc.nextLine();
                    switch (opcion) {
                        case 1:
                            System.out.println("*** Carrera 5K ***");
                            leerCarrera();
                            carrera5k();
                            break;
                        case 2:
                            System.out.println("*** Competencia de Bandas musicales ***");
                            competenciaBandaM();
                            break;
                        case 3:
                            System.out.println("*** Torneo de videojuegos ***");
                            
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
    private static void leerCarrera() {
        for(Carrera c: carreras){
            System.out.println(c);
        }
    }
   

    

    private static void carrera5k() {
        int opcion = -1;
        while (opcion != 4) {
            System.out.println("1. Crear nueva carrera");
            System.out.println("2. Registrar participantes");
            System.out.println("3. Registrar ganadores");
            System.out.println("4. Volver al menú principal");
            if (sc.hasNextInt()) {
                opcion = sc.nextInt();
                if (opcion == 1 || opcion == 2 || opcion == 3 || opcion == 4) {
                    sc.nextLine();
                    switch (opcion) {
                        case 1:
                            System.out.println("*** Crear nueva carrera ***");
                           
                            break;
                        case 2:
                            System.out.println("*** Registrar participantes ***");
                          
                            break;
                        case 3:
                            System.out.println("*** Registrar ganadores ***");
                            
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
    



   

   

    

   
}