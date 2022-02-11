
public class TesteGetSet {

	public static void main(String[] args) {
		Conta conta = new Conta(8431, 248189);
		conta.setNumero(1337);		
		conta.deposita(250);		
		System.out.println(conta.getNumero());
		System.out.println(conta.getSaldo());
		
		Cliente paulo = new Cliente();
		Cliente jefferson = new Cliente();
		
		paulo.setNome("paulo silveira");
		jefferson.setNome("jefferson leonardo");
		
		conta.setTitular(paulo);
		conta.getTitular().setProfissao("programador");
		
		conta.setTitular(jefferson);
		conta.getTitular().setProfissao("Desenvolvedor");
		
		String nomeTitular = conta.getTitular().getNome();
		
		System.out.println(jefferson.getNome());
		System.out.println(paulo.getNome());
	}
}
