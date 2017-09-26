package h02;

import javax.swing.*;
import java.awt.event.*;

/*
 * Invoer:	begintijd	uren: (0-23) 
 * 			begintijd	minuten: (0-59)
 * 			tijdsduur in minuten
 * Melden:	eindtijd
 */

public class Eindtijdpaneel extends JPanel implements ActionListener 
{
	private JTextField begintijdUrenVeld;
	private JTextField begintijdMinutenVeld;
	private JButton berekenknop;
	private JTextField resultaatVeld;
	private JTextField tijdsduurVeld;
	
	/*
	 * maak paneel met invoervelden en berekenknop
	 */
	public Eindtijdpaneel()
	{
		berekenknop = new JButton("Bereken eindtijd");
		berekenknop.addActionListener(this);
		// tekstvakken met willekeurige defaultwaarden
		// groot genoeg voor een getal van 2 cijfers
		begintijdUrenVeld = new JTextField("00",2); 
		begintijdMinutenVeld = new JTextField("00",2);
		// groot genoeg voor een getal van 3 cijfers
		tijdsduurVeld = new JTextField("0",3);
		// groot genoeg voor 25 tekens
		resultaatVeld = new JTextField(25);
		// voeg de elementen toe aan het paneel
		add(new JLabel("Begintijd Uren"));
		add(begintijdUrenVeld);
		add(begintijdMinutenVeld);
		add(new JLabel("Minuten"));
		add(new JLabel("Tijdsduur in minuten"));
		add(tijdsduurVeld);
		add(berekenknop);
		add(resultaatVeld);
	}
	
	/*
	 * bereken de resultaten en meld de uitkomsten
	 */
	public void toonResultaat(int begintijdUren, int begintijdMinuten, int tijdsduur)
	{
		int tijdsduurUren = tijdsduur / 60;
		int tijdsduurMinuten = tijdsduur - (tijdsduurUren * 60);  
		int minutenZijnUren = (begintijdMinuten + tijdsduurMinuten);
		int extraUren = minutenZijnUren / 60;
		int eindtijdMinuten = minutenZijnUren - (extraUren * 60);
		int eindtijdUren = tijdsduurUren + extraUren + begintijdUren;
		
		String resultaat = "De eindtijd is: " + eindtijdUren + 
		" uur: " + eindtijdMinuten;
		resultaatVeld.setText(resultaat);
	}
	
	/*
	 * haal gegevens op uit de velden en roep de methode
	 * toonResultaat aan 
	 */
	public void actionPerformed(ActionEvent e)
	{
		try
		{
			int begintijdUren = Integer.parseInt(begintijdUrenVeld.getText());
			int begintijdMinuten = Integer.parseInt(begintijdMinutenVeld.getText());
			int tijdsduur = Integer.parseInt(tijdsduurVeld.getText());
			toonResultaat(begintijdUren, begintijdMinuten, tijdsduur);
		}
		catch (NumberFormatException exeptionObject)
		{
			JOptionPane.showMessageDialog(null, "U heeft een verkeerde tijdsindicatie opgegeven", 
					"Verkeerde invoer", JOptionPane.WARNING_MESSAGE);
		}
	}
}
