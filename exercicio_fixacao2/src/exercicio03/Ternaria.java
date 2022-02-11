package exercicio03;

public class Ternaria {

	public static void main(String[] args) {
		
		double preco = 34.5;
		double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;//se true = 0.1 / se false = 0.05
		
		System.out.println(desconto);

	}

}
