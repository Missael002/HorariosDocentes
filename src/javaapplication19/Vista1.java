package javaapplication19;


import data.Data;
import data.Docente;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;


public class Vista1 extends JFrame{
    
    private JTextField txtnombre, txtapellido1, txtapellido2, txtpuesto, txtclave;
    private JPanel contentpane;
    Color myColor1 = new Color(177, 205, 227);
    
    public Vista1(){
        setBounds(450,500,500,450);
        setVisible(true);
        setLocationRelativeTo(null);//posisiona la ventana en el medio
        contentpane = new JPanel();
        setContentPane(contentpane);
        contentpane.setBackground(myColor1);
        contentpane.setLayout(null);
        Ejecutarv1();
        
        
    }
    private void Textos(){
        
        txtnombre = new JTextField(30);
        txtapellido1 = new JTextField(30);
        txtapellido2 = new JTextField(30);
        txtpuesto = new JTextField(30);
        txtclave = new JTextField(30);
        
        txtnombre.setBounds(285, 45, 130, 25);
        contentpane.add(txtnombre);
        
        txtapellido1.setBounds(285, 90, 130, 25);
        contentpane.add(txtapellido1);
        
        txtapellido2.setBounds(285, 135, 130, 25);
        contentpane.add(txtapellido2);
        
        txtpuesto.setBounds(285, 180, 130, 25);
        contentpane.add(txtpuesto);
        
        txtclave.setBounds(285, 225, 130, 25);
        contentpane.add(txtclave);
        
        
        JLabel lbnom = new JLabel("NOMBRE: ");
        contentpane.add(lbnom);
        lbnom.setBounds(60, 45, 70, 25);
        
        JLabel lbapel1 = new JLabel("APELLIDO PATERNO: ");
        contentpane.add(lbapel1);
        lbapel1.setBounds(60, 90, 140, 25);
        
        JLabel lbapel2 = new JLabel("APELLIDO MATERNO: ");
        contentpane.add(lbapel2);
        lbapel2.setBounds(60, 135, 140, 25);
        
        JLabel lbpuesto = new JLabel("PUESTO: ");
        contentpane.add(lbpuesto);
        lbpuesto.setBounds(60, 180, 70, 25);
        
        JLabel lbclave = new JLabel("CLAVE: ");
        contentpane.add(lbclave);
        lbclave.setBounds(60, 225, 70, 25);
        
        JLabel txtitle = new JLabel("INGRESE LOS SIGUIENTES DATOS");
        txtitle.setBackground(Color.BLUE);
        txtitle.setBounds(135, 10, 250, 25);
        contentpane.add(txtitle);
    
        
    }
    
    private void botones(){
    
    JButton btng = new JButton("GUARDAR DOCENTE");
    btng.setBounds(160, 280, 180, 25);
    contentpane.add(btng);
     
    ActionListener guarda = new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent ae) {
            try {
            Data.docente.add(new Docente(txtnombre.getText(), txtapellido1.getText(), txtapellido2.getText(), txtpuesto.getText(), txtclave.getText()));
            JOptionPane.showMessageDialog(btng, "DOCENTE AGREGADO CON EXITO");
            } catch(Exception e) {
                JOptionPane.showMessageDialog(btng, "INGRESA SOLO VALOR NUMERICO EN LA CLAVE");
            }
        
        //Docente docente = new Docente(txtnombre.getText(), txtapellido1.getText(), txtapellido2.getText(), txtpuesto.getText(), txtclave.getText());
        //lista.add(docente);
        //JOptionPane.showInputDialog(docente)
        //mostrar();
        
        Clear();
        }
    };
    btng.addActionListener(guarda);
    
    JButton btnR = new JButton("REGRESAR AL MENU");
        btnR.setBounds(160, 330, 180, 25);
        contentpane.add(btnR);
        
        ActionListener regresar = new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent ae) {
            Vista0 menu = new Vista0();
            menu.setVisible(true);
            dispose();
        }     
        };
        btnR.addActionListener(regresar);
 }
   
    private void Ejecutarv1(){
        botones();
        Textos();
        setResizable(false);
    }
    
    public void Clear(){
        txtnombre.setText("");
        txtapellido1.setText("");
        txtapellido2.setText("");
        txtpuesto.setText("");
        txtclave.setText("");
        
    }
}    