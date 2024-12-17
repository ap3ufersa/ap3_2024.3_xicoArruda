import java.util.LinkedList;

public class TestaAluno {
    public static void main(String[] args) {
        LinkedList<Aluno> alunos = new LinkedList<>();

        for (int i = 0; i < 9999; i++) {
            alunos.add(new Aluno("Aluno" + (i + 1)));
        }

        System.out.println("Imprimindo os alunos:");
        for (int i = 0; i < 9999; i++) {
            System.out.println(alunos.get(i));
        }
    }
}
