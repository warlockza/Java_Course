
import java.applet.Applet;
import java.awt.*;

/*
 *
 * RandomShape
 *
 */
public class RandomShape1 extends Applet  implements Runnable {
    //
    // ToDo:
    //
    // Add a reference to hold your thread
    // object.
    //
        private Thread t1;
    //
    // ToDo:
    // Create a thread object and cause it to 'start'
    // Think about: whose run() method will
    // the thread run?
    //



    public void start() {
        t1 = new Thread(this);
        t1.start();
    }

    //
    // ToDo:
    // Cause the thread to 'stop'/'die'
    // But do not call 'stop' on the thread object(ever)
    //

    public void stop()
    {
          t1=null;
    }

    //
    // ToDo:
    //
    // The run() method.
    //
    // Loop forever, sleeping for a time and
    // then repainting. This will cause a
    // random shape and colour to be drawn
    // every time.
    //

    public void run () {

        while (t1 !=null) {
              try {Thread.sleep(1000);
              update(this.getGraphics());
              } catch (InterruptedException ix) {};

        }


    }


    public void update(Graphics g) 	{
        //
        // Since paint() seems to be called
        // first when the applet is initialised
        // (at least it is in Internet Explorer)
        // then put all the drawing and painting
        // code in paint().
        //
        paint(g);
    }

    public void paint(Graphics g) {
        //
        // Get the size of the applet
        //
        Dimension d = getSize();

        //
        // Paint the applet's background
        // a random colour before drawing
        // the shape.
        //
        Color c = randomColor();
        g.setColor(c);
        g.fillRect(0, 0, d.width - 1, d.height - 1);

        //
        // Set our drawing colour
        //
        g.setColor(Color.black);

        //
        // Figure out the offset of the
        // shape from the edge of the applet.
        //
        int xOffset = d.width/20;
        int yOffset = d.height/20;

        //
        // Work out which shape to draw
        //
        double rand = Math.random();

        int shape = (int)(rand * 5);


        switch (shape)
        {
            case 0:
            {
                g.drawRect(xOffset,
                        yOffset,
                        d.width - (xOffset * 2),
                        d.height - (yOffset * 2));

                break;
            }
            case 1:
            {
                g.drawRoundRect(xOffset,
                        yOffset,
                        d.width - (xOffset * 2),
                        d.height - (yOffset * 2),
                        xOffset * 4,
                        yOffset * 4);

                break;
            }
            case 2:
            {
                g.drawLine(xOffset,
                        yOffset,
                        d.width - (xOffset * 2),
                        d.height - (yOffset * 2));
                break;
            }
            case 3:
            {
                g.drawOval(xOffset,
                        yOffset,
                        d.width - (xOffset * 2),
                        d.height - (yOffset * 2));
                break;
            }
            case 4:
            {
                g.drawArc(xOffset,
                        yOffset,
                        d.width - (xOffset * 2),
                        d.height - (yOffset * 2),
                        0,
                        120);
                break;
            }
            case 5:
            {
                g.draw3DRect(xOffset,
                        yOffset,
                        d.width - (xOffset * 2),
                        d.height - (yOffset * 2),
                        false);
                break;
            }
        }
    }

    private Color randomColor()
    {
        Color c = null;
        double d = Math.random();

        //
        // Calculate a random value between 0
        // and 5 and map this to a colour.
        //
        int colour = (int)(d * 5);

        switch (colour)
        {
            case 0:
            {
                c = Color.blue;
                break;
            }
            case 1:
            {
                c = Color.green;
                break;
            }
            case 2:
            {
                c = Color.red;
                break;
            }
            case 3:
            {
                c = Color. cyan;
                break;
            }
            case 4:
            {
                c = Color.yellow;
                break;
            }
            case 5:
            {
                c = Color.orange;
                break;
            }
        }

        return c;
    }
}

