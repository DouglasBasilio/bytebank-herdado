	// Uma iterface não pode ter nada concreto,
	// então eu tiro a variável 'senha'
	// deixamos apenas as assinaturas dos métodos

// defini um contrato (Autenticavel)
	// quem assina esse contrato, precisa implementar
		// método 'setSenha'
		// métido 'autentica'

// Utilizando interfaces 
// temos uma outra forma de conseguir polimorfismo sem herança.
// Pois no Java não temos herança múltipla

public abstract interface Autenticavel {
	
	// private int senha;

	public abstract void setSenha(int senha);

	public abstract boolean autentica(int senha);

}
