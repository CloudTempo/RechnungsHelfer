
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Menu extends JFrame {
	
	public Menu() {
	
	}

	public void initMenu() {
		JMenuItem miNewDefault = new JMenuItem("Default");
		
		JMenuItem checkRestart = new JMenuItem("Restart");
		
		JMenuItem checkResults = new JMenuItem("Rechnungen anzeigen");
		
		// --OPTIONEN--
		JMenu options = new JMenu("Optionen");
		options.add(miNewDefault);
		options.add(checkRestart);
		options.add(checkResults);
		
		JMenuItem about = new JMenuItem("About");
		
		// --HILFE--
		JMenu help = new JMenu("Hilfe");
		help.add(about);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.add(options);
		menuBar.add(help);
		setJMenuBar(menuBar);
		
	}
	//setJMenuBar(menuBar);
}
