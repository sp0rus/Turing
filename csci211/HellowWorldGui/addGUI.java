import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class addGUI extends JFrame{
	private JPanel myPanel;
	private JLabel myLabel;
	private JLabel myLabelTwo;
	private JButton myButton;
	private JTextField myBox;
	private JTextField myBoxTwo;
	
	public addGUI(){
		myLabel = new JLabel("Enter two numbers into the text fields.");
		myBox = new JTextField(7);
		myBoxTwo = new JTextField(7);
		
		myLabelTwo = new JLabel("SUM");
		myPanel = new JPanel();
		
		myButton = new JButton( "ADD" );
		ButtonListener listener = new ButtonListener();
		myButton.addActionListener(listener);
		
		myPanel.setPreferredSize( new Dimension(200, 200));
		myPanel.setBackground( Color.white );
		
		
		myPanel.add(myLabel);
		myPanel.add(myBox);
		myPanel.add(myBoxTwo);
		myPanel.add(myButton);
		myPanel.add(myLabelTwo);
		
		add(myPanel, BorderLayout.CENTER);
	}	
	public static void main( String[] args ){
		addGUI gui = new addGUI();
			
		gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gui.setSize(700,200);
		gui.setVisible(true);
		
	}
	private class ButtonListener implements ActionListener{
		public void actionPerformed( ActionEvent e ){
			if( e.getSource() == myButton ){
				Random generator = new Random();
				int a = Integer.parseInt(myBox.getText());
				int b = Integer.parseInt(myBoxTwo.getText());
				int sum = a + b;
				String sString  = Integer.toString(sum);
				myLabelTwo.setText(sString);
			}
		}
	}

}