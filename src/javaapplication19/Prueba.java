package javaapplication19;

import data.Data;
import data.Docente;
import data.Materia;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ScrollPaneConstants;
import javax.swing.table.DefaultTableModel;

public class Prueba extends JFrame {

    public JPanel panel;
    public JPanel panel2;
    JTable tabla;

    public static int columna, row;
    JButton boton1 = new JButton("Asociar Restriccion");
    JButton boton2 = new JButton("Asociar Materias");
    JButton boton3 = new JButton("Ver Materias");

                   
    //JButton boton1, boton2, boton3;

    JButton save;
    Integer indexDocente;

    public Prueba() {
       this.setSize(1200, 500);//establecemos el tamaño de la ventana
        setTitle("Vista 4");
        setLayout(new BorderLayout());

        setLocationRelativeTo(null);//posisiona la ventana en el medio

        iniciarComponentes();
        set_table_add_sesiones();
        
    }

    public Prueba(int docente) {
        this.indexDocente = docente;
        this.setSize(1200, 500);//establecemos el tamaño de la ventana
        setTitle("Vista 4");
        setLayout(new BorderLayout());

        setLocationRelativeTo(null);//posisiona la ventana en el medio

        iniciarComponentes();
        set_table_show_topics();
        
    }
private void iniciarComponentes() {
        ColocarPaneles();

        //ColocarTablas();
        //ColocarBotones();
    }

 private void ColocarPaneles() {
        panel = new JPanel();//creacion de un panel
        panel.setLayout(null);
        panel.setLayout(new BorderLayout());
        //panel.setLayout(new FlowLayout());
        this.getContentPane().add(panel, BorderLayout.NORTH);

        panel2 = new JPanel();
        panel.setLayout(null);
        panel.setLayout(new BorderLayout());
        this.getContentPane().add(panel2, BorderLayout.SOUTH);

        set_table_add_sesiones();
        boton1.setName("bt1");
        boton2.setName("bt2");
        boton3.setName("bt3");

        ColocarBotones();
    }
 private void ColocarBotones() {

        JButton btnR = new JButton("REGRESAR AL MENU");
        JButton asociar = new JButton("Asociar");
        JButton verMaterias = new JButton("Ver Materias Asociadas");

        //btnR.setBounds(160, 330, 150, 25);
        //panel.setLayout(null);
        panel2.add(btnR, BorderLayout.WEST);//
        panel2.add(asociar, BorderLayout.LINE_END);
        panel2.add(verMaterias, BorderLayout.LINE_END);

        ActionListener regresar = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                Vista0 menu = new Vista0();
                menu.setVisible(true);
                dispose();
            }
        };
        btnR.addActionListener(regresar);

        asociar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (tabla.getSelectedRow() > -1) {
                    Vista4 v4 = new Vista4(tabla.getSelectedRow());
                } else {
                    JOptionPane.showMessageDialog(null, "Seleccione un docente para continuar");
                }

            }
        });

        verMaterias.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (tabla.getSelectedRow() > -1) {
                    Docente d = Data.docente.get(tabla.getSelectedRow());
                    if (d.getMateriasAsociadas().size() > 0) {
                        for (Materia m : d.getMateriasAsociadas()) {
                            System.out.println(m.getNombre() + " " + m.getClave() + " " + m.getSesiones());
                        }
                    } else {
                        System.out.println("Sin materias asociadas");
                    }
                }else{
                    JOptionPane.showMessageDialog(null, "Seleccione un docente para continuar");
                }

            }
        });

    }
    public void set_table_add_sesiones() {

        Object[][] o = new Object[Data.materias.size()][Data.SIZE_COL_MATERIAS];
        for (int i = 0; i < o.length; i++) {
            o[i][0] = Data.materias.get(i).getNombre();
            o[i][1] = Data.materias.get(i).getClave();
            o[i][2] = Data.materias.get(i).getSesiones().toString();
            //o[i][3] = "btn";

        }
         DefaultTableModel modelo = new DefaultTableModel(
                o,
                Data.cabezera
        );
         
        tabla = new JTable(modelo);

       
        tabla.setModel(modelo);
        
        tabla.setBounds(20, 20, 1170, 300);
        panel.add(tabla, BorderLayout.WEST);

        JScrollPane scroll = new JScrollPane(tabla, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
//        scroll.setBounds(20, 20, 1100, 300);

        panel.add(scroll);
    }
//        tabla = new JTable(o, Data.cabezera);
//        JScrollPane JS = new JScrollPane(tabla);
//        JS.setPreferredSize(new Dimension(400, 150));
//        ventana.add(JS);
//        boton1 = new JButton("Ir");
//        boton1.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                System.out.println(tabla.getSelectedRow());
//                new Calculo(tabla.getSelectedRow());
//                //Desarrollo v5 = new Desarrollo();
//                //v5.setExtendedState(MAXIMIZED_BOTH);
//                //v5.setVisible(true);
//
//            }
//        });
//        boton1.setBounds(300, 0, 80, 15);
//        ventana.add(boton1);
//
//    }

    public void set_table_show_topics() {
        Object[][] o = new Object[Data.materias.size()][Data.SIZE_COL_MATERIAS_2];
        for (int i = 0; i < o.length; i++) {
            o[i][0] = Data.materias.get(i).getNombre();
            o[i][1] = Data.materias.get(i).getClave();
            o[i][2] = Data.materias.get(i).getSesiones().toString();
        }
        tabla = new JTable(o, Data.cabezera_2);
//        JScrollPane JS = new JScrollPane(tabla);
//        JS.setPreferredSize(new Dimension(400, 150));
//        ventana.add(JS);
        this.save = new JButton("Guardar");
        this.save.setBounds(80, 30, 200, 20);
        this.save.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (tabla.getSelectedRow() > -1) {
                    //Data.docente.get(indexDocente).addMateria(Data.materias.get(tabla.getSelectedRow()));
                    Docente d = Data.docente.get(indexDocente);
                    for (Materia aux : d.getMateriasAsociadas()) {
                        System.out.println(aux.getNombre());
                    }
                    Materia m = Data.materias.get(tabla.getSelectedRow());
                    d.addMateria(m);
                    for (Materia aux : d.getMateriasAsociadas()) {
                        System.out.println(aux.getNombre());
                    }
                }else{
                    JOptionPane.showMessageDialog(null, "Seleccione una opción");
                }
            }
        });
        tabla.add(this.save);
    }
// public static void main(String args[]){
//        
//        
//        Prueba vp = new Prueba();
//        vp.setVisible(true);
//           
//    }

}
