module ElectricityBill {
	requires javafx.controls;
	requires java.sql;
	requires javafx.fxml;
	requires javafx.base;
	requires javafx.graphics;
//	exports application.payments;
//	opens application.payments to javafx.fxml;
	opens application to javafx.graphics, javafx.fxml, javafx.base;
}
