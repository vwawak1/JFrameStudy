//JMJ
import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Display extends JFrame {
	
	private int width;
	private int height;
	
	//Constructor for the display
	public Display(int width, int height) {
		this.width = width;
		this.height = height;
		
		//Display Data + Creation
		setSize(width, height); //Set size of window
		setTitle("Snek Game"); //Set title of window
		setDefaultCloseOperation(EXIT_ON_CLOSE); //Set close operation
		setResizable(false); //Set whether the window should be resized
		setLocationRelativeTo(null); //Center the window
		setVisible(true); //Set window to appear visible
		getContentPane().setBackground(new Color(0,0,0));  //Set background colors
		
		//Add Title Screen Panel On Start
		add(titleScreen());
		
	}
	
	private JLabel createLabel(String txt) {
		return new JLabel(txt);
	}
	
	private JPanel titleScreen() {
		//Create JPanel component
		JPanel screen = new JPanel();
		
		//Create title text
		JLabel titleTxt = createLabel("Generic Snake Game");
		titleTxt.setFont(new Font("Serif", Font.PLAIN, 24));
		titleTxt.setVerticalAlignment(JLabel.TOP);
		titleTxt.setHorizontalAlignment(JLabel.CENTER);
		
		//Create Start Button
		JButton startBtn = new JButton();
		startBtn.setBounds(width/2-35,height/2-10,70,20);
		startBtn.setText("Start");
		
		//Set background color and bounds of panel
		screen.setBackground(new Color(29, 133, 41));
		screen.setBounds(0,0,this.width,this.height);
		
		//Add text and button
		screen.add(titleTxt);
		screen.add(startBtn);
		
		//Return Screen
		return screen;
	}
	
}
