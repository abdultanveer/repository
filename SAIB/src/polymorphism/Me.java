package polymorphism;

public class Me {
	public static void main(String[] args) {
		Bank bank;
		bank = new AlRajhi();
				//new Saib();
		int amountRequired = bank.openLocker();
		System.out.println("amount required to open locker = "+amountRequired);
	}

}
