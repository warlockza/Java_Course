
import java.applet.*;
import java.awt.*;

/*
 * PersonTestApplet class
 *
 * PersonTestApplet is a Java applet for testing
 * the methods of the Person class or any
 * of its subclasses. Results are displayed
 * in a tabular format using a custom component
 * called QALiveTable.
 *
 * The objects should be created in
 * the init() method
 *
 * You can use the displayPersons() method to
 * display the name and details of both persons.
 *
 * You can use the testX() methods to test the
 * methods of the Person class.
 *
 */

public class PersonTestApplet extends Applet implements Testable
{
    // Reference to QALiveTable object that will display results
    QALiveTable table ;

    // Declare two object references
    private Person person;
    private Student student;

    //
    // The init() method is called when the applet is initialised
    //
    public void init()
    {
        //
        // Create a Person, with a name and an age
        //
        person  = new Person ("Ken", 42);

        //
        // ToDo
        //
        // Create a Student object, with a name, an age and a subject
        // Assign reference to student variable previously declared
        //
         student = new Student ("Bob",36,"Maths");


        // Initialise the table for displaying the persons name and details
        //
        initialiseDisplay(3, 2, 2); // 3 rows, 2 columns, 2 buttons
        displayHeadings("Name", "Details");

        //
        // Display the name and details of the person and the student
        //
        displayPersons(person, student);

    }


    //
    // This method displays details of two  persons
    //
    void displayPersons(Person p1, Person p2)
    {
        String dummy = "";  // temporary variable so that skeleton compiles

        // Update person 1 in row 1
        //
        if (p1 != null)
            updatePerson(1, p1.getName(), p1.getDetails());

        //
        // ToDo
        //
        // Call the updatePerson() method below to display
        // the name and details of person 2 in row 2
        //
        if (p2 != null)
            updatePerson(2, p2.getName(), p2.getDetails());


    }


    //
    // This private method updates person's details in specified row
    //
    private void updatePerson(int row, String name, String details)
    {
        table.setRow(row, name, details);
    }


    //
    // The following testX() methods implement the Testable interface
    // and will be called by the QALiveTable component in response
    // to button clicks.  You can use them to call methods in your
    // Person or Student classes.
    //

    public void test1()
    {
        //
        // ToDo
        //
        // Call student's changeSubject() method with some subject


        student.changeSubject("Physics");
        // Re-display persons' details
        displayPersons(student, person);
    }

    public void test2()
    {
        //
        // ToDo
        //
        // Call student's changeSubject() method with a different subject

         student.changeSubject("Cooking");

        // Re-display persons' details
        displayPersons(person, student);
    }

    public void test3()
    {

        // Re-display persons' details
        displayPersons(person, student);
    }

    public void test4()
    {

        // Re-display persons' details
        displayPersons(person, student);
    }

    public void test5()
    {

        // Re-display persons' details
        displayPersons(person, student);
    }



    //
    // The following methods set up the QALiveTable
    // component. You do not need to modify either
    // of them.
    //

    //
    // This private method simply calls the appropriate
    // method in the QALiveTable control to set up the
    // column headings
    //
    private void displayHeadings(String s1, String s2)
    {
        table.setColumnHeadings(s1, s2);
    }


    //
    // This private method creates a QALiveTable component
    // and adds it to the applet container
    //
    private void initialiseDisplay(int rows, int cols, int buttons)
    {
        //
        // Create the QALiveTable component for displaying the results.
        // Pass this as last argument to make this
        // class the "target" object of the control panel,
        // i.e. the object that implements the Testable
        // interface.
        //
        table = new QALiveTable(rows, cols, buttons, this);

        // Ensure QALiveTable component fills applet container
        setLayout(new GridLayout(1, 1));

        // Add the QALiveTable component to applet container
        add(table);
    }

}
