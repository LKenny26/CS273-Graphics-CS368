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

        // Yellow Background
        setBackground(Color.yellow);

        // Create a Scanner object
        Scanner scan = new Scanner(System.in); 

        Polygon triangle = new Polygon();

        // Get first point of the triangle
        System.out.println("Enter x for the first point");
        String coord_one_x = scan.nextLine();
        System.out.println("Enter y for the first point");
        String coord_one_y = scan.nextLine();
        triangle.addPoint(Integer.parseInt(coord_one_x),Integer.parseInt(coord_one_y));

        // Get Second point for the triangle
        System.out.println("Enter x for the second point");
        String coord_two_x = scan.nextLine();
        System.out.println("Enter y for the second point");
        String coord_two_y = scan.nextLine();
        triangle.addPoint(Integer.parseInt(coord_two_x),Integer.parseInt(coord_two_y));
        
        //Get last point for the triangle
        System.out.println("Enter x for the last point");
        String coord_three_x = scan.nextLine();
        System.out.println("Enter y for the last point");
        String coord_three_y = scan.nextLine();
        triangle.addPoint(Integer.parseInt(coord_three_x),Integer.parseInt(coord_three_y));

        if (Integer.parseInt(coord_one_x) < 0 || Integer.parseInt(coord_two_x) < 0 || Integer.parseInt(coord_three_x) < 0){
            System.out.println("Error: One of the x points is negative and would go off the screen on the left.");
            System.out.println("Remember when x is negative it goes left, and when it is posistive it goes right.");
            System.exit(ABORT);
        }
        if(Integer.parseInt(coord_one_x) > 600 || Integer.parseInt(coord_two_x) > 600 || Integer.parseInt(coord_three_x) > 600){
            System.out.println("Error: One of the x points is greater than the window and would go off the screen on the right.");
            System.out.println("Remember when y is negative it goes left, and when it is posistive it goes right.");
            System.exit(ABORT);
        }
        if (Integer.parseInt(coord_one_y) < 0 || Integer.parseInt(coord_two_y) < 0 || Integer.parseInt(coord_three_y) < 0){
            System.out.println("Error: One of the y points is negative and would go off the screen on the top.");
            System.out.println("Remember when y is negative it goes up, and when it is posistive it goes down.");
            System.exit(ABORT);
        }
        if(Integer.parseInt(coord_one_y) > 600 || Integer.parseInt(coord_two_y) > 600 || Integer.parseInt(coord_three_y) > 600){
            System.out.println("Error: One of the y points is greater than the window and would go off the screen on the bottom.");
            System.out.println("Remember when y is negative it goes up, and when it is posistive it goes down.");
            System.exit(ABORT);
        }

        scan.close();
        g.setColor(Color.green);
        g.fillPolygon(triangle);

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
