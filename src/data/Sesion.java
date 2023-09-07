package data;

/**
 *
 * @author Jose Manuel
 */
public class Sesion {

    private Integer ClaveMateria;
    private String NombreSesison;
    private String Horas;
    
    public Sesion(Integer claveMateria, String nombreSesion, String horas) {
        this.ClaveMateria = claveMateria;
        this.NombreSesison = nombreSesion;
        this.Horas = horas;
    }

    public Integer getClaveMateria() {

        return ClaveMateria;
    }

    public void setClaveMateria(Integer ClaveMateria) {
        this.ClaveMateria = ClaveMateria;
    }

    public String getNombreSesison() {
        return NombreSesison;
    }

    public void setNombreSesison(String NombreSesison) {
        this.NombreSesison = NombreSesison;
    }

    public String getHoras() {
        return Horas;
    }

    public void setHoras(String Horas) {
        this.Horas = Horas;
    }

}
