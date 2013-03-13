
import java.applet.*;
import java.awt.*;

/*
 * EmployeeTestApplet class
 *
 * EmployeeTestApplet is a Java applet for testing
 * the methods of the Employee class.  Results are
 * displayed in a tabular format using a custom
 * component called QALiveTable.
 *
 * The Employee objects should be created in
 * the init() method
 *
 * You can use the displayEmployees() method to
 * display details of the employees in the applet
 *
 *
 * You can use the testX() methods to test the
 * methods of your Employee class.
 *
 */

public class EmployeeTestApplet extends Applet implements Testable
{
    // Reference to QALiveTable object that will display results
    private QALiveTable table ;

    //
    // Declare instance variables for holding
    // references to two employee objects
    //
    private Employee employee1, employee2;

    //
    // The init() method is called when the applet is initialised
    //


    public void init()
    {
        //
        // Create two new Employee objects
        //
        Employee.setRetirementAge(65);
        employee1 = new Employee("Mike","Smith", 28);
        employee2 = new Employee("Neil","Jones", 25);

        //
        // Initialise the table for displaying the employees' details
        //
        initialiseDisplay(3, 2, 5); // 3 rows, 2 columns, 2 buttons

        displayHeadings("Employee", "Age");

        //
        // Display the employees' details in the applet
        //
        displayEmployees();

    }

    //
    // This private method displays record of each employee
    //
    private void displayEmployees()
    {
        //String dummyName = "A. N. Other"; // no longer required

        // Update employee 1 in row 1
        //
        updateEmployee(1, employee1.getName(), employee1.getAge());

        // Update employee 2 in row 2
        //
        updateEmployee(2, employee2.getName(), employee2.getAge());

    }


    //
    // This private method updates employee details in specified row
    //
    private void updateEmployee(int row, String name, int age)
    {
        table.setRow(row, name, "" + age);
    }


    //
    // The following testX() methods implement the Testable interface
    // and will be called by the QALiveTable component in response
    // to button clicks.  You can use them to call methods in your
    // Employee class.
    //

    public void test1()
    {
        // Call method of employee 1
        employee1.incAge();

        // Re-display employees' details
        displayEmployees();
    }

    public void test2()
    {
        // Call method of employee 2
        employee2.incAge();

        // Re-display employees' details
        displayEmployees();
    }

    public void test3()
    {

        // Re-display employees' details
        employee2.changeName("Dahmer");
        displayEmployees();
    }

    public void test4()
    {

        // Re-display employees' details
        employee2.changeName("Lorena","Bobbit");
        displayEmployees();
    }

    public void test5()
    {

        // Re-display employees' details
        Employee.setRetirementAge(60);
        displayEmployees();
    }



    //
    // The following methods set up the QALiveTable
    // component. You do not need to modify them.
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
