

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

// ToDo:
//
// Declare the applet to be an ActionListener
// and make sure that the applet compiles correctly

public class ButtonApplet extends Applet implements ActionListener {
    private int count = 0; // the count

    //
    // ToDo:
    //
    // Define three instance variables to hold
    // references to two buttons and a text field

    Button button1;
    Button button2;
    TextField text1;

    public void init()
    {
        //
        // ToDo:
        //
        // Create the text field and add it to this Applet
        // using the inherited add()command from the Container class
        //
        text1=new TextField("This is a text field",80);
        add(text1);

        //
        // ToDo:
        //
        //
        // Create two buttons and add them to this Applet
        //
        button1=new Button("Button 1");
        button2=new Button("Button 2");
        add(button1);
        add(button2);

        //
        // ToDo:
        //
        // Register the applet as the listener for
        // your two Buttons
        //
                  button1.addActionListener(this);
                  button2.addActionListener(this);
        }

    //
    // ToDo:
    //
    // Inside your actionPerformed() method:
    // use the getSource() method of the ActionEvent class
    // to discover which Button was pressed.
    //
    // Increment or decrement the count variable.
    //
    // Set the text in the TextField to (""+count)
    //

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button1) {
                    this.count++;
        } else if (e.getSource()== button2 ) {
                      this.count--;
        }
        text1.setText(""+count);

    }


}   //  ends ButtonApplet
