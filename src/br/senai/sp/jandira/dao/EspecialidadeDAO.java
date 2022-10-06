package br.senai.sp.jandira.dao;

import br.senai.sp.jandira.model.Especialidade;
import java.util.ArrayList;


public class EspecialidadeDAO {
    // Essa classe será responsável pela persistencia de dados das especialidades, por exemplo excluir, editar e adicionar uma especialidade.
    
    private static ArrayList<Especialidade> especialidades = new ArrayList<>();
    
    public static void gravar(Especialidade e) {
        especialidades.add(e);
    }
    
    public static ArrayList<Especialidade> getEspecialidades() {
        return especialidades;
    }
    
    public static Especialidade getEspecialidade(Integer codigo) {
        for (Especialidade e : especialidades) {
            if (e.getCodigo() == codigo) {
                return e;
            }
        }
        
        return null;
    }
    
    public static void atualizar(Especialidade especialidadeAtualizada) {
        for (Especialidade e : especialidades) {
            if (e.getCodigo() == especialidadeAtualizada.getCodigo()) {
                especialidades.set(especialidades.indexOf(e), especialidadeAtualizada);
                break;
            }
        }
    }
    
    public static void excluir(Integer codigo) {
        for (Especialidade e : especialidades) {
            if (e.getCodigo() == codigo) {
                especialidades.remove(e);
                break;
            }
        }
    }
    
    //Criar uma lista inicial de especialidades
    public static void criarListaEspecialidades() {
        Especialidade e1 = new Especialidade("Cardiologia", "Área medicinal que cuida do coração.");
        Especialidade e2 = new Especialidade("Fisioterapia", "Área medicinal que cuida da recuperação parcial de movimentos prejudicados.");
        Especialidade e3 = new Especialidade("Clinico Geral", "Médico que atende no plantão, Encaminha para outras especialidades.");
        Especialidade e4 = new Especialidade("Dermatologista", "Área medicinal que cuida da pele.");
        
        especialidades.add(e1);
        especialidades.add(e2);
        especialidades.add(e3);
        especialidades.add(e4);
    }
    
}
