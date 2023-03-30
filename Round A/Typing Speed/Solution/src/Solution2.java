import java.util.Scanner;
import java.io.*;
public class Solution2 {



    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        int c=0;
        while(c++<T)
        {
            String s1=sc.next();
            String s2=sc.next();

            int a=0,k=0,j=0;

            for(int i=0;i<s1.length();i++)
            {
                for( j=k;j<s2.length();j++)
                {
                    int compare=Character.compare(s1.charAt(i), s2.charAt(j));
                    if(compare==0)
                    {
                        a++;
                        k=j+1;
                        break;
                    }
                }
            }


            if(a==s1.length())
            {
                System.out.println("Case #"+c+": "+(s2.length()-a));
            }
            else
            {
                System.out.println("Case #"+c+": IMPOSSIBLE");
            }




        }
    }

}