

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

/*
 *
 * Components
 *
 */

public class ComponentApplet extends Applet
        implements ActionListener
{
    private TextArea feedback;
    private TextField name;
    private Choice relation;
    private Button ok, reset;
    private Label namePrompt = new Label("Name: ");
    private Label relationPrompt = new Label("Relationship: ");


    public void init()
    {
        //
        // ToDo:
        //
        // Create a non-editable text area of
        // 5 lines by 40 columns. This is used
        // to display messages to the user.
        //
        // Initialise it with an appropriate
        // message and assign the new TextArea to
        // the instance variable named feedback.
        //
           feedback=new TextArea("feedback",5,40);
           feedback.setEditable(false);
        //
        // ToDo:
        //
        // Create a TextField for the user to
        // type a name into. Assign the TextField
        // to the instance variable called name.

           name=new TextField("Name");

        //
        // ToDo:
        //
        // Assign a new Choice object to the
        // relation instance variable. Add the possible
        // relationship types to the Choice. Examples would be:
        //
        //	Father, Mother, Sister, Brother,
        //
        //
             relation=new Choice();
             relation.add("Father");
             relation.add("Mother");
             relation.add("Sister");
             relation.add("Brother");



        //
        // ToDo:
        //
        // Assign two new Buttons to the instance variables
        // ok and reset. Label the Buttons appropriately.

        ok=new Button("New");
        reset=new Button("Reset");


        //
        //
        // ToDo:
        //
        // Add all the components to the applet by uncommenting this section
        //


		add(feedback);
		add(namePrompt);
		add(name);
		add(relationPrompt);
		add(relation);
		add(ok);
		add(reset);


        //
        // ToDo:
        //
        // Register the applet as an ActionListener
        // for the two Buttons ok and reset.
        //

         ok.addActionListener(this);
         reset.addActionListener(this);
    }

    public void actionPerformed(ActionEvent evt){

        //
        // ToDo:
        //
        // Discover if the Event Source was ok or reset.
        //
        // If the source was the ok Button, check that
        // the user typed a name in the TextField.
        // If so say "Hi" to the named relation
        // by displaying a message in the TextArea
        // (e.g. "Hi there Uncle Albert").
        // Otherwise, display an error message.
        //
        if (evt.getSource()== ok) {
            if (name.getText().length() == 0) {
                feedback.setText("Please fill in a name");
            } else {
                feedback.setText("Hi there ");
                feedback.append(relation.getSelectedItem());
                feedback.append(" " + name.getText());
            }
        }  else if (evt.getSource()==reset) {
            name.setText("");
            relation.select(0);
            feedback.setText("Try again");
        }

        //
        // ToDo:
        //
        // If the event source was the reset Button,
        // clear the TextField and reset the Choice
        // relationship to its original value.
        // Show a message prompting the user to start again.
        //

    } // ends actionPerformed()

}

