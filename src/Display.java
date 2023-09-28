//JMJ
import javax.swing.JFrame;

public class Display extends JFrame {
	
	//Constructor for the display
	public Display(int width, int height) {
		//set window title, on close event, and resizing
		setSize(width, height);
		setTitle("Snek Game");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		
		//Centers the window and makes visible
		setLocationRelativeTo(null);
		setVisible(true);
	}
	

	
	
}
