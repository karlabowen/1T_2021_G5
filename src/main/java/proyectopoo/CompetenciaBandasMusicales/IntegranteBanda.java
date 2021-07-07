/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectopoo.CompetenciaBandasMusicales;

import proyectopoo.Estudiante;

public class IntegranteBanda {
    private String id;
    private String nombre;
    private RolBanda rol;

    public IntegranteBanda(Estudiante e) {
        this.id=e.getId();
        this.nombre=e.getNombre();
    }
  
    public String getId() {
        return id;
    }

    public void setRol(RolBanda rol) {
        this.rol = rol;
    }
    
}