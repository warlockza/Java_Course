
import java.awt.*;

/*
 *
 * MyCircle
 *
 */

public class MyCircle extends MyShape {

    //
    // ToDo:
    //
    // Add a constructor which takes ONLY 3 arguments: centreX, centreY and radius
    // THATS 3 ARGUMENTS NOT 4 !
    // You will need to convert these 3 values to the 4 required by
    // the superclass' constructor (i.e. left, top, width, height)
    // See diagram in workbook for help with the geometry


              public MyCircle (int centerX, int centerY,int radius) {
                   super(centerX-radius,centerY-radius,radius*2,radius*2);
              }



    //
    // ToDo:
    //
    // Implement the draw() method defined in the superclass.
    // This should draw a circle of the required size
    //
    // Hint: class Graphics has a drawOval() method
    //


             public void Draw (Graphics g) {
                 g.drawOval(left,top,width,height);

             }




}
