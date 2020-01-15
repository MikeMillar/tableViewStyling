package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.SelectionMode;
import javafx.scene.layout.BorderPane;
import sample.dataModels.Person;
import javafx.scene.control.TableView;

public class Controller {

    private ObservableList<Person> contacts;

    @FXML private BorderPane mainBorderPane;
    @FXML private TableView mainTableView;

    public void initialize() {
        contacts = FXCollections.observableArrayList();
        Person person = new Person("Mike", "Millar", "555-555-5555", Person.statusOptions.NO_STATUS);
        contacts.add(person);
        person = new Person("Cassy", "Gutierrez", "222-222-2222", Person.statusOptions.AUTH_HOLD);
        contacts.add(person);
        person = new Person("Adrian", "Medina", "111-111-1111", Person.statusOptions.WORKING);
        contacts.add(person);
        person = new Person("Bob", "Fisher", "333-333-33330", Person.statusOptions.COMPLETE);
        contacts.add(person);
        person = new Person("Toy", "Yoda", "444-444-4444", Person.statusOptions.HOLD);
        contacts.add(person);
        person = new Person("Henry", "Ford", "666-666-6666", Person.statusOptions.READY);
        contacts.add(person);

        mainTableView.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
        mainTableView.getSelectionModel().selectFirst();
        mainTableView.setItems(contacts);
    }


}
