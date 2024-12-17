import java.util.ArrayList;

public class ControleAluno {

    ArrayList<Aluno> osQueridos;

    public ControleAluno() {
        osQueridos = new ArrayList<>();
    }

    /** Retorna verdadeiro se o aluno foi adicionado, falso caso contrário */
    public boolean adicionaAluno(Aluno novoAluno) {
        if (novoAluno != null && !osQueridos.contains(novoAluno)) {
            osQueridos.add(novoAluno);
            return true;
        }
        return false;
    }

    /** Retorna verdadeiro se o aluno foi removido, falso caso contrário */
    public boolean removeAluno(Aluno aRemover) {
        if (aRemover != null && osQueridos.contains(aRemover)) {
            osQueridos.remove(aRemover);
            return true;
        }
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