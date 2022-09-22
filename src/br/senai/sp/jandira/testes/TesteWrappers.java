package br.senai.sp.jandira.testes;

import java.util.ArrayList;

import br.senai.sp.jandira.model.Especialidade;

public class TesteWrappers {

	public static void main(String[] args) {
		
		int a = 5;
		Integer b = 5;
		
		Double x = 2.9;
		
		//-------------------------------------------------------------------------------------------------

		ArrayList<Especialidade> especialidades = new ArrayList<>();

		Especialidade e1 = new Especialidade();
		e1.setNome("Cardiologia");
		e1.setDescriçao("Cuida do coração");
		
		
		Especialidade e2 = new Especialidade();
		e2.setNome("Ortopedista");
		e2.setDescriçao("Cuida das fraturas");
		
		especialidades.add(e1);
		especialidades.add(e2);
		
		Especialidade e3 = new Especialidade();
		e3.setNome("Clinico Geral");
		e3.setDescriçao("Sabe de tudo um pouco");
		
		especialidades.add(e3);
		
		
		Especialidade e4 = new Especialidade();
		e4.setNome("Fisioterapia");
		e4.setDescriçao("Cuida das dores e movimenos");
		
		//Especialidade[] especialidades = {e1, e2, e3, e4};
		
		Especialidade e5 = new Especialidade();
		e5.setNome("Pediatria");
		e5.setDescriçao("Cuida das crianças");

		especialidades.add(e4);
		especialidades.add(e5);
		
		System.out.println(especialidades.size());
		
		//----------------------------------------------------------------------------------------------------------
		
		ArrayList<Integer> notas = new ArrayList<>();
		notas.add(50);
		notas.add(12);
		
		System.out.println(notas.size());
		
		notas.add(28);
		notas.add(43);
		System.out.println(notas.size());
		
		//Queremos ver a especialidade que está na posição 3 da arraylist
		System.out.println(especialidades.get(3).getNome());
		
		//Trocar o nome da especialidade que está na posição 1 do arraylist para "teste" e exibir
		especialidades.get(1).setNome("Teste");
		System.out.println(especialidades.get(1).getNome());
		
		
	}

}
