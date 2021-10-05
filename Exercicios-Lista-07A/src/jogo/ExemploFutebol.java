package jogo;

import jogo.equipamentos.Bola;
import jogo.equipamentos.Campo;
import jogo.pessoas.Jogador;
import jogo.pessoas.Juiz;
import jogo.pessoas.Treinador;

public class ExemploFutebol {

	public static void main(String[] args) {
		
		Bola b = new Bola("Adidas");
		Campo c = new Campo(25, 42);
		
		Juiz j = new Juiz("Péricles");
		
		Treinador tA = new Treinador("Renato");
		Treinador tB = new Treinador("Abel");
		
		Jogador gA = new Jogador("Marcelo");
		Jogador zagA = new Jogador("Pedro");
		Jogador alaDA = new Jogador("Leo");
		Jogador alaEA = new Jogador("Bruno");
		Jogador atA = new Jogador("Diego");
		
		Jogador gB = new Jogador("Gilmar");
		Jogador zagB = new Jogador("Victor");
		Jogador alaDB = new Jogador("Marcos");
		Jogador alaEB = new Jogador("Alex");
		Jogador atB = new Jogador("Leandro");

		Equipe timeA = new Equipe(gA, zagA, alaDA, alaEA, atA, tA);
		
		Equipe timeB = new Equipe(gB, zagB, alaDB, alaEB, atB, tB);
		
		Futebol f = new Futebol(timeA, timeB, j, c, b);
		
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
