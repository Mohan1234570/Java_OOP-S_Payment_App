package in.ashokit;

public class CreditCardPayment implements IPayment {
	@Override
	public void StartPayment() {
		System.out.println("CrediCardPayment is Processing...");
	}
}
