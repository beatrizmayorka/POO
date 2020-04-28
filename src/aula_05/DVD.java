package aula_05;

public class DVD extends Produto {
	String artista;
	int duracao;

	public DVD(String n, double p, String a, int d) {
		nome = n;
		preco = p;
		artista = a;
		duracao = d;
	}
			
	public void VerificaNomeePreco() {
		System.out.println(" --> O DVD '" + this.nome + "' do " + this.artista + " possui " + this.duracao + " minutos de duracao. ");
		System.out.println(" --> Preco do DVD: " + this.preco + " "); // Mostra o preco do DVD.
		System.out.println(" --> Portanto o DVD é: ");
			
			if (this.ehCaro()) {
				System.out.println(" --- Caro --- ");
			} else {
				System.out.println(" --- Barato --- ");
			}
			
		
		System.out.println(); // Vai pular uma linha. 
	}

}
