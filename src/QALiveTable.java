

import java.awt.*;
import java.awt.event.*;

// QALiveTable.java

//
// This class is designed for testing a simple class.
// It displays a table of records with up to four columns.
// It can also display up to five buttons. When one of
// these buttons is clicked, a callback is made to
// a method specified in the Testable interface.
// Therefore, the class you want to test must implement
// this interface.
//


public final class QALiveTable extends Panel
{
    int numRows, numColumns, numButtons;
    private Label[][] label;
    private Testable targetObject = null;

    //
    // This constructor adds two panels to the applet's
    // container after it has been set up a border
    // layout.
    //
    // The top panel is set up for a grid layout
    // and then a Label component is added to each
    // cell in the grid. Each label is mapped to
    // a mapped to a row and column in the table.
    // The first row is reserved for displaying
    // column headings.
    //
    // A number of buttons are added to the bottom
    // panel, which, by default, is set up for a flow
    // layout.
    //
    public QALiveTable(int rows, int cols, int buttons)
    {
        numRows = rows;
        numColumns = cols;
        numButtons = buttons;

        setLayout(new BorderLayout());
        Panel topPanel = new Panel();
        topPanel.setLayout(new GridLayout(rows, cols));

        label = new Label[rows][cols];
        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < cols; j++)
            {
                label[i][j] = new Label("");
                topPanel.add(label[i][j]);
            }
        }

        add("North", topPanel);
        Panel bottomPanel = new Panel();
        for (int i = 1; i <= buttons; i++)
        {
            class TestListener implements ActionListener
            {
                public TestListener(int inTestNumber)
                {
                    testNumber = inTestNumber;
                }
                public void actionPerformed (ActionEvent ae)
                {
                    test(testNumber);
                }
                private int testNumber;
            }
            Button b = new Button("Test " + i);
            b.addActionListener(new TestListener(i));
            bottomPanel.add(b);
        }

        add("South", bottomPanel);

        Font font = new Font("Helvetica", Font.BOLD, 14);
        for (int j = 0; j < cols; j++)
            label[0][j].setFont(font);

    }

    //
    // This constructor is identical to the previous one
    // except that it accepts an additional argument - a
    // reference to a Testable object. This constructor
    // should be used where you want button clicks to call
    // methods in a some target object, in which case the
    // class of the target object must implement the
    // Testable interface.

    public QALiveTable(int rows, int cols, int buttons, Testable c)
    {
        this(rows, cols, buttons);
        targetObject = c;
    }



    //
    // This method sets up one column heading
    //
    public void setColumnHeadings(String s1)
    {
        if (numColumns == 1)
            label[0][0].setText(s1);
    }

    //
    // This method sets up two column headings
    //
    public void setColumnHeadings(String s1, String s2)
    {
        if (numColumns == 2)
        {
            label[0][0].setText(s1);
            label[0][1].setText(s2);
        }
    }
    //
    // This method sets up three column headings
    //
    public void setColumnHeadings(String s1, String s2, String s3)
    {
        if (numColumns == 3)
        {
            label[0][0].setText(s1);
            label[0][1].setText(s2);
            label[0][2].setText(s3);
        }
    }
    //
    // This method sets up four column headings
    //
    public void setColumnHeadings(String s1, String s2, String s3, String s4)
    {
        if (numColumns == 4)
        {
            label[0][0].setText(s1);
            label[0][1].setText(s2);
            label[0][2].setText(s3);
            label[0][3].setText(s4);
        }
    }



    //
    // This method sets first column in specified row
    //
    public void setRow(int row, String s1)
    {
        if (row < numRows)
        {
            label[row][0].setText(s1);
        }
    }

    //
    // This method sets first two columns in specified row
    //
    public void setRow(int row, String s1, String s2)
    {
        if (row < numRows)
        {
            label[row][0].setText(s1);
            label[row][1].setText(s2);
        }
    }

    //
    // This method sets first three columns in specified row
    //
    public void setRow(int row, String s1, String s2, String s3)
    {
        if (row < numRows)
        {
            label[row][0].setText(s1);
            label[row][1].setText(s2);
            label[row][2].setText(s3);
        }
    }

    //
    // This method sets first four columns in specified row
    //
    public void setRow(int row, String s1, String s2, String s3, String s4)
    {
        if (row < numRows)
        {
            label[row][0].setText(s1);
            label[row][1].setText(s2);
            label[row][2].setText(s3);
            label[row][3].setText(s4);
        }
    }



    // This method is called when an action event occurs,
    // i.e. if any of the buttons are clicked
    //
    public void test(int testNumber)
    {
        switch(testNumber)
        {
            case 1:
                targetObject.test1();
                break;
            case 2:
                targetObject.test2();
                break;
            case 3:
                targetObject.test3();
                break;
            case 4:
                targetObject.test4();
                break;
            case 5:
                targetObject.test5();
                break;
        }
    }

}
