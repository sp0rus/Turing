import java.util.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JOptionPane;


/** The JFrame subclass for Question 1. 
 *  @author Jamie Osman
 *  
 *  */
public class Q1Frame extends JFrame
{
    // JPanel 
    private JPanel centerJPanel;
    private JPanel leftJPanel;
    private JPanel rightJPanel;

    //JButtons
    private JButton incrementButton;        //operand buttons
    private JButton decrementButton;
    
    // JLabel
    private JLabel value;
    
    int numVal = 50;
    String answerString;

    //no argument constructor
    public Q1Frame()
    {
        super( "Inc/Dec" );

		setLayout( new GridLayout(1,2));
        //create left panel for label
        leftJPanel = new JPanel();        //set up panel
        
        //convert numVal to String
        answerString = Integer.toString(numVal);
        
        //create and add label
        value = new JLabel( answerString );
        leftJPanel.add( value );     //add button to panel
        
        //add leftPanel to JFrame
        add(leftJPanel);
        
        //create right panel for buttons
        rightJPanel= new JPanel();		//set up panel
        
        //create and add buttons
        incrementButton = new JButton("Increment");
        rightJPanel.add(incrementButton);
        
        decrementButton = new JButton("Decrement");
		rightJPanel.add(decrementButton);
		
		//add rightPanl to JFrame
		add(rightJPanel);
       

        //create new ButtonHandler for button event handling
        ButtonHandler handler = new ButtonHandler();

        incrementButton.addActionListener( handler );
        decrementButton.addActionListener( handler );
        
    }//end Q1Frame constructor

    //inner class for button event handling
    private class ButtonHandler implements ActionListener
    {
        //handle button event
        public void actionPerformed( ActionEvent event )
        {
        	
        	// Your code here:
        	if ( event.getActionCommand( ) == "Increment" ){
        		numVal++;
        		value.setText(Integer.toString(numVal));
        	}
        	if ( event.getActionCommand( ) == "Decrement" ){
        		numVal--;
        		value.setText(Integer.toString(numVal));
        	}
 
           
        }    //end method actionPerformed
    }//end method ButtonHandler

}