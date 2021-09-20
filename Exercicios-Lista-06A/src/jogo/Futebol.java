package jogo;

import jogo.equipamentos.*;
import jogo.pessoas.*;

public class Futebol {
	private Equipe equipe1;
	private Equipe equipe2;
	
	private Juiz juiz;
	
	private Campo campo;
	private Bola bola;
	
	
	public Equipe getEquipe1() {
		return equipe1;
	}
	public void setEquipe1(Equipe equipe1) {
		this.equipe1 = equipe1;
	}
	public Equipe getEquipe2() {
		return equipe2;
	}
	public void setEquipe2(Equipe equipe2) {
		this.equipe2 = equipe2;
	}
	public Juiz getJuiz() {
		return juiz;
	}
	public void setJuiz(Juiz juiz) {
		this.juiz = juiz;
	}
	public Campo getCampo() {
		return campo;
	}
	public void setCampo(Campo campo) {
		this.campo = campo;
	}
	public Bola getBola() {
		return bola;
	}
	public void setBola(Bola bola) {
		this.bola = bola;
	}
	
}
