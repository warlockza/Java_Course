import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 12/03/13
 * Time: 09:25
 * To change this template use File | Settings | File Templates.
 */
public class EmployeeTest {
    public static void main (String[] args) {
        ArrayList<Employee> EmployeeList=new ArrayList();

        EmployeeList.add(new Employee("Mike",36));
        EmployeeList.add(new Employee("Neil",35));

        for (Employee Emp: EmployeeList) {
        System.out.println(Emp.getName()+"\t"+Emp.getAge());
        Emp.incAge();
        System.out.println(Emp.getName()+"\t"+Emp.getAge());
        }

    }
}
