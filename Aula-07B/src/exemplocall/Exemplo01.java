package exemplocall;

public class Exemplo01 {

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa("Luis", 16, "Assmann");
		System.out.println(p1.getNome() + " " + p1.getSobrenome());
		System.out.println(p1.getIdade() + " - " + p1.getDataNascimento());
		
		Pessoa p2 = new Pessoa("Luis", "Assmann", 16);
		System.out.println(p2.getNome() + " " + p2.getSobrenome());
		System.out.println(p2.getIdade() + " - " + p2.getDataNascimento());
		
		Pessoa p3 = new Pessoa();
		System.out.println(p3.getNome() + " " + p3.getSobrenome());
		System.out.println(p3.getIdade() + " - " + p3.getDataNascimento());
	}

}
