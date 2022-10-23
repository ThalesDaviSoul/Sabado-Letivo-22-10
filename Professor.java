import java.util.List;
import java.util.LinkedList;

public class Professor extends AssociadoEscola {
    private String escolaridade;
    private List<Disciplina> disciplinas;

    //Construtores
    public Professor(){
        super();
        this.disciplinas = new LinkedList<Disciplina>();
    }

    public Professor(String nome, String escolaridade, int matricula){
        super(nome, matricula);
        this.escolaridade = escolaridade;
        this.disciplinas = new LinkedList<Disciplina>();
    }

    //Getters and Setters

    public String getEscolaridade(){
        return this.escolaridade;
    }

    public List<Disciplina> getDisciplinas(){
        return this.disciplinas;
    }

    //Methods
    public void addDisciplina(Disciplina nova_disciplina){
        this.disciplinas.add(nova_disciplina);
    }

}
