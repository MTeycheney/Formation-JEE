import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.*;

public class FigureUtil {

	private static int MIN_X = 0;
	private static int MAX_X = 100;
	private static int MIN_Y = 0;
	private static int MAX_Y = 100;

	private static int MAX_TAILLE = 20;

	private FigureUtil()
	{
		
	}

	private static final Map<String, Figure> figures = new HashMap<String, Figure>();
	
	public static Rond getRandomRond()
	{
		int rayon = getRandomInt(1, MAX_TAILLE / 2);
		Point centre = getRamdomPoint(MIN_X + MAX_TAILLE / 2, MIN_Y - MAX_TAILLE / 2, MAX_X + MAX_TAILLE / 2,
				MAX_Y - MAX_TAILLE / 2);
		Rond r = new Rond(centre, rayon);
		figures.put(r.getKey(), r);
		return r;
	}

	public static Rectangle getRandomRectangle()
	{
		int largeur = getRandomInt(1, MAX_TAILLE);
		int hauteur = getRandomInt(1, MAX_TAILLE);
		Point p = getRamdomPoint(MIN_X, MIN_Y, MAX_X - largeur, MAX_Y - hauteur);
		Rectangle r = new Rectangle(p, hauteur, largeur);
		figures.put(r.getKey(), r);
		return r;
	}

	private static int getRandomInt(int min, int max)
	{
		return (int) (Math.random() * (max - min)) + min;
	}

	private static Point getRamdomPoint(int min_x, int min_y, int max_x, int max_y) {
		int x = getRandomInt(min_x, max_x);
		int y = getRandomInt(min_y, max_y);
		return new Point(x, y);
	}
	
	private static Figure getRandomFigure()
	{
		byte choix = (byte)(Math.random() * 4);
		switch (choix) {
		case 0: return getRandomRond();
		case 1 : return getRandomRectangle();
		case 2 : return getRandomCarre();
		case 3 :
		default:
			return getRandomSegment();
		}
	}
	
	private static Carre getRandomCarre()
	{
		int cote = getRandomInt(1, MAX_TAILLE);
		Point p = getRamdomPoint(MIN_X, MIN_Y, MAX_X - cote, MAX_Y - cote);
		Carre c = new Carre(p, cote);
		figures.put(c.getKey(), c);
		return c;
	}

	private static Segment getRandomSegment()
	{
		int longueur = getRandomInt(1, MAX_TAILLE);
		boolean horizontal = Math.random() < 0.5;
		Point p = getRamdomPoint(MIN_X, MIN_Y, MAX_X - (horizontal ? longueur : 0), MAX_Y - (horizontal ? 0 : longueur));
		Segment s = new Segment(p, longueur, horizontal);
		figures.put(s.getKey(), s);
		return new Segment(p,  longueur, horizontal);
	}
	
	
	public static Iterator<Point> getPoints(Figure...figures)
	{
		Collection<Point> c = new HashSet<>();
		
		for(Figure f : figures)
		{
			Iterator<Point> it = f.getPoints();
			while (it.hasNext())
			{
				c.add(it.next());
				
			}
		}
		
		return c.iterator();
	}
	
	public static void imprime(Dessin d) throws IOException, ImpressionHorsLimiteException
	{
		File file = File.createTempFile("mondessin", ".txt");
		PrintWriter sortie = new PrintWriter(new FileOutputStream(file));
		Iterator<Figure> it = d.getFigures();
		
		while (it.hasNext())
		{
			Figure f = it.next();
			sortie.println(it.next());
			Iterator<Point> itp = f.getPoints();
			
			while (itp.hasNext())
			{
				Point p = itp.next();
				
				if (p.getX()<MIN_X||p.getX()>MAX_X||p.getY()<MIN_Y||p.getY()>MAX_Y)
				{
					throw new ImpressionHorsLimiteException();
				}
						
			}
			
		}
		
		for (int i = 0; i < 100; i++)
		{
			sortie.println("=");
		}
		sortie.println();
		
		for (int y = MAX_Y; y > MIN_Y ; y-- )
		{
			for (int x = MIN_X; x < MAX_X ; x++)
			{
				Figure f = getFigureEn(new Point(x,y), d);
				if (f == null)
				{
					sortie.println(" ");
				}
				else
				{
					sortie.println(f.getCouleur().getCode());
				}
			}
			sortie.println();
		}
		
		sortie.close();
		System.out.println("Dessin imprimé dans " + file.getAbsolutePath());
		
	}

	public static Collection<Figure> genere(int nb){
		Collection<Figure> collection = new HashSet<>();
		while(collection.size()<nb) {
			collection.add(getRandomFigure());
		}
		return collection;
	}
	
	public static Figure getFigureEn(Point p, Dessin d)
	{
		Iterator<Figure> it = d.getFigures();
		
		while (it.hasNext())
		{
			Figure f = it.next();
			if(f.couvre(p))
			{
				return f;
			}
		}
		return null;
	}
	
	public static Figure procheZero(Dessin d)
	{
		Iterator<Figure> it = d.getFigures();
		// Collection<Figure> figures = new ArrayList<Figure>();
		TreeSet<Figure> figures = new TreeSet<Figure>();
		
		while (it.hasNext())
		{
			figures.add(it.next());			
		}
		
		return figures.first();
		// return Collections.min(figures);
	}
	
	public static Collection<Figure> trieDominant(Dessin d)
	{
		Iterator<Figure> it = d.getFigures();
		List<Figure> figures = new ArrayList<Figure>();
		
		
		while (it.hasNext())
		{
			figures.add(it.next());			
		}
		
		Collections.sort(figures, new Comparator<Figure>()
		{
			public int compare(Figure f1, Figure f2)
			{
				int s1 = 0;
				int s2 = 0;
				
				if (f1 instanceof Surfacable)
				{
					s1 = (int) ((Surfacable)f1).surface();
				}
				
				if (f2 instanceof Surfacable)
				{
					s2 = (int) ((Surfacable)f2).surface();
				}
				
				return s2 - s1;
			}
		});
		
		return figures;
	}
	
	public static Figure get(String id)
	{
		Figure f = figures.get(id);
		if(f == null)
		{
			f = getRandomFigure();
		}
		
		return f;
	}
	
	public static void sauvegarde(Dessin d, File f) throws IOException
	{
		ObjectOutputStream sortie =  new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(f)));
		sortie.writeObject(d);
		System.out.println("Dessin sauvegardé dans " + f.getAbsolutePath());
		sortie.close();
	}
	
	public static Dessin charge(File file) throws IOException, ClassNotFoundException
	{
		Dessin dessin;
		
		try
		{
			ObjectInputStream entree = new ObjectInputStream(new BufferedInputStream(new FileInputStream(file)));
			dessin = (Dessin)entree.readObject();
			entree.close();
		}
		catch(FileNotFoundException ex)
		{
			System.out.println("Fichier non trouvé : " +ex.getMessage());
			dessin = new Dessin();
		}
		
		return dessin;
	}
	
}
