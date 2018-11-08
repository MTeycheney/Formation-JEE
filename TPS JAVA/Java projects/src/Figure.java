import java.io.Serializable;
import java.util.Iterator;

public abstract class Figure implements Comparable<Figure>, Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 145660174120622548L;
	
	private static int maxId = 1;
	private int id;
	protected Couleur couleur;
	
	
	private Figure()
	{
		this.id = maxId++;
	}
	
	public Figure(Couleur couleur)
	{
		this.id = maxId++;
	}
	
	public abstract Iterator<Point> getPoints();
	
	public String getKey()
	{
		return "" + id;
	}
	
	public void affiche()
	{
		System.out.println(this);
	}
	
	public abstract Point getCentre();
	
	public Couleur getCouleur()
	{
		return couleur;
	}
	
	public abstract boolean couvre(Point p);
	
	public double distanceAZero()
	{
		double min = -1;
		final Point zero = new Point();
		Iterator<Point> it = getPoints();
		
		while (it.hasNext())
		{
			Point p = it.next();
			double d = p.distance(zero);
			
			if (d<min || min == -1)
			{
				min = d;
			}
		}
		
		return min;
	}
	
	public int compareTo(Figure f)
	{
		double dd = this.distanceAZero() - f.distanceAZero();
		return (dd == 0) ? 0 : ((dd < 0) ? -1 : 1);
	}
	
}
