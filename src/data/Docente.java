package data;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jorge
 */
public class Docente {

    private String nombre;
    private String paterno;
    private String materno;
    private String puesto;
    private String clave;

    private String[][] restrcciones;// 0 o 1 

    private List<Materia> materiasAsociadas = new ArrayList<Materia>();

    public Docente(String nombre, String paterno, String materno, String puesto, String clave) {
        this.nombre = nombre;
        this.paterno = paterno;
        this.materno = materno;
        this.puesto = puesto;
        this.clave = clave;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPaterno() {
        return paterno;
    }

    public void setPaterno(String paterno) {
        this.paterno = paterno;
    }

    public String getMaterno() {
        return materno;
    }

    public void setMaterno(String materno) {
        this.materno = materno;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String[][] getRestrcciones() {
        return restrcciones;
    }

    public void setRestrcciones(String[][] restrcciones) {
        this.restrcciones = restrcciones;
    }

    public List<Materia> getMateriasAsociadas() {
        return materiasAsociadas;
    }

    public void setMateriasAsociadas(List<Materia> materiasAsociadas) {
        this.materiasAsociadas = materiasAsociadas;
    }

    public void addMateria(Materia m) {
        this.materiasAsociadas.add(m);
    }

    public void iniRestricciones() {
        if (this.restrcciones == null) {
            this.restrcciones = new String[6][Data.horarios.size()];
            for (int i = 0; i < this.restrcciones.length; i++) {
                for (int j = 0; j < this.restrcciones[i].length; j++) {
                    this.restrcciones[i][j] = "0";
                }
            }
        }
    }

}
