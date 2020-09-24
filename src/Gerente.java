// Gerente é um funcionário, Gerente herda da Classe Funcionario
// assina o contrato 'Autencicavel'´
// É um 'Autenticavel'

public class Gerente extends Funcionario implements Autenticavel {

	private int senha;

	// Reescrita do método
	public double getBonificacao() {
		System.out.println("Chamando o método de bonificação do GERENTE");
		return super.getSalario();
		// "salario" vem da classe super, então não uso this
	}

	@Override
	public void setSenha(int senha) {
		this.senha = senha;

	}

	@Override
	public boolean autentica(int senha) {
		if (this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}

}
