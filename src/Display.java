//JMJ
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Display extends JFrame implements ActionListener{
	
	private int width;
	private int height;
	JButton startBtn = new JButton();

	
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
	
	
	//Title Screen Method
	private JPanel titleScreen() {
		//Create JPanel component
		JPanel screen = new JPanel();
		
		//Edit Start Button
		this.startBtn.setBounds(width/2-35,height/2-10,70,20);
		this.startBtn.setText("Start");
		this.startBtn.addActionListener(this);
		this.startBtn.setHorizontalTextPosition(JButton.CENTER);
		this.startBtn.setVerticalAlignment(JButton.BOTTOM);
		this.startBtn.setFocusable(false);
		
		//Add button
		screen.add(this.startBtn);
		
		//Create title text
		JLabel titleTxt = createLabel("Generic Snake Game");
		titleTxt.setFont(new Font("Serif", Font.PLAIN, 24));
		titleTxt.setVerticalAlignment(JLabel.TOP);
		titleTxt.setHorizontalAlignment(JLabel.CENTER);
		
		//Set background color and bounds of panel
		screen.setBackground(new Color(29, 133, 41));
		screen.setBounds(0,0,this.width,this.height);
		
		//Add text
		screen.add(titleTxt);
		
		//Return Screen
		return screen;
	}
	
	//Add event listener
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == this.startBtn) {
			System.out.println("I've been pressed!");
		}
	}
	
	
}
