package javaapplication19;

import data.Data;
import data.Materia;
import data.Sesion;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.stream.Collectors;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jose Manuel
 */
public class Ventana5 extends JFrame implements ActionListener {

    JButton boton1, boton2;

    private JPanel contentPane;
    JTable tabla1;

    //Object[][] datos = new Object[Data.sesiones.size()][2];
    Object[][] datos = null;

    Integer claveMateria = 0;

    public Ventana5(int materiaSeleccionada) {

        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(100, 100, 400, 300);
        Color myColor1 = new Color(177, 205, 227);
        Color myColor2 = new Color(255, 175, 175);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setBackground(myColor1);
        contentPane.setLayout(null);

        Materia materia = Data.materias.get(materiaSeleccionada);
        System.out.println(materia.getNombre() + " " + materia.getSesiones());
        claveMateria = Integer.parseInt(materia.getClave());

        String[] columnNames = {"Sesion", "Horas"};

        List< Sesion> lista = Data.sesiones;

        List< Sesion> listaMateria = lista.stream().filter(u
                -> u.getClaveMateria().equals(Integer.parseInt(materia.getClave())))
                .collect(Collectors.toList());

        datos = new Object[listaMateria.size()][2];

        for (int i = 0; i < listaMateria.size(); i++) {
            datos[i][0] = listaMateria.get(i).getNombreSesison();
            datos[i][1] = listaMateria.get(i).getHoras();
        }

        // materia = Data.materias.set((Materia) datos[i][1]);
        DefaultTableModel dtm = new DefaultTableModel(datos, columnNames);
        tabla1 = new JTable(dtm);
        tabla1.setBackground(myColor2);

        JScrollPane scrollPane = new JScrollPane(tabla1);
        getContentPane().add(scrollPane, BorderLayout.CENTER);
        this.setVisible(true);

        JScrollPane jScrollPane = new JScrollPane();
        jScrollPane.setViewportView(tabla1);
        jScrollPane.setBounds(20, 20, 360, 200);
        add(jScrollPane);

        //setLayout(null);
        boton1 = new JButton("Guardar");
        boton1.setBounds(100, 230, 100, 30);
        add(boton1);
        boton1.addActionListener((ActionListener) this);

        boton2 = new JButton("Regresar");
        boton2.setBounds(200, 230, 100, 30);
        add(boton2);
        boton2.addActionListener((ActionListener) this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        try {
            if (e.getSource() == boton1) {
                Data.sesiones.removeIf(s -> s.getClaveMateria().equals(claveMateria));

                for (int i = 0; i < tabla1.getRowCount(); i++) {

                    datos[i][0] = tabla1.getValueAt(i, 0);
                    datos[i][1] = tabla1.getValueAt(i, 1);

                    Data.sesiones.add(new Sesion(claveMateria, tabla1.getValueAt(i, 0).toString(), tabla1.getValueAt(i, 1).toString()));

                }
                JOptionPane.showMessageDialog(null, "Sesion Actualizada");
            }
        } catch (Exception d) {
            System.out.println(d.getMessage());
        }

        if (e.getSource() == boton2) {
            Vista4 v4 = new Vista4();
            v4.setVisible(true);
            dispose();

        }
    }
}
