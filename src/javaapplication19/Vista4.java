package javaapplication19;

import data.Data;
import data.Docente;
import data.Materia;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ScrollPaneConstants;
import javax.swing.table.DefaultTableModel;

public class Vista4 extends JFrame {

    static void setText(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    static void setText(List<String> Horas) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public JPanel panel;
    public JPanel panel2;
    JTable tabla;
    Color myColor1 = new Color(194, 190, 190);
    Color myColor2 = new Color(177, 205, 227);
    
    public static int columna, row;
    JButton boton1 = new JButton("Asociar Restriccion");
    JButton boton2 = new JButton("Asociar Materias");
    JButton boton3 = new JButton("Ver Materias");

    JButton save;
    Integer indexDocente;
    
    public Vista4() {
        
        //this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        //this.setExtendedState(MAXIMIZED_BOTH);
        this.setResizable(false);
        //this.setDefaultCloseOperation(false);
        //this.setVisible(true);
        this.setSize(1200, 500);//establecemos el tamaño de la ventana
        setTitle("Vista 4");
        setLayout(new BorderLayout());

        setLocationRelativeTo(null);//posisiona la ventana en el medio
        
        iniciarComponentes();
        set_table_add_sesiones();
        
    }
    private Vista4 v4 = this;

    public Vista4(int docente) {
        this.indexDocente = docente;
        this.setResizable(false);
        this.setSize(1200, 500);//establecemos el tamaño de la ventana
        setTitle("Vista 4");
        setLayout(new BorderLayout());

        setLocationRelativeTo(null);//posisiona la ventana en el medio

        iniciarComponentes();
        set_table_show_topics();

    }

    private void iniciarComponentes() {
        ColocarPaneles();

        JButton btnR = new JButton("REGRESAR AL MENU");
        JButton ir = new JButton("IR");

    }

    private void ColocarPaneles() {
        panel = new JPanel();//creacion de un panel
        panel.setLayout(null);
        panel.setLayout(new BorderLayout());
        //panel.setLayout(new FlowLayout());
        this.getContentPane().add(panel, BorderLayout.NORTH);
        this.getContentPane().setBackground(myColor1);
        
        panel2 = new JPanel();

        panel.setLayout(null);
        panel.setLayout(new BorderLayout());
        this.getContentPane().add(panel2, BorderLayout.SOUTH);
        panel2.setBackground(myColor1);

        boton1.setName("bt1");
        boton2.setName("bt2");
        boton3.setName("bt3");

        ColocarBotones();
    }

    public void ColocarBotones() {

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
        tabla.setFillsViewportHeight(true);
        tabla.setBackground(myColor2);
        
        tabla.setModel(modelo);

        tabla.setBounds(20, 20, 1170, 300);
        panel.add(tabla, BorderLayout.WEST);

        JScrollPane scroll = new JScrollPane(tabla, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
//        scroll.setBounds(20, 20, 1100, 300);

        panel.add(scroll);

        JButton Volver = new JButton("Volver");
        Volver.setBounds(40, 30, 200, 20);
        panel2.add(Volver);

        JButton Ir = new JButton("Ir");
        Ir.setBounds(80, 30, 200, 20);
        panel2.add(Ir);

        Volver.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Vista0 v0 = new Vista0();
                //vp0.setVisible(true);
                v4.dispose();
            }
        });

        Ir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(tabla.getSelectedRow()<=-1){
                    JOptionPane.showMessageDialog(rootPane, "Seleccione una fila");
                }
                else{
                    System.out.println(tabla.getSelectedRow());
                    new Ventana5(tabla.getSelectedRow());
                    dispose();
                }
                
            }
        });
    }

    public void set_table_show_topics() {
        Object[][] o = new Object[Data.materias.size()][Data.SIZE_COL_MATERIAS_2];
        for (int i = 0; i < o.length; i++) {
            o[i][0] = Data.materias.get(i).getNombre();
            o[i][1] = Data.materias.get(i).getClave();
            o[i][2] = Data.materias.get(i).getSesiones().toString();

        }
        DefaultTableModel modelo2 = new DefaultTableModel(
                o,
                Data.cabezera_2
        );
        tabla = new JTable(modelo2);
        tabla.setFillsViewportHeight(true);
        tabla.setBackground(myColor2);
         
        tabla.setModel(modelo2);

        tabla.setBounds(20, 20, 1170, 300);
        panel.add(tabla, BorderLayout.WEST);

        JScrollPane scroll = new JScrollPane(tabla, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
//        scroll.setBounds(20, 20, 1100, 300);

        panel.add(scroll);

        JButton Guardar = new JButton("Guardar");
        Guardar.setBounds(140, 30, 200, 20);
        panel2.add(Guardar);
        //this.save = new JButton("Guardar");

        JButton Regresar = new JButton("Regresar");
        Regresar.setBounds(80, 30, 200, 20);
        panel2.add(Regresar);
        //this.save = ne333w JButton("Guardar");

        //af.setVisible(false);
          Guardar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (tabla.getSelectedRow() > -1) {
                    //Data.docente.get(indexDocente).addMateria(Data.materias.get(tabla.getSelectedRow()));
                    Docente d = Data.docente.get(indexDocente);
                    
                    for (Materia aux : d.getMateriasAsociadas()) {
                        System.out.println(aux.getNombre());
                    }
                    
                    Materia m = Data.materias.get(tabla.getSelectedRow());
                    boolean repeat = false;
                    for (Materia aux : d.getMateriasAsociadas()) 
                    
                    {
                        if (aux.getNombre().equals(m.getNombre())) {
                            repeat = true;
                            break;
                        }
                    }

                    if (!repeat) {
                        d.addMateria(m);
                        JOptionPane.showMessageDialog(null, " Materia guardada ");
                    } else {
                        JOptionPane.showMessageDialog(null, "La materia ya esta asociada, no se puede repetir");
                    }
                    //for (Materia aux : d.getMateriasAsociadas()) {
                    //    System.out.println(aux.getNombre());
                    //}
                } else {
                    JOptionPane.showMessageDialog(null, "Seleccione una opción");
                }
            }
        });
          
        Regresar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Vista7 ven = new Vista7();
                ven.setVisible(true);
                dispose();
            }
        });
    }

}
