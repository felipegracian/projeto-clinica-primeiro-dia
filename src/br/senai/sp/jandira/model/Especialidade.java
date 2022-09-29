package br.senai.sp.jandira.model;

import javax.swing.JOptionPane;

public class Especialidade {

    private static int contador = 99;
    private Integer codigo;
    private String nome;
    private String descriçao;

    //Construtores da classe
    public Especialidade(String nome) {

        this.nome = nome;
        this.contador++;
        this.codigo = contador;
    }

    public Especialidade(String nome, String descricao) {
        this.nome = nome;
        this.descriçao = descricao;
        this.contador++;
         this.codigo = contador;
    }

    public Especialidade() { // Construtor Default/ padrão

        this.contador++;
         this.codigo = contador;
    }

    //Métodos de acesso aos atributos

    public static int getContador() {
        return contador;
    }

    public Integer getCodigo() {
        return codigo;
    }
    
    
    
    
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
