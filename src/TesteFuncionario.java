
public class TesteFuncionario {

	public static void main(String[] args) {

		Funcionario douglas = new Gerente();
		douglas.setNome("Douglas Basilio");
		douglas.setCpf("391.615.578-46");
		douglas.setSalario(4000.00);
		
		System.out.println(douglas.getNome());
		System.out.println(douglas.getBonificacao());
	}

}
