

import java.applet.*;
import java.awt.*;

public class ShapeTest extends Applet
{
    // Create a polymorphic array of
    // four MyShape objects - some of which are
    // MyRectangles and others are MyCircles.

    MyShape[] myShapes = {
            new MyRectangle(10,10,200,200),		// left, top, width, height
            new MyCircle(110,110,100),		// centreX, centreY, radius
            new MyRectangle(200,30,100,50),
            new MyCircle(250,80,50)
    };

    public void paint(Graphics g)
    {


        // ToDo:
        //
        // Ask each shape in the array to draw itself.
        // Note that the draw() method of the MyShape
        // class takes a single argument: a reference
        // to a Graphics object, i.e. as passed into paint().

        		for (int i=0;i < myShapes.length;i++) {
		                  myShapes[i].Draw(g);

		}

    }
}
