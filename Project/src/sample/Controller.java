package sample;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private TextField inputField;

    @FXML
    private ListView<String> listView;

    @FXML
    private ListView<String> usersListView;

    @FXML
    public void initialize() {
        usersListView.setItems(FXCollections.observableArrayList("User #1", "User #2"));

    }

    @FXML
    public void addWordToList() {
        String word = inputField.getText();
        if (!word.isBlank()) {
            listView.getItems().add(word);
        }
        inputField.setText("");
    }

    @FXML
    public void exit() {
        System.exit(0);
    }
}
