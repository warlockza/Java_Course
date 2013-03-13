import java.awt.*;

/*
 *
 * MyShape
 *
 */

public abstract class MyShape {
    // Instance variables for left, top, width and height of bounding rectangle.
    // Note use of protected modifier to allow direct access by a subclass
    //
    protected int left, top, width, height;


    //
    // ToDo:
    //
    // Add a Constructor. This should initialise all of
    // the instance variables to the values passed in.
    //

           public MyShape(int l,int t,int w,int h) {
               left=l;
               top=t;
               width=w;
               height=h;
           }


    //
    // ToDo:
    //
    // Add an abstract draw method which takes a
    // reference to a Graphics object. This will force all
    // subclasses of MyShape to implement this method
    // This method will not return anything, but don't forget you
    // must specify a return type for the method
              abstract public void Draw(Graphics g);

}
