import java.io.Serializable;

public class Point implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = -6142265591080980286L;
	
	private int abscisse;
	private int ordonnee;
	
	static final int init_x = 0;
	static final int init_y = 0;
	
	public Point(int abs, int ord)
	{
		abscisse = abs;
		ordonnee = ord;
	}
	
	/*
	 * TP12
	 */
	public Point()
	{
		this.abscisse = init_x;
		this.ordonnee = init_y;
		
	}
	
	public int getX()
	{
		return abscisse;
	}
	
	public int getY()
	{
		return ordonnee;
	}
	
	public String toString()
	{
		String coor = "[" + getX() + ";" + getY() + "]";
		return coor;
	}
	
	/*
	 *  TP11: Compléter la classe Point avec une méthode equals qui renvoie vrai si et seulement les X et les Y des
	deux points comparés sont les mêmes.
	 */
	

	
	protected Point clone()
	{
		return new Point(abscisse, ordonnee);
	}
	

	public boolean Equals(Object obj)
	{
		if(obj instanceof Point)
		{
			Point point = (Point) obj;
			return (this.abscisse == point.abscisse) && (this.ordonnee == point.ordonnee);
		}
		else
		{
			return false;
		}
	}
	
	public double distance(Point p)
	{
		int dx = p.getX() - this.getX();
		int dy = p.getY() - this.getY();
		int dx2 = dx * dx;
		int dy2 = dy * dy;
		return Math.sqrt(dx2 + dy2);
	}
	
}
