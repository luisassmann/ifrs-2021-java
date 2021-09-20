package ex1;

import java.util.Scanner;

import jogo.*;
import jogo.equipamentos.*;
import jogo.pessoas.*;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		// Bola, Campo e Juiz --------------------------------------
		
		Bola bola = new Bola();
		
		System.out.print("Marca da Bola: ");
		bola.setMarca(leitor.nextLine());
		
		
		Campo campo = new Campo();
		
		System.out.print("Largura do Campo: ");
		campo.setLargura(Double.parseDouble(leitor.nextLine()));
		
		System.out.print("Comprimento do Campo: ");
		campo.setComprimento(Double.parseDouble(leitor.nextLine()));
		
		
		Juiz juiz = new Juiz();
		System.out.print("Nome do Juiz: ");
		juiz.setNome(leitor.nextLine());
		
		
		// Equipe 1 ------------------------------------------------
		System.out.println("\nEquipe 1:");
		
		Equipe time1 = new Equipe();
		
		Jogador goleiro = new Jogador();
		
		System.out.print("Goleiro: ");
		goleiro.setNome(leitor.nextLine());
		time1.setGoleiro(goleiro);
		
		Jogador zagueiro = new Jogador();
		
		System.out.print("Zagueiro: ");
		zagueiro.setNome(leitor.nextLine());
		time1.setZagueiro(zagueiro);
		
		Jogador alaDireito = new Jogador();
		
		System.out.print("Ala Direito: ");
		alaDireito.setNome(leitor.nextLine());
		time1.setAlaDireito(alaDireito);
		
		Jogador alaEsquerdo = new Jogador();
		
		System.out.print("Ala Esquerdo: ");
		alaEsquerdo.setNome(leitor.nextLine());
		time1.setAlaEsquerdo(alaEsquerdo);
		
		Jogador atacante = new Jogador();
		
		System.out.print("Atacante: ");
		atacante.setNome(leitor.nextLine());
		time1.setAtacante(atacante);
		
		Treinador treinador = new Treinador();
		
		System.out.print("Treinador: ");
		treinador.setNome(leitor.nextLine());
		time1.setTreinador(treinador);
		
		// Equipe 2 ------------------------------------------------
		System.out.println("\nEquipe 2:");
		
		Equipe time2 = new Equipe();
		
		Jogador goleiro2 = new Jogador();
		
		System.out.print("Goleiro: ");
		goleiro2.setNome(leitor.nextLine());
		time2.setGoleiro(goleiro2);
		
		Jogador zagueiro2 = new Jogador();
		
		System.out.print("Zagueiro: ");
		zagueiro2.setNome(leitor.nextLine());
		time2.setZagueiro(zagueiro2);
		
		Jogador alaDireito2 = new Jogador();
		
		System.out.print("Ala Direito: ");
		alaDireito2.setNome(leitor.nextLine());
		time2.setAlaDireito(alaDireito2);
		
		Jogador alaEsquerdo2 = new Jogador();
		
		System.out.print("Ala Esquerdo: ");
		alaEsquerdo2.setNome(leitor.nextLine());
		time2.setAlaEsquerdo(alaEsquerdo2);
		
		Jogador atacante2 = new Jogador();
		
		System.out.print("Atacante: ");
		atacante2.setNome(leitor.nextLine());
		time2.setAtacante(atacante2);
		
		Treinador treinador2 = new Treinador();
		
		System.out.print("Treinador: ");
		treinador2.setNome(leitor.nextLine());
		time2.setTreinador(treinador2);
		
		leitor.close();
		
		
		
		Futebol fut = new Futebol();
		
		fut.setBola(bola);
		fut.setCampo(campo);
		
		fut.setJuiz(juiz);
		
		fut.setEquipe1(time1);
		fut.setEquipe2(time2);
		
		// OutPut ----------------------------------------------
		
		System.out.println("\n\nJogo de Futebol ⚽\n\n");
		
		System.out.println("Escalação Equipe 1:\n");
		
		System.out.println("Goleiro: " + fut.getEquipe1().getGoleiro().getNome());
		System.out.println("Zagueiro: " + fut.getEquipe1().getZagueiro().getNome());
		System.out.println("Ala Direito: " + fut.getEquipe1().getAlaDireito().getNome());
		System.out.println("Ala Esquerdo: " + fut.getEquipe1().getAlaEsquerdo().getNome());
		System.out.println("Atacante: " + fut.getEquipe1().getAtacante().getNome());
		
		System.out.println("\nTreinador: " + fut.getEquipe1().getTreinador().getNome());
		
		
		System.out.println("\n\nEscalação Equipe 2:\n");
		
		System.out.println("Goleiro: " + fut.getEquipe2().getGoleiro().getNome());
		System.out.println("Zagueiro: " + fut.getEquipe2().getZagueiro().getNome());
		System.out.println("Ala Direito: " + fut.getEquipe2().getAlaDireito().getNome());
		System.out.println("Ala Esquerdo: " + fut.getEquipe2().getAlaEsquerdo().getNome());
		System.out.println("Atacante: " + fut.getEquipe2().getAtacante().getNome());
		
		System.out.println("\nTreinador: " + fut.getEquipe2().getTreinador().getNome());
		
		
		System.out.println("\n\nJuiz: " + fut.getJuiz().getNome());
		
		System.out.println("\n\nCampo: altura=" + fut.getCampo().getLargura() + " comp=" + fut.getCampo().getComprimento());
		
		System.out.println("\n\nBola: " + fut.getBola().getMarca());
	}

}
