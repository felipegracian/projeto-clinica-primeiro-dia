package br.senai.sp.jandira.model;

import javax.swing.JOptionPane;

public class Especialidade {

	private String nome;
	private String descriçao;
	
	//Construtores da classe
	
	public Especialidade(String nome) {
		
		this.nome = nome;
	}
	
	public Especialidade(String nome, String descricao) {
		this.nome = nome;
		this.descriçao = descricao;
	}
	
	public Especialidade() { // Construtor Default/ padrão
		
	}
	
	//Métodos de acesso aos atributos
	public void setNome(String nome) {
		
		if (nome.length() >= 3) {
		this.nome = nome;
		} else {
			JOptionPane.showMessageDialog(null, "O nome da especialidade deve ter pelo menos 3 caracteres.");
		}
		
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setDescriçao(String descriçao) {
		
		if (descriçao.length() >= 10) {
			this.descriçao = descriçao;
		} else {
			JOptionPane.showMessageDialog(null, "Descrição de uma especialidade deve ter pelo menos 10 caracteres.");
		}
		
		
	}
	
	public String getDescriçao() {
		return descriçao;
	}
}
