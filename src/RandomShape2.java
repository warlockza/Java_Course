
import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

/*
 *
 * RandomShape
 *
 */
public class RandomShape2 extends Applet implements Runnable
{
    // instance variables
    private Thread runner = null;
    private boolean suspended = false;

    private Button pause, restart;

    public void init()
    {
        // creates the two buttons and adds them to the bottom of the applet
        setLayout(new BorderLayout());
        Panel p = new Panel();
        p.add(pause = new Button("pause"));
        p.add(restart = new Button("restart"));
        add(BorderLayout.SOUTH, p);

        // anonymous class to respond to a "pause" request
        pause.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                // DO NOT wait() in an AWT event method!!!
            }
        });

        restart.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                // Do Notify'ing from here
            }
        });
    }

    public void start()
    {
        //
        // If our thread is not already running
        // start it.
        //
        if (runner == null)
        {
            //
            // Note that we pass ourselves (the
            // applet) to the Thread so that our
            // run() method (below) is executed.
            //
            runner = new Thread(this);
            runner.start();
        }
    }

    public void stop()
    {
        //
        // If the thread is still running, stop it.

        runner = null;
    }

    public void run()
    {
        //
        // Put the current thread (runner) to
        // sleep for a time and
        // then repaint. This will cause a
        // random shape and colour to be drawn
        // each time through the loop

        while (runner != null)
        {
            // Do 'wait'ing from here
            try
            {
                Thread.sleep(1000);
            } catch (InterruptedException e) {}
            repaint();


        }
    }

    public void update(Graphics g)
    {
        //
        // Since paint() seems to be called
        // first when the applet is initialised
        // (at least it is in Internet Explorer)
        // then put all the drawing and painting
        // code in paint().
        //
        paint(g);
    }

    public void paint(Graphics g)
    {
        //
        // Get the size of the applet
        //
        Dimension d = getSize();
        int width = d.width;
        int height = d.height - 30;

        //
        // Paint the applet's background
        // a random colour before drawing
        // the shape.
        //
        Color c = randomColor();
        g.setColor(c);
        g.fillRect(0, 0, width - 1, height - 1);

        //
        // Set our drawing colour
        //
        g.setColor(Color.black);

        //
        // Figure out the offset of the
        // shape from the edge of the applet.
        //
        int xOffset = width/20;
        int yOffset = height/20;

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
                        width - (xOffset * 2),
                        height - (yOffset * 2));

                break;
            }
            case 1:
            {
                g.drawRoundRect(xOffset,
                        yOffset,
                        width - (xOffset * 2),
                        height - (yOffset * 2),
                        xOffset * 4,
                        yOffset * 4);

                break;
            }
            case 2:
            {
                g.drawLine(xOffset,
                        yOffset,
                        width - (xOffset * 2),
                        height - (yOffset * 2));
                break;
            }
            case 3:
            {
                g.drawOval(xOffset,
                        yOffset,
                        width - (xOffset * 2),
                        height - (yOffset * 2));
                break;
            }
            case 4:
            {
                g.drawArc(xOffset,
                        yOffset,
                        width - (xOffset * 2),
                        height - (yOffset * 2),
                        0,
                        120);
                break;
            }
            case 5:
            {
                g.draw3DRect(xOffset,
                        yOffset,
                        width - (xOffset * 2),
                        height - (yOffset * 2),
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

