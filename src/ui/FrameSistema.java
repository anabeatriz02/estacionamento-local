package ui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.UUID;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import br.com.estacionamento.model.Movimento;
import br.com.estacionamento.model.Pessoa;
import br.com.estacionamento.model.Veiculo;
import dao.SistemaDao;
import util.CalcTempo;
import util.Util;

public class FrameSistema {
	
	private static final String sistema = null;
	private static final String Veiculos = null;
	private JLabel labelEntrada; 
	private JLabel labelPlaca;
	private JTextField textPlaca; 
	private JLabel labelModelo;
	private JTextField textModelo;
	private JLabel labelSaída; 
	private JLabel labelPlaca2;
	private JTextField textPlaca2;
	private JLabel labelModelo2;
	private JTextField textModelo2;
	private JLabel labelDataEntrada; 
	private JTextField textDataEntrada; 
	private JLabel labelHoraEntrada;
	private JTextField textHoraEntrada;
	private JLabel labelDataSaída;
	private JTextField textDataSaída;
	private JLabel labelHoraSaída;
	private JTextField textHoraSaída;
	private JLabel labelTempo;
	private JTextField textTempo;
	private JLabel labelValorAPagar;
	private JTextField textValorAPagar;
	private ButtonGroup adc;
	private JButton buttonGravar;
	private JButton buttonGravar2;
	private JButton buttonGravar3;
	private JButton buttonGravar4;
	private JButton buttonBuscar;
	private JScrollPane scrollTable;
	private JTable tabelaSistema; 
	private DefaultTableModel tabelaClientesModelo; 
	
