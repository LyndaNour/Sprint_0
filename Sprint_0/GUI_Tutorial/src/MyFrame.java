import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MyFrame extends JFrame implements ActionListener {

	JButton newGamebutton ;
	JButton replayButton;
	JButton textButton;
	JRadioButton simpleGame;
	JRadioButton generalGame;
	JRadioButton humanPlayer1;
	JRadioButton computerPlayer1;
	JRadioButton s1;
	JRadioButton o1;
	JRadioButton humanPlayer2;
	JRadioButton computerPlayer2;
	JRadioButton s2;
	JRadioButton o2;
	JTextArea textArea;
	JCheckBox checkBox;
	ImageIcon iconImage;
	
	MyFrame(){
		
		// Set Frame
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setSize(800,800);
		this.setTitle("SOS Game");
		this.getContentPane().setBackground(Color.darkGray);
		iconImage = new ImageIcon("sos.png");
		this.setIconImage(iconImage.getImage());
		
		//JPanel
		JPanel panel = new JPanel();
		panel.setBounds(10,50,700,500);
		panel.setLayout(null);
		panel.setBackground(new Color(504521));
		this.add(panel);
		
		// add a title
		
		JLabel titleLabel = new JLabel(" This is SOS Game");
		titleLabel.setBounds(289,25,200,20);
		titleLabel.setFont(new Font("serif", Font.BOLD,20));
		panel.add(titleLabel);
		
		//Set text area
		textArea = new JTextArea();
		textArea.setText("write here");
		textArea.setForeground(Color.red);
		textArea.setBackground(Color.white);
		textArea.setFont(new Font("arial", Font.BOLD,15));
		textArea.setLineWrap(true);
		textArea.setBounds(200,170,300,70);
		panel.add(textArea);
		this.setVisible(true);
		
		//Set submit text button
		textButton=new JButton();
		textButton.setText("click to submit text");
		textButton.setBounds(270,250,150,20);
		textButton.setFocusable(false);
		textButton.addActionListener(this);
		panel.add(textButton);
		
		//New game button
		newGamebutton = new JButton();
		newGamebutton.setBounds(570,420,100,30);
		newGamebutton.setText("New Game");
		newGamebutton.setBorderPainted(true);
		newGamebutton.addActionListener(this);
		newGamebutton.setFocusable(false);
		panel.add(newGamebutton);
		
		//Replay button
		replayButton = new JButton();
		replayButton.setBounds(570,450,100,30);
		replayButton.setText("Replay");
		replayButton.setBorderPainted(true);
		replayButton.addActionListener(this);
		replayButton.setFocusable(false);
		panel.add(replayButton);
		
		// Set check box button
		checkBox = new JCheckBox();
		checkBox.setText("Record game");
		checkBox.setBounds(16,465,150,16);
		checkBox.setBackground(null);
		checkBox.addActionListener(this);
		checkBox.setFocusable(false);
		panel.add(checkBox);		

		// Set simple game and general game radio buttons
		simpleGame = new JRadioButton();
		simpleGame.setLayout(null);
		//simpleGame.setBackground(null);
		simpleGame.setText("Simple Game");
		simpleGame.setBorderPainted(true);
		simpleGame.setBounds(200,100,120,20);
		simpleGame.setBackground(null);
		simpleGame.addActionListener(this);
		simpleGame.setFocusable(false);
		panel.add(simpleGame);
		
		generalGame = new JRadioButton();
		generalGame.setLayout(null);
		generalGame.setText("General Game");
		generalGame.setBackground(null);
		generalGame.setBorderPainted(true);
		generalGame.setBounds(370,100,120,20);
		generalGame.addActionListener(this);
		generalGame.setFocusable(false);
		panel.add(generalGame);
		
		
		ButtonGroup group = new ButtonGroup();
		group.add(simpleGame);
		group.add(generalGame);
		
		//Blue player 
		JLabel bluePlayerLabel = new JLabel("Blue player");
		bluePlayerLabel.setBounds(35,190,100,20);
		bluePlayerLabel.setFont(new Font("arial",Font.BOLD, 13));
		panel.add(bluePlayerLabel);
		
		//add human radio button
		humanPlayer1 = new JRadioButton("Human");
		humanPlayer1.setBackground(null);
		humanPlayer1.setBounds(35,220,80,17);
		humanPlayer1.addActionListener(this);
		humanPlayer1.setFocusable(false);
		panel.add(humanPlayer1);
		
		// add S O radio buttons
		s1 = new JRadioButton("S");
		s1.setBackground(null);
		s1.setBounds(55,240,90,17);
		s1.addActionListener(this);
		s1.setFocusable(false);
		panel.add(s1);
		
		o1 = new JRadioButton("O");
		o1.setBackground(null);
		o1.setBounds(55,260,90,17);
		o1.addActionListener(this);
		o1.setFocusable(false);
		panel.add(o1);
		
		
		//add computer radio button
		computerPlayer1 = new JRadioButton("Computer");
		computerPlayer1.setBackground(null);
		computerPlayer1.setBounds(35,280,90,17);
		computerPlayer1.addActionListener(this);
		computerPlayer1.setFocusable(false);
		panel.add(computerPlayer1);
		
		// add computer human group radio button
		ButtonGroup humanComputerGroup1 = new ButtonGroup();
		humanComputerGroup1.add(humanPlayer1);
		humanComputerGroup1.add(computerPlayer1);
		
		// add S O radio button group
		ButtonGroup soGroup1 = new ButtonGroup();
		soGroup1.add(s1);
		soGroup1.add(o1);
		

		//Red player
				JLabel redPlayerLabel = new JLabel("Red player");
				redPlayerLabel.setBounds(570,190,100,20);
				redPlayerLabel.setFont(new Font("arial",Font.BOLD, 13));
				panel.add(redPlayerLabel);
				//add human radio button
				humanPlayer2 = new JRadioButton("Human");
				humanPlayer2.setBackground(null);
				humanPlayer2.setBounds(580,220,80,17);
				humanPlayer2.addActionListener(this);
				humanPlayer2.setFocusable(false);
				panel.add(humanPlayer2);
				
				// add S O radio buttons
				s2 = new JRadioButton("S");
				s2.setBackground(null);
				s2.setBounds(600,240,90,17);
				s2.addActionListener(this);
				s2.setFocusable(false);
				panel.add(s2);
				
				o2 = new JRadioButton("O");
				o2.setBackground(null);
				o2.setBounds(600,260,90,17);
				o2.addActionListener(this);
				o2.setFocusable(false);
				panel.add(o2);
				
				
				//add computer radio button
				computerPlayer2 = new JRadioButton("Computer");
				computerPlayer2.setBackground(null);
				computerPlayer2.setBounds(580,280,90,17);
				computerPlayer2.addActionListener(this);
				computerPlayer2.setFocusable(false);
				panel.add(computerPlayer2);
				
				// add computer human group radio button
				ButtonGroup humanComputerGroup2 = new ButtonGroup();
				humanComputerGroup2.add(humanPlayer2);
				humanComputerGroup2.add(computerPlayer2);
				
				// add S O radio button group
				ButtonGroup soGroup2 = new ButtonGroup();
				soGroup2.add(s2);
				soGroup2.add(o2);
					
		
		this.setVisible(true);
	
		
		}

		@Override
		public void actionPerformed(ActionEvent e)
		{
		 if(e.getSource()==textButton) {
			System.out.println(textArea.getText());
			
		}
		 else if(e.getSource()==newGamebutton) {
				System.out.println("Start a " + newGamebutton.getText());
			}
		 else if (e.getSource()==replayButton) {
				System.out.println(replayButton.getText()+ " game");
		
	}
		 if(e.getSource()==checkBox) {
				System.out.println(checkBox.getText() + " " + checkBox.isSelected());
			}
		 if(e.getSource()==simpleGame) {
				System.out.println(simpleGame.getText() + " selected");
			}
			else if(e.getSource()==generalGame) {
				System.out.println(generalGame.getText() + " selected");			
			}
		
		else if(e.getSource()==humanPlayer1) {
			System.out.println(humanPlayer1.getText() + " selected");			
		}
		else if(e.getSource()==s1) {
			System.out.println(s1.getText() + " selected");			
		}
		else if(e.getSource()==o1) {
			System.out.println(o1.getText() + " selected");			
		}

		else if(e.getSource()==computerPlayer1) {
			System.out.println(computerPlayer1.getText() + " selected");			
		}
		else if(e.getSource()==humanPlayer2) {
			System.out.println(humanPlayer2.getText() + " selected");			
		}
		else if(e.getSource()==s2) {
			System.out.println(s2.getText() + " selected");			
		}
		else if(e.getSource()==o2) {
			System.out.println(o2.getText() + " selected");			
		}

		else if(e.getSource()==computerPlayer2) {
			System.out.println(computerPlayer2.getText() + " selected");			
		}
		}
}
