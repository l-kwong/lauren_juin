/*
* Author : laurenkwong
* Date : Jun. 4, 2021
* Description : 
*/

package lauren_juin;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Ecrire1 {

	public static void main(String[] args) {
		String Fichier="/Users/laurenkwong/desktop/Ecrire1.txt";
		final String s1="Un autre texte";
		final String s2="\nécrire et vous faire comprendre";
		
		FileWriter ficAEcrire;
		PrintWriter sortie;
		try
		{
			ficAEcrire=new FileWriter(Fichier,true);
			sortie=new PrintWriter(ficAEcrire);
			sortie.print(s1);
			sortie.print(s2);
			sortie.close();
		} catch(IOException ioe)
		{
			System.out.println("Erreur entrée/sortie");
		}

	}

}
