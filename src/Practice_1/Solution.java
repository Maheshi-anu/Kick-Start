package Practice_1;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        int testCases;
        Scanner input = new Scanner(System.in);
        testCases = input.nextInt();
        for (int i = 1; i <= testCases; i++){
            int bags;
            int kids;
            int candis = 0;
            int remain;
            bags = input.nextInt();
            kids = input.nextInt();
            for (int n = 0; n < bags; n++){
                candis += input.nextInt();
            }
            remain = candis % kids;
            System.out.println("Case #"+i+": "+remain);
        }
    }
}
