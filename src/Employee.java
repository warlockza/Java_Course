/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 12/03/13
 * Time: 09:21
 * To change this template use File | Settings | File Templates.
 */
public class Employee {
    private static int retirementAge=65;
    private String lastName;
    private String firstName;
    private Integer Age;

    public Employee (String lastName, int Age) {
        this.lastName=lastName;
        this.Age=Age;
    }
    public Employee (String firstName,String lastName,int Age) {
        this.lastName=lastName;
        this.firstName=firstName;
        this.Age=Age;
    }

    public static void setRetirementAge(int newRetirementAge) {
           retirementAge=newRetirementAge;
    }
    public String getName() {
        return this.firstName+" "+this.lastName;
    }

    public void changeName(String newLastName) {
        this.lastName=newLastName;
    }

    public void changeName(String newFirstName,String newLastName) {
        this.lastName=newLastName;
        this.firstName=newFirstName;
    }
    public int getAge() {
        return this.Age;
    }
    public void incAge() {
        if (this.Age==retirementAge) {
            return;
        } else {
            this.Age++;
        }
    }
}
