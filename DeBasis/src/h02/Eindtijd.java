package h02;

import javax.swing.*;

/*
 * Hoofdstuk 2, voorbeeld 3: Eindtijdcalculator
 * 
 * Bereken de eindtijd van de afspraak bij een specialist
 * De assistente voert een begin tijd in, uur in twee 
 * getallen (0-23) en minuten in twee getallen (0-59). 
 * Vervolgens wordt de tijdsduur in minuten ingevuld.
 * De duur van de afspraak is geen vaste tijd. Na een
 * klik op de knop berekent het programma de eindtijd. 
 */

public class Eindtijd extends JFrame
{
	// maak een venster en stel enkele eigenschappen ervan in;
	// geef het venster een paneel als inhoud
	public Eindtijd()
	{ 
		JFrame venster = new JFrame();
		// 300 horizontaal: ruimte voor 2 labels en 2 tekstvakken
		// 250 verticaal: 	ruimte voor twee regels invoer.
		//					knop en tekstvak voor resultaat
		venster.setSize(300,250);
		venster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		venster.setTitle("Eindtijd bepalen");
		venster.setLocation(100, 100); // niet helemaal linksboven
		JPanel hoofdpaneel = new Eindtijdpaneel();
		venster.add(hoofdpaneel);
		venster.setVisible(true);
	} 
	
	public static void main( String[ ] args)
	{
		new Eindtijd();
	}
}
