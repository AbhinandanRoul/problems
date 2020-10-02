 import java.util.*;
 public class Bon_Appetit
 {
     public static void main(String[] args)
     {
     
     Scanner in=new Scanner (System.in);
     int n=in.nextInt();
     int k=in.nextInt();
     int bill[]=new int[n];
     for(int i=0;i<n;i++)
        bill[i]=in.nextInt();
    int b=in.nextInt();

    bonAppetit(bill,k,b);
     }
 
 public static void bonAppetit(int bill[], int k, int b)
    {
    

        int total_items=bill.length;
        int total_bill=0;
        for(int i=0;i<total_items;i++)
        {
             total_bill+=bill[i]; //if all items are billed together
        }

        int total_shared_bill=total_bill-bill[k];//the bill which excludes what Anna didn't eat
        int Anna_bill= total_shared_bill/2; // What Anna is required to pay 
        if(Anna_bill==b)
            System.out.println("Bon Appetit");
        else
        {
            int refund= b-Anna_bill;
            System.out.println(refund);
        }


    }
 }