package h01;

import javax.swing.*;

/*
 * Hoofdstuk 1, voorbeeld 1: Kopieer
 * Een venster heeft een paneel met twee tekstvakken en een knop
 * ertussen. Een klik op de knop kopieert de inhoud van het vak
 * links naar het rechtervak
 */

public class Kopieer extends JFrame
{
	// maak een venster en stel enkele eigenschappen ervan in
	// geef het venster een paneel als inhoud
	public Kopieer()
	{ 
		JFrame venster = new JFrame();
		// 500 is voldoende breed voor 2 tekstvakken
		// een knop; 200 is willekeurig
		venster.setSize(500,200);
		venster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		venster.setTitle("Voorbeeld 1 van hoofdstuk 1");
		venster.setLocation(100, 100); // niet helemaal linksboven
		JPanel hoofdpaneel = new Kopieerpaneel();
		venster.add(hoofdpaneel);
		venster.setVisible(true);
	} 
	
	public static void main( String[ ] args)
	{
		new Kopieer();
	}
}
