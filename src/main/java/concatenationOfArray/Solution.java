// https://leetcode.com/problems/concatenation-of-array/

package concatenationOfArray;

import java.util.LinkedList;

class Solution {
    public int[] getConcatenation(int[] nums) {
        // Primera Solución:
        int[] res = new int[nums.length*2];
        for(int i = 0; i < nums.length; i++){
            res[i] = nums[i];
            res[i+nums.length] = nums[i];
        }
        return res;
    }
}
