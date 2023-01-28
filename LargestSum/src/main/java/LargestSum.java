
import java.util.List;


public class LargestSum {
    /**
     * Get the largest possible sum that can be obtained from a pair of values in the list. A number can't be added
     * to itself, unless there are duplicates.
     *
     * @param nums a list of ints.
     * @return the largest possible sum of separate numbers from nums.
     */
    public int bigSum(List<Integer> nums){
        
        int sum = nums
                .stream()
                .sorted()
                .skip(nums.size() - 2)
                .reduce(0,  Integer::sum);
       
        return sum;  
    }


}