package model.exceptions;

public class DomainException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	//deixa uma mensagem j� salva
	public DomainException(String msg) {
		super(msg);
	}
}
