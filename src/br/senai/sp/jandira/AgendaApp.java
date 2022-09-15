package br.senai.sp.jandira;

import javax.swing.JOptionPane;

import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.PlanoDeSaude;

public class AgendaApp {

	public static void main(String[] args) {
		
		Especialidade especialidade = new Especialidade();
		especialidade.setNome("Cardiologia");
		especialidade.setDescriçao("Cardiologia é a especialidade médica que realiza o diagnóstico e trata das doenças do coração.");
		
		
		PlanoDeSaude planoDeSaude = new PlanoDeSaude();
		planoDeSaude.setOperadora("Notredame Intermédica");
		planoDeSaude.setCategoria("Gold");
		
		
		JOptionPane.showMessageDialog(null, especialidade.getDescriçao());
		JOptionPane.showMessageDialog(null, planoDeSaude.getOperadora());
		JOptionPane.showMessageDialog(null, planoDeSaude.getCategoria());

	}

}
