import java.util.Random;

public class Aula3_2_TestaAluno {
    public static void main(String[] args) {

        System.out.println();
        System.out.println("Um aluno aprovado:");
        //um aluno aprovado
        Aluno xico = new Aluno();
        xico.setNome("Xico Arruda");
        xico.setNota1(7);
        xico.setNota2(7);
        xico.setNota3(7);
        System.out.println(xico);

        //muitos alunos
        System.out.println("Muitos alunos:");
        for (int i = 0; i < 99; i++) {
            Aluno umAluno = new Aluno();
            umAluno.setNome("AlunoNumero" + i);
            Random random = new Random();
            umAluno.setNota1(10 * random.nextDouble());
            umAluno.setNota2(10 * random.nextDouble());
            umAluno.setNota3(10 * random.nextDouble());
            System.out.println(umAluno);
            System.out.println(umAluno.getMedia());
        }

    }
}
