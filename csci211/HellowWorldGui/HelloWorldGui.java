import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class HelloWorldGui extends JFrame{
	private JPanel myPanel;
	private JLabel myLabel;
	private JButton myButton;
	private JTextField myBox;
	
	public HelloWorldGui(){
		myLabel = new JLabel("Free Puppies");
		myPanel = new JPanel();
		
		myButton = new JButton( "DO NOT CLICK" );
		ButtonListener listener = new ButtonListener();
		myButton.addActionListener(listener);
		
		myBox = new JTextField(7); //five chars wide
		myBox.setText("BUAHAHAHA");
		
		myPanel.setPreferredSize( new Dimension(200, 200));
		myPanel.setBackground( Color.white );
		
		
		myPanel.add(myLabel);
		myPanel.add(myButton);
		myPanel.add(myBox);
		
		add(myPanel, BorderLayout.CENTER);
	}	
	public static void main( String[] args ){
		HelloWorldGui gui = new HelloWorldGui();
			
		gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gui.setSize(200,200);
		gui.setVisible(true);
		
	}
	private class ButtonListener implements ActionListener{
		public void actionPerformed( ActionEvent e ){
			if( e.getSource() == myButton ){
				Random generator = new Random();
				int r = generator.nextInt(100) + 1 ;
				String rString  = Integer.toString(r);
				myLabel.setText(rString);
			}
		}
	}

}