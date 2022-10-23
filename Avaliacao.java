public class Avaliacao {
    private int trimestre;
    private static int numero_prova;
    private int identificador;

    // Construtores
    public Avaliacao(int trimestre){
        this.trimestre = trimestre;
        this.identificador = Avaliacao.numero_prova;
        Avaliacao.numero_prova++;
    }

    //Getters and Setters
    public int getTrimestre(){
        return trimestre;
    }

    public int getIdentificador(){
        return identificador;
    }

}
