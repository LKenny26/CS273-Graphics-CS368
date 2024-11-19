/** This program draws concentric Boxes
 *   @author 
 */

// Import a couple of library-packages
import java.awt.*;
import javax.swing.*;

/** class Boxes
 *
 * The important thing that we need to do in this class is finish the
 * 'paint' method.  
 */
public class Boxes extends Canvas
{

    /** the "paint" method, that specifies what to draw on the screen
     * 
     * This method needs to be updated
     */
    public void paint(Graphics g)
    {
        //This line is important, don't remove it!
        super.paint(g);
        Font font = new Font("Serif", Font.PLAIN, 40);

        // Draw the Outer Box
        g.setFont(font);
        g.setColor(Color.black);
        g.drawString("Drawing Outer Box...", 50, 50);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        g.setColor(Color.blue);
        g.fillRect(200, 200, 500, 500);

        // Draw the middle box
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        g.setFont(font);
        g.setColor(Color.black);
        g.drawString("Drawing Middle Box...", 50, 100);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        g.setColor(Color.red);
        g.fillRect(300,300,300,300);

        // Draw the inner box
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        g.setFont(font);
        g.setColor(Color.black);
        g.drawString("Drawing Inner Box...", 50, 150);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        g.setColor(Color.green);
        g.fillRect(375,375,150,150);
        
    }//paint

    /**
     * main
     *
     * All Java programs start with a method named main.  This class' main
     * method creates the window to display your Java drawing.
     *
     * IMPORTANT:  DO NOT MODIFY THIS METHOD
     */
    public static void main(String[] args)
    {
        //Create a window for this program
        JFrame myFrame = new JFrame();
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setSize(1000,1000);
 
        //Put an instance of this class in the window frame
        Boxes myContent = new Boxes();
        myContent.setBackground(Color.gray.brighter()); // set background color
        myFrame.getContentPane().add(myContent);
        
        // display the frame
        myFrame.setVisible(true);
        
    }//main


    
}//class Boxes
