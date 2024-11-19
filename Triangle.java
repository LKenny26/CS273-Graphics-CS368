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

        /*
         *  Proposed Change to Triangle.java
         *  Justification: Ideally students can use the provided how to guide to draw a Polygon. 
         *  The purpose of this change is to have the students see that the triangle is defined
         *  poorly and also has coords that are just plain wrong. The student should be able to 
         *  recogize. This also draws the points for the students before drawing the polygon, so
         *  students know where each point is going to be.
         *  Context: Students have a hard time with Coords. The goal is to help the gain better knowledge of 
         *  how the system works.
         *  Importance: With fixing broken code the student may familiarize themself with looking at documentation
         *  and using their gained knowledge with Boxes.java to fix the coords. Hopefully after completeing these 
         *  two intro type practices, they will have the coord knowledge for House.java and Jackolantern.java
         */

        // A previous student attemped to draw a triangle without looking up how to use a Polygon object
        // Fix the broken code to draw a triangle
        Polygon = Polygon();

        int x1 = -2000000;
        int y1 = 0;
        int x2 = 100;
        int y2 = -50;
        int x3 = 1/2 50;
        int y3 = 5;


        triangle = new point(x1, y1);
        triangle = new point(x2, y2);
        triangle = new point(x3, y3);

        g.fillOval(x1, y1, 10, 10);
        g.fillOval(x2, y2, 10, 10);
        g.fillOval(x3, y3, 10, 10);
        Thread.sleep(3000);
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
