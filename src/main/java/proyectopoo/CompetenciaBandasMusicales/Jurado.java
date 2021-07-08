/*+
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectopoo.CompetenciaBandasMusicales;

import proyectopoo.Persona;

public class Jurado extends Persona{
    private String bio;

    public Jurado(String id, String nombre,String bio) {
        super(id, nombre);
        this.bio = bio;
    }
    
    
}