	public void criarTela(){

        Color roxo = new Color(128, 0, 255);
        Color cinza = new Color(255, 255, 255);
        
        JFrame tela = new JFrame();
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tela.setTitle("*SISTEMA*");
        tela.setSize(800, 600);
        tela.getContentPane().setBackground(cinza);
        tela.setLayout(null);
        tela.setResizable(false);
        tela.setLocationRelativeTo(null);
        
        labelEntrada = new JLabel("ENTRADA");
        labelEntrada.setBounds(20, 20, 90, 30);
        labelEntrada.setForeground(roxo);
        labelEntrada.setFont(new Font("Arial", Font.BOLD, 16)); 
        
        labelPlaca = new JLabel("PLACA: ");
        labelPlaca.setBounds(20, 50, 100, 30);
        textPlaca = new JTextField();
        textPlaca.setBounds(20, 80, 200, 30);
        labelPlaca.setForeground(roxo);
        
        labelModelo = new JLabel("MODELO: ");
        labelModelo.setBounds(230, 50, 90, 30);
        textModelo = new JTextField();
        textModelo.setBounds(230, 80, 200, 30);
        labelModelo.setForeground(roxo);
        
        adc = new ButtonGroup();    
        
        buttonGravar = new JButton("ENTRAR");
        buttonGravar.setBounds(440, 80, 190, 30);
        
        labelSaída = new JLabel("SAÍDA");
        labelSaída.setBounds(20, 220, 150, 150); 
        labelSaída.setFont(new Font("Arial", Font.BOLD, 16));
        labelSaída.setForeground(roxo);
        
        labelPlaca2 = new JLabel("PLACA: ");
        labelPlaca2.setBounds(20, 310, 150, 30);
        textPlaca2 = new JTextField();
        textPlaca2.setBounds(20, 340, 150, 30);
        labelPlaca2.setForeground(roxo);
        
        buttonGravar2 = new JButton ("BUSCAR");
        buttonGravar2.setBounds(190, 340, 100, 30);
        
        labelModelo2 = new JLabel("MODELO: ");
        labelModelo2.setBounds(20, 380, 150, 30);
        textModelo2 = new JTextField();
        textModelo2.setBounds(20, 410, 100, 30);
        labelModelo2.setForeground(roxo);
        
        labelDataEntrada = new JLabel("DATA ENTRADA: ");
        labelDataEntrada.setBounds(130, 380, 150, 30);
        textDataEntrada = new JTextField();
        textDataEntrada.setBounds(130, 410, 100, 30);
        labelDataEntrada.setForeground(roxo);
        
        labelHoraEntrada = new JLabel("HORA ENTRADA: ");
        labelHoraEntrada.setBounds(240, 380, 150, 30);
        textHoraEntrada = new JTextField();
        textHoraEntrada.setBounds(240, 410, 100, 30);
        labelHoraEntrada.setForeground(roxo);
        
        labelDataSaída = new JLabel("DATA SAÍDA: ");
        labelDataSaída.setBounds(350, 380, 150, 30);
        textDataSaída = new JTextField();
        textDataSaída.setBounds(350, 410, 100, 30);
        labelDataSaída.setForeground(roxo);
        
        labelHoraSaída = new JLabel("HORA SAÍDA: ");
        labelHoraSaída.setBounds(460, 380, 150, 30);
        textHoraSaída = new JTextField();
        textHoraSaída.setBounds(460, 410, 100, 30);
        labelHoraSaída.setForeground(roxo);
        
        labelTempo = new JLabel("TEMPO: ");
        labelTempo.setBounds(570, 380, 150, 30);
        textTempo = new JTextField();
        textTempo.setBounds(570, 410, 70, 30);
        labelTempo.setForeground(roxo);
        
        labelValorAPagar = new JLabel("VALOR A PAGAR: ");
        labelValorAPagar.setBounds(20, 460, 150, 30);
        textValorAPagar = new JTextField();
        textValorAPagar.setBounds(130, 460, 150, 30);
        labelValorAPagar.setForeground(roxo);
        
        buttonGravar3 = new JButton("EFETUAR SAÍDA");
        buttonGravar3.setBounds(290, 460, 170, 30);
        
        buttonGravar4 = new JButton("FECHAR SISTEMA");
        buttonGravar4.setBounds(470, 460, 170, 30);
       
        tabelaClientesModelo = new DefaultTableModel();
           
            tabelaClientesModelo.addColumn("CÓDIGO");
            tabelaClientesModelo.addColumn("PLACA");
            tabelaClientesModelo.addColumn("MODELO");
            tabelaClientesModelo.addColumn("DATA ENTRADA");
            
            SistemaDao dao = new SistemaDao();
            ArrayList<Movimento> componentes = dao.listarVeiculos();
            
			for (Movimento veiculo : componentes) {
            	String[] vetorVeiculo = {veiculo.getCodigo(), veiculo.getPlaca(), veiculo.getModelo(), veiculo.getDataEntrada()};
            	tabelaClientesModelo.addRow(vetorVeiculo);
            }
     
            tabelaSistema = new JTable(tabelaClientesModelo);
            tabelaSistema.getColumnModel().getColumn(0).setPreferredWidth(90);
            tabelaSistema.getColumnModel().getColumn(1).setPreferredWidth(220);
            tabelaSistema.getColumnModel().getColumn(2).setPreferredWidth(140);
            tabelaSistema.getColumnModel().getColumn(3).setPreferredWidth(140);
            tabelaSistema.getColumnModel().getColumn(0).setResizable(false);
            tabelaSistema.getTableHeader().setReorderingAllowed(false);

            scrollTable = new JScrollPane(tabelaSistema);
            scrollTable.setBounds(20, 120, 610, 150);
            
        tela.getContentPane().add(labelEntrada);    
        tela.getContentPane().add(scrollTable);   
        tela.getContentPane().add(labelPlaca);
        tela.getContentPane().add(textPlaca);
        tela.getContentPane().add(labelModelo);
        tela.getContentPane().add(textModelo);
        tela.getContentPane().add(labelSaída);
        tela.getContentPane().add(labelPlaca2);
        tela.getContentPane().add(textPlaca2);
        tela.getContentPane().add(buttonGravar);
        tela.getContentPane().add(buttonGravar2);
        tela.getContentPane().add(labelModelo2);
        tela.getContentPane().add(textModelo2);
        tela.getContentPane().add(labelDataEntrada);
        tela.getContentPane().add(textDataEntrada);
        tela.getContentPane().add(labelHoraEntrada);
        tela.getContentPane().add(textHoraEntrada);
        tela.getContentPane().add(labelDataSaída);
        tela.getContentPane().add(textDataSaída);
        tela.getContentPane().add(labelHoraSaída);
        tela.getContentPane().add(textHoraSaída);
        tela.getContentPane().add(labelTempo);
        tela.getContentPane().add(textTempo);
        tela.getContentPane().add(labelValorAPagar);
        tela.getContentPane().add(textValorAPagar);
        tela.getContentPane().add(buttonGravar3);
        tela.getContentPane().add(buttonGravar4);
        
        tela.setVisible(true);
        
        buttonGravar.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
            	
            	Movimento movimento = new Movimento();
            	
            	movimento.setModelo(textModelo.getText());
            	movimento.setPlaca(textPlaca.getText());
            	movimento.setCodigo(Util.gerarCodigo());
    
            	SistemaDao dao = new SistemaDao(movimento);
            	dao.salvar();
            	
            	  JOptionPane.showInputDialog(null, "Cliente cadastrado com sucesso!!!");
            }
          
        });
        
        // *** esse botão e o buscar...
        buttonGravar2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				String placa;
				placa = textPlaca2.getText().toUpperCase();
				
				SistemaDao dao = new SistemaDao();
				Movimento movimento = dao.buscarVeiculo(placa);
				
				textModelo2.setText(movimento.getModelo());
				textDataEntrada.setText(movimento.getDataEntrada());
				textHoraEntrada.setText(movimento.getHoraEntrada());
				textDataSaída.setText(Util.converterData(LocalDate.now()));
				textHoraSaída.setText(Util.converterHora(LocalTime.now()));
				
			}
		}); 
        
        buttonGravar4.addActionListener(new ActionListener() {
        	
        	@Override
			public void actionPerformed(ActionEvent arg0) {
        		System.exit(0);
        		
        }
        
    
          });
	   }
     }

             