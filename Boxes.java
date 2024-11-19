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

        /*
         *  Proposed change to Boxes.java. 
         *  Justification: Ideally students can center boxes easily and 
         *  create more rectangles. The purpose of this change is to have the boxes semi complete
         *  but lacking in the form of Coords or measurements. The student should be able to recogize what is 
         *  wrong with each box and correct it. This also utlizes Thread.sleep() to ensure
         *  students know where each box is supposed to be and when it gets drawn.
         *  Context: Students have a hard time with Coords. The goal is to help the gain better knowledge of 
         *  how the system works. 
         *  Importance: With simple fixes in the beginning 
         *  perhaps the student may familiarize themself with the system to utlize futher along
         *  in the lab.
         */

         // These Boxes are not drawing right...
         // Figure out what value is wrong with each box, and correct it.

        // Draw the Outer Box
        g.setFont(font);
        g.setColor(Color.black);
        g.drawString("Drawing Outer Box...", 50, 50);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        g.setColor(Color.blue);
        g.fillRect(200, -2000, 500, 500);

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
        g.fillRect(-10,300,300,300);

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
        g.fillRect(375,375,1500,150);
        
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
