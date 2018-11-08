import java.io.File;
import java.io.IOException;
import java.util.*;

public class Test {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		Rond rondrand = FigureUtil.getRandomRond();
		Rectangle rectrand = FigureUtil.getRandomRectangle();
		
		rondrand.affiche();
		rectrand.affiche();
		
		Point p = new Point(5,10);
		System.out.println(p.getX());
		System.out.println(p.getY());
		System.out.println(p);
		
		Rond ro = new Rond(p, 25);
		ro.affiche();

		Rectangle re = new Rectangle(p, 20, 25);
		re.affiche();
		
		Dessin d = new Dessin();
		d.addAll(FigureUtil.genere(20));
		
		Collection<Figure> c = FigureUtil.trieDominant(d);
		
		try
		{
			FigureUtil.imprime(d);
			FigureUtil.sauvegarde(d, File.createTempFile("xxx", ".txt"));
		}
		catch(ImpressionHorsLimiteException ex)
		{
			System.out.println("Impression hors limite : " + ex.getMessage());
		}
		catch(IOException ex)
		{
			System.out.println("Erreur à l'écriture du fichier : " + ex.getMessage());
		}
		
		
	}

}
