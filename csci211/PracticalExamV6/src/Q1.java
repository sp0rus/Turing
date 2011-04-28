
import javax.swing.JFrame;


/** The main program for Question 1. 
 *  @author Jamie Osman
 *  */

public class Q1 extends JFrame
{
    public static void main( String args[] )
    {
        Q1Frame calculator = new Q1Frame();
        calculator.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        calculator.setSize(300,300);        //set frame size
        calculator.setVisible( true );        //display frame

    }//end main
}//end class Calculator Demo

