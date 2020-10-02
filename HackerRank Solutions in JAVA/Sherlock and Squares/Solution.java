import java.util.*;

public class Sherlock_and_Squares {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0)
            {
            int a = in.nextInt();
            int b = in.nextInt();
            int k1=(int) Math.floor(Math.sqrt(b));
            int k2=(int) Math.ceil(Math.sqrt(a));
            System.out.println(k1-k2+1);
             }
        }
}
