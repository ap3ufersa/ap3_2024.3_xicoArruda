import java.util.Random;

public class TestaAluno {
    public static void main(String[] args) {

        for (int i = 0; i < 9999999; i++) {
            Aluno umAluno = new Aluno();
            umAluno.setNome("AlunoNumero" + i);
            Random random = new Random();
            double notaAleatoria = 10 * random.nextDouble();
            umAluno.setNota1(notaAleatoria);
            System.out.println(umAluno);
        }

    }
}
