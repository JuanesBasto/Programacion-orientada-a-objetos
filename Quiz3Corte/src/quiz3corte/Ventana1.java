/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quiz3corte;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author basto
 */
public class Ventana1 extends JFrame {

    String textocaja1;
    String textocaja2;
    JPanel panel = new JPanel();

    Ventana1() {
        this.setSize(500, 500);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("Programa");
        panel.setBackground(Color.cyan);

        panel.setLayout(null);
        this.add(panel);

        JLabel text1 = new JLabel();
        text1.setText("Digite un numero");
        text1.setForeground(Color.red);
        text1.setBounds(100, 30, 100, 50);
        panel.add(text1);

        JTextField caja1 = new JTextField();
        caja1.setBounds(230, 30, 100, 50);
        caja1.setText("N digitos");
        panel.add(caja1);

        JLabel text2 = new JLabel();
        text2.setText(" Digite un numero");
        text2.setForeground(Color.red);
        text2.setBounds(100, 130, 200, 50);
        panel.add(text2);

        JTextField caja2 = new JTextField();
        caja2.setBounds(230, 130, 100, 50);
        caja2.setText("1 digito");
        panel.add(caja2);

        JButton boton1 = new JButton();
        boton1.setBounds(200, 200, 80, 35);
        boton1.setText("Enviar");
        panel.add(boton1);

        JLabel imagen = new JLabel();
        ImageIcon icon = new ImageIcon("Users/basto/Pictures/The_divine_femenine.jpg");
        imagen.setIcon(icon);
        imagen.setBounds(200, 300, 200, 200);
        panel.add(imagen);

        ActionListener click = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                if (e.getSource() == boton1) {
                    textocaja1 = caja1.getText();
                    textocaja2 = caja2.getText();

                    int texto1 = Integer.parseInt(textocaja1);
                    int texto2 = Integer.parseInt(textocaja2);

                    String tinverso = inverso(textocaja1);
                    //String tinversoarreglado = arreglado(texto1, texto2);

                    int textinverso = Integer.parseInt(tinverso);

                    setVisible(false);
                    Ventana2 pant = new Ventana2(tinverso/*, tinversoarreglado*/);
                }

            }

        };
        boton1.addActionListener(click);

    }

    /*private String arreglado(int texto1, int texto2) {
        int digitos = textocaja1.length();
        String tex2 = String.valueOf(texto2);
        String tex1 = String.valueOf(texto1);

        for (int i = 0; i < digitos; i++) {
            
            
            int posi1 = Integer.parseInt(posi);
            if (posi1==texto2){
                String tinarreglado = tinarreglado+ "1";
            }
            String tinvarreglado = 
            
        }

    }*/

    public String inverso(String textocaja1) {
        int digitos = textocaja1.length();
        char[] temp = new char[digitos];

        for (int i = digitos; i < 1; i--) {
            temp[digitos - i - 1] = textocaja1.charAt(i);
        }
        return String.copyValueOf(temp);
    }

    public void cargarImagen() {
        ImageIcon icon = new ImageIcon("C:\\Users\\basto\\Pictures");
    }
}
