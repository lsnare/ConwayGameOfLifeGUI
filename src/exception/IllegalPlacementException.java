package exception;

public class IllegalPlacementException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public IllegalPlacementException(String message){
		super(message);
	}
	
	public IllegalPlacementException(String message, Throwable throwable){
		super(message, throwable);
	}
}
