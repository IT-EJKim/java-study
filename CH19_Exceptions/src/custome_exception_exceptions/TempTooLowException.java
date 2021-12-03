package custome_exception_exceptions;

public class TempTooLowException extends TempOutOfRangeException {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public TempTooLowException(String message) {
		super(message);
	}

}
