/*
* Author : laurenkwong
* Date : Jun. 14, 2021
* Description : Ce programme permet de recevioir les numéros de téléphone
* de format différents valide (pour l'amérique du nord) et 
* les reformate en un format unique choisi
* On utilise ici des expressions régulières tant pour la vérification
* du format que pour les reformattages
*/

package lauren_juin;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNewFormat {

	public static void main(String[] args) 
	{
		// Expression régulière à respecter
		String regex="^\\(?([0-9]{3})\\)?[-.\\s]?([0-9]{3})?[-.\\s]([0-9]{4})$";
				
		// Liste de numéroes de tel
		List<String> tel=new ArrayList<String>();
		Scanner crayon=new Scanner(System.in);
		int k=0;
		String input ="";
		for(int i=0;i<5;i++)
		{
			k=i+1;
			System.out.println("Inscrire le numéro du télephone "+k);
			input=crayon.nextLine();
			tel.add(input);
		}
		crayon.close();
		
		Pattern pattern=Pattern.compile(regex); 
		for(String phone:tel)
		{
			Matcher matcher=pattern.matcher(phone);
			if (matcher.matches())
				System.out.println(matcher.replaceFirst("($1) $2-$3"));
		}
			
	}

}
