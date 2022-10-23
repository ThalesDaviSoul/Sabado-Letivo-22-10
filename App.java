public class App{
    public static void main(String[] args) {
        Disciplina AEDS = new Disciplina("AEDS", 26);
        Disciplina TP = new Disciplina("TP", 22);
        Disciplina OCSLab = new Disciplina("OCSLab", 26);

        Professor Honda = new Professor("Honda", "Mestrado", 202250);
        Professor Virginia = new Professor("Virgínia", "Doutorado", 202242);
        
        Honda.addDisciplina(OCSLab);

        Virginia.addDisciplina(AEDS);
        Virginia.addDisciplina(TP);
        
        AEDS.addAvaliacao(new AvaliacaoDoAluno(1, 10));
        AEDS.addAvaliacao(new AvaliacaoDoAluno(1, 10));

        TP.addAvaliacao(new AvaliacaoDoAluno(1, 10));
        TP.addAvaliacao(new AvaliacaoDoAluno(1, 10));

        OCSLab.addAvaliacao(new AvaliacaoDoAluno(1, 10));
        OCSLab.addAvaliacao(new AvaliacaoDoAluno(1, 10));

        System.out.println(Honda.getNome()+" é responsável pelas seguintes materias:");
        for(Disciplina d : Honda.getDisciplinas()){
            System.out.println(d.getNome()+", tem "+d.getNumeroAlunos()+" alunos");
            if(d.getAvaliacoes()!=null){
                System.out.println("Essa materia teve as seguintes avaliacoes:");
                for(AvaliacaoDoAluno a : d.getAvaliacoes()){
                    System.out.println("- #"+a.getIdentificador()+", no trimestre "+a.getTrimestre()+", que vale "+a.getNota());
                }
            }
        }
        System.out.println(Virginia.getNome()+" é responsável pelas seguintes materias:");
        for(Disciplina d : Virginia.getDisciplinas()){
            System.out.println(d.getNome()+", tem "+d.getNumeroAlunos()+" alunos");
            if(d.getAvaliacoes()!=null){
                System.out.println("Essa materia teve as seguintes avaliacoes:");
                for(AvaliacaoDoAluno a : d.getAvaliacoes()){
                    System.out.println("- #"+a.getIdentificador()+", no trimestre "+a.getTrimestre()+", que vale "+a.getNota());
                }
            }
        }



    }
}