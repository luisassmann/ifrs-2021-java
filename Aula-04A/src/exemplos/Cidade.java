package exemplos;

public class Cidade {
	public String nome;
	public int habitantes;
	public double pib;
	public String estado;
	public String pais;
	
	
	public void informacoes() {
		System.out.println("A cidade é " + nome);
		System.out.println("Essa cidade possui " + habitantes);
		System.out.println("O PIB é em torno de R$" + pib);
		System.out.println("Essa cidade faz parte do Estado de " + estado);
		System.out.println("Pertencendo ao país " + pais);
	}
	
	public void pibPerCapita() {
		double rendaPerCapita = ((double)pib) / habitantes;
		System.out.println("O PIB per capita da cidade de " + nome + " é R$" + rendaPerCapita);
	}
}
