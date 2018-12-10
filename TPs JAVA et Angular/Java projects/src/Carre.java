import java.io.Serializable;

public class Carre extends Rectangle implements Surfacable, Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 4918985403860640648L;

	/*
	 * TP13-1/13-2
	 */
	
	public Carre(Point p, int cote)
	{
		this(p, cote, Couleur.getCouleurDefaut());
	}
	
	public Carre(Point p, int cote, Couleur couleur)
	{
		super(p, cote, cote, couleur);
	}
	
	/*
	 * Solution commentée
	 */
	
	protected String getType()
	{
		return "CARRE";
	}
}
