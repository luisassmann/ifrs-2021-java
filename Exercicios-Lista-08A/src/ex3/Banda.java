package ex3;

import ex3.pessoas.*;
import ex3.local.*;

public class Banda {
	private Musico[] musicos;
	private Cidade cidadeOrigem;
	
	private String estiloMusical;

	public Banda(Musico[] musicos, Cidade cidadeOrigem, String estiloMusical) {
		super();
		this.musicos = musicos;
		this.cidadeOrigem = cidadeOrigem;
		this.estiloMusical = estiloMusical;
	}

	public Musico[] getMusicos() {
		return musicos;
	}

	public void setMusicos(Musico[] musicos) {
		this.musicos = musicos;
	}

	public Cidade getCidadeOrigem() {
		return cidadeOrigem;
	}

	public void setCidadeOrigem(Cidade cidadeOrigem) {
		this.cidadeOrigem = cidadeOrigem;
	}

	public String getEstiloMusical() {
		return estiloMusical;
	}

	public void setEstiloMusical(String estiloMusical) {
		this.estiloMusical = estiloMusical;
	}
	
	
}
