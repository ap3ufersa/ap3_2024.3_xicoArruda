package onibus_heranca;

public class MainOnibus {
    public static void main(String[] args) {
        Veiculo umCarro = new Veiculo("OOO-15784", 5);
        Onibus umOnibus = new Onibus("Q9SACQ", 500, "51649Assu", "Pega o Guanabara");
        System.out.println(umCarro);
        System.out.println(umOnibus);
    }
}
