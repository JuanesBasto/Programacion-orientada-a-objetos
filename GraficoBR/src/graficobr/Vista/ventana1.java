/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package graficobr.Vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Virtutienda
 */
public class ventana1 extends JFrame {
  
    JLabel intro = new JLabel();
    JPanel panel = new JPanel();
    
    public void label(){
    intro.setText("Calculadora ");
    intro.setForeground(Color.red);
    intro.setBounds(200,20,200, 60);
    intro.setFont(new Font("ARIAL", Font.ITALIC,30));
    panel.add(intro);
        
    }
    
    public ventana1(){
       
       //this.setExtendedState(JFrame.MAXIMIZED_BOTH);
    this.setSize(500,500);
    this.setLocationRelativeTo(null);
    this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    //this.setUndecorated(true);
    this.setTitle("Profe");
    
   
    panel.setBackground(Color.yellow);
    panel.setLayout(null);
    this.add(panel);
    
  
    label();
    
    JLabel texto1 = new JLabel();
    texto1.setText("Digite numero: ");
    texto1.setForeground(Color.red);
    texto1.setBounds(60,80,200, 60);
    texto1.setFont(new Font("ARIAL", Font.ITALIC,20));
    panel.add(texto1);
    
    JTextField caja1 = new JTextField();
    caja1.setBounds(200,80,200, 40);
    caja1.setBorder(BorderFactory.createLineBorder(Color.RED));
    caja1.setFont(new Font("ARIAL", Font.ITALIC,20));
    panel.add(caja1);
    
    JLabel texto2 = new JLabel();
    texto2.setText("Digite numero: ");
    texto2.setForeground(Color.red);
    texto2.setBounds(60,140,200, 60);
    texto2.setFont(new Font("ARIAL", Font.ITALIC,20));
    panel.add(texto2);
   
    JTextField caja2 = new JTextField();
    caja2.setBounds(200,140,200, 40);
    //caja2.setText("Aqui va un texto");
    caja2.setFont(new Font("ARIAL", Font.ITALIC,20));
    caja2.setBorder(BorderFactory.createLineBorder(Color.RED));
    caja2.setEnabled(true);
    panel.add(caja2);
    
      
    JButton boton1 = new JButton();
    boton1.setText("Sumar");
    boton1.setFont(new Font("ARIAL", Font.ITALIC,20));
    boton1.setBounds(120,200, 100, 40);
    panel.add(boton1);
    
    JLabel texto3 = new JLabel();
    //texto3.setText("Digite numero: ");
    texto3.setForeground(Color.red);
    texto3.setBounds(160,240,200, 60);
    texto3.setFont(new Font("ARIAL", Font.ITALIC,20));
    panel.add(texto3);
    
    
    JButton boton2 = new JButton();
    boton2.setText("Restar");
    boton2.setFont(new Font("ARIAL", Font.ITALIC,20));
    boton2.setBounds(250,200, 100, 40);
    panel.add(boton2);
    
    ActionListener oyente = new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e) {
            
            if(e.getSource()== boton1){
               String rtasuma1 = caja1.getText();
               String rtasuma2 = caja2.getText();
               
               int n1 = Integer.parseInt(rtasuma1);
               int n2 = Integer.parseInt(rtasuma2);
               
               int sumatotal = n1+n2;
               
               String rtasumatotal1 = String.valueOf(sumatotal);
               setVisible(false);
               ventana2 venta2 = new ventana2(rtasumatotal1);
               venta2.setVisible(true);
               //texto3.setText("RTA: "+rtasumatotal1);
               
                
            }
            
            
            if(e.getSource()== boton2){
               String rtaresta1 = caja1.getText();
               String rtaresta2 = caja2.getText();
               
               int n1 = Integer.parseInt(rtaresta1);
               int n2 = Integer.parseInt(rtaresta2);
               
               int restatotal = n1-n2;
               
               String restatotal1 = String.valueOf(restatotal);
               texto3.setText("RTA: "+restatotal1);
               
                
            }
            
        }
        
    };
    boton1.addActionListener(oyente);
    boton2.addActionListener(oyente);
    
    
    }
}
