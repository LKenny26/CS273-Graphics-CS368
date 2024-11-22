/** This program draws a Triangle
 *   @author 
 */

// Import a couple of library-packages
import java.awt.*;
import javax.swing.*;
import java.util.*;

/** class Triangle
 *
 * The important thing that we need to do in this class is finish the
 * 'paint' method.  
 */
public class Triangle extends Canvas
{

    /** 
     * the "paint" method, that specifies what to draw on the screen
     */
    public void paint(Graphics g)
    {
        //This line is important, don't remove it!
        super.paint(g);
        Font font = new Font("Serif", Font.PLAIN, 40);

        g.setFont(font);
        g.setColor(Color.black);
        g.drawString("Drawing Points...", 50, 50);
        /*
         *  Proposed Change to Triangle.java
         * 
         *  Justification: Ideally students can use the provided how to guide to draw a Polygon. 
         *  The purpose of this change is to have the students see that the triangle is defined
         *  poorly and also has coords that are just plain wrong. Further builds upon Boxes
         *  to help students realize negative coords will be out of bounds. 
         * 
         *  This also draws the points for the students before drawing the polygon, so
         *  students know where each point is going to be. Similarly to how in Boxes 
         *  each box gets drawn seperately. States that it is drawing the points
         *  then states when it is done so it is clear that the points have been drawn
         *  even if they are out of bounds potentially. 
         *  
         *  Text is done in black to contrast the background in large font. Points are done in a 
         *  Magenta Color so that they catch the studnets' eye.
         * 
         *  Context: Students have a hard time with Coords. The goal is to help the gain better knowledge of 
         *  how the system works. With having the points being drawn first this should be clear to the students
         *  when they are out of bounds vs when they are in the right location. Should help them to see why the triangle isn't
         *  being drawn in the box after they fix the polygon code. 
         * 
         *  Importance: With fixing broken code the student may familiarize themself with looking at documentation
         *  and using their gained knowledge with Boxes.java to fix the coords. Hopefully after completeing these 
         *  two intro type practices, they will have the coord knowledge for House.java and Jackolantern.java as the points
         *  are clearly labeled as circles on the graphics pane. They should also understand now with Boxes how the x and y works
         *  to accurately place shapes, lines, and text correctly further in the lab. 
         */

        // A previous student attemped to draw a triangle without looking up how to use a Polygon object
        // Fix the broken code to draw a triangle
        // Polygon = Polygon();

        int x1 = -2000000;
        int y1 = 0;
        int x2 = 100;
        int y2 = -50;
        int x3 = 50;
        int y3 = 5;


        triangle = new point(x1, y1);
        triangle = new point(x2, y2);
        triangle = new point(x3, y3);

        // do not touch this code
        g.setColor(Color.MAGENTA);
        g.fillOval(x1, y1, 10, 10);
        g.fillOval(x2, y2, 10, 10);
        g.fillOval(x3, y3, 10, 10);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        g.setColor(Color.black);
        g.drawString("                           Done", 50, 50);
        //end of do not touch code

        g.setColor(triangle_color);
        draw(triangle);


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
        myFrame.setSize(600,600);
 
       
        //Put an instance of this class in the window frame
        Triangle myContent = new Triangle();
        myContent.setBackground(Color.gray.brighter());
        myFrame.getContentPane().add(myContent);
        
        //Display the frame
        myFrame.setVisible(true);
        
    }//main


    
}//class Triangle
