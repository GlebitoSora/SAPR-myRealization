package com.example.saprbarbyme.Controller;

import com.example.saprbarbyme.Payload.Bar;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;
public class PreProcessorController implements Initializable {

    @FXML
    private TableView<Bar> tableView;
    private final ObservableList<Bar> barDto = FXCollections.observableArrayList();
    @FXML
    private TableColumn<Bar, Double> lengthColumn;
    @FXML
    private TableColumn<Bar, Double> squareColumn;
    @FXML
    private TableColumn<Bar, Double> elasticModuleColumn;
    @FXML
    private TableColumn<Bar, Double> voltageColumn;
    @FXML
    private TextField lengthField;
    @FXML
    private TextField squareField;
    @FXML
    private TextField elasticModuleField;
    @FXML
    private TextField voltageField;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle){
        lengthColumn.setCellValueFactory(new PropertyValueFactory<Bar, Double>("lengthOfBar"));
        squareColumn.setCellValueFactory(new PropertyValueFactory<Bar, Double>("squareOfBar"));
        elasticModuleColumn.setCellValueFactory(new PropertyValueFactory<Bar, Double>("elasticModuleOfBar"));
        voltageColumn.setCellValueFactory(new PropertyValueFactory<Bar, Double>("voltageOfBar"));
    }
    @FXML
    void addBar(ActionEvent event){
        Bar bar = new Bar(Double.parseDouble(lengthField.getText()), Double.parseDouble(squareField.getText()), Double.parseDouble(elasticModuleField.getText()), Double.parseDouble(voltageField.getText()));
        ObservableList<Bar> bars = tableView.getItems();
        bars.add(bar);
        barDto.add(bar);
        tableView.setItems(bars);
    }





}