package model.exceptions;
//criei minha classe exception extendendo da classse exception 
//add serial version
public class DomainException extends Exception {
	private static final long serialVersionUID = 1L;
	
	//criei um construtor  passando uma msg String
	public DomainException(String msg) {
		super(msg);
	}
}
