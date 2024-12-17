import java.util.LinkedList;

public class TestaAluno {
    public static void main(String[] args) {
        LinkedList<Aluno> alunos = new LinkedList<>();

        for (int i = 0; i < 99; i++) {
            try{
                Aluno novoAluno = new Aluno("Aluno" + (i + 1));
                novoAluno.setNota1(-1);
                alunos.add(novoAluno);
            } catch (Exception e) {
                e.getMessage();
            }
        }

        System.out.println("Imprimindo os alunos:");
        for (int i = 0; i < 99; i++) {
            System.out.println(alunos.get(i));
        }
    }
}
