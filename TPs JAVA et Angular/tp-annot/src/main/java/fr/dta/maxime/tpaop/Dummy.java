package fr.dta.maxime.tpaop;

public class Dummy {
	private Long id;
	private String label;
	
	public Dummy() {
	}
	
	public Dummy(Long id, String label) {
		this.id = id;
		this.label = label;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}
	
	@Override
	public String toString() {
		return String.format("Dummy [id: %s, label: \"%s\"]", id, label);
	}
}
