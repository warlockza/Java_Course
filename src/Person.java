/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 12/03/13
 * Time: 14:53
 * To change this template use File | Settings | File Templates.
 */
/* Person is a class to represent a simple person */

public class Person {
    private String name;
    private int age;

      public Person(String n, int a) {
        name=n;
        age=a;
    }

    // Method to get person's name
    //
    public String getName()
    {
        return name;
    }

    // Method to get person's age
    //
    public int getAge()
    {
        return age;
    }

    public String getDetails()
    {
        return "" + age;
    }

    //
    // ToDo
    //
    // Provide a compareTo() method similar to String.compareTo()
    //






    //
    // ToDo
    //
    // Provide a class method to sort persons in array by age
    // (use a simple bubble sort algorithm)
    //
    public static void bSortByAge(Person[] pers) {
        //
        // Todo:
        //
        // Insert your code here
        for (int i = 0; i < pers.length - 1; ++i)
        {
            for (int j = i + 1; j < pers.length; ++j)
            {
                if (pers[i].getAge() > pers[j].getAge())
                {
                    Person temp = pers[i];
                    pers[i] = pers[j];
                    pers[j] = temp;
                }
            }
        }
    }


    //
    // ToDo
    //
    // Provide a class method to sort persons in array by name
    // (use simple bubble sort algorithm)
    //
    public static void bSortByName(Person[] pers)
    {
        for (int i = 0; i < pers.length - 1; ++i)
        {
            for (int j = i + 1; j < pers.length; ++j)
            {
                if (pers[i].getName().compareTo(pers[j].getName()) >0)
                {
                    Person temp = pers[i];
                    pers[i] = pers[j];
                    pers[j] = temp;
                }
            }
        }







    }


}

