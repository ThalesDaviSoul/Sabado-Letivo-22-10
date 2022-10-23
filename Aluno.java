import java.util.List;
import java.util.LinkedList;

public class Aluno extends AssociadoEscola{
    List<Disciplina> disciplinas;
    List<AvaliacaoDoAluno> avaliacoes;

    public Aluno(){
        this.disciplinas = new LinkedList<Disciplina>();
        this.avaliacoes = new LinkedList<AvaliacaoDoAluno>();
    }

    public Aluno(String nome, int matricula){
        super(nome, matricula);
        this.disciplinas = new LinkedList<Disciplina>();
        this.avaliacoes = new LinkedList<AvaliacaoDoAluno>();
    }

    //Getters and setters
    public List<Disciplina> getDisciplinas(){
        return disciplinas;
    }

    public List<AvaliacaoDoAluno> getAvaliacoes(){
        return avaliacoes;
    }

}
