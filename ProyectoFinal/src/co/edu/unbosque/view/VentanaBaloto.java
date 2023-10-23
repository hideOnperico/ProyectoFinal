package co.edu.unbosque.view;

import javax.swing.JFrame;

import co.edu.unbosque.controller.Controller;

public class VentanaBaloto extends JFrame {
	
	public VentanaBaloto(Controller c) {
	    setSize(1000, 700);
	    setTitle("Ventana Baloto");
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);
	}
	
	

}
