import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Dessin implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 2259923153208398828L;
	
	private Collection<Figure> figures = new ArrayList<Figure>();
	
	public Dessin()
	{
		
	}
	
	public boolean add(Figure figure)
	{
		return figures.add(figure);
	}
	
	public Iterator<Figure> getFigures()
	{
		return figures.iterator();
	}
	
	public boolean addAll(Collection<Figure> figures)
	{
		return this.figures.addAll(figures);
	}
	
}
