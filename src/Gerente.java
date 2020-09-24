// Gerente � um funcion�rio, Gerente herda da Classe Funcionario
public class Gerente extends Funcionario {

	private int senha;

	public void setSenha(int senha) {
		this.senha = senha;
	}

	public boolean autentica(int senha) {
		if (this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}
	
	// Reescrita do m�todo
	public double getBonificacao() {
		System.out.println("Chamando o m�todo de bonifica��o do GERENTE");
		return super.getSalario(); 
		// "salario" vem da classe super, ent�o n�o uso this
	}

}
