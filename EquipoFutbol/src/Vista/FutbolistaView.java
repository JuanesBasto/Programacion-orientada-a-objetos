package Vista;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class FutbolistaView extends JFrame {

    private JLabel lblNombre;
    private JLabel lblDorsal;
    private JTextField txtNombre;
    private JTextField txtDorsal;
    private JButton btnGuardar;

    public FutbolistaView() {
        //Configuracion del JFrame
        this.setSize(800, 800);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("Futbolista");
        // Configuración del panel
        JPanel panel = new JPanel();
        panel.setLayout(null);
        this.add(panel);

        // Crear los elementos de la interfaz
        lblNombre = new JLabel("Nombre:");
        lblNombre.setBounds(80, 80, 200, 60);
        lblDorsal = new JLabel("Dorsal:");
        lblDorsal.setBounds(80, 160, 200, 60);
        txtNombre = new JTextField();
        txtNombre.setBounds(280,80,200,60);
        txtDorsal = new JTextField();
        txtDorsal.setBounds(280, 160, 200, 60);
        btnGuardar = new JButton("Guardar");

        // Agregar los elementos al panel
        panel.add(lblNombre);
        panel.add(txtNombre);
        panel.add(lblDorsal);
        panel.add(txtDorsal);
        panel.add(btnGuardar);
    }

    // Métodos para obtener los valores ingresados en la interfaz
    public String getNombre() {
        return txtNombre.getText();
    }

    public int getDorsal() {
        int dorsal = 0;
        try {
            dorsal = Integer.parseInt(txtDorsal.getText());
        } catch (NumberFormatException e) {
            // Manejo de error si el valor ingresado no es un número válido
        }
        return dorsal;
    }

    // Método para establecer un listener en el botón de guardar
    public void addGuardarListener(ActionListener listener) {
        btnGuardar.addActionListener(listener);
    }
}
