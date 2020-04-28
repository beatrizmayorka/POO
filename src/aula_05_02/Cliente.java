package aula_05_02;

public class Cliente {
	String nome;
	String endereco;
	String telefone;

	public Cliente(String n, String e, String t) {
		nome = n;
		endereco = e;
		telefone = t;
	}
	

	public void VerificaInformacao() {
		System.out.println("Informacao de Cliente:");
		System.out.println("Nome: " + this.nome + ", endereco: " + this.endereco + " e telefone: " + this.telefone + " ");
		System.out.println();
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cliente c1 = new Cliente("Kiernan Lux", "Rua Lasca de Madeira, 864", "1234-567");
		
		c1.VerificaInformacao();
		
		Cliente c2 = new Cliente("Ana Carolina", "Avenida Mayor, 201", "9876-5432");
		
		c2.VerificaInformacao();
		
		Cliente c3 = new Cliente("Leopoldo Bernardito", "Rua Chapecó, 386", "2314-8954");
		
		c3.VerificaInformacao();

	}
}