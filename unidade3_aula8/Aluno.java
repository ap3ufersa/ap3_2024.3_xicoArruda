public class Aluno extends Pessoa {
    private double nota1 = -1;
    private double nota2 = -1;
    private double nota3 = -1;

    public Aluno() {
        super();
    }

    public Aluno(String nome) {
        super(nome);
    }

    public Aluno(String nome, double nota1, double nota2, double nota3) throws NotaInvalidaException {
        super(nome);
        this.setNota1(nota1);
        this.setNota2(nota2);
        this.setNota3(nota3);
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double novaNota) throws NotaInvalidaException {
        if (novaNota < 0 || novaNota > 10) {
            throw new NotaInvalidaException("Nota inválida: " + novaNota);
        }
        this.nota1 = novaNota;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double novaNota) throws NotaInvalidaException {
        if (novaNota < 0 || novaNota > 10) {
            throw new NotaInvalidaException("Nota inválida: " + novaNota);
        }
        this.nota2 = novaNota;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double novaNota) throws NotaInvalidaException {
        if (novaNota < 0 || novaNota > 10) {
            throw new NotaInvalidaException("Nota inválida: " + novaNota);
        }
        this.nota3 = novaNota;
    }

    public double getMedia() {
        return (nota1 + nota2 + nota3) / 3;
    }

    public boolean isAprovadoMedia() {
        return getMedia() >= 7.0;
    }

    @Override
    public String toString() {
        return "Aluno [nome=" + getNome() + ", nota1=" + nota1 + ", nota2=" + nota2 + ", nota3=" + nota3 + "]";
    }
}
