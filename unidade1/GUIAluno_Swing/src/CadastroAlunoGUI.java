
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;

public class CadastroAlunoGUI {
    private JFrame frame;
    private JTextField tfNomeCompleto, tfNomeDaMae, tfMatricula;
    private JFormattedTextField tfDataNascimento;
    private JButton btnCadastrarAluno;
    private List<Aluno> alunos;
    private JFrame mainFrame;
    private ExibicaoAlunosGUI exibicaoAlunosGUI;

    public CadastroAlunoGUI(JFrame mainFrame, List<Aluno> alunos, ExibicaoAlunosGUI exibicaoAlunosGUI) {
        this.mainFrame = mainFrame;
        this.alunos = alunos;
        this.exibicaoAlunosGUI = exibicaoAlunosGUI;
        createAndShowGUI();
    }

    private void createAndShowGUI() {
        frame = new JFrame("Cadastro de Aluno");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new BorderLayout());

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(0, 2));

        // Campos para cadastro do aluno
        panel.add(new JLabel("Nome Completo:"));
        tfNomeCompleto = new JTextField();
        panel.add(tfNomeCompleto);

        panel.add(new JLabel("Nome da Mãe:"));
        tfNomeDaMae = new JTextField();
        panel.add(tfNomeDaMae);

        panel.add(new JLabel("Matrícula:"));
        tfMatricula = new JTextField();
        panel.add(tfMatricula);

        panel.add(new JLabel("Data de Nascimento (dd/MM/yyyy):"));
        try {
            MaskFormatter dateFormatter = new MaskFormatter("##/##/####");
            dateFormatter.setPlaceholderCharacter('_');
            tfDataNascimento = new JFormattedTextField(dateFormatter);
        } catch (Exception e) {
            tfDataNascimento = new JFormattedTextField();
        }
        panel.add(tfDataNascimento);

        btnCadastrarAluno = new JButton("Cadastrar Aluno");
        btnCadastrarAluno.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cadastrarAluno();
            }
        });
        panel.add(btnCadastrarAluno);

        frame.add(panel, BorderLayout.CENTER);
        frame.setVisible(true);
    }

    private void cadastrarAluno() {
        try {
            Aluno aluno = new Aluno();
            aluno.setNomeCompleto(tfNomeCompleto.getText());
            aluno.setNomeDaMae(tfNomeDaMae.getText());
            aluno.setMatricula(Long.parseLong(tfMatricula.getText()));

            // Converte a data de nascimento do formato dd/MM/yyyy para LocalDate
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            aluno.setDataNascimento(LocalDate.parse(tfDataNascimento.getText(), formatter));

            alunos.add(aluno);
            JOptionPane.showMessageDialog(frame, "Aluno cadastrado com sucesso!");

            // Atualiza a janela de exibição de alunos
            if (exibicaoAlunosGUI != null) {
                exibicaoAlunosGUI.atualizarListaAlunos();
            }

            frame.dispose();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(frame, "Erro ao cadastrar aluno: " + e.getMessage(), "Erro",
                    JOptionPane.ERROR_MESSAGE);
        }
    }
}
