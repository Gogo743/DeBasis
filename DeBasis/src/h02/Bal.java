package h02;

import javax.swing.*; // voor JFrame

/*
 * Hoofdstuk 2, voorbeeld: Bal
 * Teken een horizontale lijn met vaste verhouding tot het venster.
 * Midden op de lijn ligt een bal, van een door de gebruiker op te
 * geven grootte. 
 */

public class Bal extends JFrame
{
	// maak een venster met paneel als inhoud 
	public Bal()
	{ 
		JFrame venster = new JFrame();
		// ruim genoeg voor bal
		venster.setSize(600,500);
		venster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		venster.setTitle("Bal");
		venster.setLocation(100, 100); // niet helemaal linksboven
		venster.add(new Balpaneel());
		venster.setVisible(true);
	} 
	
	public static void main( String[ ] args)
	{
		new Bal();
	}
}
