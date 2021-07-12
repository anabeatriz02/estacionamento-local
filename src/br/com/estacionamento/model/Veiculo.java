package br.com.estacionamento.model;

public class Veiculo {

	
	private String cor;
	private Modalidade tipo;
	private Sistema cliente;

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public Modalidade getTipo() {
		return tipo;
	}

	public void setTipo(Modalidade tipo) {
		this.tipo = tipo;
	}

	public Sistema getCliente() {
		return cliente;
	}

	public void setCliente(Sistema cliente) {
		this.cliente = cliente;
	}

}

