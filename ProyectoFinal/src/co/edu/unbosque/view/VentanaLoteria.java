package co.edu.unbosque.view;

import javax.swing.JButton;
import javax.swing.JFrame;

import co.edu.unbosque.controller.Controller;

public class VentanaLoteria extends JFrame {
    private JButton btnSeleccionarNumeros;

    public VentanaLoteria(Controller c) {
        setTitle("Lotería");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        

     
    }
}
