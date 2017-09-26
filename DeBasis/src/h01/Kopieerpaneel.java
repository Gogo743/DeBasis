package h01;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/*
 * Deze klasse maakt een paneel met twee tekstvakken en een 
 * knop en reageert op de knop door veld2 gelijk te maken aan veld1
 */

public class Kopieerpaneel extends JPanel implements ActionListener 
{

	private JButton actieknop;
	private JTextArea gebied1;
	private JTextArea gebied2;
	
	/*
	 * maak paneel met twee tekstvelden en een knop ertussen
	 */
	public Kopieerpaneel()
	{
		setLayout(new FlowLayout(FlowLayout.LEFT,0,0));
		actieknop = new JButton(">Kopieer>");
		actieknop.addActionListener(this);
		gebied1 = new JTextArea(3,40); // ruimte voor 3 regels van 40 letters
		gebied2 = new JTextArea(3,40); // zelfde grootte als gebied1
		add(gebied1);
		add(actieknop);
		add(gebied2);
		gebied1.setToolTipText("Vul in dit vak een woord in");
		gebied2.setToolTipText("Hier komt een kopie van het linkerveld");
		actieknop.setToolTipText("Klik om de tekst van links naar rechts te brengen");
	}
	/*
	 * veld2 krijgt de inhoud van veld1
	 */
	public void actionPerformed(ActionEvent e)
	{
		gebied2.setText(gebied1.getText());
	}
}
