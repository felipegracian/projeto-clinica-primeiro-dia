package br.senai.sp.jandira.testes;

import java.util.ArrayList;

import br.senai.sp.jandira.AgendaApp;
import br.senai.sp.jandira.dao.EspecialidadeDAO;
import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.PlanoDeSaude;

public class TesteObjetos {

    public static void main(String[] args) {

        int[] a = {1, 2, 3};

        int[] b = {3, 4, 5};

        int[][] c = {
            {1, 2, 3}, {3, 4, 5}
        };
        System.out.println(c[1][1]);
        System.out.println("--------------------------");

        Especialidade e1 = new Especialidade("Cardiologia");
        //e1.setNome("Cardiologia");
        e1.setDescriçao("Cuida do coração");

        EspecialidadeDAO.gravar(e1);

        Especialidade e2 = new Especialidade();
        e2.setNome("Ortopedista");
        e2.setDescriçao("Cuida das fraturas");

        EspecialidadeDAO.gravar(e2);

        Especialidade e3 = new Especialidade("Clinico Geral");
        e3.setDescriçao("Sabe de tudo um pouco");
        EspecialidadeDAO.gravar(e3);

        Especialidade e5 = new Especialidade("Pediatra");
        e5.setDescriçao("cuida das crianças");
        EspecialidadeDAO.gravar(e5);

        EspecialidadeDAO.excluir(102);

        for (Especialidade ee : EspecialidadeDAO.getEspecialidades()) {
            System.out.println(ee.getNome());
        }

        Especialidade procurada = EspecialidadeDAO.getEspecialidade(101);
        System.out.println("BUSCA---" + procurada.getNome());

        System.out.println("UPDATE-----------");
        Especialidade atualizada = new Especialidade();
        atualizada.setNome("Ortopedista Geral");
        atualizada.setCodigo(101);
        EspecialidadeDAO.atualizar(atualizada);
        Especialidade procurada1 = EspecialidadeDAO.getEspecialidade(101);
        System.out.println("BUSCA DO UPDATE____" + procurada1.getNome());

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
        for (int x = 0; x < especialidades.size(); x++) {
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
