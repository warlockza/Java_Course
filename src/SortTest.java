/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 12/03/13
 * Time: 14:33
 * To change this template use File | Settings | File Templates.
 */
import com.sun.corba.se.impl.logging.ORBUtilSystemException;

import java.math.*;
public class SortTest {

    public static void main (String[] args) {
         int[] myArray;
         myArray=new int[10];

        for (int i=0; i<myArray.length; i++) {
            myArray[i]= (int) (Math.random()*100);
            System.out.printf("Element %d Equals %d\n",i,myArray[i]);
        }

        Sort srt=new Sort();
        srt.bSort(myArray);

        for (int i=0; i<myArray.length; i++) {
            System.out.printf("Element %d Equals %d\n",i,myArray[i]);
        }
    }


}
