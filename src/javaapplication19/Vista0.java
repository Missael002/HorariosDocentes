package javaapplication19;

import data.Data;
import data.Docente;
import data.Materia;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JLabel;

public class Vista0 extends JFrame{
   
    private JPanel panel;
    private Vista0 v = this;
    Color myColor1 = new Color(177, 205, 227);
    public Vista0(){
        this.setSize(500,500);//establecemos el tamaño de la ventana
        setTitle("GENERADOR DE HORARIO PARA CLASES");
        setLocationRelativeTo(null);//posisiona la ventana en el medio
        IniciarMetodos();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
    }
    
     private void IniciarMetodos() { 
        ColocarPanel();
        ColocarBotones();
        setResizable(false);
    }
     

    private void ColocarPanel(){
        panel = new JPanel();//creacion de un panel
        panel.setLayout(null);
        panel.setBackground(myColor1);
        this.getContentPane().add(panel);
        
    }    
    private void ColocarBotones(){ //Creacion de botones con sus funciones
        JButton btnv1=new JButton("INGRESAR DOCENTE");
        btnv1.setBounds(40, 50, 160, 25);
        panel.add(btnv1);
        this.dispose();
        
        ActionListener accion1 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            Vista1 v1= new Vista1();
            v1.setVisible(true);
            v.dispose();
            }
        };
        btnv1.addActionListener(accion1);
        
        JButton btnv2 = new JButton("CONFIGURAR MATERIA");
        btnv2.setBounds(250, 50, 180, 25);
        panel.add(btnv2);
            
            ActionListener accion2 = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                Vista2 v2 = new Vista2();
                v2.setVisible(true);
                v.dispose();
                
            } 
        };
        btnv2.addActionListener(accion2);
        
        JButton btnv3 = new JButton("INGRESAR HORARIOS");
        btnv3.setBounds(40, 150, 190, 25);
        panel.add(btnv3);
        btnv3.setVisible(true);
        
         ActionListener accion3 = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                Vista3 v3 = new Vista3  ();
                v3.setVisible(true);
                //v.dispose();
            } 
        };
        btnv3.addActionListener(accion3);   
        
        JButton btnv4 = new JButton("MATERIAS");
        btnv4.setBounds(260, 150, 160, 25);
        btnv4.setVisible(true);
        panel.add(btnv4);
        
        
        
        
        ActionListener accion4 = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                //new Vista4();
                //v.dispose();
                Vista4 v4 = new Vista4();
                v4.setVisible(true);
            } 
        };
        btnv4.addActionListener(accion4);
        
        JButton btnv7 = new JButton("DOCENTES");
        btnv7.setBounds(40, 250, 160, 25);
        btnv7.setVisible(true);
        panel.add(btnv7);
        
        ActionListener accion5 = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                Vista7 v7 = new Vista7();
                v7.setVisible(true);
                v.dispose();
            } 
        };
        btnv7.addActionListener(accion5);
           
        JLabel txtitle = new JLabel("BIENVENIDO AL MENU");
        txtitle.setBackground(Color.yellow);
        txtitle.setBounds(180, 10, 160, 25);
        panel.add(txtitle);
          
    } 
    
    public static void main(String args[]){
        Data.docente.add(new Docente("Damian","Rosado","Castellanos","Docente","123"));
        Data.docente.add(new Docente("Iván","Fuentes","Chab","Docente","124"));
        
       
        Vista0 v0 = new Vista0();
        v0.setVisible(true);
        
        
           
    }

}    
