package br.com.senaijandira.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import br.com.senaijandira.model.Aluno;

public class Frame {
	public void criarTela() {

		// * * * Construindo a tela
		JFrame tela = new JFrame();
		tela.setTitle("Sistema de acadmia IMC e NCD");
		tela.setSize(800, 400);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setLayout(null);

		// *** Contruindo o texto de inserção de nome //
		JLabel labelNome = new JLabel("Nome:");
		labelNome.setBounds(10, 10, 60, 30);

		JTextField textNome = new JTextField();
		textNome.setBounds(50, 10, 250, 30);

		JLabel labelPeso = new JLabel("Peso: ");
		labelPeso.setBounds(10, 50, 60, 30);

		JTextField textPeso = new JTextField();
		textPeso.setHorizontalAlignment(SwingConstants.RIGHT);
		textPeso.setBounds(45, 50, 60, 30);

		JLabel labelAltura = new JLabel();
		labelAltura.setText("Altura: ");
		labelAltura.setBounds(130, 50, 60, 30);

		JTextField textAltura = new JTextField();
		textAltura.setHorizontalAlignment(SwingConstants.RIGHT);
		textAltura.setBounds(170, 50, 60, 30);

		// ------------------------------------------------------*******-*-*-*-*--*-*-*//

		JLabel labelDataNascimento = new JLabel("Data de Nascimento:");
		labelDataNascimento.setBounds(10, 90, 120, 30);
		
		JTextField textDataNascimento = new JTextField();
		textDataNascimento.setBounds(130, 90, 100, 30);

		JComboBox<String> comboNivelAtividade = new JComboBox<String>();
		tela.add(comboNivelAtividade);
		comboNivelAtividade.addItem("Nenhuma Atividade");
		comboNivelAtividade.addItem("Atividade Leve");
		comboNivelAtividade.addItem("Atividade Moderada");
		comboNivelAtividade.addItem("Atividade Intensa");
		comboNivelAtividade.setBounds(10, 130, 140, 30);

		JRadioButton jrb_masc = new JRadioButton("Masculino");
		JRadioButton jrb_fem = new JRadioButton("Feminino ");
		ButtonGroup grupo_sexo = new ButtonGroup();
		grupo_sexo.add(jrb_masc);
		grupo_sexo.add(jrb_fem);
		JPanel panel_sexo = new JPanel();
		panel_sexo.add(jrb_masc);
		panel_sexo.add(jrb_fem);

		panel_sexo.setBounds(0, 180, 200, 30);
		
		JButton btnCalcular = new JButton("CALCULAR");
		btnCalcular.setBounds(20, 240, 120, 30);
		
		JButton btnLimpar = new JButton("LIMPAR");
		btnLimpar.setBounds(150, 240, 120, 30);;

		// *** Mostrando na tela todos os campos criados***//
		tela.add(labelNome);
		tela.add(textNome);
//		tela.add(combo);
		tela.add(labelPeso);
		tela.add(textPeso);
		tela.add(textAltura);
		tela.add(labelAltura);
		tela.add(labelDataNascimento);
		tela.add(textDataNascimento);
		tela.getContentPane().add(panel_sexo);
		tela.add(btnCalcular);
		tela.add(btnLimpar);
		
		
		//*Implementando ações*//
		btnCalcular.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				Aluno aluno = new Aluno();
				aluno.setPeso(Double.parseDouble(textAltura.getText()));
				aluno.setAltura(Double.parseDouble(textAltura.getText()));
//				aluno.setNivelAtividade(comboNivelAtividade.getSelectedItem(comboNivelAtividade));
			}
		});
		
				
				
				
				
				
				
		tela.setVisible(true);

	}
}