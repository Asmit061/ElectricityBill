package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class AdminController {
	@FXML
	private Label adminLBL;

	
	public void GetAdmin(String admin) {

		adminLBL.setText(admin);

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
	
	public void out1(ActionEvent event) {
		try {
			
			((Node)event.getSource()).getScene().getWindow().hide();
			Stage primaryStage = new Stage();
			FXMLLoader loader = new FXMLLoader();
			Pane root = loader.load(getClass().getResource("/design/NewPayment.fxml").openStream());
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			NewPaymentsController newpaymentController = (NewPaymentsController)loader.getController();
		    newpaymentController.GetAdmin(adminLBL.getText());
			primaryStage.setScene(scene);
			primaryStage.initStyle(StageStyle.TRANSPARENT);
			primaryStage.show();
			
		} catch (Exception e) {
			
		}
	}
	
	public void out2(ActionEvent event) {
		try {
			
			((Node)event.getSource()).getScene().getWindow().hide();
			Stage primaryStage = new Stage();
			FXMLLoader loader = new FXMLLoader();
			Pane root = loader.load(getClass().getResource("/design/Billamount.fxml").openStream());
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			BillAmountController billController = (BillAmountController)loader.getController();
		    billController.GetAdmin(adminLBL.getText());
			primaryStage.setScene(scene);
			primaryStage.initStyle(StageStyle.TRANSPARENT);
			primaryStage.show();
			
		} catch (Exception e) {
			
		}
	}
	
	public void out3(ActionEvent event) {
		try {
			
			((Node)event.getSource()).getScene().getWindow().hide();
			Stage primaryStage = new Stage();
			FXMLLoader loader = new FXMLLoader();
			Pane root = loader.load(getClass().getResource("/design/AddBill.fxml").openStream());
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			AddBillController billController = (AddBillController)loader.getController();
		    billController.GetAdmin(adminLBL.getText());
			primaryStage.setScene(scene);
			primaryStage.initStyle(StageStyle.TRANSPARENT);
			primaryStage.show();
			
		} catch (Exception e) {
			
		}
	}
	
	public void out4(ActionEvent event) {
		try {
			
			((Node)event.getSource()).getScene().getWindow().hide();
			Stage primaryStage = new Stage();
			FXMLLoader loader = new FXMLLoader();
			Pane root = loader.load(getClass().getResource("/design/AdminComplaint.fxml").openStream());
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			AdminComplaintController admincomplaintController = (AdminComplaintController)loader.getController();
		    admincomplaintController.GetAdmin(adminLBL.getText());
			primaryStage.setScene(scene);
			primaryStage.initStyle(StageStyle.TRANSPARENT);
			primaryStage.show();
			
		} catch (Exception e) {
			
		}
	}
	
}