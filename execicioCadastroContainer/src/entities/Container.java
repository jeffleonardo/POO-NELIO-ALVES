package entities;

public class Container {
	
	private String empresa;
	private String numero;
	private String missao;
	private double peso;
	
	public Container() {
		
	}

	public Container(String empresa, String numero, String missao, double peso) {
		super();
		this.empresa = empresa;
		this.numero = numero;
		this.missao = missao;
		this.peso = peso;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getMissao() {
		return missao;
	}

	public void setMissao(String missao) {
		this.missao = missao;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	@Override
	public String toString() {
		return "Empresa: " + empresa.toUpperCase() + "\n" +
			   "Container: " + numero.toUpperCase()  + "\n" +
			   "Missao: " + missao.toUpperCase()  + "\n" +
			   "Tara: " + String.format("%.2f", peso);
	}
}