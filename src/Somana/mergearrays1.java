package Somana;

import java.util.Scanner;

public class mergearrays1 {
    

    static int[]mergearray(int[] ar1,int[] ar2){
		int i=0,j=0,k=0;
		int [] res=new int[ar1.length+ar2.length];
             for(;i<ar1.length&&j<ar2.length;)	
             {
            	 if(ar2[j]<ar1[i])
            	 {   
            		 res[k++]=ar2[j++];
            	 }
            	 else
            	 {
            		 res[k++]=ar1[i++];
            	 }
            	 
            		 
             }
             for(;i<ar1.length;) {
            	 res[k++]=ar1[i++]; 
             }
             for(;j<ar2.length;) {
            	 res[k++]=ar2[j++]; 
             }
             return res;
             
	}
    public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int [] ar1=new int[n1];
		for(int i=0;i<ar1.length;i++) {
			ar1[i]=sc.nextInt();
		}
		int n2=sc.nextInt();
		int [] ar2=new int[n2];
		for(int i=0;i<ar2.length;i++) {
			ar2[i]=sc.nextInt();
		}
		int [] res =mergearray(ar1,ar2);
		for(int i=0;i<res.length;i++)
		{
			System.out.print(res[i]+" ");
		}
		

	}

}



