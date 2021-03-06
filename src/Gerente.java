// Gerente � um funcion�rio, Gerente herda da Classe Funcionario
// assina o contrato 'Autencicavel'�
// � um 'Autenticavel'

public class Gerente extends Funcionario implements Autenticavel {

	private AutenticacaoUtil autenticador;

	public Gerente() {
		this.autenticador = new AutenticacaoUtil();
	}

	// Reescrita do m�todo
	public double getBonificacao() {
		System.out.println("Chamando o m�todo de bonifica��o do GERENTE");
		return super.getSalario();
		// "salario" vem da classe super, ent�o n�o uso this
	}

	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
	}

	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
	}

}
