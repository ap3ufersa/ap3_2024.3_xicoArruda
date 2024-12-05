import java.util.ArrayList;
import java.util.List;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class MainAlunosGUI extends Application {

    private List<Aluno> alunos = new ArrayList<>();
    private ExibicaoAlunosGUI exibicaoAlunosGUI;

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Cadastro de Alunos");

        Button btnCadastrarAluno = new Button("Cadastrar Aluno");
        btnCadastrarAluno.setOnAction(e -> new CadastroAlunoGUI(alunos, exibicaoAlunosGUI).start(new Stage()));

        Button btnExibirAlunos = new Button("Exibir Alunos");
        btnExibirAlunos.setOnAction(e -> {
            if (exibicaoAlunosGUI == null) {
                exibicaoAlunosGUI = new ExibicaoAlunosGUI(alunos);
            }
            exibicaoAlunosGUI.start(new Stage());
        });

        HBox hbox = new HBox(10, btnCadastrarAluno, btnExibirAlunos); // Use HBox para layout horizontal
        hbox.setAlignment(Pos.CENTER); // Centraliza os botões horizontalmente
        hbox.setPadding(new Insets(10));

        Scene scene = new Scene(hbox, 300, 200);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
