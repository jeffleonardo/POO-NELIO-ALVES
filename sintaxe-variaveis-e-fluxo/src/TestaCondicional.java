
public class TestaCondicional {

	public static void main(String[] args) {
		System.out.println("Testando condicionais!");
		int idade = 16;
		int quantidadePessoas = 3;
		boolean acompanhado = quantidadePessoas >= 2;
		
		System.out.println("Valor de acompanhado = " + acompanhado);
		if (idade >= 18 || acompanhado) {
			System.out.println("Seja bem vindo!");
		} else {
			System.out.println("Você é menor de idade, portanto, não pode entrar!");
		}
	}
}
