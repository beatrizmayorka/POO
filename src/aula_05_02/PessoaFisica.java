package aula_05_02;

public class PessoaFisica {
	String CPF;

	public PessoaFisica(String c) {
		 CPF = c;
	}

		public void VerificaInformacao() {
		System.out.println("Informacao de Pessoa Física:");
		System.out.println("CPF: " + this.CPF + " ");
		System.out.println();
		
	}
}