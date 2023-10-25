package co.edu.unbosque.view;

import javax.swing.JButton;
import javax.swing.JFrame;

import co.edu.unbosque.controller.Controller;

public class VentanaPrincipal extends JFrame {
    private JButton btnLoteria;
    private JButton btnSuperastro;
    private JButton btnBaloto;
    private JButton btnBetPlay;
    private JButton btnChance;

    public VentanaPrincipal(Controller c) {
        setSize(1000, 700);
        setTitle("Ventana Principal");
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);

        crearComponentesVentanaPrincipal();
        
    }

    public void crearComponentesVentanaPrincipal() {
        btnLoteria = new JButton("Lotería");
        btnSuperastro = new JButton("Superastro");
        btnBaloto = new JButton("Baloto");
        btnBetPlay = new JButton("BetPlay");
        btnChance = new JButton("Chance");

        btnLoteria.setBounds(250, 250, 200, 100);
        btnSuperastro.setBounds(550, 250, 200, 100);
        btnBaloto.setBounds(250, 400, 200, 100);
        btnBetPlay.setBounds(550, 400, 200, 100);
        btnChance.setBounds(420, 40, 200, 100);

        add(btnLoteria);
        add(btnSuperastro);
        add(btnBaloto);
        add(btnBetPlay);
        add(btnChance);
    }

   
    public JButton getBtnLoteria() {
        return btnLoteria;
    }

    public JButton getBtnSuperastro() {
        return btnSuperastro;
    }

    public JButton getBtnBaloto() {
        return btnBaloto;
    }

    public JButton getBtnBetPlay() {
        return btnBetPlay;
    }

    public void setBtnLoteria(JButton btnLoteria) {
        this.btnLoteria = btnLoteria;
    }

    public void setBtnSuperastro(JButton btnSuperastro) {
        this.btnSuperastro = btnSuperastro;
    }

    public void setBtnBaloto(JButton btnBaloto) {
        this.btnBaloto = btnBaloto;
    }

    public void setBtnBetPlay(JButton btnBetPlay) {
        this.btnBetPlay = btnBetPlay;
    }

	public JButton getBtnChance() {
		return btnChance;
	}

	public void setBtnChance(JButton btnChance) {
		this.btnChance = btnChance;
	}
    
}
