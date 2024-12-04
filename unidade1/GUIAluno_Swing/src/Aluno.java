
import java.time.LocalDate;

public class Aluno {
    private long matricula = -1;
    protected String nomeCompleto = "";
    private String nomeDaMae = "";
    private LocalDate dataNascimento;
    private LocalDate dataCadastro = LocalDate.now();

    public long getMatricula() {
        return matricula;
    }

    public void setMatricula(long matricula) {
        this.matricula = matricula;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getNomeDaMae() {
        return nomeDaMae;
    }

    public void setNomeDaMae(String nomeDaMae) {
        this.nomeDaMae = nomeDaMae;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public LocalDate getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(LocalDate dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    @Override
    public String toString() {
        return "Aluno [matricula=" + matricula + ", nomeCompleto=" + nomeCompleto + ", nomeDaMae=" + nomeDaMae
                + ", dataNascimento=" + dataNascimento + ", dataCadastro=" + dataCadastro + "]";
    }

}
