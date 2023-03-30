import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testCases = input.nextInt();
        for (int tc = 1; tc <= testCases; ++tc){
            String i = input.next();
            String p = input.next();
            System.out.println("Case #"+tc+": "+typingSpeed(i,p));
        }

    }
    public static String typingSpeed(String i, String p){
        String output = "";
        if (p.length() < i.length()){
            output = "IMPOSSIBLE";
        }
        else if (p.length() == i.length()) {
            if (!p.equals(i)){
                output = "IMPOSSIBLE";
            }
        }
        else {
            boolean isLetterMissing = false;
            for (int j = 0; j < i.length(); j++){
                if((!p.contains(String.valueOf(i.charAt(j))))){
                    output = "IMPOSSIBLE";
                    isLetterMissing = true;
                    break;
                }
            }
            if (!isLetterMissing){
                int out = p.length() - i.length();
                output = String.valueOf(Integer.valueOf(out));
            }
        }
        return output;
    }
}
