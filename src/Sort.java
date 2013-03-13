/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 12/03/13
 * Time: 14:46
 * To change this template use File | Settings | File Templates.
 */
public class Sort {

    public static void bSort(int[] nums) {
        for (int i = 0; i < nums.length - 1; ++i)
        {
            for (int j = i + 1; j < nums.length; ++j)
            {
                if (nums[i] > nums[j])
                {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
    }
}
