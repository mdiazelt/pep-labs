
import java.util.List;
import java.util.Collections;


public class LargestSum {
    /**
     * Get the largest possible sum that can be obtained from a pair of values in the list. A number can't be added
     * to itself, unless there are duplicates.
     *
     * @param nums a list of ints.
     * @return the largest possible sum of separate numbers from nums.
     */
    public int bigSum(List<Integer> nums){
        Collections.sort(nums);
        System.out.println(nums);
        int sum = 0;
        for (int i = 0; i <= nums.size(); i--){
            sum = nums.get(-1 ) + nums.get(2);
        }
        return sum;  
    }


}