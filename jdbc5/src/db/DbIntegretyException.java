package db;

public class DbIntegretyException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	private DbIntegretyException(String msg) {
		super(msg);
	}
}
