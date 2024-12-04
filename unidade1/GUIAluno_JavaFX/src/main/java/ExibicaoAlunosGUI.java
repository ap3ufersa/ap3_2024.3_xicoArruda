import java.time.format.DateTimeFormatter;
import java.util.List;

import javafx.application.Application;
import javafx.beans.property.SimpleStringProperty;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class ExibicaoAlunosGUI extends Application {

    private TableView<Aluno> tableView;
    private List<Aluno> alunos;

    public ExibicaoAlunosGUI(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Exibição de Alunos");

        tableView = new TableView<>();
        tableView.setItems(javafx.collections.FXCollections.observableList(alunos));

        TableColumn<Aluno, Long> colMatricula = new TableColumn<>("Matrícula");
        colMatricula.setCellValueFactory(new PropertyValueFactory<>("matricula"));

        TableColumn<Aluno, String> colNomeCompleto = new TableColumn<>("Nome Completo");
        colNomeCompleto.setCellValueFactory(new PropertyValueFactory<>("nomeCompleto"));

        TableColumn<Aluno, String> colNomeDaMae = new TableColumn<>("Nome da Mãe");
        colNomeDaMae.setCellValueFactory(new PropertyValueFactory<>("nomeDaMae"));

        TableColumn<Aluno, String> colDataNascimento = new TableColumn<>("Data de Nascimento");
        colDataNascimento.setCellValueFactory(cellData -> {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            return new SimpleStringProperty(cellData.getValue().getDataNascimento().format(formatter));
        });

        TableColumn<Aluno, String> colDataCadastro = new TableColumn<>("Data de Cadastro");
        colDataCadastro.setCellValueFactory(cellData -> {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            return new SimpleStringProperty(cellData.getValue().getDataCadastro().format(formatter));
        });

        tableView.getColumns().addAll(colMatricula, colNomeCompleto, colNomeDaMae, colDataNascimento, colDataCadastro);

        BorderPane borderPane = new BorderPane();
        borderPane.setCenter(tableView);

        Scene scene = new Scene(borderPane, 600, 400);
        primaryStage.setScene(scene);
        primaryStage.show();

        atualizarListaAlunos();
    }

    public void atualizarListaAlunos() {
        tableView.setItems(javafx.collections.FXCollections.observableList(alunos));
    }
}
