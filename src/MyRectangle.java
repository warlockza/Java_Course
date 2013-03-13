import java.awt.*;

/*
 *
 * MyRectangle
 *
 */

public class MyRectangle extends MyShape {

    //
    // ToDo:
    //
    // Add a constructor which takes 4 arguments: left, top, width and height
    //
    // You will need to pass these on to the constructor of the superclass
    // Remember how to call a superclass constructor?


    public MyRectangle (int l,int t,int w, int h) {
        super(l,t,w,h);
    }

    public void Draw (Graphics g) {
        g.drawRect(left, top,width,height);
    }
    //
    // ToDo:
    //
    // Implement the draw() method defined in the superclass.
    // This should draw a rectangle of the required size
    //
    // Hint: class Graphics contains a drawRect() method
    //




}
