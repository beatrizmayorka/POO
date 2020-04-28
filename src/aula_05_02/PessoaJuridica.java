package aula_05_02;

public class PessoaJuridica {
	String CNPJ;
	String NomeFantasia;

	public PessoaJuridica(String c, String n) {
		CNPJ = c;
		NomeFantasia = n;
	}

	public void VerificaInformacao() {
		System.out.println("Informacao de Pessoa Juridica:");
		System.out.println("CNPJ: " + this.CNPJ + " e nome fantasia: " + this.NomeFantasia + " ");
		System.out.println();
		
	}
}
