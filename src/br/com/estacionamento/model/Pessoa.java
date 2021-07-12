package br.com.estacionamento.model;

public class Pessoa {

	private String codigo;
	private String nome;
	private String rg;
	private String email;
	private String telefone;
	
	public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	@Override
	public String toString() {
		return codigo +  ";" + nome + ";" + rg  + ";" + email + ";"
				+ ";" + telefone;
	}

	public void setPlaca(String upperCase) {
		// TODO Auto-generated method stub
		
	}

	public void setModelo(String upperCase) {
		// TODO Auto-generated method stub
		
	}

}

