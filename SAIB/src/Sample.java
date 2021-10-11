
public class Sample {

	public static void main(String[] args) {
		Customer abdul = new Customer();
		Security abc = new Security();
		abc.scanCustomer(abdul);
		abdul.address = "bangalore";
		System.out.println("hello world");
	}

}
