
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Karla
 */
public class Carrera {
    int Id;
    Date fecha;
    Date hora;
    String premio1l;
    String premio2l;
    String premio3l;
    int cantParticipante=0;
   public Carrera(int Id, Date fecha, Date hora, String premio1l, String premio2l, String premio3l) {
        this.Id = Id;
        this.fecha = fecha;
        this.hora = hora;
        this.premio1l = premio1l;
        this.premio2l = premio2l;
        this.premio3l = premio3l;
    }

    public int getCantParticipante() {
        return cantParticipante;
    }

    public void setCantParticipante(int cantParticipante) {
        this.cantParticipante = cantParticipante;
    }
    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Date getHora() {
        return hora;
    }

    public void setHora(Date hora) {
        this.hora = hora;
    }

    public String getPremio1l() {
        return premio1l;
    }

    public void setPremio1l(String premio1l) {
        this.premio1l = premio1l;
    }

    public String getPremio2l() {
        return premio2l;
    }

    public void setPremio2l(String premio2l) {
        this.premio2l = premio2l;
    }

    public String getPremio3l() {
        return premio3l;
    }

    public void setPremio3l(String premio3l) {
        this.premio3l = premio3l;
    }

    @Override
    public String toString() {
        return  Id + "  fecha=" + fecha + "  hora=" + hora + " Cantidad de participantes="+cantParticipante;
    }

 
    
}   

