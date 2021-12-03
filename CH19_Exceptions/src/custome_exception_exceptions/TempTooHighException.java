package custome_exception_exceptions;

public class TempTooHighException extends TempOutOfRangeException {
	
	public TempTooHighException(String message) {
		super(message);
	}

}
