import java.util.ArrayList;
import java.util.Scanner;

public class Aula3_2_TestaListaDeAlunos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Aluno> alunos = new ArrayList<>();
        int quantAlunos = 5;

        for (int i = 1; i <= quantAlunos; i++) {
            System.out.println("== Aluno " + i + " ==");
            System.out.print("Digite o nome do aluno: ");
            scanner.nextLine();
            String nome = scanner.nextLine();

            System.out.print("Digite a nota 1: ");
            double nota1 = scanner.nextDouble();

            System.out.print("Digite a nota 2: ");
            double nota2 = scanner.nextDouble();

            System.out.print("Digite a nota 3: ");
            double nota3 = scanner.nextDouble();

            Aluno aluno = new Aluno();
            aluno.setNome(nome);
            aluno.setNota1(nota1);
            aluno.setNota2(nota2);
            aluno.setNota3(nota3);

            alunos.add(aluno);
        }

        System.out.println("\n== Lista de Alunos ==");
        for (Aluno aluno : alunos) {
            System.out.println(aluno);
            System.out.println("Média: " + aluno.getMedia());
            System.out.println("Status: " + (aluno.isAprovadoMedia() ? "Aprovado" : "Reprovado"));
            System.out.println("Nome em maiúsculas: " + aluno.getNomeMaisculo());
            System.out.println("Nome em minúsculas: " + aluno.getNomeMinusculo());
            System.out.println();
        }

        scanner.close();
    }
}
