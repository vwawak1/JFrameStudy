//JMJ
import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Display extends JFrame {
	
	//Constructor for the display
	public Display(int width, int height) {
		
		//Add title text
		JLabel titleTxt = createLabel("Generic Snake Game");
		titleTxt.setFont(new Font("Serif", Font.PLAIN, 24));
		titleTxt.setVerticalAlignment(JLabel.TOP);
		titleTxt.setHorizontalAlignment(JLabel.CENTER);
		//titleTxt.setForeground));
		
		//Display Data
		setSize(width, height); //Set size of window
		setTitle("Snek Game"); //Set title of window
		setDefaultCloseOperation(EXIT_ON_CLOSE); //Set close operation
		setResizable(false); //Set whether the window should be resized
		setLocationRelativeTo(null); //Center the window
		setVisible(true); //Set window to appear visible
		getContentPane().setBackground(new Color(222, 207, 131));  //Set background colors
		
		//Add label to frame
		add(titleTxt);
		
	}
	
	private JLabel createLabel(String txt) {
		return new JLabel(txt);
	}
	
	
	
}
