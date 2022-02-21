package entities;


import enuns.Status;

public class Container {
	
	private String empresa;
	private String numero;
	private String missao;
	private double peso;
	private Status status;
	
	public Container() {
		
	}

	public Container(String empresa, String numero, String missao, double peso, Status status) {
		super();
		this.empresa = empresa;
		this.numero = numero;
		this.missao = missao;
		this.peso = peso;
		this.status = status;
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
	
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Empresa: " + empresa.toUpperCase() + "\n" +
			   "Container: " + numero.toUpperCase()  + "\n" +
			   "Missao: " + missao.toUpperCase()  + "\n" +
			   "Tara: " + String.format("%.2f", peso) + "\n" +
			   "Status: " + status;
	}
}
