package application;

import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;

public class payments {
	private final SimpleIntegerProperty meterId;
	private final SimpleDoubleProperty amount;
	
	
	public int getMeterId() {
		return meterId.get();
	}

	

	public double getAmount() {
		return amount.get();
	}

	public payments(int meterId, double amount) {
		super();
		this.meterId = new SimpleIntegerProperty(meterId);
		this.amount = new SimpleDoubleProperty(amount);
	
	}
}