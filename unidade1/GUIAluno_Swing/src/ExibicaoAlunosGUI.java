
import java.awt.BorderLayout;
import java.time.format.DateTimeFormatter;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ExibicaoAlunosGUI {
    private JFrame frame;
    private JTable table;
    private DefaultTableModel tableModel;
    private List<Aluno> alunos;

    public ExibicaoAlunosGUI(JFrame mainFrame, List<Aluno> alunos) {
        this.alunos = alunos;
        createAndShowGUI();
    }

    private void createAndShowGUI() {
        frame = new JFrame("Exibição de Alunos");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(600, 400);
        frame.setLayout(new BorderLayout());

        String[] columnNames = { "Matrícula", "Nome Completo", "Nome da Mãe", "Data de Nascimento",
                "Data de Cadastro" };
        tableModel = new DefaultTableModel(columnNames, 0);
        table = new JTable(tableModel);

        JScrollPane scrollPane = new JScrollPane(table);
        frame.add(scrollPane, BorderLayout.CENTER);

        frame.setVisible(true);

        atualizarListaAlunos();
    }

    public void atualizarListaAlunos() {
        tableModel.setRowCount(0); // Limpa as linhas existentes
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        for (Aluno aluno : alunos) {
            Object[] rowData = {
                    aluno.getMatricula(),
                    aluno.getNomeCompleto(),
                    aluno.getNomeDaMae(),
                    aluno.getDataNascimento().format(formatter),
                    aluno.getDataCadastro().format(formatter)
            };
            tableModel.addRow(rowData);
        }
    }
}
