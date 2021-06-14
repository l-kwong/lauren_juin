/*
* Author : laurenkwong
* Date : Jun. 14, 2021
* Description : Introduction sur les expressions régulières
* 				étapes/structure
*/

package lauren_juin;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExp1 {

	public static void main(String[] args) 
	{
		Scanner crayon=new Scanner(System.in);
		
		// input est le texte dans lequel l'expressio sera recherchée
		System.out.println("Inscrire le texte pour la recherche");
		String input = crayon.nextLine();
		// Expression à rechercher
		System.out.println("Inscrire le texte recherché");
		String regEx = crayon.nextLine();
		
		// Étape 1 : Utliser Pattern 
		Pattern pattern = Pattern.compile(regEx,Pattern.CASE_INSENSITIVE);
		
		// Étape 2 : Allouer un objet Matcher pour l'entrée spécifié
		Matcher matcher = pattern.matcher(input);
		
		//Étape 3 : Vérifier la concordance et afficher le résultat
		
		// =====================================================
		
		// on peut utiliser find()
		//while (matcher.find())
		//{
		//	System.out.println(("Le(s) mot(s) \"" + matcher.group()
		//			+ "\" débute à l'indice " + matcher.start()
		//			+ " et finit à l'indice " + matcher.end()));
		//}
		
		// =====================================================
		
		// Utiliser matches() ; doit correspondre entièrement à tout le text
		//if (matcher.matches())
		//{
		//	System.out.println("Les deux textes sont les mêmes");
		//} else {
		//	System.out.println("Les deux textes sont différentes");
		//}

		// =====================================================
		
		// Utiliser lookingAt()
		if (matcher.lookingAt()) 
		{
			System.out.println("On a trouvé \"" +
					matcher.group() + "\" commençant à l'indice " + matcher.start() +
					" et finit à l'indice " + matcher.end());
		} else 
		{
			System.out.println("Le texte ne se trouve pas au début");
		}
	}

}
