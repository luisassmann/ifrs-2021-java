package aula;

public class TestePessoa {

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa();
		p1.nascer();
		p1.falar("Olá");
		
		int i = p1.getIdade();
		System.out.println(i);
		
		Pessoa p2 = new Pessoa();
		p2.nome = "Leia";
		p2.idade = 20;
		p2.falar("Vamos lá!");
		
		Pessoa p3 = new Pessoa();
		p3.nome = "Mark";
		p3.setIdade(30);
		System.out.println(p3.getIdade());
		
		
		p1.falar("Olá, bom dia.");
		
	}

}
