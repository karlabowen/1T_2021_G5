/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectopoo;

/****
 *
 * @author Karla
 */
//plantilla para competencia
public class Competencia {
    protected String fecha;
    protected String hora;
    protected String primerPremio;
    protected String segundoPremio;
    protected String tercerPremio;
    
    //constructor
    public Competencia(String fecha, String hora, String primerPremio, String segundoPremio, String tercerPremio) {
        this.fecha = fecha;
        this.hora = hora;
        this.primerPremio = primerPremio;
        this.segundoPremio = segundoPremio;
        this.tercerPremio = tercerPremio;
    }
    //getters
    public String getFecha() {
        return fecha;
    }

    public String getHora() {
        return hora;
    }
    
    
}
