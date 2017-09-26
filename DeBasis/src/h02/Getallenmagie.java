package h02;

import javax.swing.*;

/*
 * Maak een paneel waar een drie cijferig getal ingevoerd kan worden. Door middel van
 * een druk op een knop wordt dat zelfde getal er nog eens achter gezet. Dat getal wordt
 * gedeeld door 7, door het oorspronkelijke getale en door 11. De uitkomst wordt in een
 * tekstvak weergegeven. 
 */

public class Getallenmagie extends JFrame 
{
	public Getallenmagie()
	{
		JFrame venster = new JFrame();
		venster.setSize(500, 200);
		venster.setLocation(200, 200);
		venster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		venster.setTitle("Getallenmagie");
		JPanel hoofdpaneel = new Getallenmagiepaneel();
		venster.add(hoofdpaneel);
		venster.setVisible(true);
	}
	
	public static void main( String[] args)
	{
		new Getallenmagie();
	}
}
