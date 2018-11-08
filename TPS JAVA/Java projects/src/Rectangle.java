import java.io.Serializable;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class Rectangle extends Figure implements Surfacable, Serializable
{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4350003232042646724L;
	
	private Point bg;
	private Point bd;
	private Point hg;
	private Point hd;
	
	public Rectangle(Point p, int hauteur, int largeur)
	{
		this(p,hauteur, largeur, Couleur.getCouleurDefaut());
	}
	
	public Rectangle(Point p, int hauteur, int largeur, Couleur couleur)
	{
		super(couleur);
		this.bg = new Point(p.getX(), p.getY());
		this.bd = new Point(p.getX() + largeur, p.getY());
		this.hg = new Point(p.getX(), p.getY() + hauteur);
		this.hd = new Point(p.getX() + largeur, p.getY() + hauteur);

	}
	
	public Point getPointBasGauche()
	{
		return bg;
	}
	
	public Point getPointBasDroit()
	{
		return bd;
	}
	
	public Point getPointHautGauche()
	{
		return hg;
	}
	
	public Point getPointHautDroit()
	{
		return hd;
	}
	
	protected String getType()
	{
		return "RECT";
	}
	
	public String toString()
	{
		return "[ " + getType() + " " + getPointBasGauche() + getPointBasDroit() + getPointHautGauche() + getPointHautDroit() + "]";
	}
	
	public Point getCentre()
	{
		int centrex = (bg.getX() + hd.getX()) / 2;
		int centrey = (bg.getY() + hd.getY()) / 2;
		return new Point(centrex, centrey);
	}

	public double surface()
	{
		int largeur = (bd.getX() - bg.getX());
		int longueur = (hg.getY() - bg.getY());
		return largeur * longueur;
	}
	
	public Iterator<Point> getPoints()
	{
		Collection<Point> c = new HashSet<>();
		c.add(bg);
		c.add(bd);
		c.add(hg);
		c.add(hd);
		
		return c.iterator();
	}
	
	public boolean couvre(Point p)
	{
		boolean estCouvertX = (bg.getX() <= p.getX()) && (p.getX() <= bd.getX());
		boolean estCouvertY = (bg.getY() <= p.getY()) && (p.getY() <= hg.getY());
	
		return estCouvertX && estCouvertY;
	}
	
	public boolean equals(Object obj)
	{
		if (obj instanceof Rectangle)
		{
			Rectangle rec = (Rectangle) obj;
			return bg.equals(rec.bg) && hd.equals(hd) && couleur == rec.couleur;
		}
		return false;
	}
	
}