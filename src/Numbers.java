import java.awt.datatransfer.StringSelection;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 11/03/13
 * Time: 14:11
 * To change this template use File | Settings | File Templates.
 */
import java.math.*;
public class Numbers {
    public static void main (String[] args) {
            for (int myNumber=1;myNumber <64; myNumber++) {
            double myResult=Math.pow(2,myNumber);
                if (myNumber < 10) {
                    System.out.print(" ");
                }
                System.out.println(myNumber+"\t"+myResult);
            if (myResult >= 999999999) {
                break;
            }

        }
    }
}
