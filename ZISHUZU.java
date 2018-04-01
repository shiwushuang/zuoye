package cl;

import java.util.Scanner;  

public class ZISHUZU{  
	public static void main(String[] args) { 
		Scanner in=new Scanner(System.in);
		int i,Max,n; 
	    n=in.nextInt(); 
	    int []a=new int[10];
	    for(i=0;i<n;i++)
	    {
	    	a[i]=in.nextInt();
	    }
	    System.out.println(Max(a,n));
	}
	public static int Max(int a[],int n)
	{
		int MaxSum=a[0];
		for(int i=0;i<n;i++)
		{
			int ThisSum=0;
			for(int j=i;j<n;j++)
			{ThisSum=a[j]+ThisSum;
			if(ThisSum>MaxSum)
				MaxSum=ThisSum;
			}
		}
		if(MaxSum<=0)
			MaxSum=0;
		return(MaxSum);
	}
}
	