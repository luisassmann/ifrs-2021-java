package exemplos;

public class Exemplo01 {

	public static void main(String[] args) {
		Pedido p = new Pedido();
		p.numero = 123;
		p.descricao = "Cinco macas e dois cachos de banana";
		
		Cliente c = new Cliente();
		c.nome = "Beltrano";
		c.sobrenome = "Smith";
		c.cpf = "111222333-44";
		c.pedido = p;
		
		System.out.println(c.nome);
		System.out.println(c.sobrenome);
		System.out.println(c.cpf);
		System.out.println(c.pedido.numero);
		System.out.println(c.pedido.descricao);
		
	}
}
