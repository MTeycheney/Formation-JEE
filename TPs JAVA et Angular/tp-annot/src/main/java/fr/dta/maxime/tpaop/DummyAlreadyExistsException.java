package fr.dta.maxime.tpaop;

public class DummyAlreadyExistsException extends Exception {

	private static final long serialVersionUID = -7503738962430440875L;

	public DummyAlreadyExistsException(Long id) {
		super(String.format("The dummy already exists [id=%s]", id));
	}
}
