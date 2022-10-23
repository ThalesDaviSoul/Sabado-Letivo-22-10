public class AssociadoEscola {
    private String nome;
    private int matricula;

    //Construtores
    public AssociadoEscola(){}

    public AssociadoEscola(String nome, int matricula){
        this.nome = nome;
        this.matricula = matricula;
    }

    //Getters and Setters
    public String getNome(){
        return this.nome;
    }

    public int getMatricula(){
        return this.matricula;
    }

}
