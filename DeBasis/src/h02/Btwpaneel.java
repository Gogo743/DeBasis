package h02;

import javax.swing.*;
import java.awt.event.*;

/*
 * Invoer:	bedrag inclusief BTW 
 * 			BTW percentage
 * Melden:	bedrag exclusief BTW
 * 			bedrag van de BTW
 */

public class Btwpaneel extends JPanel implements ActionListener 
{
	private JTextField bedragInclusiefBtwVeld;
	private JTextField percentageBtwVeld;
	private JButton berekenknop;
	private JTextArea resultaatVeld;
	
	/*
	 * maak paneel met invoervelden en berekenknop
	 */
	public Btwpaneel()
	{
		berekenknop = new JButton("Bereken btw");
		berekenknop.addActionListener(this);
		bedragInclusiefBtwVeld = new JTextField("100",6); // veld groot genoeg voor een bedrag van 6 cijfers 
		percentageBtwVeld = new JTextField("20",2); // veld groot genoeg voor een percentage van 2 cijfers 
		// 5 regels van 30 tekens
		resultaatVeld = new JTextArea(5,30);
		// voeg de elementen toe aan het paneel
		add(new JLabel("Bedrag inclusief BTW"));
		add(bedragInclusiefBtwVeld);
		add(new JLabel("BTW-percentage"));
		add(percentageBtwVeld);
		add(berekenknop);
		add(resultaatVeld);
	}
	
	/*
	 * bereken de resultaten en meld de uitkomsten
	 */
	public void toonResultaat(double bedragInclusiefBtw, double percentageBtw)
	{
		double bedragExclusiefBtw = 100 / (100 + percentageBtw) * bedragInclusiefBtw;
//		System.out.println("Waarde van percentageBtw: " + percentageBtw); // debug
//		System.out.println("Waarde van bedragInclusiefBtw: " + bedragInclusiefBtw); // debug
//		System.out.println("Waarde van bedragExclusiefBtw: " + bedragExclusiefBtw); // debug
		double btwBedrag = bedragInclusiefBtw - bedragExclusiefBtw;
		// afronden op 2 getallen achter de komma
		bedragExclusiefBtw = (int) (bedragExclusiefBtw * 100 + 0.5) / 100.0;
		btwBedrag = (int) (btwBedrag * 100 + 0.5) / 100.0;
		// resultaat tonen in resultaatveld
		String resultaat = "Bedrag exclusief BTW: " + bedragExclusiefBtw + 
		"\n" + "Bedrag van de BTW: " + btwBedrag;
		resultaatVeld.setText(resultaat);
	}
	
	/*
	 * haal gegevens op uit de velden en roep de methode
	 * toonResultaat aan 
	 */
	public void actionPerformed(ActionEvent e)
	{
		double bedragInclusiefBtw = Double.parseDouble(bedragInclusiefBtwVeld.getText());
		double percentageBtw = Double.parseDouble(percentageBtwVeld.getText());
		toonResultaat(bedragInclusiefBtw, percentageBtw);
	}
}
