package com.codeSafe;

import java.util.Scanner;

public class SelectiveAddition
{
	

	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        System.out.println("Enter n \t m \t k");
	        int n = in.nextInt();
	        int m = in.nextInt();
	        int k = in.nextInt();
	        int[] A = new int[n];
	        System.out.println("Enter n array elements..");
	        for(int i = 0; i < n; i++)
	        {
	            A[i] = in.nextInt();
	        }
	        
	        int[] S = new int[k];
	        System.out.println("Enter k fav elements..");
	        for(int i = 0; i < k; i++){
	            S[i] = in.nextInt();
	        }
	        System.out.println("Enter l \t r\t x l-r segment and x to add in this segment..");
	        for(int a0 = 0; a0 < m; a0++)
	        {
	            int l = in.nextInt();
	            int r = in.nextInt();
	            int x = in.nextInt();
	            // Write Your Code Here
	            System.out.println("My code is now executing...");
	        
	           /* for(int rr=0;rr<m;rr++){*/
	            
	            
	            for(int i=l-1;i<r;i++)
	            {
	            	for(int j=0;j<S.length;j++)
	            	{
	            		if(S[j]!=A[i])
	            		{
	            			if(j==S.length-1){
	            			A[i]=A[i]+x;}//break;
	            		
	            		}
	            		else
	            		{
	            			break;
	            		}
	            	}
	            	//System.out.println(sum);
	            }
	            int sum=0;
	            for(int i:A)
	            {
	            	sum+=i;
	            	System.out.print(i+"\t");
	            }
	            System.out.println(sum);
	        
	        
	            //}
	        
	        }
	        
	        in.close();
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	    
	}


}
