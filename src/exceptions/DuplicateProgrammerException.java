package exceptions;

public class DuplicateProgrammerException extends Exception {

	private static final long serialVersionUID = 1L; 
	private String name;
	
	public DuplicateProgrammerException(String name) {
		super("There is a programmer duplicate");
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
