import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class CadastroAlunoGUI extends Application {

    private List<Aluno> alunos;
    private ExibicaoAlunosGUI exibicaoAlunosGUI;

    public CadastroAlunoGUI(List<Aluno> alunos, ExibicaoAlunosGUI exibicaoAlunosGUI) {
        this.alunos = alunos;
        this.exibicaoAlunosGUI = exibicaoAlunosGUI;
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Cadastro de Aluno");

        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10, 10, 10, 10));
        grid.setVgap(8);
        grid.setHgap(10);

        Label nomeCompletoLabel = new Label("Nome Completo:");
        GridPane.setConstraints(nomeCompletoLabel, 0, 0);
        TextField tfNomeCompleto = new TextField();
        GridPane.setConstraints(tfNomeCompleto, 1, 0);

        Label nomeDaMaeLabel = new Label("Nome da Mãe:");
        GridPane.setConstraints(nomeDaMaeLabel, 0, 1);
        TextField tfNomeDaMae = new TextField();
        GridPane.setConstraints(tfNomeDaMae, 1, 1);

        Label matriculaLabel = new Label("Matrícula:");
        GridPane.setConstraints(matriculaLabel, 0, 2);
        TextField tfMatricula = new TextField();
        GridPane.setConstraints(tfMatricula, 1, 2);

        Label dataNascimentoLabel = new Label("Data de Nascimento (dd/MM/yyyy):");
        GridPane.setConstraints(dataNascimentoLabel, 0, 3);
        TextField tfDataNascimento = new TextField();
        GridPane.setConstraints(tfDataNascimento, 1, 3);

        Button btnCadastrarAluno = new Button("Cadastrar Aluno");
        GridPane.setConstraints(btnCadastrarAluno, 1, 4);
        btnCadastrarAluno.setOnAction(e -> cadastrarAluno(tfNomeCompleto, tfNomeDaMae, tfMatricula, tfDataNascimento));

        grid.getChildren().addAll(nomeCompletoLabel, tfNomeCompleto, nomeDaMaeLabel, tfNomeDaMae,
                matriculaLabel, tfMatricula, dataNascimentoLabel, tfDataNascimento, btnCadastrarAluno);

        Scene scene = new Scene(grid, 400, 300);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void cadastrarAluno(TextField tfNomeCompleto, TextField tfNomeDaMae, TextField tfMatricula,
            TextField tfDataNascimento) {
        try {
            Aluno aluno = new Aluno();
            aluno.setNomeCompleto(tfNomeCompleto.getText());
            aluno.setNomeDaMae(tfNomeDaMae.getText());
            aluno.setMatricula(Long.parseLong(tfMatricula.getText()));

            // Converte a data de nascimento do formato dd/MM/yyyy para LocalDate
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            aluno.setDataNascimento(LocalDate.parse(tfDataNascimento.getText(), formatter));

            alunos.add(aluno);
            new Alert(Alert.AlertType.INFORMATION, "Aluno cadastrado com sucesso!").showAndWait();

            // Atualiza a janela de exibição de alunos
            if (exibicaoAlunosGUI != null) {
                exibicaoAlunosGUI.atualizarListaAlunos();
            }

            // Fechar a janela de cadastro
            ((Stage) tfNomeCompleto.getScene().getWindow()).close();
        } catch (Exception e) {
            new Alert(Alert.AlertType.ERROR, "Erro ao cadastrar aluno: " + e.getMessage()).showAndWait();
        }
    }
}
