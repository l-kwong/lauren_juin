/*
* Author : laurenkwong
* Date : Jun. 4, 2021
* Description : 
*/

package lauren_juin;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Exemple4 {
	
	public static void main(String[] args)	throws IOException,FileNotFoundException
	{
		BufferedReader entree;
		int c;
		
			entree = new BufferedReader(new FileReader("monFichier.txt"));
			
			while(entree.ready())
			{
				c=entree.read();
				System.out.print((char) c);
			}
			
			entree.close();
	}

}
