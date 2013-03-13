/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 11/03/13
 * Time: 13:37
 * To change this template use File | Settings | File Templates.
 */
import java.math.*;

public class Age {
    public static void main(String[] args) {
       String myName="Michael";
       String herName="Angela";
       int myAge=38;
       int herAge=43;
       int ourGap=Math.abs(herAge-myAge);
       char mySex='M';
       char herSex='F';
       double ourAvg=(double)((myAge+herAge)/2.0);
       boolean over30=(myAge > 30)||(herAge > 30);
       boolean under25=(myAge < 25)||(herAge < 25);
       boolean maleOver40=((myAge > 40)&&(mySex=='M'))||((herAge >40)&&(herSex=='M'));
       System.out.println(myName+"'s Age is "+myAge+".");
       System.out.println(herName+"'s Age is "+herAge+".");
       System.out.println("Our Gap is "+ourGap+" Years.");
       System.out.println("The Average of our ages is "+ourAvg+".");

       if (over30) {
           System.out.println("One of us is over 30");
       } else {
           System.out.println("Neither of us is over 30");
       }
       if (under25) {
           System.out.println("One of us is under 25");
       } else {
           System.out.println("Neither of us is under 25");
       }
        if (maleOver40) {
            System.out.println("One of us is Male and over 40");
        } else {
            System.out.println("Neither of us are Male and over 40");
        }
    }

}
