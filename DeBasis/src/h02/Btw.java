package h02;

import javax.swing.*;

/*
 * Hoofdstuk 2, voorbeeld: BTW-calculator
 * 
 * Bereken het BTW-bedrag en de prijs exc. BTW.
 * Geef het bedrag incl. BTW op en het BTW-percentage
 */

public class Btw extends JFrame
{
	// maak een venster en stel enkele eigenschappen ervan in;
	// geef het venster een paneel als inhoud
	public Btw()
	{ 
		JFrame venster = new JFrame();
		// 360 horizontaal: ruimte voor label en tekstvak
		// 250 verticaal: 	ruimte voor twee regels invoer.
		//					knop en tekstvak voor resultaat
		venster.setSize(360,250);
		venster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		venster.setTitle("BTW berekenen");
		venster.setLocation(100, 100); // niet helemaal linksboven
		JPanel hoofdpaneel = new Btwpaneel();
		venster.add(hoofdpaneel);
		venster.setVisible(true);
	} 
	
	public static void main( String[ ] args)
	{
		new Btw();
	}
}
