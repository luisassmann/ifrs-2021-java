package jogo;

import jogo.equipamentos.Bola;
import jogo.equipamentos.Campo;
import jogo.pessoas.Jogador;
import jogo.pessoas.Juiz;
import jogo.pessoas.Treinador;

public class ExemploFutebol {

	public static void main(String[] args) {
		
		Bola b = new Bola();
		b.setMarca("Adidas");
		
		Campo c = new Campo();
		c.setComprimento(42);
		c.setLargura(25);
		
		Juiz j = new Juiz();
		j.setNome("Péricles");
		
		Treinador tA = new Treinador();
		tA.setNome("Renato");
		
		Treinador tB = new Treinador();
		tB.setNome("Abel");
		
		
		Jogador gA = new Jogador();
		gA.setNome("Marcelo");
		Jogador zagA = new Jogador();
		zagA.setNome("Pedro");
		Jogador alaDA = new Jogador();
		alaDA.setNome("Leo");
		Jogador alaEA = new Jogador();
		alaEA.setNome("Bruno");
		Jogador atA = new Jogador();
		atA.setNome("Diego");
		
		Jogador gB = new Jogador();
		gB.setNome("Gilmar");
		Jogador zagB = new Jogador();
		zagB.setNome("Victor");
		Jogador alaDB = new Jogador();
		alaDB.setNome("Marcos");
		Jogador alaEB = new Jogador();
		alaEB.setNome("Alex");
		Jogador atB = new Jogador();
		atB.setNome("Leandro");
		
		Equipe timeA = new Equipe();
		timeA.setGoleiro(gA);
		timeA.setZagueiro(zagA);
		timeA.setAlaDireito(alaDA);
		timeA.setAlaEsquerdo(alaEA);
		timeA.setAtacante(atA);
		timeA.setTreinador(tA);
		
		Equipe timeB = new Equipe();
		timeB.setGoleiro(gB);
		timeB.setZagueiro(zagB);
		timeB.setAlaDireito(alaDB);
		timeB.setAlaEsquerdo(alaEB);
		timeB.setAtacante(atB);
		timeB.setTreinador(tB);
		
		Futebol f = new Futebol();
		f.setEquipe1(timeA);
		f.setEquipe2(timeB);
		
		f.setBola(b);
		f.setCampo(c);
		
		f.setJuiz(j);
		
		// Output
		
		System.out.println("Jogo de Futebol\n\n");
		System.out.print("Juiz para o jogo: " + f.getJuiz().getNome() + "\n");
		
		System.out.println("Equipe 1:");
		System.out.println("Goleiro: " + f.getEquipe1().getGoleiro().getNome());
		System.out.println("Zagueiro: " + f.getEquipe1().getZagueiro().getNome());
		System.out.println("Ala Direito: " + f.getEquipe1().getAlaDireito().getNome());
		System.out.println("Ala Esquerdo: " + f.getEquipe1().getAlaEsquerdo().getNome());
		System.out.println("Atacante: " + f.getEquipe1().getAtacante().getNome());
		
		System.out.println("\n\n");
		
		System.out.println("Equipe 2:");
		System.out.println("Goleiro: " + f.getEquipe2().getGoleiro().getNome());
		System.out.println("Zagueiro: " + f.getEquipe2().getZagueiro().getNome());
		System.out.println("Ala Direito: " + f.getEquipe2().getAlaDireito().getNome());
		System.out.println("Ala Esquerdo: " + f.getEquipe2().getAlaEsquerdo().getNome());
		System.out.println("Atacante: " + f.getEquipe2().getAtacante().getNome());
		
		System.out.println("\n\nMarca Patrocinadora: " + f.getBola().getMarca());
		System.out.println("Campo: " + f.getCampo().getComprimento() + "m " + f.getCampo().getLargura() + "m.");
	}

}
