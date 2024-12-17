import java.util.LinkedList;

public class TestaAluno {
    public static void main(String[] args) {
        LinkedList<Aluno> alunos = new LinkedList<>();
        
        System.out.println("");

        try {
            Aluno novoAluno = new Aluno("Aluno Invalido");
            novoAluno.setNota1(-50);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        for (int i = 0; i < 99; i++) {
            Aluno novoAluno = new Aluno("Aluno" + (i + 1));
            alunos.add(novoAluno);
        }

        System.out.println("Imprimindo os alunos:");
        for (int i = 0; i < 99; i++) {
            System.out.println(alunos.get(i));
        }
    }
}
