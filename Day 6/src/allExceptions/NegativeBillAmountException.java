package allExceptions;

public class NegativeBillAmountException extends Exception 
{

	public NegativeBillAmountException() {
		super();
		
	}

	public NegativeBillAmountException(String message) {
		super(message);
		
	}

}
