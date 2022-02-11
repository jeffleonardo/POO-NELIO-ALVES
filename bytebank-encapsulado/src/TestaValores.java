
public class TestaValores {
	
	public static void main(String[] args) {
		Conta conta = new Conta(8431, 248189);
		
		System.out.println("Agencia: " + conta.getAgencia());
		
		Conta conta2 = new Conta(8431, 16549);
		Conta conta3 = new Conta(8431, 5151651);
		
		System.out.println("O total de contas é " + Conta.getTotal());
		
	}
}
