package br.com.senaijandira;

import java.time.LocalDate;

import br.com.senaijandira.gui.Frame;
import br.com.senaijandira.model.Aluno;

public class Aplicacao {
	public static void main(String[] args) {
		Frame tela =  new  Frame ();
		tela.criarTela ();
		
		
		Aluno Joao = new Aluno();
//		Joao.setNome("SemIdeias");
		Joao.setPeso(65.8);
		Joao.setAltura(1.75);
		Joao.setDataNascimento(LocalDate.of(2000, 02, 19));
		Joao.setSexo("Homem");
		Joao.setNivelAtividade("Nenhuma Atividade");
		
		System.out.println(Joao.getTaxaMetabolismoBasal());
		System.out.println(Joao.getSexo());
		System.out.println(Joao.getIdade());
		System.out.println(Joao.getAltura());
		System.out.println(Joao.getPeso());
		System.out.println(Joao.getImc());
		System.out.println(Joao.getNivelAtividade());
		
		
	}
}