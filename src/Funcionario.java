// Funcionário é algo abstrato

/*Uma classe abstrata representa um conceito, algo abstrato, 
e o compilador não permite instanciar um objeto dessa classe. 
Para instanciar é preciso criar primeiro uma classe filha não abstrata.*/

//um método abstrato define apenas a assinatura 
//(visibilidade, retorno, nome do método e parâmetros).

public abstract class Funcionario {
	private String nome;
	private String cpf;
	private double salario; 

	// abstract no método, significa que não tem um corpo
	// sem implementação, a implementação vai nas classes Filhos
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
