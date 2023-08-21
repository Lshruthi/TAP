package Somana;
import java.util.Scanner;
public class even {

    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        // implement your logic here
        int [] ar=new int[N];
        for(int i=0;i<N;i++)
        {
           ar[i]=sc.nextInt();
        }
        
        for(int i=0;i<N;i++)
        {
            
             if(ar[i]%2 ==0)
            {
                System.out.print(ar[i]+" ");
            }
        }
        sc.close();
    }
}

    

