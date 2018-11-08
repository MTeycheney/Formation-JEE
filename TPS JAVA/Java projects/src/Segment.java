import java.io.Serializable;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class Segment extends Figure implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = -7707087748731364834L;
	
	private Point pdebut;
	private Point pfin;
	
	public Segment (Point point, int longueur, boolean horizontal)
	{
		this(point,longueur, horizontal, Couleur.getCouleurDefaut());
	}
	
	public Segment(Point point, int longueur, boolean horizontal, Couleur couleur)
	{
		super(couleur);
		this.pdebut = point;
		int x = point.getX() + (horizontal ? longueur : 0);
		int y = point.getY() + (horizontal ? 0 : longueur);
		this.pfin = point;
	}
	
	public String toString()
	{
		return "[SEGM " + pdebut + pfin + "]";
	}

	
	public Point getCentre()
	{
		int x = (pdebut.getX()+ pfin.getX()) / 2;
		int y = (pdebut.getY()+ pfin.getY()) / 2;;
		return new Point(x,y);
	}
	
	public Iterator<Point> getPoints()
	{
		Collection<Point> c = new HashSet<>();
		c.add(pdebut);
		c.add(pfin);
		return c.iterator();
		
	}
	
	public boolean couvre(Point p)
	{
		boolean estCouvertX = (pdebut.getX() <= p.getX()) && (p.getX() <= pfin.getX());
		boolean estCouvertY = (pdebut.getY() <= p.getY()) && (p.getY() <= pfin.getY());
	
		
		return estCouvertX && estCouvertY;
	}
	
	public boolean equals(Object obj)
	{
		if (obj instanceof Segment)
		{
			Segment s = (Segment) obj;
			return (pdebut.equals(s.pdebut) && pfin.equals(pfin)) || (pdebut.equals(s.pfin) && pfin.equals(pdebut)) && couleur == s.couleur;
		}
		return false;
	}
	
}
