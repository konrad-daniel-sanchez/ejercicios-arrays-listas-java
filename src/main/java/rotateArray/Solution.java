// https://leetcode.com/problems/rotate-array/

package rotateArray;

class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        int[] res = new int[n];
        if(k == 0 || n == 1){
            return;
        }

        if(k > n){
            k = k % n;
        }

        // Primera versión:
        int j = 0;
        for (int i=n-k; i<n; i++){
            res[j] = nums[i];
            j++;
        }
        for(int i=0; i<n-k; i++) {
            res[j] = nums[i];
            j++;
        }

        for(int i=0; i<n;i++){
            nums[i] = res[i];
        }

        // Otra versión (Haciendo uso del módulo)
        /**
        int j = n-k;
        for(int i=0; i<n;i++){
            System.out.println(j);
            res[i] = nums[j++];
            j = j % n;
        }

        for(int i=0; i<n;i++){
            nums[i] = res[i];
        }
        **/
    }
}