	// Uma iterface n�o pode ter nada concreto,
	// ent�o eu tiro a vari�vel 'senha'
	// deixamos apenas as assinaturas dos m�todos

// defini um contrato (Autenticavel)
	// quem assina esse contrato, precisa implementar
		// m�todo 'setSenha'
		// m�tido 'autentica'

// Utilizando interfaces 
// temos uma outra forma de conseguir polimorfismo sem heran�a.
// Pois no Java n�o temos heran�a m�ltipla

public abstract interface Autenticavel {
	
	// private int senha;

	public abstract void setSenha(int senha);

	public abstract boolean autentica(int senha);

}
