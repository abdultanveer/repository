package inheritance;

public class Gst extends IncomeTax{
	
	@Override
	public int calculateTax(int income) {
		if(income<10000) return income/10;
		else return income/5;
	}

}
