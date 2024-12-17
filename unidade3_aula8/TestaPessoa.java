import java.util.LinkedList;

public class TestaPessoa {
    public static void main(String[] args) {
        LinkedList<Pessoa> pessoas = new LinkedList<>();

        for (int i = 0; i < 99; i++) {
            pessoas.add(new Pessoa("Pessoa" + (i + 1)));
        }

        System.out.println("Imprimindo as pessoas:");
        for (int i = 0; i < 99; i++) {
            System.out.println(pessoas.get(i));
        }
    }
}
