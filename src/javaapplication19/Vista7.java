package javaapplication19;

import data.Data;
import data.Docente;
import java.awt.BorderLayout;
import java.awt.Color;
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

public class Vista7 extends JFrame {

    private Vista7 v7 = this;
    public JPanel panel;
    public JPanel panel2;
    JTable tabla;
    Color myColor1 = new Color(194, 190, 190);
    Color myColor2 = new Color(177, 205, 227);

    public static int columna, row;
    JButton boton1 = new JButton("Asociar Restriccion");
    JButton boton2 = new JButton("Asociar Materias");
    JButton boton3 = new JButton("Ver Materias");

    // private Object panel;
    public Vista7() {
        //super("Vista 7");
        this.setSize(1200, 500);//establecemos el tamaño de la ventana
        setTitle("Vista 7");
        setLayout(new BorderLayout());

        setLocationRelativeTo(null);//posisiona la ventana en el medio

        iniciarComponentes();
        //ColocarTablas();
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
        this.getContentPane().setBackground(myColor1);

        panel2 = new JPanel();
        panel.setLayout(null);
        panel.setLayout(new BorderLayout());
        this.getContentPane().add(panel2, BorderLayout.SOUTH);
        panel2.setBackground(myColor1);

        //panel2.setBackground(Color.blue);
        ColocarTablas();
        boton1.setName("bt1");
        boton2.setName("bt2");
        boton3.setName("bt3");

        ColocarBotones();
    }

    private void ColocarBotones() {

        JButton btnR = new JButton("Regresar al menu");
        JButton asociar = new JButton("Asociar");
        JButton verMaterias = new JButton("Ver Materias Asociadas");
        JButton restricciones = new JButton("Asociar Restricciones");

        //btnR.setBounds(160, 330, 150, 25);
        //panel.setLayout(null);
        panel2.add(btnR, BorderLayout.WEST);//

        panel2.add(asociar, BorderLayout.LINE_END);
        panel2.add(verMaterias, BorderLayout.LINE_END);
        panel2.add(restricciones, BorderLayout.LINE_END);

        ActionListener regresar = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                Vista0 menu = new Vista0();
                menu.setVisible(true);
                dispose();
            }
        };
        btnR.addActionListener(regresar);

        restricciones.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (tabla.getSelectedRow() > -1) {
                    if (Data.horarios.size() > 0) {

                        Ventana_6 v6 = new Ventana_6(tabla.getSelectedRow());
                        v6.setVisible(true);
                        v7.dispose();
                    } else {
                        JOptionPane.showMessageDialog(null, "Ingrese los horarios para asociar restrcciones");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Seleccione un docente para continuar");
                }
            }
        });

        asociar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (tabla.getSelectedRow() > -1) {
                    // Docente d = Data.docente.get(tabla.getSelectedRow());
                    if (Data.materias.size() > 0) {

                        Vista4 v4 = new Vista4(tabla.getSelectedRow());
                        v4.setVisible(true);
                        v7.dispose();
                    } else {
                        JOptionPane.showMessageDialog(null, "Sin materias agregadas");
                    }

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
                        // for (Materia m : d.getMateriasAsociadas()) {

                        //String var1 = m.getNombre();
                        Vista8 v8 = new Vista8(tabla.getSelectedRow());
                        v8.setVisible(true);
                        v7.dispose();

                        //System.out.println(m.getNombre() + " " + m.getClave() + " " + m.getSesiones());
                        // }
                    } else {
                        JOptionPane.showMessageDialog(null, "Sin materias asociadas");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Seleccione un docente para continuar");
                }

            }
        });

    }

    private void ColocarTablas() {

        Object[][] o = new Object[Data.docente.size()][Data.SIZE_COL_DOCENTE];
        for (int i = 0; i < o.length; i++) {
            o[i][0] = Data.docente.get(i).getNombre();
            o[i][1] = Data.docente.get(i).getPaterno();
            o[i][2] = Data.docente.get(i).getMaterno();
            o[i][3] = Data.docente.get(i).getPuesto();
            o[i][4] = Data.docente.get(i).getClave();
            //o[i][5] = "bt1";
            //o[i][6] = "bt2";
            //o[i][7] = "bt3";

        }

        DefaultTableModel modelo = new DefaultTableModel(
                o,
                Data.TITLE_COL_DOCENTE
        );

        tabla = new JTable(modelo);
        tabla.setFillsViewportHeight(true);
        tabla.setBackground(myColor2);

        /*tabla = new JTable(modelo) {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };*/
        //tabla.setDefaultRenderer(Object.class, new RenderTable());
        tabla.setModel(modelo);
        //tabla.setRowHeight(30);

        /*tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                System.out.println("*** "+evt.getY());
                columna = tabla.getColumnModel().getColumnIndexAtX(evt.getX());
                row = evt.getY() / tabla.getRowHeight();
                
                if (columna <= modelo.getColumnCount() && columna >= 0 && row <= modelo.getRowCount() && row >= 0) {
                    Object objeto = modelo.getValueAt(row, columna);
                    if (objeto instanceof JButton) {
                        ((JButton) objeto).doClick();
                        JButton botones = (JButton) objeto;
                        if (botones.getName().equals("bt1")) {

                           
                                    ventana6 v6 = new ventana6();
                                    v6.setVisible(true);
                        } else if (botones.getName().equals("bt2")) {

                         
                                    //Vista4 v4 = new Vista4(1);

                        } else {
                                    Vista8 v8 = new Vista8();
                                    v8.setVisible(true);

                                }
                            }
                        }
                    }

        });*/
        tabla.setBounds(20, 20, 1170, 300);
        panel.setBackground(Color.blue);
        panel.add(tabla, BorderLayout.WEST);

        JScrollPane scroll = new JScrollPane(tabla, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scroll.setBounds(20, 20, 1100, 300);

        panel.add(scroll);
    }

}
