public class AvaliacaoDoAluno extends Avaliacao {
    private int nota;
    
    //Construtor
    public AvaliacaoDoAluno(int trimestre, int nota){
        super(trimestre);
        this.nota = nota;
    }

    //Getters and Setters
    public int getNota(){
        return nota;
    }

}
