package exception;

public class NotExistIDException extends Exception {
	//������ 2��(default, String)

	public NotExistIDException() {
		super();		
	}

	public NotExistIDException(String message) {
		super(message);		
	}
	
}
