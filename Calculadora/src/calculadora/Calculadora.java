package calculadora;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculadora extends JFrame implements ActionListener {
    private JTextField pantalla;
    private JButton[] botonesNumericos;
    private JButton botonSuma, botonResta, botonMultiplicacion, botonDivision, botonIgual, botonLimpiar;
    private double primerNumero, segundoNumero;
    private String operador;

    public Calculadora() {
        // Configurar el marco de la calculadora
        setTitle("Calculadora");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 400);
        setResizable(false);
        setLocationRelativeTo(null);
        setLayout(null); // Usar un layout nulo para posicionar manualmente los componentes

        // Crear el campo de texto para la pantalla
        pantalla = new JTextField();
        pantalla.setBounds(10, 10, 280, 50);
        pantalla.setFont(new Font("Arial", Font.PLAIN, 20));
        pantalla.setEditable(false);
        add(pantalla);

        // Crear los botones numéricos
        botonesNumericos = new JButton[10];
        for (int i = 0; i < 10; i++) {
            botonesNumericos[i] = new JButton(String.valueOf(i));
            botonesNumericos[i].setFont(new Font("Arial", Font.PLAIN, 20));
            botonesNumericos[i].addActionListener(this);
        }

        // Posicionar los botones numéricos en la ventana
        int fila = 0;
        int columna = 0;
        for (int i = 9; i >= 0; i--) {
            botonesNumericos[i].setBounds(10 + columna * 70, 70 + fila * 70, 70, 70);
            add(botonesNumericos[i]);
            columna++;
            if (columna > 2) {
                columna = 0;
                fila++;
            }
        }

        // Crear los botones de operaciones
        botonSuma = crearBotonOperacion("+", 230, 70);
        botonResta = crearBotonOperacion("-", 230, 140);
        botonMultiplicacion = crearBotonOperacion("*", 230, 210);
        botonDivision = crearBotonOperacion("/", 230, 280);
        botonIgual = crearBotonOperacion("=", 150, 280);
        botonLimpiar = crearBotonOperacion("C", 70, 280);

        setVisible(true);
    }

    private JButton crearBotonOperacion(String texto, int x, int y) {
        JButton boton = new JButton(texto);
        boton.setFont(new Font("Arial", Font.PLAIN, 20));
        boton.setBounds(x, y, 70, 70);
        boton.addActionListener(this);
        add(boton);
        return boton;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object fuente = e.getSource();

        if (fuente instanceof JButton) {
            JButton boton = (JButton) fuente;
            String textoBoton = boton.getText();

            if (textoBoton.matches("[0-9]")) {
                // Si se presionó un botón numérico
                pantalla.setText(pantalla.getText() + textoBoton);
            } else if (textoBoton.matches("[+\\-*/]")) {
                // Si se presionó un botón de operación
                primerNumero = Double.parseDouble(pantalla.getText());
                operador = textoBoton;
                pantalla.setText("");
            } else if (textoBoton.equals("=")) {
                // Si se presionó el botón de igual
                segundoNumero = Double.parseDouble(pantalla.getText());
                double resultado = 0;

                switch (operador) {
                    case "+":
                        resultado = primerNumero + segundoNumero;
                        break;
                    case "-":
                        resultado = primerNumero - segundoNumero;
                        break;
                    case "*":
                        resultado = primerNumero * segundoNumero;
                        break;
                    case "/":
                        resultado = primerNumero / segundoNumero;
                        break;
                }

                pantalla.setText(String.valueOf(resultado));
            } else if (textoBoton.equals("C")) {
                // Si se presionó el botón de limpiar
                pantalla.setText("");
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Calculadora();
            }
        });
    }
}

