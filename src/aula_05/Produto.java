package aula_05;

public class Produto {
	String nome;
	double preco;
	double desconto;
	
	public boolean ehCaro() {
		return (preco > 100);

	}
}