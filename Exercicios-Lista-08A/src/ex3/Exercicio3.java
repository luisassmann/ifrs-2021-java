package ex3;

import ex3.pessoas.*;
import ex3.local.*;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Evento[] eventos = new Evento[3];
		
		// Primeiro Evento ------------------------------------------
		
		// Organizador -----------------
		String nomeOrgE1 = "Marcos";
		String sobrenomeOrgE1 = "Macedo";
		String empresaOrgE1 = "Fieto";
		Organizador orgE1 = new Organizador(nomeOrgE1, sobrenomeOrgE1, empresaOrgE1);

		// Banda de abertura
		Musico[] musBandaAbE1 = new Musico[3];
		
		String nomeGuitarristaE1 = "Marcos";
		String sobrenomeGuitarristaE1 = "Silva";
		String instrumentoGuitarristaE1 = "Guitarra";
		musBandaAbE1[0] = new Musico(nomeGuitarristaE1, sobrenomeGuitarristaE1, instrumentoGuitarristaE1);
		
		String nomeBateristaE1 = "Caio";
		String sobrenomeBateristaE1 = "Gomes";
		String instrumentoBateristaE1 = "Bateria";
		musBandaAbE1[1] = new Musico(nomeBateristaE1, sobrenomeBateristaE1, instrumentoBateristaE1);
		
		String nomeVocalistaE1 = "Mateus";
		String sobrenomeVocalistaE1 = "Lima";
		String instrumentoVocalistaE1 = "Microfone";
		musBandaAbE1[2] = new Musico(nomeVocalistaE1, sobrenomeVocalistaE1, instrumentoVocalistaE1);
		
		Cidade orBanAbE1 = new Cidade("Bom Principio", "RS", "Brasil");
		String estBanAbE1 = "Rock";
		
		Banda bandaAbE1 = new Banda(musBandaAbE1, orBanAbE1, estBanAbE1);
		
		// Banda Principal
		Musico[] musBandaPrE1 = new Musico[3];
		
		String nomeGuitarristaPrE1 = "Julio";
		String sobrenomeGuitarristaPrE1 = "Fraga";
		String instrumentoGuitarristaPrE1 = "Guitarra";
		musBandaPrE1[0] = new Musico(nomeGuitarristaPrE1, sobrenomeGuitarristaPrE1, instrumentoGuitarristaPrE1);
		
		String nomeBateristaPrE1 = "Gildo";
		String sobrenomeBateristaPrE1 = "Freitas";
		String instrumentoBateristaPrE1 = "Bateria";
		musBandaPrE1[1] = new Musico(nomeBateristaPrE1, sobrenomeBateristaPrE1, instrumentoBateristaPrE1);
		
		String nomeVocalistaPrE1 = "Lucas";
		String sobrenomeVocalistaPrE1 = "Martini";
		String instrumentoVocalistaPrE1 = "Microfone";
		musBandaPrE1[2] = new Musico(nomeVocalistaPrE1, sobrenomeVocalistaPrE1, instrumentoVocalistaPrE1);
		
		Cidade orBanPrE1 = new Cidade("Porto Alegre", "RS", "Brasil");
		String estBanPrE1 = "Rock";
		
		Banda bandaPrE1 = new Banda(musBandaPrE1, orBanPrE1, estBanPrE1);
		
		// Evento 1 criacao;
		Cidade cidadeEvento1 = new Cidade("Bom Princípio", "RS", "Brasil");
		String dataEvento1 = "22/12/2021";
		int numIngEvento1 = 120000;
		double valorIngEvento1 = 34.5;
		eventos[0] = new Evento(bandaAbE1, bandaPrE1, cidadeEvento1, orgE1, dataEvento1, numIngEvento1, valorIngEvento1);
		
		
		// Segundo Evento ------------------------------------------

		// Organizador -----------------
		String nomeOrgE2 = "Carlos";
		String sobrenomeOrgE2 = "Castro";
		String empresaOrgE2 = "Arriba";
		Organizador orgE2 = new Organizador(nomeOrgE2, sobrenomeOrgE2, empresaOrgE2);

		// Banda de abertura
		Musico[] musBandaAbE2 = new Musico[3];
		
		String nomeGuitarristaE2 = "Marcos";
		String sobrenomeGuitarristaE2 = "Silva";
		String instrumentoGuitarristaE2 = "Guitarra";
		musBandaAbE2[0] = new Musico(nomeGuitarristaE2, sobrenomeGuitarristaE2, instrumentoGuitarristaE2);
		
		String nomeBateristaE2 = "Caio";
		String sobrenomeBateristaE2 = "Gomes";
		String instrumentoBateristaE2 = "Bateria";
		musBandaAbE2[1] = new Musico(nomeBateristaE2, sobrenomeBateristaE2, instrumentoBateristaE2);
		
		String nomeVocalistaE2 = "Mateus";
		String sobrenomeVocalistaE2 = "Lima";
		String instrumentoVocalistaE2 = "Microfone";
		musBandaAbE2[2] = new Musico(nomeVocalistaE2, sobrenomeVocalistaE2, instrumentoVocalistaE2);
		
		Cidade orBanAbE2 = new Cidade("Bom Principio", "RS", "Brasil");
		String estBanAbE2 = "Rock";
		
		Banda bandaAbE2 = new Banda(musBandaAbE2, orBanAbE2, estBanAbE2);
		
		// Banda Principal
		Musico[] musBandaPrE2 = new Musico[3];
		
		String nomeGuitarristaPrE2 = "Julio";
		String sobrenomeGuitarristaPrE2 = "Fraga";
		String instrumentoGuitarristaPrE2 = "Guitarra";
		musBandaPrE2[0] = new Musico(nomeGuitarristaPrE2, sobrenomeGuitarristaPrE2, instrumentoGuitarristaPrE2);
		
		String nomeBateristaPrE2 = "Gildo";
		String sobrenomeBateristaPrE2 = "Freitas";
		String instrumentoBateristaPrE2 = "Bateria";
		musBandaPrE2[1] = new Musico(nomeBateristaPrE2, sobrenomeBateristaPrE2, instrumentoBateristaPrE2);
		
		String nomeVocalistaPrE2 = "Lucas";
		String sobrenomeVocalistaPrE2 = "Martini";
		String instrumentoVocalistaPrE2 = "Microfone";
		musBandaPrE2[2] = new Musico(nomeVocalistaPrE2, sobrenomeVocalistaPrE2, instrumentoVocalistaPrE2);
		
		Cidade orBanPrE2 = new Cidade("Porto Alegre", "RS", "Brasil");
		String estBanPrE2 = "Rock";
		
		Banda bandaPrE2 = new Banda(musBandaPrE2, orBanPrE2, estBanPrE2);
		
		// Evento 2 criacao;
		Cidade cidadeEvento2 = new Cidade("Feliz", "RS", "Brasil");
		String dataEvento2 = "12/12/2021";
		int numIngEvento2 = 150000;
		double valorIngEvento2 = 112.25;
		eventos[1] = new Evento(bandaAbE2, bandaPrE2, cidadeEvento2, orgE2, dataEvento2, numIngEvento2, valorIngEvento2);
		
		
		// =================== OUTPUT ============================
		System.out.println("=======================================================");
		
		System.out.println("Dados Evento 1");
		System.out.println();
		System.out.println("Organizador: " + eventos[0].getOrganizador().getNome());
		System.out.println("Empresa: " + eventos[0].getOrganizador().getEmpresa());
		System.out.println();
		System.out.println("Cidade: " + eventos[0].getCidade().getNome());
		System.out.println();
		System.out.println("Banda de Abertura: " + eventos[0].getBandaAbertura().getEstiloMusical());
		System.out.println("Musicos¬");
		for (Musico m : eventos[0].getBandaAbertura().getMusicos()) {
			System.out.println(m.getNome() + " - " + m.getInstrumento());
		}
		System.out.println();
		System.out.println("Banda Principal: " + eventos[0].getBandaPrincipal().getEstiloMusical());
		System.out.println("Musicos¬");
		for (Musico m : eventos[0].getBandaPrincipal().getMusicos()) {
			System.out.println(m.getNome() + " - " + m.getInstrumento());
		}
		System.out.println();
		System.out.printf("Valor do ingresso: R$ %5.2f", eventos[0].getValorIngresso());
		
		
		System.out.println("\n=======================================================");
		
		
		System.out.println("Dados Evento 2");
		System.out.println();
		System.out.println("Organizador: " + eventos[1].getOrganizador().getNome());
		System.out.println("Empresa: " + eventos[1].getOrganizador().getEmpresa());
		System.out.println();
		System.out.println("Cidade: " + eventos[1].getCidade().getNome());
		System.out.println();
		System.out.println("Banda de Abertura: " + eventos[1].getBandaAbertura().getEstiloMusical());
		System.out.println("Musicos¬");
		for (Musico m : eventos[1].getBandaAbertura().getMusicos()) {
			System.out.println(m.getNome() + " - " + m.getInstrumento());
		}
		System.out.println();
		System.out.println("Banda Principal: " + eventos[1].getBandaPrincipal().getEstiloMusical());
		System.out.println("Musicos¬");
		for (Musico m : eventos[1].getBandaPrincipal().getMusicos()) {
			System.out.println(m.getNome() + " - " + m.getInstrumento());
		}
		System.out.println();
		System.out.printf("Valor do ingresso: R$ %5.2f", eventos[1].getValorIngresso());
		
		System.out.println("\n=======================================================");
		
	} 

}
