public class TestaControleAluno {

    public static void main(String[] args) {
        ControleAluno controle = new ControleAluno();

        Aluno aluno1 = new Aluno("João");
        Aluno aluno2 = new Aluno("Maria");
        Aluno aluno3 = new Aluno("Carlos");

        System.out.println("Adicionando alunos:");
        System.out.println("Adiciona João: " + controle.adicionaAluno(aluno1));
        System.out.println("Adiciona Maria: " + controle.adicionaAluno(aluno2));
        System.out.println("Adiciona Carlos: " + controle.adicionaAluno(aluno3));
        System.out.println("Adiciona João novamente: " + controle.adicionaAluno(aluno1)); // duplicado

        System.out.println("\nLista de Alunos:");
        System.out.println(controle);

        
        System.out.println("\nRemovendo alunos:");
        System.out.println("Remove Maria: " + controle.removeAluno(aluno2));
        System.out.println("Remove João: " + controle.removeAluno(aluno1));
        System.out.println("Remove Maria novamente: " + controle.removeAluno(aluno2));

        
        System.out.println("\nLista de Alunos após remoção:");
        System.out.println(controle);
    }
}