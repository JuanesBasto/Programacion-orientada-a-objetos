/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package graficobr;

import java.awt.Color;
import java.awt.Font;
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
    
    
    public ventana1(){
       //this.setExtendedState(JFrame.MAXIMIZED_BOTH);
    this.setSize(500,500);
    this.setLocationRelativeTo(null);
    this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    //this.setUndecorated(true);
    this.setTitle("Profe");
    
    JPanel panel = new JPanel();
    panel.setBackground(Color.yellow);
    panel.setLayout(null);
    this.add(panel);
    
    JLabel intro = new JLabel();
    intro.setText("Calculadora ");
    intro.setForeground(Color.red);
    intro.setBounds(200,20,200, 60);
    intro.setFont(new Font("ARIAL", Font.ITALIC,30));
    panel.add(intro);
    
    
    JLabel texto1 = new JLabel();
    texto1.setText("Digite numero: ");
    texto1.setForeground(Color.red);
    texto1.setBounds(80,80,200, 60);
    panel.add(texto1);
    
    JTextField caja1 = new JTextField();
    caja1.setBounds(180,80,200, 40);
    panel.add(caja1);
    
    JLabel texto2 = new JLabel();
    texto2.setText("Digite numero: ");
    texto2.setForeground(Color.red);
    texto2.setBounds(80,140,200, 60);
    panel.add(texto2);
    
    
    JTextField caja2 = new JTextField();
    caja2.setBounds(180,140,200, 40);
    caja2.setText("Aqui va un texto");
    caja2.setFont(new Font("ARIAL", Font.ITALIC,20));
    caja2.setBorder(BorderFactory.createLineBorder(Color.RED));
    caja2.setEnabled(true);
    panel.add(caja2);
    
    JButton boton1 = new JButton();
    boton1.setText("Sumar");
    boton1.setFont(new Font("ARIAL", Font.ITALIC,20));
    boton1.setBounds(200,200, 100, 40);
    panel.add(boton1);
    
    
    
    
    
    }
}
