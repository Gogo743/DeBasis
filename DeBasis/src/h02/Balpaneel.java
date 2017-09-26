package h02;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Balpaneel extends JPanel implements ActionListener 
{
	private JTextField balGrootteVeld; // Veld voor de grootte van de bal
	private JButton tekenknop; // om opnieuw tekenen te forceren
	private int balGrootte;
	
	/*
	 * maak een paneel met drie invoervelden en tekenknop
	 */
	public Balpaneel()
	{
		tekenknop = new JButton("Teken");
		tekenknop.addActionListener(this);
		balGrootteVeld = new JTextField("300",3); // veld voor een een grootte t/m 999 pixels
		balGrootteVeld.addActionListener(this);
		bepaalGrootteBal();
		// voeg onderdelen toe aan paneel
		add(new JLabel("Grootte"));
		add(balGrootteVeld);
		add(tekenknop);
	}
	
	/*
	 * bereken het huidige midden en teken de paraplu
	 */
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		int vensterBreedte = getWidth();
		System.out.println(vensterBreedte);
		int vensterHoogte = getHeight();
		int midden = vensterBreedte / 2; // midden van het scherm, locatie waar de bal op de lijn ligt
		int balOvaalCenter = balGrootte / 2;
		g.setColor(Color.green);
		g.drawLine(30, vensterHoogte - 30, vensterBreedte - 30, vensterHoogte - 30);
		g.setColor(Color.orange);
		g.fillOval(midden - (balGrootte / 2), vensterHoogte - balGrootte - 30, balGrootte, balGrootte);
		g.setColor(Color.black);
		g.drawOval(midden - (balGrootte / 2), vensterHoogte - balGrootte - 30, balGrootte, balGrootte);
		g.drawOval(midden - (balGrootte / 4), vensterHoogte - balGrootte - 30, balOvaalCenter, balGrootte);
	}
	
	/*
	 * haal de balgrootte uit het invulvak
	 */
		public void bepaalGrootteBal()
	{
		balGrootte = Integer.parseInt(balGrootteVeld.getText());
	}
				
	// geklikt op de knop
	public void actionPerformed(ActionEvent e)
	{
		bepaalGrootteBal(); // nieuwe grootte vastleggen
		repaint(); // opnieuw tekenen
	}
}
	