import java.util.ArrayList;

public class ControleAluno {

    ArrayList<Aluno> osQueridos;

    public ControleAluno() {
        osQueridos = new ArrayList<>();
    }

    /** Retorna verdadeiro se o aluno foi adicionado, falso c.c. */
    public boolean adicionaAluno(Aluno novoAluno) {
        return false;
    }

    /** Retorna verdadeiro se o aluno foi adicionado, falso c.c. */
    public boolean removeAluno(Aluno aRemover) {
        return false;
    }

    public ArrayList<Aluno> getOsQueridos() {
        return osQueridos;
    }

    public void setOsQueridos(ArrayList<Aluno> osQueridos) {
        this.osQueridos = osQueridos;
    }

    @Override
    public String toString() {
        return "ControleAluno [osQueridos=" + osQueridos + "]";
    }

}
