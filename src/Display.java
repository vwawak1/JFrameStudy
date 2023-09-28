//JMJ
import java.awt.Color;
import javax.swing.JFrame;

public class Display extends JFrame {
	
	//Constructor for the display
	public Display(int width, int height) {
		
		setSize(width, height); //Set size of window
		setTitle("Snek Game"); //Set title of window
		setDefaultCloseOperation(EXIT_ON_CLOSE); //Set close operation
		setResizable(false); //Set whether the window should be resized
		setLocationRelativeTo(null); //Center the window
		setVisible(true); //Set window to appear visible
		//ImageIcon logo = new ImageIcon("/filename/");
		//setIconImage(logo.getImage());
		getContentPane().setBackground(new Color(222, 207, 131));
		
	}
	

	
	
}
