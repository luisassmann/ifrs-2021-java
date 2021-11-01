package videoaula;

// Cliente eh uma subclasse de pessoa
// Pessoa eh a classe mais GERAL
// Cliente eh a classe mais ESPECIFICA
public class Cliente extends Pessoa {
	public String cpf;
	
	public void imprimirDadosCompletos() {
		System.out.println(this.nome + " " + this.sobrenome);
		System.out.println("CPF: " + this.cpf);
	}
}
