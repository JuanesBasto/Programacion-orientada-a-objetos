/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package graficobr.Vista;

import graficobr.Vista.ventana1;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 *
 * @author Virtutienda
 */
public class ventana2 extends JFrame{
    
    
    public ventana2(String rtasumatotal1){
        
    this.setSize(500,500);
    this.setLocationRelativeTo(null);
    this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    //this.setUndecorated(true);
    this.setTitle("Resultado");
    
    JPanel panel = new JPanel();
    panel.setBackground(Color.yellow);
    panel.setLayout(null);
    this.add(panel);
    
    JLabel intro = new JLabel();
    intro.setText("RTA Calculadora ");
    intro.setForeground(Color.red);
    intro.setBounds(130,20,250, 60);
    intro.setFont(new Font("ARIAL", Font.ITALIC,30));
    panel.add(intro);
    
    
    JLabel texto3 = new JLabel();
    texto3.setText("RTA: "+rtasumatotal1);
    texto3.setForeground(Color.red);
    texto3.setBounds(130,80,200, 60);
    texto3.setFont(new Font("ARIAL", Font.ITALIC,20));
    panel.add(texto3);
    
    JButton volver = new JButton();
    volver.setText("Volver");
    volver.setFont(new Font("ARIAL", Font.ITALIC,20));
    volver.setBounds(130, 180,200, 40);
    panel.add(volver);
    
    ActionListener oyente = new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e) {
            
            if(e.getSource()== volver){
              
                ventana1 venta1 = new ventana1();
                setVisible(false);
                venta1.setVisible(true);
                
            }
            
            
            
            
        }
        
    };
    volver.addActionListener(oyente);
    
    
    
    }
    
   
    
}
