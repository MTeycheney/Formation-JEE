public enum Couleur
{
	Rouge('R'), Vert('V'), Bleu('B'), Jaune('J'), Noir('N');
	
	private char code;
	
	private Couleur(char c)
	{
		code = c;
	}
	
	public String getCode()
	{
		return String.valueOf(code);
	}
	
	public static Couleur getCouleurDefaut()
	{
		return Couleur.Noir;
	}
	
	
}
