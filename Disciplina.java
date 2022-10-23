import java.util.List;
import java.util.LinkedList;

public class Disciplina {
    private String nome;
    private int numero_alunos;
    private List<AvaliacaoDoAluno> avaliacoes;

    //Construtores
    public Disciplina(){
        this.avaliacoes = new LinkedList<AvaliacaoDoAluno>();
    }
    public Disciplina(String nome, int numero_alunos){
        this.nome = nome;
        this.numero_alunos = numero_alunos;
        this.avaliacoes = new LinkedList<AvaliacaoDoAluno>();
    }

    //Getters and Setters
    public String getNome(){
        return this.nome;
    }

    public int getNumeroAlunos(){
        return this.numero_alunos;
    }

    public List<AvaliacaoDoAluno> getAvaliacoes(){
        return this.avaliacoes;
    }

    //Methods
    public void addAvaliacao(AvaliacaoDoAluno nova_avaliacao){
        this.avaliacoes.add(nova_avaliacao);
    }


}
