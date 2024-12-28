package db;

public class DbException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public DbException(String msg) {
		super(msg);
	}
}

//classe DbException que vai extender da classe java RuntimeException
//construtor que vai passa a msg de exception 