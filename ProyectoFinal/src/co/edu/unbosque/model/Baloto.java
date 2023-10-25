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

    
    public Baloto() {
		// TODO Auto-generated constructor stub
	}
    /*
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
    */
    
    public Baloto(int[] numerosBaloto, int numeroSuperBalota, boolean boletoJugado, String fechaSorteo,
			int[] numerosGanadores, double montoPremio, double cantidadApostada, String identificadorBoleto) {
		super();
		this.numerosBaloto = numerosBaloto;
		this.numeroSuperBalota = numeroSuperBalota;
		this.boletoJugado = boletoJugado;
		this.fechaSorteo = fechaSorteo;
		this.numerosGanadores = numerosGanadores;
		this.montoPremio = montoPremio;
		this.cantidadApostada = cantidadApostada;
		this.identificadorBoleto = identificadorBoleto;
	}



	@Override
	public String toString() {
		return "Baloto [numerosBaloto=" + Arrays.toString(numerosBaloto) + ", numeroSuperBalota=" + numeroSuperBalota
				+ ", boletoJugado=" + boletoJugado + ", fechaSorteo=" + fechaSorteo + ", numerosGanadores="
				+ Arrays.toString(numerosGanadores) + ", montoPremio=" + montoPremio + ", cantidadApostada="
				+ cantidadApostada + ", identificadorBoleto=" + identificadorBoleto + "]";
	}

	public int[] getNumerosBaloto() {
		return numerosBaloto;
	}

	public void setNumerosBaloto(int[] numerosBaloto) {
		this.numerosBaloto = numerosBaloto;
	}

	public int getNumeroSuperBalota() {
		return numeroSuperBalota;
	}

	public void setNumeroSuperBalota(int numeroSuperBalota) {
		this.numeroSuperBalota = numeroSuperBalota;
	}

	public boolean isBoletoJugado() {
		return boletoJugado;
	}

	public void setBoletoJugado(boolean boletoJugado) {
		this.boletoJugado = boletoJugado;
	}

	public String getFechaSorteo() {
		return fechaSorteo;
	}

	public void setFechaSorteo(String fechaSorteo) {
		this.fechaSorteo = fechaSorteo;
	}

	public int[] getNumerosGanadores() {
		return numerosGanadores;
	}

	public void setNumerosGanadores(int[] numerosGanadores) {
		this.numerosGanadores = numerosGanadores;
	}

	public double getMontoPremio() {
		return montoPremio;
	}

	public void setMontoPremio(double montoPremio) {
		this.montoPremio = montoPremio;
	}

	public double getCantidadApostada() {
		return cantidadApostada;
	}

	public void setCantidadApostada(double cantidadApostada) {
		this.cantidadApostada = cantidadApostada;
	}

	public String getIdentificadorBoleto() {
		return identificadorBoleto;
	}

	public void setIdentificadorBoleto(String identificadorBoleto) {
		this.identificadorBoleto = identificadorBoleto;
	}

	private String generarIdentificadorUnico() {
       
        return "ID-XXXXXX"; 
    }
}
