package co.edu.unbosque.controller;
import co.edu.unbosque.view.VentanaBaloto;
import co.edu.unbosque.view.VentanaLoteria;
import co.edu.unbosque.view.VentanaSuperastro;
import co.edu.unbosque.view.VentanaBetPlay;
import co.edu.unbosque.view.VentanaChance;
import co.edu.unbosque.view.VentanaPrincipal;

public class Controller {
    private VentanaPrincipal ventanaPrincipal;
    private VentanaBaloto ventanaBaloto;
    private VentanaLoteria ventanaLoteria;
    private VentanaSuperastro ventanaSuperastro;
    private VentanaBetPlay ventanaBetPlay;
    private VentanaChance ventanaChance;

    public Controller() {
        ventanaPrincipal = new VentanaPrincipal(this);
        ventanaBaloto = new VentanaBaloto(this);
        ventanaLoteria = new VentanaLoteria(this);
        ventanaSuperastro = new VentanaSuperastro(this);
        ventanaBetPlay = new VentanaBetPlay(this);
        ventanaChance = new VentanaChance(this);

        implementarLogicaBotonesVentanaPrincipal();
    }

    public void implementarLogicaBotonesVentanaPrincipal() {
        ventanaPrincipal.getBtnBaloto().addActionListener(e -> ventanaBaloto.setVisible(true));
        ventanaPrincipal.getBtnLoteria().addActionListener(e -> ventanaLoteria.setVisible(true));
        ventanaPrincipal.getBtnSuperastro().addActionListener(e -> ventanaSuperastro.setVisible(true));
        ventanaPrincipal.getBtnBetPlay().addActionListener(e -> ventanaBetPlay.setVisible(true));
        ventanaPrincipal.getBtnChance().addActionListener(e -> ventanaChance.setVisible(true));
    }


    public void ejecutar() {
        ventanaPrincipal.setVisible(true);
    }
}
