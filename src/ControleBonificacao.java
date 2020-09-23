
public class ControleBonificacao {
	
	private double soma;
	
	// Refer�ncia gen�ria (Polimorfismo)
	// O m�todo espec�fico ser� chamado
	public void registra(Funcionario f) {
		double boni = f.getBonificacao();
		this.soma += boni;
	}
	
	public double getSoma() {
		return soma;
	}
}
