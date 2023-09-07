package javaapplication19;

import data.Data;
import data.Materia;
import data.Sesion;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Vista2 extends JFrame {

    private JTextField txtnombre, txtsesion, txtclave;
    private JPanel pane;
    Color myColor1 = new Color(177, 205, 227);

    public Vista2() {

        setBounds(450, 500, 500, 450);
        setVisible(true);
        setLocationRelativeTo(null);
        pane = new JPanel();
        setContentPane(pane);
        pane.setBackground(myColor1);
        pane.setLayout(null);
        iniciarVista2();
        
        setResizable(false);
    }

    private void iniciarTexto() {

        txtnombre = new JTextField(30);
        txtsesion = new JTextField(30);
        txtclave = new JTextField(30);

        txtnombre.setBounds(285, 45, 130, 25);
        pane.add(txtnombre);

        txtsesion.setBounds(285, 135, 130, 25);
        pane.add(txtsesion);

        txtclave.setBounds(285, 90, 130, 25);
        pane.add(txtclave);

        JLabel lbnom = new JLabel("NOMBRE: ");
        pane.add(lbnom);
        lbnom.setBounds(50, 45, 70, 25);

        JLabel lbclave = new JLabel("CLAVE: ");
        pane.add(lbclave);
        lbclave.setBounds(50, 90, 140, 25);

        JLabel lbsesion = new JLabel("NUMERO DE SESIONES: ");
        pane.add(lbsesion);
        lbsesion.setBounds(50, 135, 170, 25);

        JLabel txtitle = new JLabel("INGRESE LOS SIGUIENTES DATOS");
        txtitle.setBackground(Color.BLUE);
        txtitle.setBounds(135, 10, 250, 25);
        pane.add(txtitle);
    }

    private void Botones() {
        JButton btng = new JButton("GUARDAR MATERIA");
        btng.setBounds(160, 190, 180, 25);
        pane.add(btng);

        ActionListener guardar = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                try {

                    Data.materias.add(new Materia(txtnombre.getText(), txtclave.getText(), Integer.parseInt(txtsesion.getText())));

                    //Agregamos las sesiones a mi array
                    for (int i = 0; i < Integer.parseInt(txtsesion.getText()); i++) {
                        try {

                            Data.sesiones.add(new Sesion(Integer.parseInt(txtclave.getText()), "Sesion " + (i + 1), 0 + ""));

                        } catch (Exception e) {
                            System.out.println("javaapplication19.Calculo.<init>()");
                        }
                    }

                    //fin de agreggar las sesiones a mi array
                    JOptionPane.showMessageDialog(btng, "MATERIA AGREGADA CON EXITO");
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(btng, "INGRESA VALOR NUMERICO EN SESIONES Y LA CLAVE");
                }
                Clear();
            }
        };
        btng.addActionListener(guardar);

        JButton btnR = new JButton("REGRESAR AL MENU");
        btnR.setBounds(160, 230, 180, 25);
        pane.add(btnR);

        ActionListener regresar = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                Vista0 menu = new Vista0();
                menu.setVisible(true);
                dispose();
            }
        };
        btnR.addActionListener(regresar);
    }

    public void Clear() {
        txtnombre.setText("");
        txtclave.setText("");
        txtsesion.setText("");

    }

    private void iniciarVista2() {
        Botones();
        iniciarTexto();
    }
}
