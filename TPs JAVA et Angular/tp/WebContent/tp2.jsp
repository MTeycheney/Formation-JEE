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
		 1) Créer une jsp qui affiche des informations sur la requête:<br>
		 § liste des paramètres et de leur valeurs<br>
		 § liste des attributs de requête et de session et de leur valeurs<br>
		 2) Modifier la page si nécessaire pour utiliser des éléments de la JSTL<br>
		 
		 <form method="get">
		 	<input type="text" name="nom" placeholder="Entrez du texte..."></input>
		 	<input type="text" name="prenom" placeholder="Entrez du texte..."></input>
		 	<input type="submit" value="Valider"></input>
		 </form>
		<br>
		
		<%
				
				Enumeration<String> mesChamps = request.getParameterNames(); // On stocke les attributs name du formulaire, obtenus en paramètres de la requête, dans un enum "mesChamps" de type String. 
				while(mesChamps.hasMoreElements()) // On parse l'enum et pour chaque élément présent:
				{
					String champActuel = mesChamps.nextElement(); // On stocke cet élément dans une variable de type String.
					
					String value = request.getParameter(champActuel); // On stocke ensuite la valeur de cet élément dans une variable de type String.
					
					out.println(champActuel + " = " + value + "<br/>"); // Enfin, on affiche le résultat sous forme de: "name" du champ du formulaire + sa valeur.
				}
				
				
		%>
      	
	</body>
</html>