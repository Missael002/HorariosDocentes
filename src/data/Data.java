package data;

import java.util.ArrayList;
import java.util.List;

public class Data {

    public static List<Docente> docente = new ArrayList<Docente>();

    public static int SIZE_COL_DOCENTE = 8;
    public static Object[] TITLE_COL_DOCENTE = new Object[]{"Nombre", "Apellido Paterno", "Apellido Materno", "Puesto",
        "Clave"};

    public static List<String> horarios = new ArrayList<String>();
//    public static String [] getEncabezadosHorarios(){
//        String [] c = new String[horarios.size()];
//        for(int i=0; i<horarios.size(); i++){
//            c[i] = horarios.get(i);
//        }
//        return c;
//    }

    public static List<Materia> materias = new ArrayList<Materia>();
    public static List<Sesion> sesiones = new ArrayList<Sesion>();
    public static int SIZE_COL_MATERIAS = 4;
    public static String[] cabezera = {"Materia", "Clave", "N°.Sesiones"};
    public static int SIZE_COL_MATERIAS_2 = 3;
    public static String[] cabezera_2 = {"Materia", "Clave", "N°.Sesiones"};


    /*  
    horarios.get(0)  ---> "7-8"
    horarios.get(1)  ---> "8-9"
     */
}
