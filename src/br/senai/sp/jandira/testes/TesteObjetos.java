package br.senai.sp.jandira.testes;

import java.util.ArrayList;

import br.senai.sp.jandira.AgendaApp;
import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.PlanoDeSaude;

public class TesteObjetos {

	public static void main(String[] args) {
		
		Especialidade e1 = new Especialidade("Cardiologia");
		//e1.setNome("Cardiologia");
		e1.setDescriçao("Cuida do coração");
		
		
		Especialidade e2 = new Especialidade();
		e2.setNome("Ortopedista");
		e2.setDescriçao("Cuida das fraturas");
		
		Especialidade e3 = new Especialidade("Clinico Geral");
		e3.setDescriçao("Sabe de tudo um pouco");
                
                Especialidade e5 = new Especialidade("Pediatra");
		e5.setDescriçao("cuida das crianças");
		
		ArrayList<Especialidade> especialidades = new ArrayList<>();
		especialidades.add(e1);
		especialidades.add(e2);
		especialidades.add(e3);
		
		//imprimir o nome das especialidades que estão neste ArrayList
		int i = 0;// contador
		while (i < especialidades.size()) { // condiçao
			System.out.println(especialidades.get(i).getNome());
			i++; // acumulador
		}

		// Utilização do for para iteração no ArrayList
		//for(contador; condição; acumulador) {
		
	    //}
		
		System.out.println("-----------------------FOR---------------------------------");
		for(int x = 0; x < especialidades.size(); x++) {
			System.out.println(especialidades.get(x).getNome());
		}
		
		//FOR EACH
		System.out.println("--------------------FOR EACH--------------------------------");
		for (Especialidade e : especialidades) {
			System.out.println(e.getNome());
		}
		
		//Criar 3 planos de saude, armazenar em um arraylist e exibir o nome da operadora de cada um deles usando for each
		
		PlanoDeSaude p1 = new PlanoDeSaude("Notredame");
		
		PlanoDeSaude p2 = new PlanoDeSaude("Amil");
		
		PlanoDeSaude p3 = new PlanoDeSaude("Bradesco");
		
		ArrayList<PlanoDeSaude> operadoras = new ArrayList<>();
		operadoras.add(p1);
		operadoras.add(p2);
		operadoras.add(p3);
		
		System.out.println("-----------------Tarefa Operadoras----------------------");
		for (PlanoDeSaude f : operadoras) {
			System.out.println(f.getOperadora());
			System.out.println(f.getQuantidade());
		}
		
		System.out.println(PlanoDeSaude.getQuantidade());
		
		AgendaApp.main(args);
		System.out.println("--------------------" + PlanoDeSaude.getQuantidade());
		
                
                //exibir quantidade de especialidades
                System.out.println(e1.getCodigo() + "--" + e1.getNome());
                System.out.println(e2.getCodigo() + "--" + e2.getNome());
                System.out.println(e3.getCodigo() + "--" + e3.getNome());
                System.out.println(e5.getCodigo() + "--" + e5.getNome());
	}

}
