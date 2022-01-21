package ex3;

public class Gerente implements Funcionario {
	private String nome;
	private String setor;
	private double salario;
	private double porcAumentoMes;
	
	public Gerente(String nome, double salario, String setor) {
		super();
		this.nome = nome;
		this.salario = salario;
		this.setor = setor;
	}

	@Override
	public void imprimir() {
		System.out.println(this.nome + " ------------------");
		System.out.println("Setor: " + this.setor);
		System.out.printf("Salário: R$ %.2f\n", this.salario);
		System.out.println();
	}

	@Override
	public void calculaSalario() {
		System.out.printf("Salário antigo: R$ %.2f\n", this.salario);
		this.salario = this.salario + (this.salario * porcAumentoMes / 100);
		System.out.printf("Salário atual: R$ %.2f\n", this.salario);
		System.out.println();
	}

	@Override
	public void consultaAumento() {
		System.out.println("O aumento mensal de "+this.nome+" é de "+this.porcAumentoMes+"%");
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}

	public double getPorcAumentoMes() {
		return porcAumentoMes;
	}

	public void setPorcAumentoMes(double porcAumentoMes) {
		this.porcAumentoMes = porcAumentoMes;
	}
	
	
	
	
}
