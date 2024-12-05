import java.time.LocalDate;

import javafx.beans.property.LongProperty;
import javafx.beans.property.LongPropertyBase;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Aluno {
    private final StringProperty nomeCompleto = new SimpleStringProperty();
    private final StringProperty nomeDaMae = new SimpleStringProperty();
    private final ObjectProperty<LocalDate> dataNascimento = new SimpleObjectProperty<>();
    private final ObjectProperty<LocalDate> dataCadastro = new SimpleObjectProperty<>(LocalDate.now());

    private final LongProperty matricula = new LongPropertyBase() {
        @Override
        public Object getBean() {
            return Aluno.this;
        }

        @Override
        public String getName() {
            return "matricula";
        }
    };

    public long getMatricula() {
        return matricula.get();
    }

    public void setMatricula(long matricula) {
        this.matricula.set(matricula);
    }

    public LongProperty matriculaProperty() {
        return matricula;
    }

    public String getNomeCompleto() {
        return nomeCompleto.get();
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto.set(nomeCompleto);
    }

    public StringProperty nomeCompletoProperty() {
        return nomeCompleto;
    }

    public String getNomeDaMae() {
        return nomeDaMae.get();
    }

    public void setNomeDaMae(String nomeDaMae) {
        this.nomeDaMae.set(nomeDaMae);
    }

    public StringProperty nomeDaMaeProperty() {
        return nomeDaMae;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento.get();
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento.set(dataNascimento);
    }

    public ObjectProperty<LocalDate> dataNascimentoProperty() {
        return dataNascimento;
    }

    public LocalDate getDataCadastro() {
        return dataCadastro.get();
    }

    public void setDataCadastro(LocalDate dataCadastro) {
        this.dataCadastro.set(dataCadastro);
    }

    public ObjectProperty<LocalDate> dataCadastroProperty() {
        return dataCadastro;
    }
}
