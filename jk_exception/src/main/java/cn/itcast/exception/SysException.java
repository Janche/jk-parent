package cn.itcast.exception;

public class SysException extends Exception {
	private static final long serialVersionUID = 1L;
	private String message;

	public String getMessage() {
		return message;
	}

	public SysException(String message) {
		this.message = message;
	}
}