import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class queen {

    // Complete the queensAttack function below.
    static int queensAttack(int n, int k, int rq, int cq, int[][] o) {
        /*
        int [][]board = new int[n][n];
        int []f = new int[4];
        int []tru= new int[4];
        int flag=0;
        int count=0;
        int dlc=0;
        int drc=0;
        int rc=0;
        int cc=0;
        int rq= r_q-1;
        int cq= c_q-1;
        board[rq][cq]=2;
        for(int i=0; i<k; i++){
            board[(obstacles[i][0]-1)][(obstacles[i][1]-1)]=1;
        }
        //tbr
        for (int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        //r
        for (int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                //System.out.print(board[i][j] + " ");
                if(board[i][j]!=2){
                    if(board[i][j]==1 && i<=rq && j<=cq){
                        if(i+j==rq+cq){dlc=0;}
                        else if(i-j==rq-cq){drc=0;}
                        else if(i==rq){rc=0;}
                        else if(j==cq){cc=0;}

                    }
                    else if(board[i][j]==1 && i>=rq && j>=cq) {
                        flag=1;
                        if(i+j==rq+cq){f[0]=dlc;tru[0]=1;}
                        else if(i-j==rq-cq){f[1]=drc;tru[1]=1;}
                        else if(i==rq){f[2]=rc;tru[2]=1;}
                        else if(j==cq){f[3]=cc;tru[3]=1;}

                    }
                    else{
                        if(i+j==rq+cq){dlc++;}
                        else if(i-j==rq-cq){drc++;}
                        else if(i==rq){rc++;}
                        else if(j==cq){cc++;}
                    }
                }
            }
            //System.out.println();
        }

         System.out.println("counts :-");
          System.out.println(dlc + " "+drc + " "+rc + " "+ cc);

        if(tru[0]!=1){f[0]=dlc;}
        if(tru[1]!=1){f[1]=drc;}
        if(tru[2]!=1){f[2]=rc;}
        if(tru[3]!=1){f[3]=cc;}
        System.out.println("Final counts :-");

        for(int i=0; i<4; i++){
            System.out.print(f[i]+ " ");
            count+=f[i];
        }
        */
        //obstacles[][]

        /*///All directions
        //  up row
            while(r!=rr && rr>0 ){rr--;count++;}
            rr=rq;
            //down row
            while(r!=rr && rr<=n ){rr++;count++;}
            rr=rq;
            //right column
            while(c!=cc && cc<=n){cc++; count++;}
            cc=cq;
            //left column
            while(c!=cc && cc>0){cc--; count++;}
            cc=cq;
            //right digonal up
            while(c!=cc && r!=rr && cc<=n && rr<0 ){rr--; cc++; count++;}
            rr=rq; cc=cq;
            //right digonal down
            while(c!=cc && r!=rr && cc>0 && rr<=n ){rr++; cc--; count++;}
            rr=rq; cc=cq;
            //left digonal up
            while(c!=cc && r!=rr && cc>0 && rr>0 ){rr--; cc--; count++;}
            rr=rq; cc=cq;
            //right digonal up
            while(c!=cc && r!=rr && cc<=n && rr<=n ){rr++; cc++; count++;}
            rr=rq; cc=cq;

        */
        //int [][]board = new int[n][n];
        //for(int i=0; i<k; i++){
         //   board[(o[i][0]-1)][(o[i][1]-1)]=1;
        //}
        //board[rq-1][cq-1]=2;
        //tbr
        int r=0;
        int c=0;
        int co=0;
        int rr=rq;
        int cc=cq;
        int []count={n,n,n,n,n,n,n,n};
        int []flag =new int[8];
        int []t=new int[8];
        t = total(rq,cq,n);
        //print_board(board,n);
        for (int i=0; i<k; i++){
            r=o[i][0];
            c=o[i][1];
            System.out.println(" " + r + " " + c);

            //up row
            if(c==cc && r<rr){
                flag[0]=1;
            while(r+1<rr && rr>1 ){rr--;co++;}
            rr=rq;
            //System.out.println(co);
            if(count[0]>co && co!=0){count[0]=co;}
            co=0;}
            
            //down row
            if(c==cc && r>rr){
                flag[1]=1;
            while(r-1>rr && rr<n ){rr++;co++;}
            rr=rq;
            //System.out.println(co);
            if(count[1]>co && co!=0){count[1]=co;}
            co=0;}
            
            //right column
            if(r==rr && c>cc ){
                flag[2]=1;
            while(c-1>cc && cc<n){cc++; co++;}
            cc=cq;
            System.out.println(co);
            if(count[2]>co && co!=0){count[2]=co;}
            co=0;}
            
            //left column
            if(r==rr && c<cc ){
                flag[3]=1;
            while(c+1<cc && cc>1){cc--; co++;}
            cc=cq;
            //System.out.println(co);
            if(count[3]>co && co!=0){count[3]=co;}
            co=0;}
            
            //right digonal up
            if(r+c==rr+cc && c>cc && r<rr){
                flag[4]=1;
            while(c-1>cc && r+1<rr && cc<n && rr>1 ){rr--; cc++; co++;}
            rr=rq; cc=cq;
            if(count[4]>co && co!=0){count[4]=co;}
            co=0;}
            //System.out.println(co);
            //right digonal down
            if(r+c==rr+cc && c<cc && r>rr){
                flag[5]=1;
            while(c+1<cc && r-1>rr && cc>1 && rr<n ){rr++; cc--; co++;}
            rr=rq; cc=cq;
            if(count[5]>co && co!=0){count[5]=co;}
            co=0;}
            //System.out.println(co);
            //left digonal up
            if(r-c==rr-cc && c<cc && r<rr){
                flag[6]=1;
            while(c+1<cc && r+1<rr && cc>1 && rr>1 ){rr--; cc--; co++;}
            rr=rq; cc=cq;
            if(count[6]>co && co!=0){count[6]=co;}
            co=0;}
            //System.out.println(co);
            //left digonal down
            if(r-c==rr-cc && c>cc && r>rr){
                flag[7]=1;
            while(c-1>cc && r-1>rr && cc<n && rr<n ){rr++; cc++; co++;}
            rr=rq; cc=cq;
            if(count[7]>co && co!=0){count[7]=co;}
            co=0;}
            //System.out.println(co);




        }
        int ans=0;
        for(int i=0 ; i<8; i++){
            //System.out.print(flag[i] + " ");
            if(flag[i]!=0 ){
                if(count[i]!=n)
                ans=ans+count[i];
            }
            else  {
                ans=ans+t[i];
            }
        }


        return ans;


    }

    public static int[] total(int rq,int cq, int n){
        int count[]=new int[8];
        int rr=rq;
        int cc=cq;

        while(rr>1 ){rr--;count[0]++;}
            rr=rq;
            //System.out.println(count);
            //down row
            while(rr<n ){rr++;count[1]++;}
            rr=rq;
            //System.out.println(count);
            //right column
            while(cc<n){cc++; count[2]++;}
            cc=cq;
            //System.out.println(count);
            //left column
            while(cc>1){cc--; count[3]++;}
            cc=cq;
            //System.out.println(count);
            //right digonal up
            while(cc<n && rr>1 ){rr--; cc++; count[4]++;}
            rr=rq; cc=cq;
            //System.out.println(count);
            //right digonal down
            while(cc>1 && rr<n ){rr++; cc--; count[5]++;}
            rr=rq; cc=cq;
            //System.out.println(count);
            //left digonal up
            while(cc>1 && rr>1 ){rr--; cc--; count[6]++;}
            rr=rq; cc=cq;
            //System.out.println(count);
            //right digonal up
            while(cc<n && rr<n ){rr++; cc++; count[7]++;}
            rr=rq; cc=cq;
            //System.out.println(count);
            //System.out.println("individual movemments :- ");
            //for (int i=0;i<8;i++){
            //    System.out.print(count[i] + " ");
            //}
            //System.out.println();
            return count;

    }

   /* 
   public static void print_board(int[][]board,int n){
        
        for (int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
    */

    /*

    public static int mod(int x){
        if(x<0){return (-1*x);}
        else {return x;}
    }
    */

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nk = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nk[0]);

        int k = Integer.parseInt(nk[1]);

        String[] r_qC_q = scanner.nextLine().split(" ");

        int r_q = Integer.parseInt(r_qC_q[0]);

        int c_q = Integer.parseInt(r_qC_q[1]);

        int[][] obstacles = new int[k][2];

        for (int i = 0; i < k; i++) {
            String[] obstaclesRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 2; j++) {
                int obstaclesItem = Integer.parseInt(obstaclesRowItems[j]);
                obstacles[i][j] = obstaclesItem;
            }
        }

        int result = queensAttack(n, k, r_q, c_q, obstacles);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
