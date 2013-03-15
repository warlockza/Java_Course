

import java.sql.*;

public class Library2 {
    static
    {
        // to do:
        // add code to load the driver class sun.jdbc.odbc.JdbcOdbcDriver
        // don't forget to catch relevant exceptions
      try {
          Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
      } catch (ClassNotFoundException e) {
          System.out.println(e);
    }

    }

    // instance variables
    private Connection con;

    private String userName = "QAUser", password = "qa";
    private int currentIDNum;


    public Library2() {
        // to do:
        // add code to create (not declare!) a connection to the datasource LIBRARY and
        // store the reference in the instance variable provided
        // you will need to use the userName and password variables

          try {
              con=DriverManager.getConnection("jdbc:odbc:library",userName,password);
          }   catch (SQLException e) {
              System.out.println(e);
          }

        // sets the instance variable currentIDNum to be whatever the highest
        // idNum in the database is
        currentIDNum = getCurrentIDNum();
    }

    // helper method which finds out the highest current idnum in the table
    // so as to avoid clashes when adding new members
    private int getCurrentIDNum()
    {
        int result = 0;
        try
        {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select idNum from members");
            while (rs.next())
            {
                int idNum = rs.getInt("idNum");
                if (idNum > result)
                {
                    result = idNum;
                }
            }
        }
        catch (SQLException se)
        {
            System.out.println(se);
        }
        return result;
    }

    // returns a formatted String representation of the current Members
    public String getMembers()
    {
        StringBuffer sb = new StringBuffer(200);

        // to do:
        // ask the Connection for a Statement and use it to retrieve
        // all the data from the members table. Then process the data
        // and format your results by appending them to sb.
        try {
            Statement st=con.createStatement();
            ResultSet rs = st.executeQuery("select * from members");

            while (rs.next()) {
                sb.append(rs.getInt("idNum")+"\t"+rs.getString("name")+"\t\t"+rs.getInt("age")+"\n");
            }
        } catch (SQLException e) {
            System.out.println(e);
        }

        return sb.toString();
    }

    // removes the specified member from the collection
    public boolean removeMember(String name)
    {
        boolean result = false;

        // to do:
        // remove any entries from the table which have the name
        // which has been passed in as a parameter. If the row was sucessfully
        // removed then set result to be true, otherwise leave it as false
            try {
                Statement st=con.createStatement();
                System.out.println("delete from members where name='"+name+"'");
                if (st.executeUpdate("delete from members where name='"+name+"'") == 1) {
                    result=true;
                }
                }   catch (SQLException e) {
                System.out.println(e);
            }

        return result;
    }

    // creates a new Member and adds it to the collection
    public void addMember(String name, int age)
    {
        // to do:
        // use the parameters and the instance variable currentIDNum
        // to add a new row to the table. You will need to create a Statement
        // first and then use the information you have to build up an sql string
        // for the statement to work with

        try {
            Statement st=con.createStatement();
            if (st.executeUpdate("insert into members (name,age) values ('"+name+"',"+age+")") == 1) {
                //result=true;
            }
            st.close();
        }   catch (SQLException e) {
            System.out.println(e);
        }

    }

    public void shutDown() {
        try {
            con.close();
        } catch (Exception e) {
        }
    }

}