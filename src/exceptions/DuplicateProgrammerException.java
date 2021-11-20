package exceptions;

public class DuplicateProgrammerException extends Exception {

	private static final long serialVersionUID = 1L; 
	
	public DuplicateProgrammerException(String name) {
		super("There is a programmer duplicate");
	}
}
