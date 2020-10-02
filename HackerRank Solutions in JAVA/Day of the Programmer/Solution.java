import java.util.*;
public class day_of_the_programmer
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        int year=in.nextInt();

        if(year==1918)
        {
            System.out.println("26.09.1918");
        }
        else
        {
            if(IsJulian(year))
            {
                if(IsJulianLeap(year))
                    System.out.println("12.09."+(year));
                else
                    System.out.println("13.09."+(year));
            }
            else
            {
                if(IsLeap(year))
                System.out.println("12.09."+(year));
                else
                System.out.println("13.09."+(year));
            }

        }
    }
    public static boolean IsLeap(int n)
    {
        if (n % 400 == 0) 
            return true; 

        if (n % 100 == 0) 
            return false; 
       
        if (n % 4 == 0) 
            return true; 

        return false; 
    }

    public static boolean IsJulian(int n)
    {
        if(n>=1700 && n<=1917)
        return true;
        else
        return false;
    }

    public static boolean IsJulianLeap(int year)
    {
        if(year%4==0)
        return true;
        else
        return false;
    }
}
