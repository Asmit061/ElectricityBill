package application;


import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;

import data.userPanelDAO;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;

import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;

import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class NewUserController implements Initializable {
	
	@FXML
	private Label mylbl;
	@FXML
	private TextField meterId;
	@FXML
	private TextField uname;
	@FXML
	private TextField email;
	@FXML
	private TextField fname;
	@FXML
	private TextField lname;
	@FXML
	private PasswordField pass;
	@FXML
    private ComboBox<String> combobox;
	@FXML
	private Button btn1;
	@FXML
	private TextField aadhar;
	int billAmount=0;
	
	
    
    ObservableList<String> list = FXCollections.observableArrayList("MALE", "FEMALE", "OTHERS");

	

	public void submit(ActionEvent event) throws ClassNotFoundException, SQLException {

		   if(  lname.getText().trim().isEmpty() || fname.getText().trim().isEmpty() || meterId.getText().trim().isEmpty()||
				uname.getText().trim().isEmpty() || pass.getText().trim().isEmpty() || 
				email.getText().trim().isEmpty() || combobox.getValue().trim().isEmpty() || aadhar.getText().isEmpty() ) {
			mylbl.setStyle
			(
				 "-fx-background-color: #ffb3b3;"
				+ "-fx-text-fill: red;"
			);
			mylbl.setText("Enter all Details");
			
		}else {
			
			userPanelDAO.insertUser(fname.getText(), lname.getText(), Integer.parseInt(meterId.getText()), uname.getText(), pass.getText(),
					                email.getText(), combobox.getValue().toString(), aadhar.getText(), billAmount);
			mylbl.setStyle
			(
					
					 "-fx-background-color: #1aff1a;"
					+ "-fx-text-fill: black;"
			);
		mylbl.setText("Registered");
		
		}
		
		
	}
	
	public void exxit(ActionEvent event) {
	System.exit(0);
		
	}
	
	
	public void out(ActionEvent event) {
		try {
			
			((Node)event.getSource()).getScene().getWindow().hide();
			Stage primaryStage = new Stage();
			FXMLLoader loader = new FXMLLoader();
			Pane root = loader.load(getClass().getResource("/design/Login.fxml").openStream());
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.initStyle(StageStyle.TRANSPARENT);
			primaryStage.show();
		
		} catch (Exception e) {
			
		}
	}

	public void initialize(URL arg0, ResourceBundle arg1) {
		combobox.setItems(list);
		
	}
}


