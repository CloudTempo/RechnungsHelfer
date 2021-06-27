
import java.awt.Dimension;
import javax.swing.JFrame;

public class GUI extends JFrame {
	
	Menu AA = new Menu(); //Damit ich die initMenu() Methode aufrufen kann.
						// Somit habe ich die Klasse ausgelagert.
	
	public GUI() {
		setTitle("McCann Rechnung"); // Fenstertitel
		setDefaultCloseOperation(DISPOSE_ON_CLOSE); // Schließen-Aktion
		setPreferredSize(new Dimension(400, 400)); // bevorz. Fenstergröße
		setResizable(false); // Fenstergröße nicht manuell änderbar
		AA.initMenu(); // Fenster-Menü initialisieren (siehe Methode unten!)
		pack(); // Fenstergröße anpassen
		setLocationRelativeTo(null); // Fensterposition
		setVisible(true); // Fenster anzeigen
	}
	
}
