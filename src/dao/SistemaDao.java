package dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import br.com.estacionamento.model.Movimento;
import br.com.estacionamento.model.Pessoa;
import br.com.estacionamento.model.Veiculo;
import ui.FrameSistema;

public class SistemaDao {
	
	private static final String Veiculo = null;
	private Movimento movimento;
	private BufferedReader reader;
	private ArrayList<Movimento> veiculo;

	
	public SistemaDao(Movimento movimento) {
		this.movimento = movimento;
	}
	
	public SistemaDao() {
	}

	public Movimento getMovimento() {
		return movimento;
	}
	
	 public void salvar() {

	        Path path = Paths.get("C:/Users/21192891/movimentacao.ds1");

	        try {
	            BufferedWriter writer = Files.newBufferedWriter(path, Charset.forName("ISO-8859-1"),
	                    StandardOpenOption.WRITE, StandardOpenOption.APPEND);

	            writer.write(movimento.toStringSalvar());
	            writer.newLine();
	            writer.close();

	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	 }
	
	 public ArrayList<Movimento> listarVeiculos(){
		 
		 //Obter o caminho do arquivo
		 Path path = Paths.get("C:/Users/21192891/movimentacao.ds1");
		 
		 //criar o buffer para o arquivo
		 try {
			 BufferedReader reader = Files.newBufferedReader(path, Charset.forName("ISO-8859-1"));
			 
			 String linha = reader.readLine();
			 ArrayList<Movimento> componentes = new ArrayList<>();
			 
			 while(linha != null) {
				 String[] vetorVeiculo = linha.split(";");
				 
				 Movimento veiculo = new Movimento();
				 
				 veiculo.setCodigo(vetorVeiculo[0]);
				 veiculo.setPlaca(vetorVeiculo[1]);
				 veiculo.setModelo(vetorVeiculo[2]);
				 veiculo.setDataEntrada(vetorVeiculo[3]);
				 veiculo.setHoraEntrada(vetorVeiculo[4]);
				 veiculo.setDataSaida(vetorVeiculo[5]);
				 veiculo.setHoraSaida(vetorVeiculo[6]);
				 veiculo.setTempo(vetorVeiculo[7]);
				 veiculo.setValorPago(Double.parseDouble(vetorVeiculo[8]));
	
				 componentes.add(veiculo);
				 
				 linha = reader.readLine();
				 
			 }
			 
			 reader.close();
			 return componentes;
			 
			 
		 } catch(Exception e) {
			 System.out.println("Ocorreu um erro na leitura!!!");
			 e.printStackTrace();
		 }
		 return null;
	 }
	 
	 public Movimento buscarVeiculo(String placa) {
		 
	
		 
		//Obter o caminho do arquivo
		 Path path = Paths.get("C:/Users/21192891/movimentacao.ds1");	 
		 
		 //criar o buffer para o arquivo
		 try {
			 BufferedReader reader = Files.newBufferedReader(path, Charset.forName("ISO-8859-1"));
			 
			 String linha = reader.readLine();
			 
			 Movimento movimento = new Movimento();
			 
			 while(linha != null) {
				 String[] vetorVeiculo = linha.split(";");
				 
				 if (vetorVeiculo[1].equals(placa)) {
					 movimento.setCodigo(vetorVeiculo[0]);
					 movimento.setPlaca(vetorVeiculo[1]);
					 movimento.setModelo(vetorVeiculo[2]);
					 movimento.setDataEntrada(vetorVeiculo[3]);
					 movimento.setHoraEntrada(vetorVeiculo[4]);
					 movimento.setDataSaida(vetorVeiculo[5]);
					 movimento.setHoraSaida(vetorVeiculo[6]);
					 movimento.setTempo(vetorVeiculo[7]);
					 movimento.setValorPago(Double.parseDouble(vetorVeiculo[8]));
					
					 return movimento;
				 }
				 

				 linha = reader.readLine();
				
				 
          }
			 reader.close();
			
			 
		 }catch(Exception e) {
			 System.out.println("Ocorreu um erro na leitura!!!");
			 e.printStackTrace();
			 return null;}
		return movimento;		 
	 }
  } 
				 