package br.com.estacionamento.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Movimento {

	private String codigo;
	private String placa;
	private String modelo;
	private Veiculo veiculo;
	private double valorPago;
	private String tempo;
	
	private String dataEntrada = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
	private String horaEntrada = LocalDateTime.now().format(DateTimeFormatter.ofPattern("HH:mm"));
	private String dataSaida = null;
	private String horaSaida = null;
	
	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getTempo() {
		return tempo;
	}

	public void setTempo(String vetorVeiculo) {
		this.tempo = vetorVeiculo;
	}

	public String getDataEntrada() {
		return dataEntrada;
	}

	public void setDataEntrada(String localDate) {
		this.dataEntrada = localDate;
	}

	public String getHoraEntrada() {
		return horaEntrada;
	}

	public void setHoraEntrada(String horaEntrada) {
		this.horaEntrada = horaEntrada;
	}

	public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}

	public String getDataSaida() {
		return dataSaida;
	}

	public void setDataSaida(String dataSaida) {
		this.dataSaida = dataSaida;
	}

	public String getHoraSaida() {
		return horaSaida;
	}

	public void setHoraSaida(String horaSaida) {
		this.horaSaida = horaSaida;
	}

	public double getValorPago() {
		return valorPago;
	}

	public void setValorPago(double valorPago) {
		this.valorPago = valorPago;
	}
	
	public String toStringSalvar() {
		return codigo + ";" + placa + ";" + modelo + ";" + dataEntrada + ";" + horaEntrada + "dataSaida" + ";" + "horaSaida" + ";" + 0 + ";" + 0;
	}

}
