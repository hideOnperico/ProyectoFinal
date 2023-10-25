package co.edu.unbosque.model;

import java.util.Arrays;

public class Baloto {
    private int[] numerosBaloto;
    private int numeroSuperBalota; 
    private boolean boletoJugado; 
    private String fechaSorteo; 
    private int[] numerosGanadores;
    private double montoPremio; 
    private double cantidadApostada; 
    private String identificadorBoleto; 

    
    public Baloto(int[] numerosBaloto, int numeroSuperBalota, String fechaSorteo) {
        this.numerosBaloto = Arrays.copyOf(numerosBaloto, numerosBaloto.length);
        this.numeroSuperBalota = numeroSuperBalota;
        this.fechaSorteo = fechaSorteo;
        this.boletoJugado = false;
        this.numerosGanadores = new int[6]; 
        this.montoPremio = 0.0; 
        this.cantidadApostada = 0.0; 
        this.identificadorBoleto = generarIdentificadorUnico();
    }

    
    private String generarIdentificadorUnico() {
       
        return "ID-XXXXXX"; 
    }
}
