package aula_05_02;

public class heranca_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//
		
		PessoaFisica f1 = new PessoaFisica("123.456.789-12");
		
		f1.VerificaInformacao();
		
		PessoaFisica f2 = new PessoaFisica("321.645.879-21");
		
		f2.VerificaInformacao();
		
		PessoaFisica f3 = new PessoaFisica("231.564.987-53");
		
		f3.VerificaInformacao();
		
		//
		
		PessoaJuridica j1 = new PessoaJuridica("52.893.610/0001-01", "MinhaEmpresa.Ltda");
		
		j1.VerificaInformacao();
		
		PessoaJuridica j2 = new PessoaJuridica("73.966.194/0001-03", "RuralNegocios.Ltda");
		
		j2.VerificaInformacao();
		
		PessoaJuridica j3 = new PessoaJuridica("42.421.945/001-04", "LuxAdvogados.ltda");
		
		j3.VerificaInformacao();
		
	}		
	

}