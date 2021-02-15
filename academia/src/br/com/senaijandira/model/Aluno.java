package br.com.senaijandira.model;

import java.time.LocalDate;
import java.time.Period;

public class Aluno {
	private String nome;
	private LocalDate dataNascimento;
	private String sexo;
	private double peso;
	private double altura;
	private String nivelAtividade;
	
	private double taxaMetabolismoBasal;
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return this.nome;
	}

	// ***//
	

	public LocalDate setDataNascimento(LocalDate dataNascimento) {
		return this.dataNascimento = dataNascimento;
	}
	
	public LocalDate getDataNascimento() {
		return dataNascimento;
	}
	
	//**idade da pessoa **//
	
	public int getIdade() {
		LocalDate hoje = LocalDate.now();
		Period periodo = Period.between(this.dataNascimento, hoje);
		return periodo.getYears();
	}
	// ***//
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getSexo() {
		return this.sexo;
	}

	// ***//
	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getPeso() {
		return this.peso;
	}

	// ***//
	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getAltura() {
		return this.altura;
	}
	
	public void setNivelAtividade(String nivelAtividade) {
		this.nivelAtividade=nivelAtividade;
	}
	public String getNivelAtividade() {
		return this.nivelAtividade;
	}

	public double getImc() {
		double calculoImc = peso / Math.pow(this.altura, 2);
		return calculoImc;
	}

	public String getStatusImc() {
		if (this.getImc() < 18.5) {
			return "Abaixo do peso";
		} else if (this.getImc() > 18.6 && this.getImc() < 25) {
			return "Peso ideal";
		} else if (this.getImc() >= 25 && this.getImc() < 30) {
			return "Levemente Acima do peso";
		} else if (this.getImc() >= 30 && this.getImc() < 55) {
			return "Obesidade grau I";
		} else if (this.getImc() >= 35 && this.getImc() <= 40) {
			return "Obesidade grau II (Severa)";
		} else {
			return "Obesidade III (Morbida)";
		}
	}

	// ******************************************************************************//
//	Homens
//	• Entre 18 a 30 anos — 15,3 x peso + 679;
//	• Entre 31 a 60 anos — 11,6 x peso + 879;
//	• Acima de 60 anos — 13,5 x peso + 487.
//	Mulheres
//	• Entre 18 a 30 anos — 14,7 x peso + 496
//	• Entre 31 a 60 anos — 8,7 x peso + 829;
//	• Acima de 60 anos — 10,5 x peso + 596.
	public double taxaMetabolismoBasal(){
		if(this.sexo.equalsIgnoreCase("Homem")) {
			if(getIdade()>=18 && getIdade()<=30) {
				return (15.5*getPeso())+679;
				}
			else if(getIdade() >= 31 && getIdade() <=60) {
				return (11.6*getPeso())+879;
			}
			else if(getIdade() >=60) {
				return 10.5*getPeso()+596;
			}
		}
		
		if(this.sexo.equals("Mulher")) {
			if(getIdade()>=18 && getIdade()<=30) {
				return 14.7*getPeso()+496;
				}
			else if(getIdade() >= 31 && getIdade() <=60) {
				return 8.7*getPeso()+829;
			}
			else if(getIdade() >=60) {
				return (10.5*getPeso())+596;
			}
		}
	}
	public double getTaxaMetabolismoBasal() {
		return taxaMetabolismoBasal();
	}
	
//	Atividade leve — 1,6 para mulheres e 1,5 para homens
//	• Atividade moderada — 1,6 para mulheres e 1,8 para homens
//	• Atividade intensa — 1,8 para mulheres e 2,1 para homens
	
//	public double getTaxaMetabolismo(){
//		if(getNivelAtividade().equalsIgnoreCase("Nenhuma Atividade")){
//			return this.taxaMetabolismoBasal;
//		}else if(getNivelAtividade().equalsIgnoreCase("Atividade Leve")) {
//			return this.taxaMetabolismoBasal*1.6;
//		}else if(getNivelAtividade().equalsIgnoreCase("Atividade Moderada")) {
//			return this.taxaMetabolismoBasal*1.6;
//		}else if(getNivelAtividade().contentEquals("Atividade Intensa")) {
//			return this.taxaMetabolismoBasal*1.8;
//		}
//	}
}