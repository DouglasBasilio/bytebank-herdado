// Funcion�rio � algo abstrato

/*Uma classe abstrata representa um conceito, algo abstrato, 
e o compilador n�o permite instanciar um objeto dessa classe. 
Para instanciar � preciso criar primeiro uma classe filha n�o abstrata.*/

//um m�todo abstrato define apenas a assinatura 
//(visibilidade, retorno, nome do m�todo e par�metros).

public abstract class Funcionario {
	private String nome;
	private String cpf;
	private double salario; 

	// abstract no m�todo, significa que n�o tem um corpo
	// sem implementa��o, a implementa��o vai nas classes Filhos
	public abstract double getBonificacao();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

}
