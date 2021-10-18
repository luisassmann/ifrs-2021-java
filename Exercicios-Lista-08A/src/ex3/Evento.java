package ex3;

import ex3.local.*;
import ex3.pessoas.*;

public class Evento {
	private Banda bandaAbertura;
	private Banda bandaPrincipal;
	
	private Cidade cidade;
	
	private Organizador organizador;
	
	private String data;
	private int numeroIngressos;
	private double valorIngresso;
	
	public Evento(Banda bandaAbertura, Banda bandaPrincipal, Cidade cidade, Organizador organizador, String data,
			int numeroIngressos, double valorIngresso) {
		super();
		this.bandaAbertura = bandaAbertura;
		this.bandaPrincipal = bandaPrincipal;
		this.cidade = cidade;
		this.organizador = organizador;
		this.data = data;
		this.numeroIngressos = numeroIngressos;
		this.valorIngresso = valorIngresso;
	}

	public Banda getBandaAbertura() {
		return bandaAbertura;
	}

	public void setBandaAbertura(Banda bandaAbertura) {
		this.bandaAbertura = bandaAbertura;
	}

	public Banda getBandaPrincipal() {
		return bandaPrincipal;
	}

	public void setBandaPrincipal(Banda bandaPrincipal) {
		this.bandaPrincipal = bandaPrincipal;
	}

	public Cidade getCidade() {
		return cidade;
	}

	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}

	public Organizador getOrganizador() {
		return organizador;
	}

	public void setOrganizador(Organizador organizador) {
		this.organizador = organizador;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public int getNumeroIngressos() {
		return numeroIngressos;
	}

	public void setNumeroIngressos(int numeroIngressos) {
		this.numeroIngressos = numeroIngressos;
	}

	public double getValorIngresso() {
		return valorIngresso;
	}

	public void setValorIngresso(double valorIngresso) {
		this.valorIngresso = valorIngresso;
	}
	
	
	
}
