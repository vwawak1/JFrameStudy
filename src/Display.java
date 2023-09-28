//JMJ
import java.awt.*;
import javax.swing.*;

public class Display extends JFrame{

	//Instantiate a canvas
	private Canvas canvas;
	
	//Constructor for the display
	public Display(int width, int height) {
		//set window title, on close event, and resizing
		setTitle("Snek Game");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		
		//Create canvas
		canvas = new Canvas();
		
		//Set canvas to declared width and height using Dimension data type
		canvas.setPreferredSize(new Dimension(width, height));
		
		//Make window unfocusable (test)
		canvas.setFocusable(false);
		add(canvas);
		pack();
		
		//Centers the window and makes visible
		setLocationRelativeTo(null);
		setVisible(true);
		
	}
	
	
}
