import java.awt.datatransfer.StringSelection;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 13/03/13
 * Time: 09:25
 * To change this template use File | Settings | File Templates.
 */
public class Student extends Person {
    private String subject;

    public Student (String n, int a, String s) {
        super(n,a);
        subject=s;
    }

    public String getDetails()
    {
        return super.getDetails()+","+subject;
    }
    public void changeSubject(String s) {
        subject=s;
    }
}
