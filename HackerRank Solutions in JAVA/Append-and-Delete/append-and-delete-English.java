import java.util.*;

public class Solution 
{

    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String t = in.next();
        int k = in.nextInt();
        int i;
        int check=0;
        for(i=0;i<s.length()&&i<t.length();i++)
          if(s.charAt(i)!=t.charAt(i))
            break;
            
    
      
      
      int d=s.length()-i; //the length of the mismatched substring of s
      int a=t.length()-i; //the length of the mismatched substring of a
      
      int p=k-d-a;
      if(p==0)
        {
        System.out.println("Yes");
      }
      else if(p<0)
        {
        System.out.println("No");
      }
      else
        {
        if(p%2==0)
          {
          System.out.println("Yes");
        }
        else
          {
          if(p>=(2*i))
            {System.out.println("Yes");}
          else
            {System.out.println("No");}
            
        }
      }
    }
}
