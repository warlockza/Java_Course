/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 12/03/13
 * Time: 14:53
 * To change this template use File | Settings | File Templates.
 */
public class PersonTest {

    private static String[] testNames = {"Trulli", "Baumgartner", "Montoya",
            "Sato", "Coulthard", "Barrichello",
            "Schumacher", "Button", "Alonso",
            "Fisichella", "Bruni", "Webber" };
    private static int[] testAges = {40, 26, 29, 27, 32, 31, 32, 37, 28, 30, 32, 32};

    public static void main (String[] args) {
        Person[] persons;
        persons=new Person[testNames.length];
        for (int i=0;i < persons.length;i++) {
            persons[i]=new Person(testNames[i],testAges[i]);
            System.out.printf("Name=%s\t\tAge=%d\n",persons[i].getName(),persons[i].getAge());
        }
        Person.bSortByAge(persons);
        System.out.println("*********************************************************");
        for (int i=0;i < persons.length;i++) {
            System.out.printf("Name=%s\t\tAge=%d\n",persons[i].getName(),persons[i].getAge());
        }
        Person.bSortByName(persons);
        System.out.println("*********************************************************");
        for (int i=0;i < persons.length;i++) {
            System.out.printf("Name=%s\t\tAge=%d\n",persons[i].getName(),persons[i].getAge());
        }
    }
}
