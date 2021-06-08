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

public class Exercice2 {
	
	public static void main(String[] args)	throws IOException,FileNotFoundException
	{
		BufferedReader entree;
		String ligne;
			entree = new BufferedReader(new FileReader("monCalcul.txt"));
		
			while(entree.ready())
			{
				ligne=entree.readLine();
				System.out.println(ligne);
			}
			entree.close();
	}
}
