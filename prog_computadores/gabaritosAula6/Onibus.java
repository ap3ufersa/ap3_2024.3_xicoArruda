package onibus_heranca;

public class Onibus extends Veiculo {
    private String prefixo;
    private String nomeCompanhia;

    public Onibus(String placa, int capacidade, String prefixo, String nomeCompanhia) {
        super(placa, capacidade);
        this.prefixo = prefixo;
        this.nomeCompanhia = nomeCompanhia;
    }

    public String getPrefixo() {
        return prefixo;
    }

    public void setPrefixo(String prefixo) {
        this.prefixo = prefixo;
    }

    public String getNomeCompanhia() {
        return nomeCompanhia;
    }

    public void setNomeCompanhia(String nomeCompanhia) {
        this.nomeCompanhia = nomeCompanhia;
    }

    @Override
    public String toString() {
        return "Onibus{" +
                "placa='" + getPlaca() + '\'' +
                ", capacidade=" + getCapacidade() +
                ", prefixo='" + prefixo + '\'' +
                ", nomeCompanhia='" + nomeCompanhia + '\'' +
                '}';
    }
}
