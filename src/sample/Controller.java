package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable{

    @FXML TableView tableView;

    @FXML TableColumn<Person, Integer> idColumn;
    @FXML TableColumn<Person,String> nameColumn;
    @FXML TableColumn<Person,String> adressColumn;
    @FXML TableColumn<Person,Integer> ageColumn;

    ObservableList<Person> persons;
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        persons = FXCollections.observableArrayList();
        persons.add(new Person(1,"Петров","Киев",20));
        persons.add(new Person(2,"Иванов","Николаев",18));
        persons.add(new Person(3,"Сидоров","Одесса",70));
        persons.add(new Person(4,"Сенкевич","Урюпинск",20));

        idColumn.setCellValueFactory(new PropertyValueFactory<>("id"));
        nameColumn.setCellValueFactory(new PropertyValueFactory<>("fio"));
        nameColumn.setCellFactory(TextFieldTableCell.forTableColumn());
        nameColumn.setOnEditCommit(
                t -> t.getTableView().getItems().get(t.getTablePosition().getRow()).setFio(t.getNewValue())
        );
        adressColumn.setCellValueFactory(new PropertyValueFactory<>("adress"));
        ageColumn.setCellValueFactory(new PropertyValueFactory<>("age"));
        tableView.setItems(persons);
    }

    public void addRow(ActionEvent actionEvent) {
//        tableView.getItems().addAll(new Person(5,"Сталин","Москва",150));
        tableView.getItems().add(new Person(5,"Сталин","Москва",150));
    }
}
