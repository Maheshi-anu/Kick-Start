package Practice_2;

import java.util.*;

public class Solution {

    private static long findMaxNumOfBalancedSubstrings(int l, int r) {
        long maxNumOfSubstrings = 0;
        long totalPara = l + r;
        if (totalPara > 1){
            maxNumOfSubstrings = totalPara - (totalPara % 2) - 1;
        }
        return maxNumOfSubstrings;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Input number of test cases
        int testCaseCount = in.nextInt();

        for (int tc = 1; tc <= testCaseCount; ++tc) {
            // Input total number of left and right parentheses
            int l = in.nextInt();
            int r = in.nextInt();

            System.out.println("Case #" + tc + ": " + findMaxNumOfBalancedSubstrings(l, r));
        }
    }
}

