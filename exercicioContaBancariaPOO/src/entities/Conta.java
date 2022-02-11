package entities;

public class Conta {

	private String nome;
	private int numConta;
	private double saldo;
	
	public Conta() {
		
	}
	
	public Conta(String nome, int numConta) {
		this.nome = nome;
		this.numConta = numConta;
	}
	
	public Conta(String nome, int numConta, double depositoInicial) {
		super();
		this.nome = nome;
		this.numConta = numConta;
		depositar(depositoInicial);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumConta() {
		return numConta;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public void depositar(double valor) {
		saldo += valor;
	}	
	
	public void sacar(double valor) {
		saldo -= valor + 5.00;		
	}

	@Override
	public String toString() {
		return   "nome: " + nome + "\n" 
			    + "conta: " + numConta + "\n"
			    + "saldo: $ " + String.format("%.2f", saldo); 
	}
}
