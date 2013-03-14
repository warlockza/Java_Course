
import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class ActiveApplet extends Applet
{
    public void init()
    {
        //
        // ToDo
        //
        // Inside the Applet's init() method create a local inner class
        // called ComponentMouseListener which extends MouseAdapter.
        //
        // Give the local class two Color instance
        // fields: "enterColor" and "exitColor". Provide the class with
        // constructor which takes two Color objects as its arguments,
        // and use these parameters to initialise the instance fields.
        //
        // Override the mouseEntered()method to change the colour of the
        // Component which triggers MouseEvent to "enterColor".
        //
        // Override the mouseExited() method to change the colour of the
        // Component which triggers MouseEvent to "exitColor".
        //

            class ComponentMouseListener extends MouseAdapter {
                public Color exitColor;
                public Color enterColor;


                public ComponentMouseListener(Color enter, Color exit) {
                    this.exitColor=exit;
                    this.enterColor=enter;
                }
                public void mouseEntered(MouseEvent event) {
                         event.getComponent().setBackground(enterColor);
                }
                public void mouseExited(MouseEvent event) {
                         event.getComponent().setBackground(exitColor);
                }
            }

        //
        // ToDo:
        //
        // Create a new instance of ComponentMouseListener and assign it
        // to a MouseListener variable.
        //

        ComponentMouseListener MouseListener=new ComponentMouseListener(Color.PINK,Color.GREEN);


        //
        // ToDo:
        //
        // Use a loop to add five Buttons labelled "Press Me".
        // Register the MouseListener with each of them.
        //
                         for (int i=0; i<5 ;i++) {
                             final Button b=new Button("Press Me");
                                 b.addMouseListener(MouseListener);
                                 add(b);
                                 b.addActionListener(new ActionListener () {
                                     int count;
                                 public void actionPerformed(ActionEvent ae) {
                                            count++;
                                            b.setLabel(""+count);
                                            b.setBackground(Color.RED);
                                 }

                                 });
                         }

        //
        // ToDO:
        //
        // While still inside the loop, give each Button an
        // ActionListener using an anonymous inner class.
        //
        // Each ActionListener should be given an instance variable
        // named count to record the number of times its
        // actionPerformed() method has been called.
        //
        // In the actionPerformed() method, increment count,
        // change the Button's background colour to red, and
        // set the Button's label to display the count variable.
        //





        //
        // ToDo:
        //
        // Create a new instance of ComponentMouseListener (using different colours).
        // Add a new TextField, and Register the ComponentMouseListener
        // as a MouseListener for the TextField
        //
        ComponentMouseListener mouse2 = new ComponentMouseListener(Color.BLUE,Color.CYAN);
        final TextField t = new TextField ("WOOO",80);
        t.addMouseListener(mouse2);
        add(t);
        t.addFocusListener(new FocusAdapter() {
                    public void focusGained (FocusEvent fx) {
                           t.selectAll();
                    }
            }
        );

        //
        // ToDo:
        //
        // Use an anonymous inner class which extends FocusAdapter
        // to select the text in the TextField when the focus is gained
        // [ java.awt.TextComponent defines a method selectAll() ]
        //


    } // ends init()


}   // ends Applet