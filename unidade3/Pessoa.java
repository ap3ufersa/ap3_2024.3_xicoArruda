public class Pessoa {
    private String nome;

    public Pessoa() {
        this.nome = "SemNome";
    }

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNomeMaiusculo() {
        return nome.toUpperCase();
    }

    public String getNomeMinusculo() {
        return nome.toLowerCase();
    }

    @Override
    public String toString() {
        return "Pessoa [nome=" + nome + "]";
    }
}
