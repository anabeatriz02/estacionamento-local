package br.com.estacionamento.model;

import java.time.LocalTime;

public class Vaga {

	private String numeroVaga;
	private Modalidade tipoDeVaga; // Moto | Passeio | Utilitário
	private boolean statusVaga;
	private double valorHora;
	private double valorHoraAdicional;
	private LocalTime tempoTolerancia;

	public String getNumeroVaga() {
		return numeroVaga;
	}

	public void setNumeroVaga(String numeroVaga) {
		this.numeroVaga = numeroVaga;
	}

	public Modalidade getTipoDeVaga() {
		return tipoDeVaga;
	}

	public void setTipoDeVaga(Modalidade tipoDeVaga) {
		this.tipoDeVaga = tipoDeVaga;
	}

	public boolean isStatusVaga() {
		return this.statusVaga;
	}

	public void setStatusVaga(boolean statusVaga) {
		this.statusVaga = statusVaga;
	}

	public double getValorHora() {
		return valorHora;
	}

	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}

	public double getValorHoraAdicional() {
		return valorHoraAdicional;
	}

	public void setValorHoraAdicional(double valorHoraAdicional) {
		this.valorHoraAdicional = valorHoraAdicional;
	}

	public LocalTime getTempoTolerancia() {
		return tempoTolerancia;
	}

	public void setTempoTolerancia(LocalTime tempoTolerancia) {
		this.tempoTolerancia = tempoTolerancia;
	}

}

