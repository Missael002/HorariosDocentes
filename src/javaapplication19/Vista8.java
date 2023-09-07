package javaapplication19;

import data.Data;
import data.Docente;
import data.Materia;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ScrollPaneConstants;
import javax.swing.table.DefaultTableModel;

public class Vista8 extends JFrame {

    public JPanel panel;
    public JPanel panel2;
    Color myColor1 = new Color(194, 190, 190);
    Color myColor2 = new Color(177, 205, 227);
    Integer v1;
    
    public Vista8(int selectedRow) {
        this.v1 = selectedRow;
            //Docente d = Data.docente.get(selectedRow);
            //if (d.getMateriasAsociadas().size() > 0) {
                //for (Materia m : d.getMateriasAsociadas()) {

                    //String var1 = m.getNombre();
                   // System.out.println(m.getNombre() + " " + m.getClave() + " " + m.getSesiones());
               // }
           // } else {
                //System.out.println("Sin materias asociadas");
           // }

        this.setSize(1170, 500);//establecemos el tamaño de la ventana
        setTitle("Vista 8");
        setLayout(new BorderLayout());
        setLocationRelativeTo(null);//posisiona la ventana en el medio

        iniciarComponentes();
    }

    private void iniciarComponentes() {
        ColocarPaneles();
        ColocarTablas();
        
        
    }

    private void ColocarPaneles() {
        panel = new JPanel();
        panel.setLayout(null);
        panel.setLayout(new BorderLayout());
         this.getContentPane().setBackground(myColor1);
         
        this.getContentPane().add(panel, BorderLayout.NORTH);

        panel2 = new JPanel();
        panel.setLayout(null);
        panel.setLayout(new BorderLayout());
        this.getContentPane().add(panel2, BorderLayout.SOUTH);
        panel2.setBackground(myColor1);

        Botones();
    }

    private void Botones() {
        JButton btn1 = new JButton("REGRESAR");
        panel2.add(btn1, BorderLayout.WEST);//

        ActionListener regresar = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                Vista7 v7 = new Vista7();
                v7.setVisible(true);
                dispose();
            }
        };
        btn1.addActionListener(regresar);

    }

   private void ColocarTablas() {
        DefaultTableModel modelo = new DefaultTableModel(); 
        Docente d = Data.docente.get(v1);

            
                
                modelo.addColumn("Nombre");
                modelo.addColumn("Clave");
                modelo.addColumn("Sesiones");
                
                for (Materia m : d.getMateriasAsociadas()) {
                Object [] datos = {m.getNombre(),m.getClave(),m.getSesiones()};
                
                modelo.addRow(datos);
                
                System.out.println(m.getNombre() + " " + m.getClave() + " " + m.getSesiones());
                
                /*
                Object[][] o = new Object[d.getMateriasAsociadas().size()][Data.SIZE_COL_MATERIAS_2];
                
                for (int i = 0; i < o.length; i++) {

                    o[i][0] = m.getNombre();
                    o[i][1] = d.getClave();
                    o[i][2] = m.getSesiones();

                }
                */   
                JTable tabla = new JTable(modelo);
                tabla.setFillsViewportHeight(true);
                tabla.setBackground(myColor2);
                //JTable tabla = new JTable(o, Data.cabezera_2);

                tabla.setBounds(20, 20, 950, 300);
                panel.add(tabla, BorderLayout.WEST);

                JScrollPane scroll = new JScrollPane(tabla, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
                //scroll.setBounds(20, 20, 950, 300);

                panel.add(scroll);
            }
     
    }
}