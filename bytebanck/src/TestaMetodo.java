
public class TestaMetodo {

	public static void main(String[] args) {
		Conta contaDoJefferson = new Conta();
		contaDoJefferson.saldo = 250;
		contaDoJefferson.deposita(250);		
		System.out.println(contaDoJefferson.saldo);
		
		boolean conseguiuRetirar = contaDoJefferson.saca(250);
		System.out.println(contaDoJefferson.saldo);
		System.out.println(conseguiuRetirar);
		
		Conta contaDaMarcela = new Conta();
		contaDaMarcela.deposita(1000);
		
		if(contaDaMarcela.transfere(300, contaDoJefferson)) {
			System.out.println("Transferencia feita com sucesso");
		}else {
			System.out.println("Saldo insuficiente");
		}
		
		System.out.println(contaDoJefferson.saldo);
		System.out.println(contaDaMarcela.saldo);
	}

}
