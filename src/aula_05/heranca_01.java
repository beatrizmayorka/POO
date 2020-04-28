package aula_05;

public class heranca_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Livro l1 = new Livro("O Senhor dos Anéis", 50, "J. R. R. Tolkien", 1212);

		l1.VerificaTamanho();
		
		Livro l2 = new Livro("O Pequeno Príncipe", 10, "Antoine De Saint-Exupery", 93);
		l2.VerificaTamanho();
		
		// Início do objeto cd
		
		CD C1 = new CD("Paradise Valley", 29, "John Mayer", 6);

		C1.VerificaNomeePreco();
	
		CD C2 = new CD("El Mal Querer", 120, "Rosalía", 1);

		C2.VerificaNomeePreco();
		
		// Início do objeto dvd
		
		DVD D1 = new DVD("The Frank Sinatra Show", 50, "Frank Sinatra", 60);

		D1.VerificaNomeePreco();
	} 

}