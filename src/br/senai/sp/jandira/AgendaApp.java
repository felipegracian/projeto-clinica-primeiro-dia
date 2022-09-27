package br.senai.sp.jandira;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.swing.JOptionPane;

import br.senai.sp.jandira.model.Agenda;
import br.senai.sp.jandira.model.Endereco;
import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.Estados;
import br.senai.sp.jandira.model.Medico;
import br.senai.sp.jandira.model.Paciente;
import br.senai.sp.jandira.model.PlanoDeSaude;

public class AgendaApp {

	public static void main(String[] args) {
		
		//Criar os objetos
		PlanoDeSaude planoDeSaude = new PlanoDeSaude("Unimed");
		planoDeSaude.setOperadora("Unimed");
		planoDeSaude.setCategoria("Bronze");
		planoDeSaude.setNumero("532.231.157");
		planoDeSaude.setValidade(LocalDate.of(2023, 8, 20)); //20/08/2023
		
		
		Endereco endereco = new Endereco();
		endereco.setLogradouro("Rua Luiz Carlos Bechara");
		endereco.setNumero("3");
		endereco.setBairro("Vila Marcondes");
		endereco.setCidade("Carapicuiba");
		endereco.setCep("06321-570");
		endereco.setEstado(Estados.SAO_PAULO);
		endereco.setComplemento("Casa");
		
		Paciente paciente = new Paciente();
		paciente.setNome("Carlos Pereira");
		paciente.setDataDeNascimento(LocalDate.of(2004, 6, 24));
		paciente.setTelefone("(11)965853688");
		paciente.setEndereco(endereco);
		paciente.setRg("52.820.157-6");
		paciente.setCpf("511631858-32");
		paciente.setPlanoDeSaude(planoDeSaude);
		
		//Exibir dados
		//Nome
		//telefone
		//operadora
		//categoria
		//cidade
		//estado
		
		System.out.println(paciente.getNome());
		System.out.println(paciente.getTelefone());
		System.out.println(paciente.getPlanoDeSaude().getOperadora());
		System.out.println(paciente.getPlanoDeSaude().getCategoria());
		System.out.println(paciente.getEndereco().getCidade());
		System.out.println(paciente.getEndereco().getEstado());
		System.out.println("------------------");
		
		//Criar especialidades
		
		Especialidade Ortopedista = new Especialidade();
		Ortopedista.setNome("Ortopedia");
		Ortopedista.setDescriçao(" especialidade médica responsável por diagnosticar, tratar e acompanhar lesões que afetam o sistema locomotor");
		
	    Especialidade ClinicoGeral = new Especialidade();
	    ClinicoGeral.setNome("Clinico Geral");
	    ClinicoGeral.setDescriçao("Sabe de tudo um pouquinho");
	    
	    Especialidade Cardiologista = new Especialidade();
	    Cardiologista.setNome("Cardiologia");
	    Cardiologista.setDescriçao("Médico do coração");
	    
	    //Criar um objeto médico
	    Medico medico1 = new Medico();
	    medico1.setNome("Paulo Anaktomi");
	    medico1.setEmail("pauloanak@gmail.com");
	    medico1.setTelefone("4124-5678");
	    medico1.setCrm("3241-578");
	    Especialidade[] especialidades1 = {Cardiologista, ClinicoGeral};
	    medico1.setEspecialidade(especialidades1);
	    
	    
	    //Exibir os dados do medico
	    System.out.println(medico1.getNome());
	    System.out.println(medico1.getEmail());
	    System.out.println(medico1.getTelefone());
	    System.out.println(medico1.getCrm());
	    System.out.println("-----------------");
	    
	    //Exibir as especialidades do médico
	    
	    int contador = 0;
	    while (contador < medico1.getEspecialidade().length) {
	    	System.out.println("Especialidade " + (contador +1 ) + "-" + medico1.getEspecialidade()[contador].getNome());
	    	contador++;
	    }
		
	    //Fazer um agendamento do paciente Carlos Pereira
	    //com um cardiologista dia 27/09/2022
	    //as 14;15
	    
	    Agenda agenda1 = new Agenda();
	    agenda1.setData(LocalDate.of(2022, 9, 27));
	    agenda1.setHora(LocalTime.of(14, 15));
	    agenda1.setPaciente(paciente);
	    agenda1.setMedico(medico1);
	    agenda1.setEspecialidade(Cardiologista);
	    
	    
	    //Exibir os dados da agenda : Nome do paciente, nome do medico,nome da especialidade , data e hora da consulta
	    
	    System.out.println();
	    System.out.println("Agenda do paciente : " + agenda1.getPaciente().getNome());
	    System.out.println("Médico : " + agenda1.getMedico().getNome());
	    System.out.println("Especialidade : " + agenda1.getEspecialidade().getNome());
	    System.out.println("Data : " + agenda1.getData());
	    System.out.println("Hora : " + agenda1.getHora());
	    
	    
	    
	}

}
