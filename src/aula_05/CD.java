package aula_05;

public class CD extends Produto {
	String artista;
	int faixa;

	
	public CD(String n, double p, String a, int f) {
		nome = n;
		preco = p;
		artista = a;
		faixa = f;
	}
	
	public void VerificaNomeePreco() {
		
		System.out.println(" --> O CD '" + this.nome + "' de " + this.artista + " possui " + this.faixa + " faixas. "); // Mostra as caracteristicas do CD.
		System.out.println(" --> Preco do CD: " + this.preco + " "); // Mostra o preco do CD.
		System.out.println(" --> Portanto o CD é: ");
		
		if (this.ehCaro()) {
			System.out.println(" --- Caro --- ");
		} else {
			System.out.println(" --- Barato --- ");
		}
		
		System.out.println(); // Pula uma linha.	
	} 
}