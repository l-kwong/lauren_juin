/*
* Author : laurenkwong
* Date : Jun. 8, 2021
* Description : 
*/

package lauren_juin;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Exercice1 {

	public static void main(String[] args)	
	{
		FileReader ficALire;
		BufferedReader entree;
		
		char c;
		int count=0;
		try {
			ficALire=new FileReader("/Users/laurenkwong/desktop/monFichier.txt");
			entree = new BufferedReader(ficALire);
			
			while (entree.ready())
			{
				c= (char) entree.read();
				
				if(c=='a')
				{
					count++;
				}
			}
			
			System.out.println("Il y a " + count + " caractéres 'a' dans le texte");
			entree.close();
		} catch (FileNotFoundException fnf) {
			System.out.println("Le fichier ne peut pas être lu");
		} catch (IOException ioe) {
			System.out.println("Erreur d'entrée");
		}
		
	}
}