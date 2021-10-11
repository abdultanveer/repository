package polymorphism;

import inheritance.Gst;
import inheritance.IncomeTax;

public class Me {
	public static void main(String[] args) {
		Bank bank;
		bank = new AlRajhi();
				//new Saib();
		int amountRequired = bank.openLocker();
		System.out.println("amount required to open locker = "+amountRequired);
		
		IncomeTax incomeTax = new Gst();
				//new IncomeTax();
		int tax = incomeTax.calculateTax(12000);
		System.out.println("tax to be paid ="+tax);
	
	}

}
