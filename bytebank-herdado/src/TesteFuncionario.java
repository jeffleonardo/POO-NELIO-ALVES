
public class TesteFuncionario {

	public static void main(String[] args) {
		
		Funcionario func1 = new Funcionario();
		func1.setNome("Jefferson Leonardo");
		func1.setCpf("42746851744");
		func1.setSalario(2500.00);
		
		System.out.println(func1.getNome());
		System.out.println(func1.getBonificacao());
		
		//func1.salario = 300.0;
	}

}
