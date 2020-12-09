
public class TesteFuncionario {

	public static void main(String[] args) {
		
		Funcionario andreson = new Funcionario();
		andreson.setNome("Andreson Souza");
		andreson.setCpf("222.222.222-77");
		andreson.setSalario(2600.00);
		
		System.out.println(andreson.getNome());
		System.out.println(andreson.getBonificacao());
	}

}
