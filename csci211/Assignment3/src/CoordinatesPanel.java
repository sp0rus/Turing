//********************************************************************
//  CoordinatesPanel.java       Java Foundations
//
//  Represents the primary panel for the Coordinates program.
//********************************************************************

import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.KeyStroke;

import java.awt.*;
import java.awt.event.*;

public class CoordinatesPanel extends JPanel
{
   private final int SIZE = 6;  // diameter of dot

   private int x, y;  // coordinates of mouse press
   private int releaseX, releaseY; //coordinates of release

   //-----------------------------------------------------------------
   //  Constructor: Sets up this panel to listen for mouse events.
   //-----------------------------------------------------------------
   public CoordinatesPanel()
   {
      addMouseListener (new CoordinatesListener());
      addKeyListener (new KeyEventListener());
      setFocusable(true);

      setBackground (Color.black);
      setPreferredSize (new Dimension(300, 200));
      
      
   }

   //-----------------------------------------------------------------
   //  Draws all of the dots stored in the list.
   //-----------------------------------------------------------------
   public void paintComponent (Graphics page)
   {
      super.paintComponent(page);

      page.setColor (Color.green);

      //page.fillOval (x, y, SIZE, SIZE);
      
      //draw the line
      page.drawLine(x,y,releaseX,releaseY);

      page.drawString ("Coordinates: (" + x + ", " + y + "; " + releaseX + ", " + releaseY + ")", 5, 15);
   }

   //*****************************************************************
   //  Represents the listener for mouse events.
   //*****************************************************************
   private class CoordinatesListener implements MouseListener
   {
      //--------------------------------------------------------------
      //  Sets coordinates of point to be drawn and redraws
      //  the panel whenever the mouse button is pressed.
      //-------------------------------------------------------------
	   
	  //get initial variables when mouse is pressed
      public void mousePressed (MouseEvent event)
      {
         //oldX=x;
        // oldY=y;
        // x = event.getX();
        // y = event.getY();
        // repaint();
    	  x = event.getX();
          y = event.getY();
      }

      //--------------------------------------------------------------
      //  Provide empty definitions for unused event methods.
      //--------------------------------------------------------------
      public void mouseClicked (MouseEvent event) {
    	  
      }
      //draw the line when the mouse button is released
      public void mouseReleased (MouseEvent event) {
    	  releaseX = event.getX();
    	  releaseY = event.getY();
          repaint();
      }
      public void mouseEntered (MouseEvent event) {}
      public void mouseExited (MouseEvent event) {}
   }
   //Listen for the "c" key to be pressed, and clear the screen of lines
   private class KeyEventListener implements KeyListener{
	   public void keyPressed(KeyEvent e) {
		   char c = 'c';
		   if( c == e.getKeyChar()){
			   x = 0;
			   y = 0;
			   releaseX = 0;
			   releaseY = 0;
			   repaint();
		   }
	   }
	   //empty definitions for unused methods
	   public void keyReleased(KeyEvent e) {
	   }
	   public void keyTyped(KeyEvent e) {
	   } 
   }
}
