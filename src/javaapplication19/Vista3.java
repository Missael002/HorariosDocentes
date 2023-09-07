package javaapplication19;


import java.awt.MenuComponent;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPanel;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
import data.Data;
import java.awt.Color;

public class Vista3 extends JFrame implements ActionListener {

	public javax.swing.JFrame ventana;
	
         
        public Vista3(){
        super("Vista 3");
        setLocationRelativeTo(null);
        this.setResizable(false);
        }
        
        int cont1=1;
        String j2,j3,j4,j5,j6,j7,j8,j9,j10,j11,j12,j13,j14;
        String jj2,jj3,jj4,jj5,jj6,jj7,jj8,jj9,jj10,jj11,jj12,jj13,jj14;
        Color myColor1 = new Color(177, 205, 227);
         String j1  = "1";
        private Vista3 v3 = this;
        {
            
        }
	 
		JLabel e1,e2,e3,e4,e5,e6,e7,e8,e9,e10,e11,e12,e13,e14;
		JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t14;
		JButton btn1,btn2,btn3,btn4;
		JPanel panel;
                
		{
                
                
                   
		e1 = new JLabel("Horario 1");
		e1.setBounds(20, 30, 200, 20);
		e2 = new JLabel("Horario 2");
		e2.setBounds(20,50,200, 20);
                e3 = new JLabel("Horario 3");
		e3.setBounds(20,70,200, 20);
                e4 = new JLabel("Horario 4");
		e4.setBounds(20,90,200, 20);
                e5 = new JLabel("Horario 5");
		e5.setBounds(20, 110, 200, 20);
		e6 = new JLabel("Horario 6");
		e6.setBounds(20,130,200, 20);
                e7 = new JLabel("Horario 7");
		e7.setBounds(20,150,200, 20);
                e8 = new JLabel("Horario 8");
		e8.setBounds(20,170,200, 20);
		e9 = new JLabel("Horario 9");
		e9.setBounds(20,190, 200, 20);
		e10 = new JLabel("Horario 10");
		e10.setBounds(20,210,200, 20);
                e11 = new JLabel("Horario 11");
		e11.setBounds(20,230,200, 20);
                e12 = new JLabel("Horario 12");
		e12.setBounds(20,250,200, 20);
                e13 = new JLabel("Horario 13");
		e13.setBounds(20,270,200, 20);
                e14 = new JLabel("Horario 14");
		e14.setBounds(20,290,200, 20);
                
		t1 = new JTextField();
		t1.setBounds(150, 30, 90, 20);
                t2 = new JTextField();
		t2.setBounds(150, 50, 90, 20);
                t3 = new JTextField();
		t3.setBounds(150, 70, 90, 20);
                t4 = new JTextField();
		t4.setBounds(150, 90, 90, 20);
                t5 = new JTextField();
		t5.setBounds(150, 110, 90, 20);
                t6 = new JTextField();
		t6.setBounds(150, 130, 90, 20);
                t7 = new JTextField();
		t7.setBounds(150, 150, 90, 20);
                t8 = new JTextField();
		t8.setBounds(150, 170, 90, 20);
                t9 = new JTextField();
		t9.setBounds(150, 190, 90, 20);
                t10 = new JTextField();
		t10.setBounds(150, 210, 90, 20);
                t11 = new JTextField();
		t11.setBounds(150, 230, 90, 20);
                t12 = new JTextField();
		t12.setBounds(150, 250, 90, 20);
                t13 = new JTextField();
		t13.setBounds(150, 270, 90, 20);
                t14 = new JTextField();
		t14.setBounds(150, 290, 90, 20);
                
		btn1 = new JButton("Guardar");
                btn1.setBounds(300, 110, 150, 20);
		btn2 = new JButton("Regresar");
		btn2.setBounds(300, 300,150, 20);
                btn3 = new JButton("Agregar Campo");
                btn3.setBounds(300, 30, 150, 20);
                btn4 = new JButton("Eliminar Campo");
                btn4.setBounds(300, 60, 150, 20);
               
		panel = new JPanel();
		panel.setLayout(null);
		
		panel.add(btn1);
		panel.add(btn2);
                panel.add(btn3);
                panel.add(btn4);
		
		panel.add(t1);
		panel.add(t2);
                panel.add(t3);
                panel.add(t4);
                panel.add(t5);
		panel.add(t6);
                panel.add(t7);
                panel.add(t8);
                panel.add(t9);
		panel.add(t10);
                panel.add(t11);
                panel.add(t12);
                panel.add(t13);
                panel.add(t14);
                
                panel.add(e1);
		panel.add(e2);
                panel.add(e3);
                panel.add(e4);
                panel.add(e5);
		panel.add(e6);
                panel.add(e7);
                panel.add(e8);
                panel.add(e9);
		panel.add(e10);
                panel.add(e11);
                panel.add(e12);
                panel.add(e13);
                panel.add(e14);
               
		add(panel);
                panel.setBackground(myColor1);
		setSize(600,400);
		setVisible(true);
                
                e2.setVisible(false);
                e3.setVisible(false);
                e4.setVisible(false);
                e5.setVisible(false);
                e6.setVisible(false);
                e7.setVisible(false);
                e8.setVisible(false);
                e9.setVisible(false);
                e10.setVisible(false);
                e11.setVisible(false);
                e12.setVisible(false);
                e13.setVisible(false);
                e14.setVisible(false);
                
                t2.setVisible(false);
                t3.setVisible(false);
                t4.setVisible(false);
                t5.setVisible(false);
                t6.setVisible(false);
                t7.setVisible(false);
                t8.setVisible(false);
                t9.setVisible(false);
                t10.setVisible(false);
                t11.setVisible(false);
                t12.setVisible(false);
                t13.setVisible(false);
                t14.setVisible(false);
             
                
                    jj2= "0";jj3= "0";jj4= "0";jj5= "0";jj6= "0";
                    jj7= "0";jj8= "0";jj9= "0";jj10= "0";jj11= "0";jj12= "0";jj13= "0";jj14 = "0";
                cont1=1;
                }
                {
		
		
//		 setDefaultCloseOperation(EXIT_ON_CLOSE);
            }
		
                 
                {                                        
        
        
            btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              
        String Mensaje = "Introduzca una hora porfavor";
        String Mensaje2 = "Datos Guardados con Exito"; 
        final String nm1= "0";
        final String nm11= "1";
        final String nm111= "";
        String n1,n2,n3,n4,n5,n6,n7,n8,n9,n10,n11,n12,n13,n14;
                       
                //Data.getEncabezadosHorarios();
               
                //Data.horarios  = new ArrayList<String>();
                //System.out.println(Data.getEncabezadosHorarios());
                //Data.horarios.removeAll(Data.horarios); 
//                e2.setVisible(true);
//                e3.setVisible(true);
//                e4.setVisible(true);
//                e5.setVisible(true);
//                e6.setVisible(true);
//                e7.setVisible(true);
//                e8.setVisible(true);
//                e9.setVisible(true);
//                e10.setVisible(true);
//                e11.setVisible(true);
//                e12.setVisible(true);
//                e13.setVisible(true);
//                e14.setVisible(true);
//                
//                t2.setVisible(true);
//                t3.setVisible(true);
//                t4.setVisible(true);
//                t5.setVisible(true);
//                t6.setVisible(true);
//                t7.setVisible(true);
//                t8.setVisible(true);
//                t9.setVisible(true);
//                t10.setVisible(true);
//                t11.setVisible(true);
//                t12.setVisible(true);
//                t13.setVisible(true);
//                t14.setVisible(true); 
//                
//                e2.setVisible(false);
//                e3.setVisible(false);
//                e4.setVisible(false);
//                e5.setVisible(false);
//                e6.setVisible(false);
//                e7.setVisible(false);
//                e8.setVisible(false);
//                e9.setVisible(false);
//                e10.setVisible(false);
//                e11.setVisible(false);
//                e12.setVisible(false);
//                e13.setVisible(false);
//                e14.setVisible(false);
//                
//                t2.setVisible(false);
//                t3.setVisible(false);
//                t4.setVisible(false);
//                t5.setVisible(false);
//                t6.setVisible(false);
//                t7.setVisible(false);
//                t8.setVisible(false);
//                t9.setVisible(false);
//                t10.setVisible(false);
//                t11.setVisible(false);
//                t12.setVisible(false);
//                t13.setVisible(false);
//                t14.setVisible(false);
//                cont1=1;
                     
                    n1 = null;n2 = null;n3 = null;n4 = null;n5 = null;n6 = null;n7 = null;n8 = null;
                    n9 = null;n10 = null;n11 = null;n12 = null;n13 = null;n14 = null;
                    j2= "0";j3= "0";j4= "0";j5= "0";j6= "0";
                    j7= "0";j8= "0";j9= "0";j10= "0";j11= "0";j12= "0";j13= "0";j14 = "0"; 
                    j2=jj2;j3=jj3;j4=jj4;j5=jj5;j6=jj6;j7=jj7;j8=jj8;j9=jj9;j10=jj10;j11=jj11;
                    j12=jj12;j13=jj13;j14=jj14;
//                    j2= "0";j3= "0";j4= "0";j5= "0";j6= "0";
//                j7= "0";j8= "0";j9= "0";j10= "0";j11= "0";j12= "0";j13= "0";j14 = "0"; 
        switch(j1){
            case nm1: 
                    
                    break; //sirve para no ejecutar los demas casos despues del correcto
            case nm11:
                    n1 = t1.getText();
                    if (n1.length()<1){
                    JOptionPane.showMessageDialog(null, Mensaje);
                    n1 = null;n2 = null;n3 = null;n4 = null;n5 = null;n6 = null;n7 = null;n8 = null;
                    n9 = null;n10 = null;n11 = null;n12 = null;n13 = null;n14 = null;
                    return;
                }   
                    break;
            case nm111:
                
                    JOptionPane.showMessageDialog(null, Mensaje);
                    n1 = null;n2 = null;n3 = null;n4 = null;n5 = null;n6 = null;n7 = null;n8 = null;
                    n9 = null;n10 = null;n11 = null;n12 = null;n13 = null;n14 = null;
                    return;
            default: 
                    JOptionPane.showMessageDialog(null, Mensaje);
                    n1 = null;n2 = null;n3 = null;n4 = null;n5 = null;n6 = null;n7 = null;n8 = null;
                    n9 = null;n10 = null;n11 = null;n12 = null;n13 = null;n14 = null;
                    return;            
        }
            
        switch(j2){
            case nm1:
                    
                    break; //sirve para no ejecutar los demas casos despues del correcto
            case nm11: 
                    n2 = t2.getText();
                    
                    if (n2.length()<1){
                    JOptionPane.showMessageDialog(null, Mensaje);
                    n1 = null;n2 = null;n3 = null;n4 = null;n5 = null;n6 = null;n7 = null;n8 = null;
                    n9 = null;n10 = null;n11 = null;n12 = null;n13 = null;n14 = null;
                    return;
                }   
                    break;
            case nm111:
                    JOptionPane.showMessageDialog(null, Mensaje);
                    n1 = null;n2 = null;n3 = null;n4 = null;n5 = null;n6 = null;n7 = null;n8 = null;
                    n9 = null;n10 = null;n11 = null;n12 = null;n13 = null;n14 = null;
                    return;
            default: 
                    JOptionPane.showMessageDialog(null, Mensaje);
                    n1 = null;n2 = null;n3 = null;n4 = null;n5 = null;n6 = null;n7 = null;n8 = null;
                    n9 = null;n10 = null;n11 = null;n12 = null;n13 = null;n14 = null;
                    return;        
        }
        switch(j3){
            case nm1:
                    
                    break; //sirve para no ejecutar los demas casos despues del correcto
            case nm11: 
                    n3 = t3.getText();
                    if (n3.length()<1){
                    JOptionPane.showMessageDialog(null, Mensaje);
                    n1 = null;n2 = null;n3 = null;n4 = null;n5 = null;n6 = null;n7 = null;n8 = null;
                    n9 = null;n10 = null;n11 = null;n12 = null;n13 = null;n14 = null;
                    return;
                }  
                    break;
            case nm111:
                    JOptionPane.showMessageDialog(null, Mensaje);
                    n1 = null;n2 = null;n3 = null;n4 = null;n5 = null;n6 = null;n7 = null;n8 = null;
                    n9 = null;n10 = null;n11 = null;n12 = null;n13 = null;n14 = null;
                    return;
            default: 
                    JOptionPane.showMessageDialog(null, Mensaje);
                    n1 = null;n2 = null;n3 = null;n4 = null;n5 = null;n6 = null;n7 = null;n8 = null;
                    n9 = null;n10 = null;n11 = null;n12 = null;n13 = null;n14 = null;
                    return;        
        }
        switch(j4){
            case nm1: 
                    
                    break; //sirve para no ejecutar los demas casos despues del correcto
            case nm11:
                    n4 = t4.getText();
                    if (n4.length()<1){
                    JOptionPane.showMessageDialog(null, Mensaje);
                    n1 = null;n2 = null;n3 = null;n4 = null;n5 = null;n6 = null;n7 = null;n8 = null;
                    n9 = null;n10 = null;n11 = null;n12 = null;n13 = null;n14 = null;
                    return;
                }  
                    break;
            case nm111:
                    JOptionPane.showMessageDialog(null, Mensaje);
                    n1 = null;n2 = null;n3 = null;n4 = null;n5 = null;n6 = null;n7 = null;n8 = null;
                    n9 = null;n10 = null;n11 = null;n12 = null;n13 = null;n14 = null;
                    return;
            default: 
                    JOptionPane.showMessageDialog(null, Mensaje);
                    n1 = null;n2 = null;n3 = null;n4 = null;n5 = null;n6 = null;n7 = null;n8 = null;
                    n9 = null;n10 = null;n11 = null;n12 = null;n13 = null;n14 = null;
                    return;        
        }
        switch(j5){
            case nm1: 
                    
                    break; //sirve para no ejecutar los demas casos despues del correcto
            case nm11: 
                    n5 = t5.getText();
                    if (n5.length()<1){
                    JOptionPane.showMessageDialog(null, Mensaje);
                    n1 = null;n2 = null;n3 = null;n4 = null;n5 = null;n6 = null;n7 = null;n8 = null;
                    n9 = null;n10 = null;n11 = null;n12 = null;n13 = null;n14 = null;
                    return;
                }  
                    break;
            case nm111:
                    JOptionPane.showMessageDialog(null, Mensaje);
                    n1 = null;n2 = null;n3 = null;n4 = null;n5 = null;n6 = null;n7 = null;n8 = null;
                    n9 = null;n10 = null;n11 = null;n12 = null;n13 = null;n14 = null;
                    return;
            default: 
                    JOptionPane.showMessageDialog(null, Mensaje);
                    n1 = null;n2 = null;n3 = null;n4 = null;n5 = null;n6 = null;n7 = null;n8 = null;
                    n9 = null;n10 = null;n11 = null;n12 = null;n13 = null;n14 = null;
                    return;        
        }
        switch(j6){
            case nm1:
                   
                    break; //sirve para no ejecutar los demas casos despues del correcto
            case nm11:
                    n6 = t6.getText();
                    if (n6.length()<1){
                    JOptionPane.showMessageDialog(null, Mensaje);
                    n1 = null;n2 = null;n3 = null;n4 = null;n5 = null;n6 = null;n7 = null;n8 = null;
                    n9 = null;n10 = null;n11 = null;n12 = null;n13 = null;n14 = null;
                    return;
                }  
                    break;
            case nm111:
                    JOptionPane.showMessageDialog(null, Mensaje);
                    n1 = null;n2 = null;n3 = null;n4 = null;n5 = null;n6 = null;n7 = null;n8 = null;
                    n9 = null;n10 = null;n11 = null;n12 = null;n13 = null;n14 = null;
                    return;
            default: 
                    JOptionPane.showMessageDialog(null, Mensaje);
                    n1 = null;n2 = null;n3 = null;n4 = null;n5 = null;n6 = null;n7 = null;n8 = null;
                    n9 = null;n10 = null;n11 = null;n12 = null;n13 = null;n14 = null;
                    return;        
        }
        switch(j7){
            case nm1: 
                       
                    break; //sirve para no ejecutar los demas casos despues del correcto
            case nm11:
                     n7 = t7.getText();
                     if (n7.length()<1){
                    JOptionPane.showMessageDialog(null, Mensaje);
                    n1 = null;n2 = null;n3 = null;n4 = null;n5 = null;n6 = null;n7 = null;n8 = null;
                    n9 = null;n10 = null;n11 = null;n12 = null;n13 = null;n14 = null;
                    return;
                }  
                     break;
            case nm111:
                    JOptionPane.showMessageDialog(null, Mensaje);
                    n1 = null;n2 = null;n3 = null;n4 = null;n5 = null;n6 = null;n7 = null;n8 = null;
                    n9 = null;n10 = null;n11 = null;n12 = null;n13 = null;n14 = null;
                    return;
            default: 
                    JOptionPane.showMessageDialog(null, Mensaje);
                    n1 = null;n2 = null;n3 = null;n4 = null;n5 = null;n6 = null;n7 = null;n8 = null;
                    n9 = null;n10 = null;n11 = null;n12 = null;n13 = null;n14 = null;
                    return;        
        }
        switch(j8){
            case nm1:
                    
                    break; //sirve para no ejecutar los demas casos despues del correcto
            case nm11:
                    n8 = t8.getText();
                     if (n8.length()<1){
                    JOptionPane.showMessageDialog(null, Mensaje);
                    n1 = null;n2 = null;n3 = null;n4 = null;n5 = null;n6 = null;n7 = null;n8 = null;
                    n9 = null;n10 = null;n11 = null;n12 = null;n13 = null;n14 = null;
                    return;
                }  
                     break;
            case nm111:
                    JOptionPane.showMessageDialog(null, Mensaje);
                    n1 = null;n2 = null;n3 = null;n4 = null;n5 = null;n6 = null;n7 = null;n8 = null;
                    n9 = null;n10 = null;n11 = null;n12 = null;n13 = null;n14 = null;
                    return;
            default: 
                
                    JOptionPane.showMessageDialog(null, Mensaje);
                    n1 = null;n2 = null;n3 = null;n4 = null;n5 = null;n6 = null;n7 = null;n8 = null;
                    n9 = null;n10 = null;n11 = null;n12 = null;n13 = null;n14 = null;
                    return;        
        }
        switch(j9){
            case nm1: 
                      
                    break; //sirve para no ejecutar los demas casos despues del correcto
            case nm11:
                    n9 = t9.getText();
                     if (n9.length()<1){
                    JOptionPane.showMessageDialog(null, Mensaje);
                    n1 = null;n2 = null;n3 = null;n4 = null;n5 = null;n6 = null;n7 = null;n8 = null;
                    n9 = null;n10 = null;n11 = null;n12 = null;n13 = null;n14 = null;
                    return;
                }  
                     break;
            case nm111:
                    JOptionPane.showMessageDialog(null, Mensaje);
                    n1 = null;n2 = null;n3 = null;n4 = null;n5 = null;n6 = null;n7 = null;n8 = null;
                    n9 = null;n10 = null;n11 = null;n12 = null;n13 = null;n14 = null;
                    return;
            default: 
                    JOptionPane.showMessageDialog(null, Mensaje);
                    n1 = null;n2 = null;n3 = null;n4 = null;n5 = null;n6 = null;n7 = null;n8 = null;
                    n9 = null;n10 = null;n11 = null;n12 = null;n13 = null;n14 = null;
                    return;        
        }
        switch(j10){
            case nm1:
                    
                    break; //sirve para no ejecutar los demas casos despues del correcto
            case nm11:
                    n10 = t10.getText();
                     if (n10.length()<1){
                    JOptionPane.showMessageDialog(null, Mensaje);
                    n1 = null;n2 = null;n3 = null;n4 = null;n5 = null;n6 = null;n7 = null;n8 = null;
                    n9 = null;n10 = null;n11 = null;n12 = null;n13 = null;n14 = null;
                    return;
                }  
                     break;
            case nm111:
                    JOptionPane.showMessageDialog(null, Mensaje);
                    n1 = null;n2 = null;n3 = null;n4 = null;n5 = null;n6 = null;n7 = null;n8 = null;
                    n9 = null;n10 = null;n11 = null;n12 = null;n13 = null;n14 = null;
                    return;
            default: 
                    JOptionPane.showMessageDialog(null, Mensaje);
                    n1 = null;n2 = null;n3 = null;n4 = null;n5 = null;n6 = null;n7 = null;n8 = null;
                    n9 = null;n10 = null;n11 = null;n12 = null;n13 = null;n14 = null;
                    return;        
        }
        switch(j11){
            case nm1: 
                    
                    break; //sirve para no ejecutar los demas casos despues del correcto
            case nm11:
                    n11 = t11.getText();
                     if (n11.length()<1){
                    JOptionPane.showMessageDialog(null, Mensaje);
                    n1 = null;n2 = null;n3 = null;n4 = null;n5 = null;n6 = null;n7 = null;n8 = null;
                    n9 = null;n10 = null;n11 = null;n12 = null;n13 = null;n14 = null;
                    return;
                }  
                    break;
            case nm111:
                    JOptionPane.showMessageDialog(null, Mensaje);
                    n1 = null;n2 = null;n3 = null;n4 = null;n5 = null;n6 = null;n7 = null;n8 = null;
                    n9 = null;n10 = null;n11 = null;n12 = null;n13 = null;n14 = null;
                    return;
            default: 
                    JOptionPane.showMessageDialog(null, Mensaje);
                    n1 = null;n2 = null;n3 = null;n4 = null;n5 = null;n6 = null;n7 = null;n8 = null;
                    n9 = null;n10 = null;n11 = null;n12 = null;n13 = null;n14 = null;
                    return;        
        }
        switch(j12){
            case nm1: 
                    
                    break; //sirve para no ejecutar los demas casos despues del correcto
            case nm11:
                    n12 = t12.getText();
                     if (n12.length()<1){
                    JOptionPane.showMessageDialog(null, Mensaje);
                    n1 = null;n2 = null;n3 = null;n4 = null;n5 = null;n6 = null;n7 = null;n8 = null;
                    n9 = null;n10 = null;n11 = null;n12 = null;n13 = null;n14 = null;
                    return;
                }  
                    
                     break;
            case nm111:
                    JOptionPane.showMessageDialog(null, Mensaje);
                    n1 = null;n2 = null;n3 = null;n4 = null;n5 = null;n6 = null;n7 = null;n8 = null;
                    n9 = null;n10 = null;n11 = null;n12 = null;n13 = null;n14 = null;
                    return;
            default: 
                    JOptionPane.showMessageDialog(null, Mensaje);
                    n1 = null;n2 = null;n3 = null;n4 = null;n5 = null;n6 = null;n7 = null;n8 = null;
                    n9 = null;n10 = null;n11 = null;n12 = null;n13 = null;n14 = null;
                    return;        
        }
        switch(j13){
            case nm1: 
                    
                    break; //sirve para no ejecutar los demas casos despues del correcto
            case nm11:
                    n13 = t13.getText();
                    if (n13.length()<1){
                    JOptionPane.showMessageDialog(null, Mensaje);
                    n1 = null;n2 = null;n3 = null;n4 = null;n5 = null;n6 = null;n7 = null;n8 = null;
                    n9 = null;n10 = null;n11 = null;n12 = null;n13 = null;n14 = null;
                    return;
                }  
                     break;
            case nm111:
                    JOptionPane.showMessageDialog(null, Mensaje);
                    n1 = null;n2 = null;n3 = null;n4 = null;n5 = null;n6 = null;n7 = null;n8 = null;
                    n9 = null;n10 = null;n11 = null;n12 = null;n13 = null;n14 = null;
                    return;
            default: 
                    JOptionPane.showMessageDialog(null, Mensaje);
                    n1 = null;n2 = null;n3 = null;n4 = null;n5 = null;n6 = null;n7 = null;n8 = null;
                    n9 = null;n10 = null;n11 = null;n12 = null;n13 = null;n14 = null;
                    return;        
        }
        switch(j14){
            case nm1: 
                    
                    break; //sirve para no ejecutar los demas casos despues del correcto
            case nm11: 
                    n14 = t14.getText();
                     if (n14.length()<1){
                    JOptionPane.showMessageDialog(null, Mensaje);
                    n1 = null;n2 = null;n3 = null;n4 = null;n5 = null;n6 = null;n7 = null;n8 = null;
                    n9 = null;n10 = null;n11 = null;n12 = null;n13 = null;n14 = null;
                    return;
                }  
                     break;
            case nm111:
                    JOptionPane.showMessageDialog(null, Mensaje);
                    n1 = null;n2 = null;n3 = null;n4 = null;n5 = null;n6 = null;n7 = null;n8 = null;
                    n9 = null;n10 = null;n11 = null;n12 = null;n13 = null;n14 = null;
                    return;
            default: 
                    JOptionPane.showMessageDialog(null, Mensaje);
                    n1 = null;n2 = null;n3 = null;n4 = null;n5 = null;n6 = null;n7 = null;n8 = null;
                    n9 = null;n10 = null;n11 = null;n12 = null;n13 = null;n14 = null;
                    return;        
        }
//                System.out.println(Horas);
//                int size = Horas.size();
//                System.out.println(size);
//                String info2 = String.valueOf(size);
//                info = info2;
                //Prueba vp4 = new Prueba();
                
                Data.horarios.removeAll(Data.horarios);
                
                //Data.getEncabezadosHorarios();
                
                
                if (n1 != null){
                    Data.horarios.add(n1);
                }        
                if (n2 != null){
                    Data.horarios.add(n2);
                }
                if (n3 != null){
                    Data.horarios.add(n3);
                }    
                if (n4 != null){
                    Data.horarios.add(n4);
                }
                if (n5 != null){
                    Data.horarios.add(n5);    
                }
                if (n6 != null){
                    Data.horarios.add(n6);    
                }
                if (n7 != null){
                    Data.horarios.add(n7);    
                }
                if (n8 != null){
                    Data.horarios.add(n8);    
                }
                if (n9 != null){
                    Data.horarios.add(n9);    
                }
                if (n10 != null){
                    Data.horarios.add(n10);    
                }
                if (n11 != null){
                    Data.horarios.add(n11);    
                }
                if (n12 != null){
                    Data.horarios.add(n12);    
                }
                if (n13 != null){
                    Data.horarios.add(n13);    
                }
                if (n14 != null){
                    Data.horarios.add(n14);    
                }
                
                
                JOptionPane.showMessageDialog(null, Mensaje2);
                }     
        });
            btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            
                Vista0 vp0 = new Vista0();
                //vp0.setVisible(true);
                v3.dispose();
                
            }
            });
            btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            //Agregar Campo
             switch(cont1){
            case 1: 
                    e2.setVisible(true);
                    t2.setVisible(true);
                    cont1= cont1+1;
                    jj2="1";
                    break;
            case 2: 
                    e3.setVisible(true);
                    t3.setVisible(true);
                    cont1= cont1+1; 
                    jj3="1";
                    break; //sirve para no ejecutar los demas casos despues del correcto
            case 3: 
                    e4.setVisible(true);
                    t4.setVisible(true);
                    cont1= cont1+1;
                    jj4="1";
                    break;
            case 4:
                    e5.setVisible(true);
                    t5.setVisible(true);
                    cont1= cont1+1;
                    jj5="1";
                    break;
            case 5:
                    e6.setVisible(true);
                    t6.setVisible(true);
                    cont1= cont1+1;
                    jj6="1";
                    break;
            case 6:
                    e7.setVisible(true);
                    t7.setVisible(true);
                    cont1= cont1+1;
                    jj7="1";
                    break;
            case 7:
                    e8.setVisible(true);
                    t8.setVisible(true);
                    cont1= cont1+1;
                    jj8="1";
                    break;
            case 8:
                    e9.setVisible(true);
                    t9.setVisible(true);
                    cont1= cont1+1;
                    jj9="1";
                    break;
            case 9:
                    e10.setVisible(true);
                    t10.setVisible(true);
                    cont1= cont1+1;
                    jj10="1";
                    break;
            case 10:
                    e11.setVisible(true);
                    t11.setVisible(true);
                    cont1= cont1+1;
                    jj11="1";
                    break;
            case 11:
                    e12.setVisible(true);
                    t12.setVisible(true);
                    cont1= cont1+1;
                    jj12="1";
                    break;
            case 12:
                    e13.setVisible(true);
                    t13.setVisible(true);
                    cont1= cont1+1;
                    jj13="1";
                    break;
            case 13:
                    e14.setVisible(true);
                    t14.setVisible(true);
                    cont1= cont1+1;
                    jj14="1";
                    break;
            case 14:
                    JOptionPane.showMessageDialog(null, "Limite maximo de campos alcanzado");  
                    //cont1=cont1-1;
                    break;        
            default: 
                    JOptionPane.showMessageDialog(null, "Error");  
                    break;        
        }    
                
            }
            });
            btn4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            //Eliminar Campo
            switch(cont1){
            case 1: 
                    JOptionPane.showMessageDialog(null, "No puedes eliminar el primer campo");                  
                    break;    
            case 2:
                    t2.setText("");
                    e2.setVisible(false);
                    t2.setVisible(false);
                    cont1= cont1-1;
                    jj2="0";
                    break; //sirve para no ejecutar los demas casos despues del correcto
            case 3:
                    t3.setText("");
                    e3.setVisible(false);
                    t3.setVisible(false);
                    cont1= cont1-1;
                    jj3="0";
                    break;
            case 4:
                    t4.setText("");
                    e4.setVisible(false);
                    t4.setVisible(false);
                    cont1= cont1-1;
                    jj4="0";
                    break;
            case 5:
                    t5.setText("");
                    e5.setVisible(false);
                    t5.setVisible(false);
                    cont1= cont1-1;
                    jj5="0";
                    break;
            case 6:
                    t6.setText("");
                    e6.setVisible(false);
                    t6.setVisible(false);
                    cont1= cont1-1;
                    jj6="0";
                    break;
            case 7:
                    e7.setVisible(false);
                    t7.setVisible(false);
                    j7="0";
                    cont1= cont1-1;
                    break;
            case 8:
                    t8.setText("");
                    e8.setVisible(false);
                    t8.setVisible(false);
                    cont1= cont1-1;
                    jj8="0";
                    break;
            case 9:
                    t9.setText("");
                    e9.setVisible(false);
                    t9.setVisible(false);
                    cont1= cont1-1;
                    jj9="0";
                    break;
            case 10:
                    t10.setText("");
                    e10.setVisible(false);
                    t10.setVisible(false);
                    cont1= cont1-1;
                    jj10="0";
                    break;
            case 11:
                    t11.setText("");
                    e11.setVisible(false);
                    t11.setVisible(false);
                    cont1= cont1-1;
                    jj11="0";
                    break;
            case 12:
                    t12.setText("");
                    e12.setVisible(false);
                    t12.setVisible(false);
                    cont1= cont1-1;
                    jj12="0";
                    break;
            case 13:
                    t13.setText("");
                    e13.setVisible(false);
                    t13.setVisible(false);
                    cont1= cont1-1;
                    jj13="0";
                    break;
            case 14:
                    t14.setText("");
                    e14.setVisible(false);
                    t14.setVisible(false);
                    cont1= cont1-1;
                    jj14="0";
                    break;        
            default: 
                   JOptionPane.showMessageDialog(null, "Error");  
                    
                    break;        
        }        
                
            }
            });
   
    } 
              
                
	@Override
	public void actionPerformed(ActionEvent e) {
		
	}

         
}
