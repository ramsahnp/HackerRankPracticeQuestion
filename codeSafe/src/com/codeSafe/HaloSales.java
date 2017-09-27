package com.codeSafe;

public class HaloSales {

	public static void main(String[] args) 
	{
		int p=100,d=19,m=1,s=180;//16 2 1 9981//100 1 1 99 //99 3 1 5555//100 19 1 180
		int count=0;
		if(p<=s){
		while(s>=m && p<=s)
		{
			s=s-p;//System.out.println("Sum="+s);
			count++;//System.out.println("Count="+count);
			p=p-d;//System.out.println("Price="+p);
			if(p<m)
			{
				p=m;
			}
		}
		}
		else
		{
			System.out.println(0);System.exit(0);
		}
		
		System.out.println(count);
		//System.out.println("final sum="+(s-p));
		
		

	}

}
