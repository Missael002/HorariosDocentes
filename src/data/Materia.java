
package data;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jorge
 */
public class Materia {
  
 
    private String nombre;
    private String clave;
    private Integer sesiones; //Indica el númmero de sesiones de la materia
    
    private List<Integer> duracionSesiones = new ArrayList<Integer>(); //Duración de cada una de las sesiones

    public Materia(String nombre, String clave, Integer sesiones) {
        this.nombre = nombre;
        this.clave = clave;
        this.sesiones = sesiones;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public Integer getSesiones() {
        return sesiones;
    }

    public void setSesiones(Integer sesiones) {
        this.sesiones = sesiones;
    }

    public List<Integer> getDuracionSesiones() {
        return duracionSesiones;
    }

    public void setDuracionSesiones(List<Integer> duracionSesiones) {
        this.duracionSesiones = duracionSesiones;
    }

    public int setDuracionSesiones(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
