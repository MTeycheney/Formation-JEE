<%@page import="java.util.Enumeration"%>
<%@ page import = "java.util.Map" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Insert title here</title>
	</head>
	<body>
		 1) Cr�er une jsp qui affiche des informations sur la requ�te:<br>
		 � liste des param�tres et de leur valeurs<br>
		 � liste des attributs de requ�te et de session et de leur valeurs<br>
		 2) Modifier la page si n�cessaire pour utiliser des �l�ments de la JSTL<br>
		 
		 <form method="get">
		 	<input type="text" name="nom" placeholder="Entrez du texte..."></input>
		 	<input type="text" name="prenom" placeholder="Entrez du texte..."></input>
		 	<input type="submit" value="Valider"></input>
		 </form>
		<br>
		
		<%
				
				Enumeration<String> mesChamps = request.getParameterNames(); // On stocke les attributs name du formulaire, obtenus en param�tres de la requ�te, dans un enum "mesChamps" de type String. 
				while(mesChamps.hasMoreElements()) // On parse l'enum et pour chaque �l�ment pr�sent:
				{
					String champActuel = mesChamps.nextElement(); // On stocke cet �l�ment dans une variable de type String.
					
					String value = request.getParameter(champActuel); // On stocke ensuite la valeur de cet �l�ment dans une variable de type String.
					
					out.println(champActuel + " = " + value + "<br/>"); // Enfin, on affiche le r�sultat sous forme de: "name" du champ du formulaire + sa valeur.
				}
				
				
		%>
      	
	</body>
</html>