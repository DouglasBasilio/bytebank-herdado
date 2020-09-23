
public class ControleBonificacao {
	
	private double soma;
	
	// Referência genéria (Polimorfismo)
	// O método específico será chamado
	public void registra(Funcionario f) {
		double boni = f.getBonificacao();
		this.soma += boni;
	}
	
	public double getSoma() {
		return soma;
	}
}
