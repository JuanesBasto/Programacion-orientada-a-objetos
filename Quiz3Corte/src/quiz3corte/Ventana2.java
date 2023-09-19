/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quiz3corte;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author basto
 */
public class Ventana2 extends JFrame {

    Ventana2(String tinverso /*, String tinvarreglado*/) {

        JButton volver = new JButton();
        volver.setText("Volver");
        volver.setFont(new Font("ARIAL", Font.ITALIC, 20));
        volver.setBounds(200, 200, 80, 35);
        JPanel pantalla2 = new JPanel();
        pantalla2.add(volver);

        JLabel result = new JLabel();
        result.setText(tinverso);
        result.setBounds(100, 30, 100, 50);

        pantalla2.add(result);

        JLabel inverso = new JLabel();
        //2inverso.setText(tinvarreglado);
        inverso.setBounds(100, 130, 200, 50);

        pantalla2.add(inverso);

    }

}
